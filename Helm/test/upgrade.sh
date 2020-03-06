#!/usr/bin/env bash

# Parse arguments
pushd $(dirname "${0}") > /dev/null

cd ..

# Change to test cluster
kubectl config use-context arn:aws:eks:eu-west-1:308405705166:cluster/eks-test-03

# Generate secrets

# Upgrade service
helm upgrade example-service ./ -f test/values.yaml -f test/secrets.values.yaml
