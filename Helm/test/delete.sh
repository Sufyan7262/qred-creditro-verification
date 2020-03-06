#!/usr/bin/env bash

# Parse arguments
pushd $(dirname "${0}") > /dev/null

cd ..

# Change to test cluster
kubectl config use-context arn:aws:eks:eu-west-1:308405705166:cluster/eks-test-03

# Delete service
helm delete --purge example-service
