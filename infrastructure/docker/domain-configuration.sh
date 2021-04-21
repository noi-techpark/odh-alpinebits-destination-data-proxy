#!/bin/sh

set -e

auto_envsubst() {
  local defined_envs
  defined_envs=$(printf '${%s} ' $(env | cut -d= -f1))
  envsubst "$defined_envs" < /src/index.json > /code/index.json
}

auto_envsubst

exit 0
