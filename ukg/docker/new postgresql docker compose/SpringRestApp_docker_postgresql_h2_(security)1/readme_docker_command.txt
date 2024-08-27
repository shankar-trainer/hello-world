postgresql start 

sudo docker run --name some-postgres -e POSTGRES_PASSWORD=mysecretpassword -d -p 5432:5432 postgres
sudo docker run --name postgres -e POSTGRES_PASSWORD=postgres -d -p 5432:5432 postgres

sudo docker run --name postgres -e POSTGRES_PASSWORD=postgres -d postgres

if docker is running then start it by --> docker start **CONTAINER ID**

 -- check docker container image 
    take container id and use below to execute the container 

docker exec -it  containerid  bash
psql -U postgres


===========================================
docker ps -a 
 take container id  then run below 

docker exec -it  37ac7a54cdee bash

docker images


docker images  -- to display image 
docker  rmi  imageid -- remove image

docker ps -a -- show all container


docker container stop container_id -- to stop the container
docker container rm container_id -- to remove container
docker rmi image -- to remove image 
docker system prune -- to remove all container

docker 

#spring.datasource.url=jdbc:postgresql://localhost:5432/db1 -- not this  
spring.datasource.url=jdbc:postgresql://dbpostgresql:5432/mydb


You are talking to another container, not localhost.

spring.datasource.url=jdbc:postgresql://db:5432/db1


sudo docker build -t app1 .

sudo docker run -p 8080:9090 -it app1
                   container:host 
  


==========================================
You are talking to another container, not localhost.

spring.datasource.url=jdbc:postgresql://localhost:5432/employeeapp
should be

spring.datasource.url=jdbc:postgresql://postgres:5432/employeeapp
It is also easier to call the container something like db:

services:
  db:
And reference it by it's function:

depends_on:
  - db
and name:

spring.datasource.url=jdbc:postgresql://db:5432/employeeapp
