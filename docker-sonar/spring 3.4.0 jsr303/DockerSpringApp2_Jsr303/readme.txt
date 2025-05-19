go inside folder in play with docker or any docker
 in pom.xml finalName tag value will create  image with given name
docker build -t myapp1 .
docker run -p 6060:6060 myapp1


docker images --- to see all images
docker ps -a    --- to see all docker container 
docker stop container id   -- stop container
docker rm container id  -- remove container id 
docker rmi myapp1   -- remove docker image

