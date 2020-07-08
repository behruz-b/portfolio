#!/bin/bash

sbt dist

docker run --rm -ti -v $PWD/target/universal/portfolio-1.0.zip:/opt/portfolio-1.0.zip -p 8080:9000 --link=portfolio-db:postgres-host portfolio:latest
