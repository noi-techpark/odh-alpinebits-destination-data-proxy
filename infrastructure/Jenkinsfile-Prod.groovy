pipeline {
    agent any

    environment {
        DOCKER_PROJECT_NAME = "alpinebits-destination-data-proxy"
        DOCKER_IMAGE = "755952719952.dkr.ecr.eu-west-1.amazonaws.com/alpinebits-destination-data-proxy"
        DOCKER_TAG = "prod-$BUILD_NUMBER"
        
        SERVER_PORT = "1012"

        URL_BASE = "https://destinationdata.alpinebits.opendatahub.bz.it"
        URL_VERSION_1_0 = "https://1-0.destinationdata.alpinebits.opendatahub.bz.it"
    }

    stages {
        stage('Configure') {
            steps {
                sh """
                    rm -f .env
                    cp .env.example .env
                    echo 'COMPOSE_PROJECT_NAME=${DOCKER_PROJECT_NAME}' >> .env
                    echo 'DOCKER_IMAGE=${DOCKER_IMAGE}' >> .env
                    echo 'DOCKER_TAG=${DOCKER_TAG}' >> .env

                    echo 'SERVER_PORT=${SERVER_PORT}' >> .env

                    echo 'URL_VERSION_1_0=${URL_VERSION_1_0}' >> .env
                """
            }
        }
        stage('Build') {
            steps {
                sh '''
                    aws ecr get-login --region eu-west-1 --no-include-email | bash
                    docker-compose --no-ansi -f infrastructure/docker-compose.build.yml build --pull
                    docker-compose --no-ansi -f infrastructure/docker-compose.build.yml push
                '''
            }
        }
        stage('Deploy') {
            steps {
               sshagent(['jenkins-ssh-key']) {
                    sh """
                        (cd infrastructure/ansible && ansible-galaxy install -f -r requirements.yml)
                        (cd infrastructure/ansible && ansible-playbook --limit=prod deploy.yml --extra-vars "release_name=${BUILD_NUMBER}")
                    """
                }
            }
        }
    }
}
