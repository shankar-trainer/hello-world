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










		 