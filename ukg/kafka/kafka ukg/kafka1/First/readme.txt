
C:\kafka_2.12-3.8.0\bin\windows>start zookeeper-server-start.bat  ..\..\config\zookeeper.properties
C:\kafka_2.12-3.8.0\bin\windows>start kafka-server-start.bat ..\..\config\server.properties
C:\kafka_2.12-3.8.0\bin\windows>kafka-console-producer.bat --broker-list localhost:9092 --topic NewTopic
C:\kafka_2.12-3.8.0\bin\windows>kafka-console-consumer.bat  --bootstrap-server localhost:9092 --topic NewTopic --from-beginning


http://localhost:8080/publish/hello

http://localhost:8080/publish1?message=hello i m fine