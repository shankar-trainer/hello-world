create database montran;
show databases;
use montran;
show tables;
select user();
select current_date();
select now();
create table employee(id int primary key, name varchar(20), salary float(10,2));
show tables;
describe employee;
desc employee;
select * from employee;
insert into employee values(1001,'deepak kumar', 20000);
insert into employee values(1002,'sanjay kumar', 30000);
insert into employee values(1003,'pawan kumar', 12000);
insert into employee values(1004,'rahul kumar', 11000);
insert into employee values(1005,'laxminarayan  kumar', 90000);
select * from employee;
select id,name from employee;
select id,name, salary from employee;

select id,name from employee where id=1001;
select id,name from employee where id=1001 or name='sanjay kumar' ;
select id,name from employee where id=1001 and name='sanjay kumar' ;
select id,name from employee where id=1001 and name='deepak kumar' ;

select * from employee where  salary >20000;
-- below both are same 
select * from employee where  salary >=10000  and salary <=20000;
select * from employee where  salary between 10000  and 20000;
-- sorting  using order by 
select * from employee order by name;
select * from employee order by name desc;   -- sort by descending order
 
desc employee;
alter table employee add dob date; -- add the new column 
alter table employee modify name varchar(40); -- modify column data type 
alter table employee change id emp_id int; -- change the column name
alter table employee drop  dob; -- drop thye column name 


insert into employee values(801,'mr. laxmi narayan prasad sinha', 90000, current_date());
insert into employee values(802,'laxmi babu', 60000, '1998-12-26'); -- date single quote 'yyyy-mm-dd'
insert into employee (emp_id,name) values(8023,'anil kumar');

select * from employee where emp_id=8023;
update  employee set salary=80000, dob='1977-12-30' where emp_id=8023;

-- select length('mr. laxmi narayan prasad sinha');
select * from employee;
delete from employee; -- delete all record
delete from employee where emp_id=1001; 
desc employee;
-- unique , not null , primary key constraint 
create table book(isbn int  , bname varchar(20) not null unique, author  varchar(20) not null, primary key(isbn));
 desc book;
 insert into book values(1001,null,null);
 
 insert into book values(1001,'sql beginner','prashant kishor');
 insert into book values(1002,'sql for dummies','prashant kishor');
 -- check contraint 
 create table product (prdid int, prdname varchar(20) unique not null, cost float  (10,2) not null, 
 primary key(prdid), check(cost>=100 and cost<=1000)); 
 
 insert into product values(9789, 'java beginner book',789.5677);
 insert into product values(9787, 'java beginner book',1789.5677);
 
insert into employee (emp_id,name) values(8028,'anil kumar');
insert into employee  values(8029,null, null,null);
-- default constraint 
create table mobile(id int , model varchar(20) not null  default 'samsung', cost float(10,2) not null,
  primary key(id),check(cost>=5000 and cost<=20000)); 

insert into mobile (id,cost) values(78887,15345.4567766);
select * from mobile;

select * from employee; 







