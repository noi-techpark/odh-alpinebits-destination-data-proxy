FROM nginx:1.19

COPY infrastructure/docker/domain-configuration.sh /docker-entrypoint.d/domain-configuration.sh
COPY infrastructure/docker/default.conf.template /etc/nginx/templates/default.conf.template
COPY src /src
RUN mkdir -p /code
