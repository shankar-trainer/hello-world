show databases;
create database chitkara;
use chitkara;
show tables;
create table employee(id int primary key , name varchar(20), salary double);
desc employee;
insert into employee values(10001,'ram kumar', 20000);
insert into employee values(10002,'shyam kumar', 30000);
select * from employee;