=====================================  postgre sql ================

    Relational Database Management System (RDBMS) 

    relationship between tables 
starting postgresql 

C:\Program Files\PostgreSQL\13\bin>psql.exe  -U postgres

or use psql tool 
start button  -- search psql  -

\l
\list    will list all databases


\c databasename   -- will  connect with database

create database  databasename -- add  command in capital terminated  with semi colon 	
                              -- create database 
							  
\dt -- show all tables 

create table tablename (colname datatype, colname datatype )-- create table 

\d+ tablename -- structure of the table 

capg1=# create table employee (id bigserial primary key, name varchar(20), salary float, dob date);
capg1=# insert into employee  (name,salary,dob) values  ('hemant kumar',12000,'1999-01-11');
capg1=# insert into employee  (name,salary,dob) values 
										  ('sumit kumar',18000,'1991-10-12'),
										  ('anil kumar',78000,'1982-10-10'),
										  ('pritam kumar',56000,'1983-09-25');
										  
capg1=# select * from employee;
 id |     name     | salary |    dob
----+--------------+--------+------------
  1 | amit kumar   |  12000 | 1999-01-12
  2 | sumit kumar  |  18000 | 1991-10-12
  3 | anil kumar   |  78000 | 1982-10-10
  4 | pritam kumar |  56000 | 1983-09-25
  5 | hemant kumar |  12000 | 1999-01-11
  6 | sumit kumar  |  18000 | 1991-10-12
  7 | anil kumar   |  78000 | 1982-10-10
  8 | pritam kumar |  56000 | 1983-09-25
(8 rows)



------------------------------------
Server [localhost]:
Database [postgres]:
Port [5432]:
Username [postgres]:
Password for user postgres:
psql (13.4)
WARNING: Console code page (437) differs from Windows code page (1252)
         8-bit characters might not work correctly. See psql reference
         page "Notes for Windows users" for details.
Type "help" for help.

postgres=# \list
                                                 List of databases
   Name    |  Owner   | Encoding |          Collate           |           Ctype            |   Access privileges
-----------+----------+----------+----------------------------+----------------------------+-----------------------
 capg1     | postgres | UTF8     | English_United States.1252 | English_United States.1252 |
 db1       | postgres | UTF8     | English_United States.1252 | English_United States.1252 |
 db2       | postgres | UTF8     | English_United States.1252 | English_United States.1252 |
 db3       | postgres | UTF8     | English_United States.1252 | English_United States.1252 |
 postgres  | postgres | UTF8     | English_United States.1252 | English_United States.1252 |
 template0 | postgres | UTF8     | English_United States.1252 | English_United States.1252 | =c/postgres          +
           |          |          |                            |                            | postgres=CTc/postgres
 template1 | postgres | UTF8     | English_United States.1252 | English_United States.1252 | =c/postgres          +
           |          |          |                            |                            | postgres=CTc/postgres
(7 rows)


postgres=# \l
                                                 List of databases
   Name    |  Owner   | Encoding |          Collate           |           Ctype            |   Access privileges
-----------+----------+----------+----------------------------+----------------------------+-----------------------
 capg1     | postgres | UTF8     | English_United States.1252 | English_United States.1252 |
 db1       | postgres | UTF8     | English_United States.1252 | English_United States.1252 |
 db2       | postgres | UTF8     | English_United States.1252 | English_United States.1252 |
 db3       | postgres | UTF8     | English_United States.1252 | English_United States.1252 |
 postgres  | postgres | UTF8     | English_United States.1252 | English_United States.1252 |
 template0 | postgres | UTF8     | English_United States.1252 | English_United States.1252 | =c/postgres          +
           |          |          |                            |                            | postgres=CTc/postgres
 template1 | postgres | UTF8     | English_United States.1252 | English_United States.1252 | =c/postgres          +
           |          |          |                            |                            | postgres=CTc/postgres
(7 rows)


postgres=# CREATE DATABASE DB4;
CREATE DATABASE
postgres=# \l
                                                 List of databases
   Name    |  Owner   | Encoding |          Collate           |           Ctype            |   Access privileges
-----------+----------+----------+----------------------------+----------------------------+-----------------------
 capg1     | postgres | UTF8     | English_United States.1252 | English_United States.1252 |
 db1       | postgres | UTF8     | English_United States.1252 | English_United States.1252 |
 db2       | postgres | UTF8     | English_United States.1252 | English_United States.1252 |
 db3       | postgres | UTF8     | English_United States.1252 | English_United States.1252 |
 db4       | postgres | UTF8     | English_United States.1252 | English_United States.1252 |
 postgres  | postgres | UTF8     | English_United States.1252 | English_United States.1252 |
 template0 | postgres | UTF8     | English_United States.1252 | English_United States.1252 | =c/postgres          +
           |          |          |                            |                            | postgres=CTc/postgres
 template1 | postgres | UTF8     | English_United States.1252 | English_United States.1252 | =c/postgres          +
           |          |          |                            |                            | postgres=CTc/postgres
(8 rows)


postgres=# \c db4
You are now connected to database "db4" as user "postgres".
db4=# \dt
Did not find any relations.
db4=# create table employee (id int primary key, name varchar(20), salary float, dob date);
CREATE TABLE
db4=# \dt
        List of relations
 Schema | Name | Type  |  Owner
--------+------+-------+----------
 public | book | table | postgres
(1 row)


db4=# \d+ book;
                                           Table "public.book"
 Column |         Type          | Collation | Nullable | Default | Storage  | Stats target | Description
--------+-----------------------+-----------+----------+---------+----------+--------------+-------------
 id     | integer               |           | not null |         | plain    |              |
 name   | character varying(20) |           |          |         | extended |              |
 salary | double precision      |           |          |         | plain    |              |
 dob    | date                  |           |          |         | plain    |              |
Indexes:
    "book_pkey" PRIMARY KEY, btree (id)
Access method: heap
db4=#
										  
db4=# drop table book;
DROP TABLE
db4=# \dt
Did not find any relations.
db4=# create table employee (id int primary key, name varchar(20), salary float, dob date);
CREATE TABLE
db4=# \dt
          List of relations
 Schema |   Name   | Type  |  Owner
--------+----------+-------+----------
 public | employee | table | postgres
(1 row)


db4=# insert into employee(id,name,salary,dob) values(10001,'ram kumar',12000,'1998-01-30');
INSERT 0 1
db4=# insert into employee(id,name,salary,dob) values (10001,'ram kumar',12000,'1998-01-30');
ERROR:  duplicate key value violates unique constraint "employee_pkey"
DETAIL:  Key (id)=(10001) already exists.
db4=#
db4=#
db4=# insert into employee(id,name,salary,dob) values (10002,'amit kumar',19000,'1991-03-30'), (10003,'shyam kumar',80000,'1992-10-10'),(10004,'sunil kumar',34000,'2001-12-29');
INSERT 0 3
db4=# select * from employee;
  id   |    name     | salary |    dob
-------+-------------+--------+------------
 10001 | ram kumar   |  12000 | 1998-01-30
 10002 | amit kumar  |  19000 | 1991-03-30
 10003 | shyam kumar |  80000 | 1992-10-10
 10004 | sunil kumar |  34000 | 2001-12-29
(4 rows)


db4=# select id,name from employee;
  id   |    name
-------+-------------
 10001 | ram kumar
 10002 | amit kumar
 10003 | shyam kumar
 10004 | sunil kumar
(4 rows)


db4=# select id,name, salary from employee;
  id   |    name     | salary
-------+-------------+--------
 10001 | ram kumar   |  12000
 10002 | amit kumar  |  19000
 10003 | shyam kumar |  80000
 10004 | sunil kumar |  34000
(4 rows)


db4=# select * from employee;
  id   |    name     | salary |    dob
-------+-------------+--------+------------
 10001 | ram kumar   |  12000 | 1998-01-30
 10002 | amit kumar  |  19000 | 1991-03-30
 10003 | shyam kumar |  80000 | 1992-10-10
 10004 | sunil kumar |  34000 | 2001-12-29
(4 rows)


db4=# insert into employee(id,name,salary,dob) values (10005,'firoaz alam',82000,'1991-01-10');
INSERT 0 1
db4=# insert into employee(id,name,salary,dob) values (10005,'amina sekh',52000,'1999-01-10');
ERROR:  duplicate key value violates unique constraint "employee_pkey"
DETAIL:  Key (id)=(10005) already exists.
db4=# insert into employee(id,name,salary,dob) values (10006,'amina sekh',52000,'1999-01-10');
INSERT 0 1
db4=# insert into employee(id,name,salary,dob) values (10007,'parvin jaiswal',82000,'1999-01-11');
INSERT 0 1
db4=# select * from employee;
  id   |      name      | salary |    dob
-------+----------------+--------+------------
 10001 | ram kumar      |  12000 | 1998-01-30
 10002 | amit kumar     |  19000 | 1991-03-30
 10003 | shyam kumar    |  80000 | 1992-10-10
 10004 | sunil kumar    |  34000 | 2001-12-29
 10005 | firoaz alam    |  82000 | 1991-01-10
 10006 | amina sekh     |  52000 | 1999-01-10
 10007 | parvin jaiswal |  82000 | 1999-01-11
(7 rows)


db4=# select id,salary,name from employee;
  id   | salary |      name
-------+--------+----------------
 10001 |  12000 | ram kumar
 10002 |  19000 | amit kumar
 10003 |  80000 | shyam kumar
 10004 |  34000 | sunil kumar
 10005 |  82000 | firoaz alam
 10006 |  52000 | amina sekh
 10007 |  82000 | parvin jaiswal
(7 rows)


db4=# select * from employee where name='ram kumar';
  id   |   name    | salary |    dob
-------+-----------+--------+------------
 10001 | ram kumar |  12000 | 1998-01-30
(1 row)


db4=# select * from employee where id=1007;
 id | name | salary | dob
----+------+--------+-----
(0 rows)


db4=# select * from employee where salary>50000;
  id   |      name      | salary |    dob
-------+----------------+--------+------------
 10003 | shyam kumar    |  80000 | 1992-10-10
 10005 | firoaz alam    |  82000 | 1991-01-10
 10006 | amina sekh     |  52000 | 1999-01-10
 10007 | parvin jaiswal |  82000 | 1999-01-11
(4 rows)


db4=# select * from employee where salary>30000 and salary<=55000;
  id   |    name     | salary |    dob
-------+-------------+--------+------------
 10004 | sunil kumar |  34000 | 2001-12-29
 10006 | amina sekh  |  52000 | 1999-01-10
(2 rows)


db4=# select * from employee where  salary between 30000 and 55000;
  id   |    name     | salary |    dob
-------+-------------+--------+------------
 10004 | sunil kumar |  34000 | 2001-12-29
 10006 | amina sekh  |  52000 | 1999-01-10
(2 rows)


db4=# select * from employee where id=10007 or name='sunil kumar' ;
  id   |      name      | salary |    dob
-------+----------------+--------+------------
 10004 | sunil kumar    |  34000 | 2001-12-29
 10007 | parvin jaiswal |  82000 | 1999-01-11
(2 rows)


db4=# select * from employee where id=10007 and name='sunil kumar' ;
 id | name | salary | dob
----+------+--------+-----
(0 rows)


db4=# select * from employee where id=10004 and name='sunil kumar' ;
  id   |    name     | salary |    dob
-------+-------------+--------+------------
 10004 | sunil kumar |  34000 | 2001-12-29
(1 row)


db4=# select * from employee ;
  id   |      name      | salary |    dob
-------+----------------+--------+------------
 10001 | ram kumar      |  12000 | 1998-01-30
 10002 | amit kumar     |  19000 | 1991-03-30
 10003 | shyam kumar    |  80000 | 1992-10-10
 10004 | sunil kumar    |  34000 | 2001-12-29
 10005 | firoaz alam    |  82000 | 1991-01-10
 10006 | amina sekh     |  52000 | 1999-01-10
 10007 | parvin jaiswal |  82000 | 1999-01-11
(7 rows)


db4=# select * from employee order by name ;
  id   |      name      | salary |    dob
-------+----------------+--------+------------
 10006 | amina sekh     |  52000 | 1999-01-10
 10002 | amit kumar     |  19000 | 1991-03-30
 10005 | firoaz alam    |  82000 | 1991-01-10
 10007 | parvin jaiswal |  82000 | 1999-01-11
 10001 | ram kumar      |  12000 | 1998-01-30
 10003 | shyam kumar    |  80000 | 1992-10-10
 10004 | sunil kumar    |  34000 | 2001-12-29
(7 rows)


db4=# select * from employee order by name  asc;
  id   |      name      | salary |    dob
-------+----------------+--------+------------
 10006 | amina sekh     |  52000 | 1999-01-10
 10002 | amit kumar     |  19000 | 1991-03-30
 10005 | firoaz alam    |  82000 | 1991-01-10
 10007 | parvin jaiswal |  82000 | 1999-01-11
 10001 | ram kumar      |  12000 | 1998-01-30
 10003 | shyam kumar    |  80000 | 1992-10-10
 10004 | sunil kumar    |  34000 | 2001-12-29
(7 rows)


db4=# select * from employee order by name  desc;
  id   |      name      | salary |    dob
-------+----------------+--------+------------
 10004 | sunil kumar    |  34000 | 2001-12-29
 10003 | shyam kumar    |  80000 | 1992-10-10
 10001 | ram kumar      |  12000 | 1998-01-30
 10007 | parvin jaiswal |  82000 | 1999-01-11
 10005 | firoaz alam    |  82000 | 1991-01-10
 10002 | amit kumar     |  19000 | 1991-03-30
 10006 | amina sekh     |  52000 | 1999-01-10
(7 rows)


db4=# insert into employee(id,salary,dob) values (10009,52000,'1999-01-10');
INSERT 0 1
db4=# insert into employee(id,salary,dob) values (100010,52000,'1999-01-10');
INSERT 0 1
db4=# insert into employee(id,name,dob) values (100010,'devendra kumar','1991-01-10');
ERROR:  duplicate key value violates unique constraint "employee_pkey"
DETAIL:  Key (id)=(100010) already exists.
db4=# insert into employee(id,name,dob) values (100011,'devendra kumar','1991-01-10');
INSERT 0 1
db4=# insert into employee(id,name,dob) values (100012,'devendra kumar','1991-01-11');
INSERT 0 1
db4=#
db4=# select * from employee;
   id   |      name      | salary |    dob
--------+----------------+--------+------------
  10001 | ram kumar      |  12000 | 1998-01-30
  10002 | amit kumar     |  19000 | 1991-03-30
  10003 | shyam kumar    |  80000 | 1992-10-10
  10004 | sunil kumar    |  34000 | 2001-12-29
  10005 | firoaz alam    |  82000 | 1991-01-10
  10006 | amina sekh     |  52000 | 1999-01-10
  10007 | parvin jaiswal |  82000 | 1999-01-11
  10009 |                |  52000 | 1999-01-10
 100010 |                |  52000 | 1999-01-10
 100011 | devendra kumar |        | 1991-01-10
 100012 | devendra kumar |        | 1991-01-11
(11 rows)


db4=# select * from employee where name isnull;
   id   | name | salary |    dob
--------+------+--------+------------
  10009 |      |  52000 | 1999-01-10
 100010 |      |  52000 | 1999-01-10
(2 rows)


db4=# select * from employee where salary  isnull;
   id   |      name      | salary |    dob
--------+----------------+--------+------------
 100011 | devendra kumar |        | 1991-01-10
 100012 | devendra kumar |        | 1991-01-11
(2 rows)


db4=#
db4=#
db4=#
db4=#
db4=# create table customer(id serial, name varchar(20) not null unique, salary float not null, location varchar(20) not null;
db4(# create table customer(id serial, name varchar(20) not null unique, salary float not null, location varchar(20) not null;
db4(# create table customer(id serial, name varchar(20) not null unique, salary float not null, location varchar(20) not null);
db4(#
db4(#
db4(# create table customer(id serial, name varchar(20) not null , salary float not null, location varchar(20) not null);
db4(# \dt
          List of relations
 Schema |   Name   | Type  |  Owner
--------+----------+-------+----------
 public | employee | table | postgres
(1 row)


db4(# create table customer(id serial, name varchar(20) not null , salary float not null, location varchar(20) not null);
db4(#
db4(#
db4(#


rdbms 

relational database management system
  
  
  parent table      child table 
  
  product     --- product_order------------->product_return
   prd_id,PK      prdid      --FK            prdid   FK
   name,          order_id  -- PK            prd_ret_id pk 
   mfd,           order_date,                return_date
   cost           delivery_date              location 
   
   
   
   
   ============================
   Server [localhost]:
Database [postgres]:
Port [5432]:
Username [postgres]:
Password for user postgres:
psql (13.4)
WARNING: Console code page (437) differs from Windows code page (1252)
         8-bit characters might not work correctly. See psql reference
         page "Notes for Windows users" for details.
Type "help" for help.

postgres=# \c db4
You are now connected to database "db4" as user "postgres".
db4=# \dt
          List of relations
 Schema |   Name   | Type  |  Owner
--------+----------+-------+----------
 public | employee | table | postgres
(1 row)


db4=# create table customer (id serial primary key, name varchar(20) not null, salary float);
CREATE TABLE
db4=# insert into customer(id,name,salary) values(878787,'arvind kumar',20000);
INSERT 0 1
db4=# insert into customer(id,salary) values(878781,78000);
ERROR:  null value in column "name" of relation "customer" violates not-null constraint
DETAIL:  Failing row contains (878781, null, 78000).
db4=# insert into customer(name,salary) values('arvind kumar',20000);
INSERT 0 1
db4=# insert into customer(name,salary) values('arvind kumar',20000);
INSERT 0 1
db4=# insert into customer(name,salary) values('arvind kumar',20000);
INSERT 0 1
db4=# select * from customer;
   id   |     name     | salary
--------+--------------+--------
 878787 | arvind kumar |  20000
      1 | arvind kumar |  20000
      2 | arvind kumar |  20000
      3 | arvind kumar |  20000
(4 rows)


db4=#
db4=#
db4=#
db4=#
db4=# insert into customer(id,salary) values(878781,78000);
ERROR:  null value in column "name" of relation "customer" violates not-null constraint
DETAIL:  Failing row contains (878781, null, 78000).
db4=# \d+ customer
                                                       Table "public.customer"
 Column |         Type          | Collation | Nullable |               Default                | Storage  | Stats target | Description
--------+-----------------------+-----------+----------+--------------------------------------+----------+--------------+-------------
 id     | integer               |           | not null | nextval('customer_id_seq'::regclass) | plain    |              |
 name   | character varying(20) |           | not null |                                      | extended |              |
 salary | double precision      |           |          |                                      | plain    |              |
Indexes:
    "customer_pkey" PRIMARY KEY, btree (id)
Access method: heap


db4=# create table customer1 (id serial primary key, name varchar(20) not null unique , salary float);
CREATE TABLE
db4=# insert into customer1(name,salary) values('arvind kumar',20000);
INSERT 0 1
db4=# insert into customer1(name,salary) values('arvind kumar',20000);
ERROR:  duplicate key value violates unique constraint "customer1_name_key"
DETAIL:  Key (name)=(arvind kumar) already exists.
db4=# \d+ customer1
                                                       Table "public.customer1"
 Column |         Type          | Collation | Nullable |                Default                | Storage  | Stats target | Description
--------+-----------------------+-----------+----------+---------------------------------------+----------+--------------+-------------
 id     | integer               |           | not null | nextval('customer1_id_seq'::regclass) | plain    |              |
 name   | character varying(20) |           | not null |                                       | extended |              |
 salary | double precision      |           |          |                                       | plain    |              |
Indexes:
    "customer1_pkey" PRIMARY KEY, btree (id)
    "customer1_name_key" UNIQUE CONSTRAINT, btree (name)
Access method: heap


db4=#
db4=#
db4=#
db4=#
db4=#
db4=# create table passenger(id int, name varchar(20) not null, age int not null, country_code varchar(20) not null, primary key(id,country_code));
CREATE TABLE
db4=# dt+ passenger
db4-# \dt+ passenger
                              List of relations
 Schema |   Name    | Type  |  Owner   | Persistence |  Size   | Description
--------+-----------+-------+----------+-------------+---------+-------------
 public | passenger | table | postgres | permanent   | 0 bytes |
(1 row)


db4-# \d+ passenger
                                           Table "public.passenger"
    Column    |         Type          | Collation | Nullable | Default | Storage  | Stats target | Description
--------------+-----------------------+-----------+----------+---------+----------+--------------+-------------
 id           | integer               |           | not null |         | plain    |              |
 name         | character varying(20) |           | not null |         | extended |              |
 age          | integer               |           | not null |         | plain    |              |
 country_code | character varying(20) |           | not null |         | extended |              |
Indexes:
    "passenger_pkey" PRIMARY KEY, btree (id, country_code)
Access method: heap

db4=# insert into passenger (id,name,age,country_code) values(10001,'jitendra kumar',67,'in');
INSERT 0 1
db4=# insert into passenger (id,name,age,country_code) values(10001,'jitendra kumar',67,'ne');
INSERT 0 1
db4=# insert into passenger (id,name,age,country_code) values(10001,'jitendra kumar',67,'ne');
ERROR:  duplicate key value violates unique constraint "passenger_pkey"
DETAIL:  Key (id, country_code)=(10001, ne) already exists.
db4=# insert into passenger (id,name,age,country_code) values(10002,'amitendra kumar',67,'ne');
INSERT 0 1
db4=# insert into passenger (id,name,age,country_code) values(10002,'amitendra kumar',67,'pk');
INSERT 0 1
db4=# insert into passenger (id,name,age,country_code) values(10002,'amitendra kumar',67,'uk');
INSERT 0 1
db4=#
db4=# create table product (prdid int primary key, name varchar(20), mfd date, cost float);
CREATE TABLE

db4=# create table product_order(order_id int,order_date date, delievery_date date, prd_id int, primary key(order_id), foreign key(prd_id) references product(prdid));
CREATE TABLE

db4=#
db4=# insert into product_order (order_id,order_date,delievery_date,prd_id) values(10001,'2022-01-01','2022-03-29',1);
ERROR:  insert or update on table "product_order" violates foreign key constraint "product_order_prd_id_fkey"
DETAIL:  Key (prd_id)=(1) is not present in table "product".

db4=#
db4=# insert into product (prdid,name,mfd,cost) values(1,'samsung galaxy mobile','2022-01-29',25000);
ERROR:  value too long for type character varying(20)

db4=# insert into product (prdid,name,mfd,cost) values(1,'samsung mobile','2022-01-29',25000);
INSERT 0 1

db4=# insert into product_order (order_id,order_date,delievery_date,prd_id) values(10001,'2022-01-01','2022-03-29',1);
INSERT 0 1

db4=# select * from product;
 prdid |      name      |    mfd     | cost
-------+----------------+------------+-------
     1 | samsung mobile | 2022-01-29 | 25000
(1 row)


db4=# select * from product_order;
 order_id | order_date | delievery_date | prd_id
----------+------------+----------------+--------
    10001 | 2022-01-01 | 2022-03-29     |      1
(1 row)


db4=#
                   
db4=# create table product_return (return_id int primary key,return_date date, location varchar(20),prdid int, foreign key(prdid) references product(prdid));
CREATE TABLE
db4=#

db4=# insert into product_return values(9001,'2022-03-30','new delhi',2) ;
ERROR:  insert or update on table "product_return" violates foreign key constraint "product_return_prdid_fkey"
DETAIL:  Key (prdid)=(2) is not present in table "product".

db4=# insert into product_return values(9001,'2022-03-30','new delhi',1) ;
INSERT 0 1
db4=#
	
date and time   3 main data types 

date 
time
timestamp

functions are

  current_date 
  current_time
  now()  -- date and time both  with time zone
  localtime -- -- date and time both  without  time zone
  
db4=# select current_date;
 current_date
--------------
 2022-03-21
(1 row)


db4=# select current_time();
ERROR:  syntax error at or near ")"
LINE 1: select current_time();
                            ^
db4=# select current_time;
     current_time
-----------------------
 12:32:00.677804+05:30
(1 row)


db4=# select now;
ERROR:  column "now" does not exist
LINE 1: select now;
               ^
db4=#
db4=#
db4=# create table survey(id int primary key , survey_date date, location varchar(20), surevy_time time);
CREATE TABLE
db4=# insert into survey values(1001,current_date,'mathura',current_time);
INSERT 0 1
db4=# insert into survey values(1002,'2022-03-28','delhi','11:30:33');
INSERT 0 1
db4=# select * from survey;
  id  | survey_date | location |   surevy_time
------+-------------+----------+-----------------
 1001 | 2022-03-21  | mathura  | 12:39:51.163503
 1002 | 2022-03-28  | delhi    | 11:30:33
(2 rows)


               ^
db4=# select now();
               now
----------------------------------
 2022-03-21 12:43:19.594813+05:30
(1 row)

db4=# select localtime;
    localtime
-----------------
 12:44:12.754623
(1 row)

db4=#
db4=#
db4=# select * from employee;
   id   |      name      | salary |    dob
--------+----------------+--------+------------
  10001 | ram kumar      |  12000 | 1998-01-30
  10002 | amit kumar     |  19000 | 1991-03-30
  10003 | shyam kumar    |  80000 | 1992-10-10
  10004 | sunil kumar    |  34000 | 2001-12-29
  10005 | firoaz alam    |  82000 | 1991-01-10
  10006 | amina sekh     |  52000 | 1999-01-10
  10007 | parvin jaiswal |  82000 | 1999-01-11
  10009 |                |  52000 | 1999-01-10
 100010 |                |  52000 | 1999-01-10
 100011 | devendra kumar |        | 1991-01-10
 100012 | devendra kumar |        | 1991-01-11
(11 rows)


db4=# update employee set name='ramesh kumar' where id=10001;
UPDATE 1
db4=# update employee set name='imran khan', salary=90000 where id=10005;
UPDATE 1
db4=# select * from employee;
   id   |      name      | salary |    dob
--------+----------------+--------+------------
  10002 | amit kumar     |  19000 | 1991-03-30
  10003 | shyam kumar    |  80000 | 1992-10-10
  10004 | sunil kumar    |  34000 | 2001-12-29
  10006 | amina sekh     |  52000 | 1999-01-10
  10007 | parvin jaiswal |  82000 | 1999-01-11
  10009 |                |  52000 | 1999-01-10
 100010 |                |  52000 | 1999-01-10
 100011 | devendra kumar |        | 1991-01-10
 100012 | devendra kumar |        | 1991-01-11
  10001 | ramesh kumar   |  12000 | 1998-01-30
  10005 | imran khan     |  90000 | 1991-01-10
(11 rows)


db4=# delete from employee where id=10002;
DELETE 1
db4=# select * from employee;
   id   |      name      | salary |    dob
--------+----------------+--------+------------
  10003 | shyam kumar    |  80000 | 1992-10-10
  10004 | sunil kumar    |  34000 | 2001-12-29
  10006 | amina sekh     |  52000 | 1999-01-10
  10007 | parvin jaiswal |  82000 | 1999-01-11
  10009 |                |  52000 | 1999-01-10
 100010 |                |  52000 | 1999-01-10
 100011 | devendra kumar |        | 1991-01-10
 100012 | devendra kumar |        | 1991-01-11
  10001 | ramesh kumar   |  12000 | 1998-01-30
  10005 | imran khan     |  90000 | 1991-01-10
(10 rows)


db4=# select * from employee;
   id   |      name      | salary |    dob
--------+----------------+--------+------------
  10003 | shyam kumar    |  80000 | 1992-10-10
  10004 | sunil kumar    |  34000 | 2001-12-29
  10006 | amina sekh     |  52000 | 1999-01-10
  10007 | parvin jaiswal |  82000 | 1999-01-11
  10009 |                |  52000 | 1999-01-10
 100010 |                |  52000 | 1999-01-10
 100011 | devendra kumar |        | 1991-01-10
 100012 | devendra kumar |        | 1991-01-11
  10001 | ramesh kumar   |  12000 | 1998-01-30
  10005 | imran khan     |  90000 | 1991-01-10
(10 rows)


db4=# select id,name,salary, dob  from employee;
   id   |      name      | salary |    dob
--------+----------------+--------+------------
  10003 | shyam kumar    |  80000 | 1992-10-10
  10004 | sunil kumar    |  34000 | 2001-12-29
  10006 | amina sekh     |  52000 | 1999-01-10
  10007 | parvin jaiswal |  82000 | 1999-01-11
  10009 |                |  52000 | 1999-01-10
 100010 |                |  52000 | 1999-01-10
 100011 | devendra kumar |        | 1991-01-10
 100012 | devendra kumar |        | 1991-01-11
  10001 | ramesh kumar   |  12000 | 1998-01-30
  10005 | imran khan     |  90000 | 1991-01-10
(10 rows)


db4=# select id as "employee id", name as "empname",salary as "emp salary", dob as "date of birth"  from employee;
 employee id |    empname     | emp salary | date of birth
-------------+----------------+------------+---------------
       10003 | shyam kumar    |      80000 | 1992-10-10
       10004 | sunil kumar    |      34000 | 2001-12-29
       10006 | amina sekh     |      52000 | 1999-01-10
       10007 | parvin jaiswal |      82000 | 1999-01-11
       10009 |                |      52000 | 1999-01-10
      100010 |                |      52000 | 1999-01-10
      100011 | devendra kumar |            | 1991-01-10
      100012 | devendra kumar |            | 1991-01-11
       10001 | ramesh kumar   |      12000 | 1998-01-30
       10005 | imran khan     |      90000 | 1991-01-10
(10 rows)


db4=# select id as "employee id", name as "empname",salary as "emp salary", salary-(salary*0.05) ,dob as "date of birth"  from employee;
 employee id |    empname     | emp salary | ?column? | date of birth
-------------+----------------+------------+----------+---------------
       10003 | shyam kumar    |      80000 |    76000 | 1992-10-10
       10004 | sunil kumar    |      34000 |    32300 | 2001-12-29
       10006 | amina sekh     |      52000 |    49400 | 1999-01-10
       10007 | parvin jaiswal |      82000 |    77900 | 1999-01-11
       10009 |                |      52000 |    49400 | 1999-01-10
      100010 |                |      52000 |    49400 | 1999-01-10
      100011 | devendra kumar |            |          | 1991-01-10
      100012 | devendra kumar |            |          | 1991-01-11
       10001 | ramesh kumar   |      12000 |    11400 | 1998-01-30
       10005 | imran khan     |      90000 |    85500 | 1991-01-10
(10 rows)


db4=# select id as "employee id", name as "empname",salary as "emp salary", salary-(salary*0.05) as "gross salary" ,dob as "date of birth"  from employee;
 employee id |    empname     | emp salary | gross salary | date of birth
-------------+----------------+------------+--------------+---------------
       10003 | shyam kumar    |      80000 |        76000 | 1992-10-10
       10004 | sunil kumar    |      34000 |        32300 | 2001-12-29
       10006 | amina sekh     |      52000 |        49400 | 1999-01-10
       10007 | parvin jaiswal |      82000 |        77900 | 1999-01-11
       10009 |                |      52000 |        49400 | 1999-01-10
      100010 |                |      52000 |        49400 | 1999-01-10
      100011 | devendra kumar |            |              | 1991-01-10
      100012 | devendra kumar |            |              | 1991-01-11
       10001 | ramesh kumar   |      12000 |        11400 | 1998-01-30
       10005 | imran khan     |      90000 |        85500 | 1991-01-10
(10 rows)


db4=#
db4=# select * from employee limit 1,3;
ERROR:  LIMIT #,# syntax is not supported
LINE 1: select * from employee limit 1,3;
                               ^
HINT:  Use separate LIMIT and OFFSET clauses.
db4=# select id,name,salary, dob  from employee;
   id   |      name      | salary |    dob
--------+----------------+--------+------------
  10003 | shyam kumar    |  80000 | 1992-10-10
  10004 | sunil kumar    |  34000 | 2001-12-29
  10006 | amina sekh     |  52000 | 1999-01-10
  10007 | parvin jaiswal |  82000 | 1999-01-11
  10009 |                |  52000 | 1999-01-10
 100010 |                |  52000 | 1999-01-10
 100011 | devendra kumar |        | 1991-01-10
 100012 | devendra kumar |        | 1991-01-11
  10001 | ramesh kumar   |  12000 | 1998-01-30
  10005 | imran khan     |  90000 | 1991-01-10
(10 rows)


db4=# select sum(salary)  from employee;
  sum
--------
 454000
(1 row)


db4=# select sum(salary), max(salary)  from employee;
  sum   |  max
--------+-------
 454000 | 90000
(1 row)


db4=# select sum(salary), max(salary) ,min(salary)  from employee;
  sum   |  max  |  min
--------+-------+-------
 454000 | 90000 | 12000
(1 row)


db4=# select sum(salary), max(salary) ,min(salary),avg(salary)  from employee;
  sum   |  max  |  min  |  avg
--------+-------+-------+-------
 454000 | 90000 | 12000 | 56750
(1 row)


db4=# select count(*) from employee;
 count
-------
    10
(1 row)

db4=# select count(id) from employee;
 count
-------
    10
(1 row)


db4=# select count(name) from employee;
 count
-------
     8
(1 row)


db4=#




 JOin 
 
 
 cartesian product 
 
  A -- {a,b}
  B    {c,d}


A X B = {a,c},{a,d},{b,c},{b,d}



db4=# select count(*) from employee;
 count
-------
    10
(1 row)


db4=# select *  from employee;
   id   |      name      | salary |    dob     | location |     job
--------+----------------+--------+------------+----------+-------------
 100010 |                |  52000 | 1999-01-10 | delhi    | developer
 100012 | devendra kumar |        | 1991-01-11 | delhi    | developer
  10003 | shyam kumar    |  80000 | 1992-10-10 | delhi    | developer
  10004 | sunil kumar    |  34000 | 2001-12-29 | delhi    | designer
  10006 | amina sekh     |  52000 | 1999-01-10 | delhi    | team leader
  10007 | parvin jaiswal |  82000 | 1999-01-11 | noida    | architect
  10009 |                |  52000 | 1999-01-10 | noida    | developer
 100011 | devendra kumar |        | 1991-01-10 | gt noida | designer
  10001 | ramesh kumar   |  12000 | 1998-01-30 | gurgaon  | designer
  10005 | imran khan     |  90000 | 1991-01-10 | gurgaon  | team leader
(10 rows)


db4=# select count(job)  from employee group by job;
 count
-------
     3
     1
     4
     2
(4 rows)


db4=# select count(job), job  from employee group by job;
 count |     job
-------+-------------
     3 | designer
     1 | architect
     4 | developer
     2 | team leader
(4 rows)


db4=# select count(job), job, location  from employee group by job;
ERROR:  column "employee.location" must appear in the GROUP BY clause or be used in an aggregate function
LINE 1: select count(job), job, location  from employee group by job...
                                ^
db4=# select count(job), job, location  from employee group by location;
ERROR:  column "employee.job" must appear in the GROUP BY clause or be used in an aggregate function
LINE 1: select count(job), job, location  from employee group by loc...
                           ^
db4=# select count(location), job  from employee group by job;
 count |     job
-------+-------------
     3 | designer
     1 | architect
     4 | developer
     2 | team leader
(4 rows)


db4=# select count(location), job  from employee group by location;
ERROR:  column "employee.job" must appear in the GROUP BY clause or be used in an aggregate function
LINE 1: select count(location), job  from employee group by location...
                                ^
db4=# select count(location), location  from employee group by location;
 count | location
-------+----------
     2 | noida
     5 | delhi
     2 | gurgaon
     1 | gt noida
(4 rows)


db4=# select count(location), job from employee group by location;
ERROR:  column "employee.job" must appear in the GROUP BY clause or be used in an aggregate function
LINE 1: select count(location), job from employee group by location;
                                ^
db4=# select count(location), job from employee group by job;
 count |     job
-------+-------------
     3 | designer
     1 | architect
     4 | developer
     2 | team leader
(4 rows)


db4=# select count(location), location  from employee group by job;
ERROR:  column "employee.location" must appear in the GROUP BY clause or be used in an aggregate function
LINE 1: select count(location), location  from employee group by job...
                                ^
db4=# select count(location), location  from employee group by location;
 count | location
-------+----------
     2 | noida
     5 | delhi
     2 | gurgaon
     1 | gt noida
(4 rows)


db4=# select count(location), location,   from employee group by location having location='noida';
ERROR:  syntax error at or near "from"
LINE 1: select count(location), location,   from employee group by l...
                                            ^
db4=# select count(location), location   from employee group by location having location='noida';
 count | location
-------+----------
     2 | noida
(1 row)


db4=# select count(location), job  from employee group by location;
ERROR:  column "employee.job" must appear in the GROUP BY clause or be used in an aggregate function
LINE 1: select count(location), job  from employee group by location...
                                ^
db4=# select count(job), job, location  from employee group by location;
ERROR:  column "employee.job" must appear in the GROUP BY clause or be used in an aggregate function
LINE 1: select count(job), job, location  from employee group by loc...
                           ^
db4=# select count(job), job  from employee group by job;
 count |     job
-------+-------------
     3 | designer
     1 | architect
     4 | developer
     2 | team leader
(4 rows)


db4=# select count(job), job  from employee group by job having job='designer';
 count |   job
-------+----------
     3 | designer
(1 row)


db4=# select count(location), job  from employee group by job having job='designer';
 count |   job
-------+----------
     3 | designer
(1 row)


db4=# select count(location), location,job  from employee group by job having job='designer';
                                ^
db4=# select count(location), job  from employee group by job having job='designer';
 count |   job
-------+----------
     3 | designer
(1 row)


db4=# select count(location), location   from employee group by job having job='designer';
                                ^
db4=# select count(job), job  from employee group by job;
 count |     job
-------+-------------
     3 | designer
     1 | architect
     4 | developer
     2 | team leader
(4 rows)


db4=# select count(job),max(salary) job  from employee group by job;
 count |  job
-------+-------
     3 | 34000
     1 | 82000
     4 | 80000
     2 | 90000
(4 rows)


db4=# select count(job),max(salary), min(salary) job  from employee group by job;
 count |  max  |  job
-------+-------+-------
     3 | 34000 | 12000
     1 | 82000 | 82000
     4 | 80000 | 52000
     2 | 90000 | 52000
(4 rows)



db4=# select count(location),max(salary), min(salary),avg(salary), job  from employee group by job;
 count |  max  |  min  |        avg         |     job
-------+-------+-------+--------------------+-------------
     3 | 34000 | 12000 |              23000 | designer
     1 | 82000 | 82000 |              82000 | architect
     4 | 80000 | 52000 | 61333.333333333336 | developer
     2 | 90000 | 52000 |              71000 | team leader
(4 rows)


-- using arrays

create table doctor(id int primary key, name varchar(20),salary float,location varchar(20), wokdays int [])
db4-# \d+ doctor
                                           Table "public.doctor"
  Column  |         Type          | Collation | Nullable | Default | Storage  | Stats target | Description
----------+-----------------------+-----------+----------+---------+----------+--------------+-------------
 id       | integer               |           |          |         | plain    |              |
 name     | character varying(20) |           |          |         | extended |              |
 salary   | double precision      |           |          |         | plain    |              |
 location | character varying(20) |           |          |         | extended |              |
 wokdays  | integer[]             |           |          |         | extended |              |
Access method: heap


db4=# select * from doctor;
  id   |      name       | salary | location |     wokdays
-------+-----------------+--------+----------+-----------------
 10001 | dr arvind swami | 120000 | chennai  | {1,0,1,0,0,1,1}
(1 row)


db4=# insert into doctor (id,name,salary,location,wokdays) values(10002,'dr suman rangnathan',130000,'madurai','{0,0,1,1,0,1,1}');
INSERT 0 1
db4=# insert into doctor (id,name,salary,location,wokdays) values(10003,'dr prakash ayyar ',135000,'rameswaram','{0,1,1,1,1,1,1}');
INSERT 0 1
db4=# select * from doctor;
  id   |        name         | salary |  location  |     wokdays
-------+---------------------+--------+------------+-----------------
 10001 | dr arvind swami     | 120000 | chennai    | {1,0,1,0,0,1,1}
 10002 | dr suman rangnathan | 130000 | madurai    | {0,0,1,1,0,1,1}
 10003 | dr prakash ayyar    | 135000 | rameswaram | {0,1,1,1,1,1,1}
(3 rows)


db4=# create table book_store (book_id int primary key, type varchar(20), bname varchar[20][]);
CREATE TABLE

db4=# \d+  book_store
                                        Table "public.book_store"
 Column  |         Type          | Collation | Nullable | Default | Storage  | Stats target | Description
---------+-----------------------+-----------+----------+---------+----------+--------------+-------------
 book_id | integer               |           | not null |         | plain    |              |
 type    | character varying(20) |           |          |         | extended |              |
 bname   | character varying[]   |           |          |         | extended |              |
Indexes:
    "book_store_pkey" PRIMARY KEY, btree (book_id)
Access method: heap

db4=# insert into book_store (book_id,type,bname)  values  (1000001,'computer', '{java,php,c,python,hadoop}');
INSERT 0 1

db4=# insert into book_store (book_id,type,bname)  values  (1000002,'literatur', '{story,poem,essay,humour,lecture}');
INSERT 0 1

db4=# insert into book_store (book_id,type,bname)  values  (1000002,'history', '{ancient history,history of indian,glimpse of india,moder history,history of freedom}');

db4=# insert into book_store (book_id,type,bname)  values  (1000003,'history', '{ancient history,history of indian,glimpse of india,moder history,history of freedom}');
INSERT 0 1
db4=#
db4=#
db4=# select * from book_store;
 book_id |   type    |                                              bname
---------+-----------+-------------------------------------------------------------------------------------------------
 1000001 | computer  | {java,php,c,python,hadoop}
 1000002 | literatur | {story,poem,essay,humour,lecture}
 1000003 | history   | {"ancient history","history of indian","glimpse of india","moder history","history of freedom"}
(3 rows)


                                                        ^
db4=# select array_append(ARRAY[1,2,3],77);
 array_append
--------------
 {1,2,3,77}
(1 row)

db4=# select book_id, type, bname, array_append(bname,'jython') from book_store  where type='computer';
 book_id |   type   |           bname            |           array_append
---------+----------+----------------------------+-----------------------------------
 1000001 | computer | {java,php,c,python,hadoop} | {java,php,c,python,hadoop,jython}
(1 row)

db4=# select book_id, type, bname, array_append(bname,'jython') from book_store  where type='computer';
 book_id |   type   |           bname            |           array_append
---------+----------+----------------------------+-----------------------------------
 1000001 | computer | {java,php,c,python,hadoop} | {java,php,c,python,hadoop,jython}
(1 row)


db4=# select array_length(ARRAY[1,2,3],77);
 array_length
--------------
(1 row)


db4=# select book_id, type, bname, array_append(bname,'jython') from book_store ;
 book_id |   type    |                                              bname                                              |                                              array_append
---------+-----------+-------------------------------------------------------------------------------------------------+--------------------------------------------------------------------------------------------------------
 1000001 | computer  | {java,php,c,python,hadoop}                                                                      | {java,php,c,python,hadoop,jython}
 1000002 | literatur | {story,poem,essay,humour,lecture}                                                               | {story,poem,essay,humour,lecture,jython}
 1000003 | history   | {"ancient history","history of indian","glimpse of india","moder history","history of freedom"} | {"ancient history","history of indian","glimpse of india","moder history","history of freedom",jython}
(3 rows)


db4=# select array_length(ARRAY[1,2,3],77);
 array_length
--------------

(1 row)


db4=# select array_length(ARRAY[1,2,3],77);
 array_length
--------------

(1 row)


db4=# select array_lower(ARRAY[1,2,3],77);
 array_lower
-------------
(1 row)


db4=# select array_upper(ARRAY[1,2,3],77);
 array_upper
-------------
(1 row)

db4=# create table sweets_shop( id int primary key, name varchar(20), cost float);
CREATE TABLE
db4=#
db4=# create table sweets_order(orderid int primary key, location varchar(20), sweetid int);
CREATE TABLE
db4=#
db4=# \d+ sweets_shop
                                       Table "public.sweets_shop"
 Column |         Type          | Collation | Nullable | Default | Storage  | Stats target | Description
--------+-----------------------+-----------+----------+---------+----------+--------------+-------------
 id     | integer               |           | not null |         | plain    |              |
 name   | character varying(20) |           |          |         | extended |              |
 cost   | double precision      |           |          |         | plain    |              |
Indexes:
    "sweets_shop_pkey" PRIMARY KEY, btree (id)
Access method: heap


db4=# \d+ sweets_order
                                        Table "public.sweets_order"
  Column  |         Type          | Collation | Nullable | Default | Storage  | Stats target | Description
----------+-----------------------+-----------+----------+---------+----------+--------------+-------------
 orderid  | integer               |           | not null |         | plain    |              |
 location | character varying(20) |           |          |         | extended |              |
 sweetid  | integer               |           |          |         | plain    |              |
Indexes:
    "sweets_order_pkey" PRIMARY KEY, btree (orderid)
Access method: heap


                    ^
db4=# insert into sweets_shop values(1001,'chamcham',340);
INSERT 0 1
db4=# insert into sweets_shop values(1002,'rasogulla',270);
INSERT 0 1
db4=# insert into sweets_shop values(1004,'jalebi',200);
INSERT 0 1
db4=# insert into sweets_shop values(1006,'laddu',200);
INSERT 0 1
db4=# insert into sweets_shop values(1007,'dhokala',200);
INSERT 0 1
db4=# insert into sweets_shop values(1009,'litti chokha',50);
INSERT 0 1
db4=# select * from sweets_shop;
  id  |     name     | cost
------+--------------+------
 1001 | chamcham     |  340
 1002 | rasogulla    |  270
 1004 | jalebi       |  200
 1006 | laddu        |  200
 1007 | dhokala      |  200
 1009 | litti chokha |   50
(6 rows)


db4=# \d+ sweets_order
                                        Table "public.sweets_order"
  Column  |         Type          | Collation | Nullable | Default | Storage  | Stats target | Description
----------+-----------------------+-----------+----------+---------+----------+--------------+-------------
 orderid  | integer               |           | not null |         | plain    |              |
 location | character varying(20) |           |          |         | extended |              |
 sweetid  | integer               |           |          |         | plain    |              |
Indexes:
    "sweets_order_pkey" PRIMARY KEY, btree (orderid)
Access method: heap


db4=# insert into sweets_order values(1,'delhi',1001);
INSERT 0 1
db4=# insert into sweets_order values(2,'noida',1002);
INSERT 0 1
db4=# insert into sweets_order values(3,'delhi',1003);
INSERT 0 1
db4=# insert into sweets_order values(4,'gurgaon',1004);
INSERT 0 1
db4=# insert into sweets_order values(5,'noida',1005);
INSERT 0 1
db4=# insert into sweets_order values(5,'faridabad',1006);
ERROR:  duplicate key value violates unique constraint "sweets_order_pkey"
DETAIL:  Key (orderid)=(5) already exists.
db4=# insert into sweets_order values(6,'faridabad',1006);
INSERT 0 1
db4=#
db4=#
db4=#
db4=# select * from sweets_order;
 orderid | location  | sweetid
---------+-----------+---------
       1 | delhi     |    1001
       2 | noida     |    1002
       3 | delhi     |    1003
       4 | gurgaon   |    1004
       5 | noida     |    1005
       6 | faridabad |    1006
(6 rows)


db4=# select * from sweets_shop;
  id  |     name     | cost
------+--------------+------
 1001 | chamcham     |  340
 1002 | rasogulla    |  270
 1004 | jalebi       |  200
 1006 | laddu        |  200
 1007 | dhokala      |  200
 1009 | litti chokha |   50
(6 rows)
-- cartesian  join 

db4=# select * from sweets_shop, sweets_order;
  id  |     name     | cost | orderid | location  | sweetid
------+--------------+------+---------+-----------+---------
 1001 | chamcham     |  340 |       1 | delhi     |    1001
 1002 | rasogulla    |  270 |       1 | delhi     |    1001
 1004 | jalebi       |  200 |       1 | delhi     |    1001
 1006 | laddu        |  200 |       1 | delhi     |    1001
 1007 | dhokala      |  200 |       1 | delhi     |    1001
 1009 | litti chokha |   50 |       1 | delhi     |    1001
 1001 | chamcham     |  340 |       2 | noida     |    1002
 1002 | rasogulla    |  270 |       2 | noida     |    1002
 1004 | jalebi       |  200 |       2 | noida     |    1002
 1006 | laddu        |  200 |       2 | noida     |    1002
 1007 | dhokala      |  200 |       2 | noida     |    1002
 1009 | litti chokha |   50 |       2 | noida     |    1002
 1001 | chamcham     |  340 |       3 | delhi     |    1003
 1002 | rasogulla    |  270 |       3 | delhi     |    1003
 1004 | jalebi       |  200 |       3 | delhi     |    1003
 1006 | laddu        |  200 |       3 | delhi     |    1003
 1007 | dhokala      |  200 |       3 | delhi     |    1003
 1009 | litti chokha |   50 |       3 | delhi     |    1003
 1001 | chamcham     |  340 |       4 | gurgaon   |    1004
 1002 | rasogulla    |  270 |       4 | gurgaon   |    1004
 1004 | jalebi       |  200 |       4 | gurgaon   |    1004
 1006 | laddu        |  200 |       4 | gurgaon   |    1004
 1007 | dhokala      |  200 |       4 | gurgaon   |    1004
 1009 | litti chokha |   50 |       4 | gurgaon   |    1004
 1001 | chamcham     |  340 |       5 | noida     |    1005
 1002 | rasogulla    |  270 |       5 | noida     |    1005
 1004 | jalebi       |  200 |       5 | noida     |    1005
 1006 | laddu        |  200 |       5 | noida     |    1005
 1007 | dhokala      |  200 |       5 | noida     |    1005
 1009 | litti chokha |   50 |       5 | noida     |    1005
 1001 | chamcham     |  340 |       6 | faridabad |    1006
 1002 | rasogulla    |  270 |       6 | faridabad |    1006
 1004 | jalebi       |  200 |       6 | faridabad |    1006
 1006 | laddu        |  200 |       6 | faridabad |    1006
 1007 | dhokala      |  200 |       6 | faridabad |    1006
 1009 | litti chokha |   50 |       6 | faridabad |    1006
(36 rows)


db4=#
db4=#
db4=#
db4=#
db4=# \d+ sweets_shop
                                       Table "public.sweets_shop"
 Column |         Type          | Collation | Nullable | Default | Storage  | Stats target | Description
--------+-----------------------+-----------+----------+---------+----------+--------------+-------------
 id     | integer               |           | not null |         | plain    |              |
 name   | character varying(20) |           |          |         | extended |              |
 cost   | double precision      |           |          |         | plain    |              |
Indexes:
    "sweets_shop_pkey" PRIMARY KEY, btree (id)
Access method: heap


db4=# \d+ sweets_order
                                        Table "public.sweets_order"
  Column  |         Type          | Collation | Nullable | Default | Storage  | Stats target | Description
----------+-----------------------+-----------+----------+---------+----------+--------------+-------------
 orderid  | integer               |           | not null |         | plain    |              |
 location | character varying(20) |           |          |         | extended |              |
 sweetid  | integer               |           |          |         | plain    |              |
Indexes:
    "sweets_order_pkey" PRIMARY KEY, btree (orderid)
Access method: heap

-- equi join 
db4=# select * from sweets_shop, sweets_order where id=sweetid;
  id  |   name    | cost | orderid | location  | sweetid
------+-----------+------+---------+-----------+---------
 1001 | chamcham  |  340 |       1 | delhi     |    1001
 1002 | rasogulla |  270 |       2 | noida     |    1002
 1004 | jalebi    |  200 |       4 | gurgaon   |    1004
 1006 | laddu     |  200 |       6 | faridabad |    1006
(4 rows)

-- equi join 

db4=# select * from sweets_shop, sweets_order where id=sweetid;
  id  |   name    | cost | orderid | location  | sweetid
------+-----------+------+---------+-----------+---------
 1001 | chamcham  |  340 |       1 | delhi     |    1001
 1002 | rasogulla |  270 |       2 | noida     |    1002
 1004 | jalebi    |  200 |       4 | gurgaon   |    1004
 1006 | laddu     |  200 |       6 | faridabad |    1006
(4 rows)


db4=#
db4=#
db4=# select id,name,cost,orderid,location from sweets_shop, sweets_order where id=sweetid;
  id  |   name    | cost | orderid | location
------+-----------+------+---------+-----------
 1001 | chamcham  |  340 |       1 | delhi
 1002 | rasogulla |  270 |       2 | noida
 1004 | jalebi    |  200 |       4 | gurgaon
 1006 | laddu     |  200 |       6 | faridabad
(4 rows)


db4=# select ss.id,ss.name,ss.cost, so.orderid,so.location from sweets_shop ss, sweets_order so  where id=sweetid;
  id  |   name    | cost | orderid | location
------+-----------+------+---------+-----------
 1001 | chamcham  |  340 |       1 | delhi
 1002 | rasogulla |  270 |       2 | noida
 1004 | jalebi    |  200 |       4 | gurgaon
 1006 | laddu     |  200 |       6 | faridabad
(4 rows)

-- inner join 
db4=# select ss.id,ss.name,ss.cost, so.orderid,so.location from sweets_shop ss inner join  sweets_order so  on  id=sweetid;
  id  |   name    | cost | orderid | location
------+-----------+------+---------+-----------
 1001 | chamcham  |  340 |       1 | delhi
 1002 | rasogulla |  270 |       2 | noida
 1004 | jalebi    |  200 |       4 | gurgaon
 1006 | laddu     |  200 |       6 | faridabad
(4 rows)

db4=# select ss.id,ss.name,ss.cost, so.orderid,so.location from sweets_shop ss inner join  sweets_order so  on  id=sweetid;
  id  |   name    | cost | orderid | location
------+-----------+------+---------+-----------
 1001 | chamcham  |  340 |       1 | delhi
 1002 | rasogulla |  270 |       2 | noida
 1004 | jalebi    |  200 |       4 | gurgaon
 1006 | laddu     |  200 |       6 | faridabad
(4 rows)

-- left join 
db4=# select ss.id,ss.name,ss.cost, so.orderid,so.location from sweets_shop ss left  join  sweets_order so  on  id=sweetid;
  id  |     name     | cost | orderid | location
------+--------------+------+---------+-----------
 1001 | chamcham     |  340 |       1 | delhi
 1002 | rasogulla    |  270 |       2 | noida
 1004 | jalebi       |  200 |       4 | gurgaon
 1006 | laddu        |  200 |       6 | faridabad
 1009 | litti chokha |   50 |         |
 1007 | dhokala      |  200 |         |
(6 rows)

-- right join
db4=# select ss.id,ss.name,ss.cost, so.orderid,so.location from sweets_shop ss right  join  sweets_order so  on  id=sweetid;
  id  |   name    | cost | orderid | location
------+-----------+------+---------+-----------
 1001 | chamcham  |  340 |       1 | delhi
 1002 | rasogulla |  270 |       2 | noida
      |           |      |       3 | delhi
 1004 | jalebi    |  200 |       4 | gurgaon
      |           |      |       5 | noida
 1006 | laddu     |  200 |       6 | faridabad
(6 rows)




alter commands

to modify column 

db4=# alter table employee alter column  name type  varchar(40);

to add column 

db4=# alter table employee  add  country varchar(40);

drop column 

db4=# alter table employee drop column country ;


rename column 
db4=# alter table employee rename column dob to date_of_birth;


rename table 

db4=#  alter table employee rename  to  bank_employee



join 

   -- used to join two or more than two tables using some common column name 
   
   



Server [localhost]:
Database [postgres]:
Port [5432]:
Username [postgres]:
Password for user postgres:
psql (13.4)
WARNING: Console code page (437) differs from Windows code page (1252)
         8-bit characters might not work correctly. See psql reference
         page "Notes for Windows users" for details.
Type "help" for help.

postgres=# \c db4
You are now connected to database "db4" as user "postgres".
db4=# \dt
             List of relations
 Schema |      Name      | Type  |  Owner
--------+----------------+-------+----------
 public | book_store     | table | postgres
 public | customer       | table | postgres
 public | customer1      | table | postgres
 public | employee       | table | postgres
 public | labour         | table | postgres
 public | passenger      | table | postgres
 public | product        | table | postgres
 public | product_order  | table | postgres
 public | product_return | table | postgres
 public | survey         | table | postgres
 public | sweets_order   | table | postgres
 public | sweets_shop    | table | postgres
 public | tourist        | table | postgres
(13 rows)


db4=# \d+ employee
                                          Table "public.employee"
  Column  |         Type          | Collation | Nullable | Default | Storage  | Stats target | Description
----------+-----------------------+-----------+----------+---------+----------+--------------+-------------
 id       | integer               |           | not null |         | plain    |              |
 name     | character varying(20) |           |          |         | extended |              |
 salary   | double precision      |           |          |         | plain    |              |
 dob      | date                  |           |          |         | plain    |              |
 location | character varying(20) |           |          |         | extended |              |
 job      | character varying(20) |           |          |         | extended |              |
Indexes:
    "employee_pkey" PRIMARY KEY, btree (id)
Access method: heap


db4=# insert into employee values(8080,'maharaj prthvi raj chauhan',56000,'1756-12-12','rajsthan','king');
ERROR:  value too long for type character varying(20)
db4=# qalter table employee modify name varchar(40);
ERROR:  syntax error at or near "qalter"
LINE 1: qalter table employee modify name varchar(40);
        ^
db4=# alter table employee modify name varchar(40);
ERROR:  syntax error at or near "modify"
LINE 1: alter table employee modify name varchar(40);
                             ^
db4=# alter table employee change name varchar(40);
ERROR:  syntax error at or near "change"
LINE 1: alter table employee change name varchar(40);
                             ^
db4=# alter table employee  add  country varchar(40);
ALTER TABLE
db4=# \d+ employee
                                          Table "public.employee"
  Column  |         Type          | Collation | Nullable | Default | Storage  | Stats target | Description
----------+-----------------------+-----------+----------+---------+----------+--------------+-------------
 id       | integer               |           | not null |         | plain    |              |
 name     | character varying(20) |           |          |         | extended |              |
 salary   | double precision      |           |          |         | plain    |              |
 dob      | date                  |           |          |         | plain    |              |
 location | character varying(20) |           |          |         | extended |              |
 job      | character varying(20) |           |          |         | extended |              |
 country  | character varying(40) |           |          |         | extended |              |
Indexes:
    "employee_pkey" PRIMARY KEY, btree (id)
Access method: heap


db4=# alter table employee alter name varchar(40);
ERROR:  syntax error at or near "varchar"
LINE 1: alter table employee alter name varchar(40);
                                        ^
db4=# alter table employee alter column  name type  varchar(40);
ALTER TABLE
db4=# \d+ employee
                                          Table "public.employee"
  Column  |         Type          | Collation | Nullable | Default | Storage  | Stats target | Description
----------+-----------------------+-----------+----------+---------+----------+--------------+-------------
 id       | integer               |           | not null |         | plain    |              |
 name     | character varying(40) |           |          |         | extended |              |
 salary   | double precision      |           |          |         | plain    |              |
 dob      | date                  |           |          |         | plain    |              |
 location | character varying(20) |           |          |         | extended |              |
 job      | character varying(20) |           |          |         | extended |              |
 country  | character varying(40) |           |          |         | extended |              |
Indexes:
    "employee_pkey" PRIMARY KEY, btree (id)
Access method: heap


db4=# insert into employee values(8080,'maharaj prthvi raj chauhan',56000,'1756-12-12','rajsthan','king');
INSERT 0 1
db4=#
db4=#
db4=# alter table employee drop column country ;
ALTER TABLE
db4=# \d+ employee
                                          Table "public.employee"
  Column  |         Type          | Collation | Nullable | Default | Storage  | Stats target | Description
----------+-----------------------+-----------+----------+---------+----------+--------------+-------------
 id       | integer               |           | not null |         | plain    |              |
 name     | character varying(40) |           |          |         | extended |              |
 salary   | double precision      |           |          |         | plain    |              |
 dob      | date                  |           |          |         | plain    |              |
 location | character varying(20) |           |          |         | extended |              |
 job      | character varying(20) |           |          |         | extended |              |
Indexes:
    "employee_pkey" PRIMARY KEY, btree (id)
Access method: heap


db4=# alter table employee rename column dob to date_of_birth;
ALTER TABLE
db4=# db4=# alter table employee rename  bank_employee;
ERROR:  syntax error at or near "db4"
LINE 1: db4=# alter table employee rename  bank_employee;
        ^
db4=#  alter table employee rename  bank_employee;
ERROR:  syntax error at or near ";"
LINE 1: alter table employee rename  bank_employee;
                                                  ^
db4=#  alter table employee rename  to  bank_employee;
ALTER TABLE
db4=#
db4=#
db4=#
db4=#
db4=# \dt
             List of relations
 Schema |      Name      | Type  |  Owner
--------+----------------+-------+----------
 public | bank_employee  | table | postgres
 public | book_store     | table | postgres
 public | customer       | table | postgres
 public | customer1      | table | postgres
 public | labour         | table | postgres
 public | passenger      | table | postgres
 public | product        | table | postgres
 public | product_order  | table | postgres
 public | product_return | table | postgres
 public | survey         | table | postgres
 public | sweets_order   | table | postgres
 public | sweets_shop    | table | postgres
 public | tourist        | table | postgres
(13 rows)


db4=# create table student (roll int primary key, name varchar(20), className varchar(20));
CREATE TABLE
db4=# create table examination (roll int primary key, subject varchar(20), exam_date date);
CREATE TABLE
db4=# insert into student values(10001, 'ram kumar','seven'),(10002,'mahesh kumar','six'),(10004,'sita sharma','eight');
INSERT 0 3
db4=# insert into student values(10006, 'umehs kumar','six'),(10007,'mahesh kumar','five'),(10009,'sita sharma','six');
INSERT 0 3
db4=# insert into examination values(10001,'math','2022-03-12'),(10002,'science','2022-03-21'),(10003,'english','2022-03-01');
INSERT 0 3
db4=# insert into examination values(10005,'hindi','2022-03-11'),(10007,'telugu','2022-03-21'),(10008,'tamil','2022-03-01');
INSERT 0 3
db4=# select * from student;
 roll  |     name     | classname
-------+--------------+-----------
 10001 | ram kumar    | seven
 10002 | mahesh kumar | six
 10004 | sita sharma  | eight
 10006 | umehs kumar  | six
 10007 | mahesh kumar | five
 10009 | sita sharma  | six
(6 rows)


db4=# select * from examination;
 roll  | subject | exam_date
-------+---------+------------
 10001 | math    | 2022-03-12
 10002 | science | 2022-03-21
 10003 | english | 2022-03-01
 10005 | hindi   | 2022-03-11
 10007 | telugu  | 2022-03-21
 10008 | tamil   | 2022-03-01
(6 rows)


db4=# select * from student,examination;
 roll  |     name     | classname | roll  | subject | exam_date
-------+--------------+-----------+-------+---------+------------
 10001 | ram kumar    | seven     | 10001 | math    | 2022-03-12
 10002 | mahesh kumar | six       | 10001 | math    | 2022-03-12
 10004 | sita sharma  | eight     | 10001 | math    | 2022-03-12
 10006 | umehs kumar  | six       | 10001 | math    | 2022-03-12
 10007 | mahesh kumar | five      | 10001 | math    | 2022-03-12
 10009 | sita sharma  | six       | 10001 | math    | 2022-03-12
 10001 | ram kumar    | seven     | 10002 | science | 2022-03-21
 10002 | mahesh kumar | six       | 10002 | science | 2022-03-21
 10004 | sita sharma  | eight     | 10002 | science | 2022-03-21
 10006 | umehs kumar  | six       | 10002 | science | 2022-03-21
 10007 | mahesh kumar | five      | 10002 | science | 2022-03-21
 10009 | sita sharma  | six       | 10002 | science | 2022-03-21
 10001 | ram kumar    | seven     | 10003 | english | 2022-03-01
 10002 | mahesh kumar | six       | 10003 | english | 2022-03-01
 10004 | sita sharma  | eight     | 10003 | english | 2022-03-01
 10006 | umehs kumar  | six       | 10003 | english | 2022-03-01
 10007 | mahesh kumar | five      | 10003 | english | 2022-03-01
 10009 | sita sharma  | six       | 10003 | english | 2022-03-01
 10001 | ram kumar    | seven     | 10005 | hindi   | 2022-03-11
 10002 | mahesh kumar | six       | 10005 | hindi   | 2022-03-11
 10004 | sita sharma  | eight     | 10005 | hindi   | 2022-03-11
 10006 | umehs kumar  | six       | 10005 | hindi   | 2022-03-11
 10007 | mahesh kumar | five      | 10005 | hindi   | 2022-03-11
 10009 | sita sharma  | six       | 10005 | hindi   | 2022-03-11
 10001 | ram kumar    | seven     | 10007 | telugu  | 2022-03-21
 10002 | mahesh kumar | six       | 10007 | telugu  | 2022-03-21
 10004 | sita sharma  | eight     | 10007 | telugu  | 2022-03-21
 10006 | umehs kumar  | six       | 10007 | telugu  | 2022-03-21
 10007 | mahesh kumar | five      | 10007 | telugu  | 2022-03-21
 10009 | sita sharma  | six       | 10007 | telugu  | 2022-03-21
 10001 | ram kumar    | seven     | 10008 | tamil   | 2022-03-01
 10002 | mahesh kumar | six       | 10008 | tamil   | 2022-03-01
 10004 | sita sharma  | eight     | 10008 | tamil   | 2022-03-01
 10006 | umehs kumar  | six       | 10008 | tamil   | 2022-03-01
 10007 | mahesh kumar | five      | 10008 | tamil   | 2022-03-01
 10009 | sita sharma  | six       | 10008 | tamil   | 2022-03-01
(36 rows)


db4=#
db4=#
db4=#
db4=#
db4=#
db4=#
db4=#
db4=#
db4=# \d+ student
                                           Table "public.student"
  Column   |         Type          | Collation | Nullable | Default | Storage  | Stats target | Description
-----------+-----------------------+-----------+----------+---------+----------+--------------+-------------
 roll      | integer               |           | not null |         | plain    |              |
 name      | character varying(20) |           |          |         | extended |              |
 classname | character varying(20) |           |          |         | extended |              |
Indexes:
    "student_pkey" PRIMARY KEY, btree (roll)
Access method: heap


db4=# \d+ examination
                                         Table "public.examination"
  Column   |         Type          | Collation | Nullable | Default | Storage  | Stats target | Description
-----------+-----------------------+-----------+----------+---------+----------+--------------+-------------
 roll      | integer               |           | not null |         | plain    |              |
 subject   | character varying(20) |           |          |         | extended |              |
 exam_date | date                  |           |          |         | plain    |              |
Indexes:
    "examination_pkey" PRIMARY KEY, btree (roll)
Access method: heap


db4=# select * from student,examination where student.roll=examination.roll;
 roll  |     name     | classname | roll  | subject | exam_date
-------+--------------+-----------+-------+---------+------------
 10001 | ram kumar    | seven     | 10001 | math    | 2022-03-12
 10002 | mahesh kumar | six       | 10002 | science | 2022-03-21
 10007 | mahesh kumar | five      | 10007 | telugu  | 2022-03-21
(3 rows)


db4=# select student.roll,student.name,student.classname,examination.subject, examination.exam_date from student,examination where student.roll=examination.roll;
 roll  |     name     | classname | subject | exam_date
-------+--------------+-----------+---------+------------
 10001 | ram kumar    | seven     | math    | 2022-03-12
 10002 | mahesh kumar | six       | science | 2022-03-21
 10007 | mahesh kumar | five      | telugu  | 2022-03-21
(3 rows)


db4=# select s.roll,s.name,s.classname,e.subject, e.exam_date from student s,examination e where s.roll=e.roll;
 roll  |     name     | classname | subject | exam_date
-------+--------------+-----------+---------+------------
 10001 | ram kumar    | seven     | math    | 2022-03-12
 10002 | mahesh kumar | six       | science | 2022-03-21
 10007 | mahesh kumar | five      | telugu  | 2022-03-21
(3 rows)


db4=# select * from student;
 roll  |     name     | classname
-------+--------------+-----------
 10001 | ram kumar    | seven
 10002 | mahesh kumar | six
 10004 | sita sharma  | eight
 10006 | umehs kumar  | six
 10007 | mahesh kumar | five
 10009 | sita sharma  | six
(6 rows)


db4=# select * from examination;
 roll  | subject | exam_date
-------+---------+------------
 10001 | math    | 2022-03-12
 10002 | science | 2022-03-21
 10003 | english | 2022-03-01
 10005 | hindi   | 2022-03-11
 10007 | telugu  | 2022-03-21
 10008 | tamil   | 2022-03-01
(6 rows)


db4=# select s.roll,s.name,s.classname,e.subject, e.exam_date from student s,examination e where s.roll(+)=e.roll;
ERROR:  syntax error at or near ")"
LINE 1: ...am_date from student s,examination e where s.roll(+)=e.roll;
                                                              ^
db4=# select s.roll,s.name,s.classname,e.subject, e.exam_date from student s,examination e where s.roll=e.roll;
 roll  |     name     | classname | subject | exam_date
-------+--------------+-----------+---------+------------
 10001 | ram kumar    | seven     | math    | 2022-03-12
 10002 | mahesh kumar | six       | science | 2022-03-21
 10007 | mahesh kumar | five      | telugu  | 2022-03-21
(3 rows)


db4=# select s.roll,s.name,s.classname,e.subject, e.exam_date from student s inner join examination e on  s.roll=e.roll;
 roll  |     name     | classname | subject | exam_date
-------+--------------+-----------+---------+------------
 10001 | ram kumar    | seven     | math    | 2022-03-12
 10002 | mahesh kumar | six       | science | 2022-03-21
 10007 | mahesh kumar | five      | telugu  | 2022-03-21
(3 rows)


db4=# select s.roll,s.name,s.classname,e.subject, e.exam_date from student s left  join examination e on  s.roll=e.roll;
 roll  |     name     | classname | subject | exam_date
-------+--------------+-----------+---------+------------
 10001 | ram kumar    | seven     | math    | 2022-03-12
 10002 | mahesh kumar | six       | science | 2022-03-21
 10007 | mahesh kumar | five      | telugu  | 2022-03-21
 10009 | sita sharma  | six       |         |
 10004 | sita sharma  | eight     |         |
 10006 | umehs kumar  | six       |         |
(6 rows)


db4=# select * from student;
 roll  |     name     | classname
-------+--------------+-----------
 10001 | ram kumar    | seven
 10002 | mahesh kumar | six
 10004 | sita sharma  | eight
 10006 | umehs kumar  | six
 10007 | mahesh kumar | five
 10009 | sita sharma  | six
(6 rows)


db4=# select s.roll,s.name,s.classname,e.subject, e.exam_date from student s right  join examination e on  s.roll=e.roll;
 roll  |     name     | classname | subject | exam_date
-------+--------------+-----------+---------+------------
 10001 | ram kumar    | seven     | math    | 2022-03-12
 10002 | mahesh kumar | six       | science | 2022-03-21
       |              |           | english | 2022-03-01
       |              |           | hindi   | 2022-03-11
 10007 | mahesh kumar | five      | telugu  | 2022-03-21
       |              |           | tamil   | 2022-03-01
(6 rows)


db4=# select * from examination;
 roll  | subject | exam_date
-------+---------+------------
 10001 | math    | 2022-03-12
 10002 | science | 2022-03-21
 10003 | english | 2022-03-01
 10005 | hindi   | 2022-03-11
 10007 | telugu  | 2022-03-21
 10008 | tamil   | 2022-03-01
(6 rows)


db4=# select e.roll,s.name,s.classname,e.subject, e.exam_date from student s,examination e where s.roll(+)=e.roll;
ERROR:  syntax error at or near ")"
LINE 1: ...am_date from student s,examination e where s.roll(+)=e.roll;
                                                              ^
db4=# select s.roll,s.name,s.classname,e.subject, e.exam_date from student s right  join examination e on  s.roll=e.roll;
 roll  |     name     | classname | subject | exam_date
-------+--------------+-----------+---------+------------
 10001 | ram kumar    | seven     | math    | 2022-03-12
 10002 | mahesh kumar | six       | science | 2022-03-21
       |              |           | english | 2022-03-01
       |              |           | hindi   | 2022-03-11
 10007 | mahesh kumar | five      | telugu  | 2022-03-21
       |              |           | tamil   | 2022-03-01
(6 rows)


db4=# select e.roll,s.name,s.classname,e.subject, e.exam_date from student s right  join examination e on  s.roll=e.roll;
 roll  |     name     | classname | subject | exam_date
-------+--------------+-----------+---------+------------
 10001 | ram kumar    | seven     | math    | 2022-03-12
 10002 | mahesh kumar | six       | science | 2022-03-21
 10003 |              |           | english | 2022-03-01
 10005 |              |           | hindi   | 2022-03-11
 10007 | mahesh kumar | five      | telugu  | 2022-03-21
 10008 |              |           | tamil   | 2022-03-01
(6 rows)


db4=#