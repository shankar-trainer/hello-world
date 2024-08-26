docker build -t springapp2 .

docker run -p 8080:7070 -it springapp2  

-- expose is 8080 -- it will run on 8080
http://localhost:8080/all

docker run -p 7070:7070 -it springapp2  
 it will run on 7070
 http://localhost:7070/all
--


docker run -p hostport:containerport  -it  springapp2


to upload on docketrhub

 docker build -t shankar2929/springapp2 .

            this will create image shankar2929/springapp2

 docker run -p 7070:7070 -it shankar2929/springapp2

 docker push shankar2929/springapp2

