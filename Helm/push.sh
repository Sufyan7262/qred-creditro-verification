#!/usr/bin/env bash

pushd $(dirname "${0}") > /dev/null

DOCKER_VERSION=$(<docker-version.txt)

# Authenticate with AWS
$(aws ecr get-login --no-include-email --region eu-west-1)

# Upload docker image to AWS ECR
docker push 308405705166.dkr.ecr.eu-west-1.amazonaws.com/qred/creditro-verification-api:$DOCKER_VERSION