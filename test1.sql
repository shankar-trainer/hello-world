show databases;

create database cts_22;

use cts_22;

show tables;



create table employee(id int primary key, name varchar(20), salary float(10,2));

describe employee;

desc employee;

insert into employee values(10001, 'mohan kumar',20000);

insert into employee values(10002, 'umesh kumar',22000);

insert into employee values(10003, 'suresh kumar',30000);

insert into employee values(10004, 'shyam kumar',10000);

insert into employee values(10005, 'rajesh kumar',12000);

insert into employee values(10006, 'manoj kumar',29000);



select * from employee;

select * from employee where id=10001;

select * from employee where id>10001 and id<=10004;

select * from employee where id between 10001 and 10004;

select * from employee where id=10001 or name='suresh kumar';

select * from employee where id=10001 or name='anand kumar';

select * from employee where id=10001 and name='suresh kumar';

select * from employee where id=10001 and name='mohan kumar';



-- sorting -- order by 

select * from employee order by name;

select * from employee order by name asc;

select * from employee order by name desc;

select * from employee order by salary;



select current_date();

select now();







-- alter table 

desc employee;

-- add column 

alter table employee add dob date;

insert into employee values(1,'ram partap',89000,current_date());

select * from employee;

insert into employee values(2,'bhanu partap',90000,'2001-12-01');

-- modify column

desc employee;

insert into employee values(20,'sri bhanu partap shivaji ganeshan',90000,'2001-12-01');

alter table employee modify name varchar(40);

-- change/rename column name

alter table employee change dob date_of_birth date;



use cts_22;

show tables;

desc employee;

insert into employee values(20,'sri bhanu partap shivaji ganeshan',90000,'2001-12-01');



insert into employee (id,name) values(7001,'manish kumar');

select * from employee;



create table customer(

id int, name varchar(20) not null unique, 

salary float(10,2) not null,

city varchar(20) default 'chennai', 

primary key (id)

);

 

desc customer;

drop table customer;



insert into customer (id,name) values(10001,'amit kumar');-- error for salary

insert into customer (id,name,salary) values(10001,'amit kumar',20000);

select * from customer;



insert into customer (id,name,salary) values(10002,'amit kumar',20000);-- error duplicate entry for name

 

-- relationship 

            create table furniture( id int , name varchar(20), cost float, primary key(id));

                -- pk 

-- child table pk -- fk 

create table furniture_order(order_id int, furniture_id int, location varchar(20), delievery_date date,

 primary key(order_id), foreign key(furniture_id) references furniture(id));

 

 insert into furniture_order values(1,10001,'chennai',current_date());

 insert into furniture values(10001,'chair',1200);

 



create table student(roll int primary key, namer varchar(20));



create table examination (exam_id int , student_roll int,

 subject varchar(20), exam_date date, primary key(exam_id), foreign key(student_roll) references student(roll));

 

create table address (addr_id int , student_roll int,

 city varchar(20), primary key(addr_id), foreign key(student_roll) references student(roll));



create table product (prdid varchar(20),name varchar(20), cost float, primary key(prdid), check(cost>1000));

 

 -- update statement 

 select * from employee;

 -- update all records 

 update employee set salary=20000 ;

 update employee set salary=20000 where id=7001;

 update employee set salary=10000, name='rahul kumar' where id=6576;

 

 
show databases;
create database db1;
 