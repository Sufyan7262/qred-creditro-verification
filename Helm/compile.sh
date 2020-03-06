#!/usr/bin/env bash

pushd $(dirname "${0}") > /dev/null

BASEDIR=$(pwd -L)
DOCKER_VERSION=$(<docker-version.txt)

# Go to project root
cd ../

# Build docker image
docker . build -t 308405705166.dkr.ecr.eu-west-1.amazonaws.com/qred/pagerank-api:$DOCKER_VERSION