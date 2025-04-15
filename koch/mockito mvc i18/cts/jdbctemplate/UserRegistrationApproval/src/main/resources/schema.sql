use db1;
DROP TABLE IF EXISTS  user1;
DROP TABLE IF EXISTS  admin;

create table user1(id varchar(20) primary key, name varchar(20), age int, password varchar(20),approved varchar(20));
create table admin(id varchar(20) primary key, password varchar(20));


