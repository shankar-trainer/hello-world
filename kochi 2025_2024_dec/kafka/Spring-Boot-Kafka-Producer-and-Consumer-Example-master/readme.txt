10:39 AM 27-02-2025

kafka-topics --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic test
Created topic test.

kafka-topics.sh --bootstrap-server localhost:9092 --list

start zookeeper

cd C:\kafka_2.13-3.9.0\bin\windows
 $ zookeeper-server-start.bat ..\..\config\zookeeper.properties


start kafka server
cd   C:\kafka_2.13-3.9.0\bin\windows
$ kafka-server-start.bat ..\..\config\server.properties

Also Start the consumer listening to the java_in_use_topic-
 kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic test --from-beginning

kafka console producer
kafka-console-producer.bat --broker-list 127.0.0.1:9092 --topic test