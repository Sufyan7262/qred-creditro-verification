#!/usr/bin/env bash

# Parse arguments
pushd $(dirname "${0}") > /dev/null

cd ..

# Change to production cluster
kubectl config use-context arn:aws:eks:eu-west-1:308405705166:cluster/eks-prod-01

# Delete service
helm delete --purge pagerank-api
