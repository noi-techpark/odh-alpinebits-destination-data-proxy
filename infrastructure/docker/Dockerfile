FROM nginx:1.19

COPY infrastructure/docker/40-domain-configuration.sh /docker-entrypoint.d/40-domain-configuration.sh
COPY infrastructure/docker/default.conf.template /etc/nginx/templates/default.conf.template
COPY src /src
RUN mkdir -p /code
COPY src/specification.json /code/specification.json
