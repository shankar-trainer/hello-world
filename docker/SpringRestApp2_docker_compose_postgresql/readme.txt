docker ps -a 
docker run --name postgres -e POSTGRES_PASSWORD=postgres -d postgres

docker ps -a 
take container name and add below 	
docker exec -ti  37ac7a54cdee bash
psql -U postgres
create database DB1;
docker build -t springapp2
docker build -t springapp2 .


no need of above command 

just run 
docker compose up

curl localhost:8080

to make it down 
docker compose down

#the program is not creating table

curl.exe  http://localhost:8080/all
curl.exe -d  '{"name":"shyam", "ssn":"ssn1010"}' -H "Content-Type: application/json" -X POST http://localhost:8080/add
curl.exe -X POST -H  "Content-Type: application/json" -d '{"name":"shyam","ssn":"ssn1010"}' http://localhost:8080/add





