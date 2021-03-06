#!/usr/bin/env bash

# Parse arguments
pushd $(dirname "${0}") > /dev/null

cd ..
DOCKER_VERSION=$(<docker-version.txt)

# Change to production cluster
kubectl config use-context arn:aws:eks:eu-west-1:308405705166:cluster/eks-prod-01

# Generate secrets
./create-secrets-file.py --env prod

# Install service
helm install --name creditro-verification-api ./ -f prod/values.yaml -f prod/secrets.values.yaml --set image.tag=$DOCKER_VERSION
