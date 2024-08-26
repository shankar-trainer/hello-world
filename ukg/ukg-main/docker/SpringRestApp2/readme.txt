docker ps -a 
docker run --name postgres -e POSTGRES_PASSWORD=postgres -d postgres

docker ps -a 
take container name and add below 	
docker exec -ti  37ac7a54cdee bash
psql -U postgres
create database DB1;
docker build -t springapp2
docker build -t springapp2 .
