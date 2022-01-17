FROM nginx:1.19

COPY infrastructure/docker/40-domain-configuration.sh /docker-entrypoint.d/40-domain-configuration.sh
COPY infrastructure/docker/default.conf.template /etc/nginx/templates/default.conf.template
COPY src /src
RUN mkdir -p /code
# specification.json has been removed with commit 9a8ee5b41cd71aba35c583768d2be7e7c34bdb59
#COPY src/specification.json /code/specification.json
