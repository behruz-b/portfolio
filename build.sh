#!/bin/bash

docker pull postgres:11

docker build -t portfolio ./deploy/

source deploy.sh