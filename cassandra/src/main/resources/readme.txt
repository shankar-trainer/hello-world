//Create the keyspace
CREATE KEYSPACE killrvideo WITH REPLICATION =
{ 'class' : 'SimpleStrategy', 'replication_factor' : 1 };

//Use the keyspace

USE killrvideo;

// Users keyed by id
CREATE TABLE users (
userid uuid,
firstname text,
lastname text,
email text,
created_date timestamp,
PRIMARY KEY (userid)
);


cqlsh> desc keyspaces
show all databases;
cqlsh>desc  demo_keyspace.vet;

cqlsh>select * from demo_keyspace.vet;






https://github.com/jkmcl/spring-data-cassandra-example/blob/main/src/main/resources/application.properties

https://github.com/hantsy/spring-reactive-sample/blob/master/boot-data-cassandra/src/main/resources/application.properties