sudo docker run --name postgres -e POSTGRES_PASSWORD=postgres -d -p 5432:5432 postgres

sudo docker ps -a   get all container id 
    take container id and use below to execute the container 

docker exec -it  containerid  bash
psql -U postgres


postgres=# create database db1;

/SpringRestApp_post$ cat src/main/resources/application-prod.properties

# postgresql for development profile
server.port=9090

# ip a will give all ip address running, take for docker ip and add ir 
spring.datasource.url=jdbc:postgresql://172.17.0.1:5432/db1


spring.datasource.username=postgres
spring.datasource.password=postgres

spring.jpa.hibernate.ddl-auto = create

spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.PostgreSQLDialect


spring.jpa.show-sql=true



-- docker app build and run 
sudo docker build -t app1 .

sudo docker run -p 8080:9090 -it app1
