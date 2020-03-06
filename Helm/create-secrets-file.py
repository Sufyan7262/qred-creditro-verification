#!/usr/bin/env python3
import os
import sys
import argparse
import base64
import yaml
import json
import subprocess

# EDIT THESE VALUES
SECRETS_NAME = "pagerank-api"
# STOP EDITING

def open_local(file_name): return open(os.path.join(os.path.dirname(__file__), file_name), 'r')
def write_local(file_name): return open(os.path.join(os.path.dirname(__file__), file_name), 'r' if dry_run else 'w')
def exec_command(cmd): return subprocess.run(cmd.split(), stdout=subprocess.PIPE, stderr=subprocess.PIPE, check=True, universal_newlines=True, shell=(os.name == 'nt'))
def parse_secrets(string): return json.loads(json.loads(string)['SecretString'])

parser = argparse.ArgumentParser(add_help=False)
parser.add_argument('--dry', action="store_const", default=False, const=True)
parser.add_argument('--env', nargs="?", choices=["test", "prod"], required=True)
args = parser.parse_args()

env = args.env
dry_run = args.dry
secrets_file = env + "/secrets.values.yaml"

try:
  awsOutput = exec_command("aws secretsmanager get-secret-value --secret-id " + env + "/" + SECRETS_NAME)
except subprocess.CalledProcessError as ex:
  print("Could not fetch secrets from AWS: " + str(ex.stderr))
  sys.exit(1)

try:
  secrets = parse_secrets(awsOutput.stdout)
except json.JSONDecodeError as ex:
  print("Could not read secrets from JSON: " + str(ex.msg))
  sys.exit(1)

try:
  with write_local(secrets_file) as secrets_fh:
    to_write = yaml.safe_load(
'''
secrets: []
''')
    for key, value in secrets.items():
      to_write["secrets"].append({
        "name": key,
        "value": base64.b64encode(value.encode('utf-8')).decode("utf-8")
      })

    if not dry_run:
      secrets_fh.write(yaml.dump(to_write, allow_unicode=True, default_flow_style=False))
except OSError as ex:
  print("Could not write secrets to file: " + str(ex.strerror))
  sys.exit(1)

print("written secrets file")
