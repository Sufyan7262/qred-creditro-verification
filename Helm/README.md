# Example service

This is an example service that can be used as a base for new hydra services.

## Table of Contents

1. [Requirements](#requirements)
2. [Structure](#structure)
3. [Setup](#setup)
    1. [Submodule](#submodule)
    2. [Docker compose](#docker-compose)
    3. [Secrets](#secrets)
4. [Operations](#operations)

## Requirements

- AWS CLI ([aws.amazon.com](https://aws.amazon.com/cli))
- Docker ([www.docker.com](https://www.docker.com/products/docker-desktop))
- Helm ([helm.sh](https://helm.sh))
- Python ([python.org](https://www.python.org/downloads/))

## Structure

```
.
+-- test/
    |-- install.sh          # Installs service in Test cluster
    |-- upgrade.sh          # Upgrades service in Test cluster
    |-- delete.sh           # Deletes service from Test cluster
    |-- values.yaml         # Test specific configuration values
+-- prod/
    |-- install.sh          # Installs service in Production cluster
    |-- upgrade.sh          # Upgrades service in Production cluster
    |-- delete.sh           # Deletes service from Production cluster
    |-- values.yaml         # Production specific configuration values
+-- templates/              # A directory of templates that, when combined with values, will generate valid Kubernetes manifest files.
    |-- _helpers.tpl        # Includes template helpers
    |-- configmap.yaml      # Kubernetes ConfigMap manifest
    |-- deployment.yaml     # Kubernetes Deployment manifest
    |-- secrets.yaml        # Kubernetes Secrets manifest
    |-- service.yaml        # Kubernetes Service manifest
+-- Chart.yaml              # Helm chart configuration
+-- compile.sh              # Runs docker build command
+-- create-secrets-file.py  # Generates a secrets.values.yaml for an environment
+-- docker-version.txt      # Sets current image version
+-- push.sh                 # Uploads docker image to ECR
+-- values.yaml             # The default configuration values for this chart
```

## Setup

### Submodule

Add the service git repository as a submodule in `src/`

```bash
git submodule add git@github.com:qred/example-service.git src/example-service
```

### Docker compose

Add an entry to `docker-compose-aws.yml` in the project root

```
example-service:
    build:
      context: ./src/example-service/
      dockerfile: ./Dockerfile
    ports:
    - 8080:8080
```

### Secrets

Secrets are stored and fetched from AWS Secrets Manager.

Use the following naming scheme when creating new secrets in AWS:

```
<environment>/<service name>
```

For example: `test/ExampleService`

Secrets are automatically fetched when installing or upgrading the service.

## Operations

### Installation

For test run:
```
test/install.sh
```

For production run:
```
prod/install.sh
```

### Upgrading

For test run:
```
test/upgrade.sh
```

For production run:
```
prod/upgrade.sh
```

### Deleting

For test run:
```
test/delete.sh
```

For production run:
```
prod/delete.sh
```
