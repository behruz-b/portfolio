#!/bin/bash

docker pull postgres:11

docker build -t portfolio ./deploy/

docker run --name portfolio-db -p 5432:5432 -e 'POSTGRES_PASSWORD=maftunbek1998' -e 'POSTGRES_USER=prince' -d postgres:11

sleep 3s

docker exec -it portfolio-db psql -U prince -c "create database portfolio"

cat ./conf/database/db.sql | docker exec -i portfolio-db psql -U prince -d portfolio

source deploy.sh