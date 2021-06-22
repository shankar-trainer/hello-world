
select version();
select current_date();
select now();

create database db1;
drop database db1;
show databases;
use db1;
show tables;
create table employee(id int primary key, name varchar(20), salary float(10,2));
desc employee;
insert into employee values(1001,'ram kumar', 20000);
insert into employee values(1002,'laxman kumar', 30000);

insert into employee values(9002,'amit kumar', 70000);
select * from employee;

select count(*) from employee;
select sum(salary) from employee;

select avg(salary) as "average salary" from employee;
select min(salary) from employee;
select max(salary) from employee;



select id,name from employee;
select * from employee where id=1001;

select * from employee where id>=1001 and id<1005;


insert into employee values(9001,'manmohan kumar', 12345678.99);

insert into employee values(9009,'manmohan kumar', 123456789.99);
insert into employee values(9010,'manmohan kumar', 12345678.99788);


select * from employee order by name desc;


select emp_id, name, salary from employee;
select emp_id as "employee id", name as "emp name", salary, salary-salary*0.05 as "netsalary"  from employee;


select * from employee where id>=1001 or id<1005;
show columns from employee;

describe employee;

alter table employee add dob date;

alter table employee modify salary float(15,2);

select current_date;

use db1;
select * from employee;

update employee set city='chennai';
update employee set city='mathura' where emp_id=9002;
update employee set city='mathura', name='pritam kumar' where emp_id=9002;

delete from employee where emp_id=8001;


alter table employee change id emp_id int;
desc employee;
alter table employee add location varchar(20);
alter table employee add city varchar(20);
describe employee;
alter table employee  drop location; 
select user();

insert into employee values(8002,null,78000,'1999-11-28','madurai');
insert into employee(emp_id,name) values(8009,'paranav kumar');

create table mybook (isbn int primary key ,bname  varchar(20) unique not null);
describe mybook;
insert into mybook values(9978979,'java book')

create table book (isbn int primary key ,bname  varchar(20) unique not null, cost float(10,2), check (cost>=500));
insert into book values(7766,'mybook spring',200);
insert into book values(7766,'mybook spring',500);
create table customer (id int primary key,name varchar(20) default 'suman kumar');
insert into customer (id) values(10001);

use db1;

select * from customer;

create table student (roll int primary key, name varchar(20), subject varchar(20), marks float(5,2));
desc student;

create table student_address(addr_roll int , sector varchar(20) , city varchar(20), state varchar(20), foreign key(addr_roll)
 references student(roll) );
 use db1;
 insert into student values(1001, 'harendra kumar','math',89.56);
insert into student_address values(1001,'sec A','noida','up');
 insert into student_address values(1002,'sec A','noida','up');
-- insert first in parent then in child table
-- delete from child then from parent 
  
 delete from student_address  where addr_roll=1001;
 delete from student where roll=1001;
  
create table schoolStudent(roll int , name varchar(20), subject varchar(20), primary key(roll));  
create table schoolExam(roll int primary key,date_of_exam date, location varchar(20));

insert into schoolStudent values(1007,'rajeev kumar','social science');
insert into schoolExam values(1008,'2021-08-18','noida');

select current_date;
select * from schoolStudent;

select * from schoolExam;
select roll,date_format(date_of_exam,'%m-%d-%Y'),location from schoolExam;

select str_to_date('02-12-2002','%m-%d-%Y');

select * from employee where salary<=(select max(salary)  from employee);
select * from employee where salary=(select min(salary)  from employee);

select * from employee where salary in (select max(salary)  from employee);

select * from employee;

create table emp(id int primary key,name varchar(20), salary int, department varchar(20), location varchar(20));
insert into emp values(1007, 'rahul kumar',87000, 'hr','noida');

select * from emp;
select avg(salary), department from emp group by department;

select id,count(*),avg(salary), department, location from emp group by location;


desc emp;

select id,name,avg(salary) over (partition by department ) from emp ;
select id,name,rank() over (partition by department ) from emp ;




select ss.roll,ss.name, ss.subject, e.roll,e.date_of_exam,e.location from schoolStudent ss, schoolExam e; 

select ss.roll,ss.name, ss.subject, e.roll,e.date_of_exam,e.location from schoolStudent ss, schoolExam e where ss.roll=e.roll;

select ss.roll,ss.name, ss.subject, e.roll,e.date_of_exam,e.location from schoolStudent ss left join schoolExam e on  ss.roll=e.roll;
select ss.roll,ss.name, ss.subject, e.roll,e.date_of_exam,e.location from schoolStudent ss right join schoolExam e on  ss.roll=e.roll;




use db1;
create table product(prd_Id int primary key, prd_name varchar(20), prd_cost float(10,2));
use db1;
desc product;
insert into product values(6761,'java book',1234.56);
insert into product values(6762,'pant',1500.78);
insert into product values(6763,'shirt',934);
insert into product values(6764,'mobile',12000.5);
select * from product; 
select count(*) from product; 
delete  from product;

delimiter //

create  procedure  avgCost()
begin
select avg(prd_cost) from product;
end //

delimiter ;
call avgCost();

delimiter //

create  procedure  searchProduct(in id int,out name varchar(20),out cost float(10,2))
begin
select prd_name,prd_cost into name,cost from product where prd_id=id ;
end //
delimiter ;

call searchProduct(6762,@name,@cost1);
select @name,@cost1;
  
 
 SET  AUTOCOMMIT =0;
 
 create table person(id int primary key, name varchar(20));
 insert into person values(1001, 'ram kumar');
 insert into person values(1002, 'mohan kumar');
 select * from person;
 delete from person;
 rollback;
 commit;
 
 use db1;
 select count(*) from product;
 delete from product;

use db1;
desc product;
set sql_mode='STRICT_ALL_TABLES';
insert into product (id,name,cost) values(565665,'java book', 567.00);
insert into product (id,name,cost) values(565666,'laptop', 50000.00);
insert into product (id,name,cost) values(565667,'mobile', 12000);
insert into product  (id,name,cost)values(565668,'spring book', 2000);
insert into product (id,name,cost) values(565669,'cycle', 10000);
select * from product;















use db1;
select * from student;
select * from address;

insert into address values(1,'chennai','tamil nadu');
 insert into address values(2,'lucknow','UP');
insert into student values(1001,'ram kumar',1);
insert into student values(1002,'mohan kumar',2);


select * from student;
select * from address;
delete from student;
delete from address;

