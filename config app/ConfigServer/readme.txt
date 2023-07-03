


mkdir C:\test\git-localconfig-repo

limits-service.properties
    limits-service.minimum=8
    limits-service.maximum=888

limits-service-dev.properties
    limits-service.minimum=1
    limits-service.maximum=111

limits-service-qa.properties
    limits-service.minimum=2
    limits-service.maximum=222



add all properties files here
git init
git add *
git commit

run application


http://localhost:8888/limits-service/qa
http://localhost:8888/limits-service/default
http://localhost:8888/limits-service/qa
