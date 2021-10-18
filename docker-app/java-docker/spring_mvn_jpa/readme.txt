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
or in eclipse run as gradle test\eclipse test
for maven mvn test 
get report at build/reports/tests/test/index.html
=======
docker build -t ss .

docker run -p 8080:9090 -it ss
elinks  http://localhost:8080/prd/getAll

outside  os in widnow os using ip address
elinks  http://192.168.0108:8080/prd/getAll


>>>>>>> b4c4cf8cda5bf4888711e7d56cb167286128a787
