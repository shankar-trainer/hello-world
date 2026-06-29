start zookeeper 
C:\kafka_2.12-3.9.1\bin\windows>zookeeper-server-start.bat ..\..\config\zookeeper.properties

start kafka  server 
C:\kafka_2.12-3.9.1\bin\windows>kafka-server-start.bat ..\..\config\server.properties

create topic
C:\kafka_2.12-3.9.1\bin\windows>kafka-topics --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic topic1

list topics 
C:\kafka_2.12-3.9.1\bin\windows>kafka-topics --bootstrap-server localhost:9092 --list

start producer 
C:\kafka_2.12-3.9.1\bin\windows>start kafka-console-producer.bat --broker-list 127.0.0.1:9092 --topic topic1

start consumer 
C:\kafka_2.12-3.9.1\bin\windows>start kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic topic1 --from-beginning


curl.exe -X POST "http://localhost:8080/send/HelloKafka"

Invoke-RestMethod -Uri "http://localhost:8080/send/HelloKafka2" -Method Post

postman post method 

http://localhost:8080/send/HelloKafka

create consumer with group1 

C:\kafka_2.12-3.9.1\bin\windows>kafka-console-consumer.bat      --bootstrap-server localhost:9092     --topic topic1     --group group1     --from-beginning

curl.exe -X POST "http://localhost:8080/send?msg=HelloKafka77777"


