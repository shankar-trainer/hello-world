docker image build -t docker-boot-intro .

docker image history boot-docker-intro command you'll see a breakdown of the various layers in the image
docker container run -p 8080:8080 docker-boot-intro

Testing the Application

$ docker-machine ip
192.168.99.100
curl 192.168.99.100:8080/actuator/health

docker ps -a -- all docker image id and container id 
docker start imageid or containerid
docker stop  imageid or containerid


-------------------
<<<<<<< HEAD
gradle bootRun
------------------

in cmd run gradle test 
or in eclipse run as gradle test or eclipse run as  test
for maven mvn test 
get report at build/reports/tests/test/index.html
=======
docker build -t ss .

docker run -p 8080:9090 -it ss
elinks  http://localhost:8080/prd/getAll

outside  os in widnow os using ip address
elinks  http://192.168.0.108:8080/prd/getAll

docker run -p 8080:9090 -it ss
it will EXPOSE 9090  container's port on host's port 8080



>>>>>>> b4c4cf8cda5bf4888711e7d56cb167286128a787
------------------------------------------
in current example
in application.properties server.port:8080

if 8080  is occupied by nginx then in Dockerfile give
EXPOSE 9090:8080
or
EXPOSE 9090

sudo docker run -p 9090:8080 -it ss
http://192.168.0.111:9090/prd/getAll
http://localhost:9090/prd/getAll

docker run -p 9090:8080 -it ss

it will EXPOSE 9090  container's port on host's port 8080
http://localhost:9090/prd/getAll


--------------------------------------------------
in application.properties server.port:8080

if 8080  is not occupied by nginx then in Dockerfile give
EXPOSE 8080
or EXPOSE 8080:8080
sudo docker run -p 8080:8080 -it ss

docker run -p 8080:8080 -it ss
it will EXPOSE 8080  container's port on host's port 8080
http://localhost:8080/prd/getAll

--------------------------------------------
best
in application.properties server.port:9090

EXPOSE 9090:9090
or
EXPOSE 9090




