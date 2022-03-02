show databases;
create database cts_22;
use cts_22;
show tables;

create table employee(id int primary key, name varchar(20), salary float(10,2));
describe employee;
desc employee;
insert  into employee values(10001, 'mohan  kumar',20000);
insert  into employee values(10002, 'umesh  kumar',22000);
insert  into employee values(10003, 'suresh  kumar',30000);
insert  into employee values(10004, 'shyam  kumar',10000);
insert  into employee values(10005, 'rajesh  kumar',12000);
insert  into employee values(10006, 'manoj  kumar',29000);

select * from employee;
select * from employee where id=10001;
select * from employee where id>10001 and id<=10004;
select * from employee where id between 10001 and 10004;
select * from employee where id=10001 or name='suresh  kumar';
select * from employee where id=10001 or name='anand  kumar';
select * from employee where id=10001 and name='suresh  kumar';
select * from employee where id=10001 and name='mohan  kumar';

-- sorting  -- order by 
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
alter table employee change  dob  date_of_birth date;
