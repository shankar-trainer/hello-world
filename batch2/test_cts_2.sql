show databases;
create database cts_db2;
use cts_db2;
show tables;
create table employee(id int(10) primary key, name varchar(20),salary float(10,2));
desc employee;

delete from employee where name='suresh kumar';
delete from employee where id=10001;
delete from employee;
insert into employee values(10001, 'suresh kumar',12000.54545);
insert into employee values(10009, 'umesh kumar',18000.54545);
insert into employee values(10004, 'karan kumar',11000.54545);
insert into employee values(100010, 'puroshottam kumar',10000.54545);

select * from employee;
select * from employee where id=10004 ; 
select * from employee where id=10004 or name='umesh kumar';
select * from employee where id=10004 and name='umesh kumar';
select * from employee where id=10004 and name='karan kumar'; 

select * from employee where salary>=10000 and salary<=12000;
select * from employee where salary  between  10000 and 12000;

select * from employee order by id;
select * from employee order by salary;
select * from employee order by name;
select * from employee order by salary desc;

show create table employee;

alter table employee add dob date;
desc employee;

select * from employee;

update employee set dob='1999-10-30' where id=10001;
update employee set dob='1998-01-25', salary=30000 where id=10004;

alter table employee modify  name varchar(40);

desc employee;
insert into employee values(9001, 'puroshottam kumar sharma',10000.54545,'1996-10-10');
select * from employee;

alter table employee change   id empid int;
select empid,name from employee;
select salary,name from employee;


insert into employee (empid,name)values(9002, 'krishna kumar');










select current_date();

show databases;
use cts_db2;
show tables;

desc employee;

create table customer( customer_id int not null, customer_name varchar(20) not null,city varchar(20) unique not null,
country_name varchar(20) not null, primary key(customer_id));

insert into customer (customer_id, customer_name) values(10001,'priyanshu kumar');
insert into customer  values(10001,'priyanshu kumar', 'chennai','india');

insert into customer  values(10002,'amrendra kumar', 'madurai','india');

create table passenger(passenger_id int, passenger_name varchar(20) not null, country_code varchar(20) not null  ,
age int not null, primary key(passenger_id,country_code));

insert into passenger values(10001,'ram kumar','ne',41);
insert into passenger values(10002,'rajesh kumar','sri',41);
select * from passenger;

desc passenger;
drop table passenger;
-- child table
create table sweets_customer(cid int , cname varchar(20) not null, location varchar(20) not null, 
primary key(cid));
-- parent table
create table sweets_order(order_id int , order_date date not null, customer_id int not null, primary key(order_id),
 foreign key(customer_id) references sweets_customer(cid));
 
 insert into sweets_order values(98998,'2021-06-21',9001);
 insert into sweets_order values(98999,'2021-05-21',9005);
 insert into sweets_order values(9855,'2021-05-21',1001);
 
 -- first add record in child table sweets_customer thyen in parent 
 insert into sweets_customer values(9008,'kamal kumar','madurai');
 
select sc.cid, sc.cname,sc.location, so.order_id,so.order_date from    sweets_customer sc, sweets_order so
 where sc.cid=so.customer_id;
 
 select * from sweets_customer;
 select * from sweets_order;
  
  delete from sweets_customer where cid=9008;
  delete from sweets_order where customer_id=9008;
drop table sweets_order;

desc customer;

create table book(isbn int , bname varchar(20)  unique not null default 'sql beginner', cost float not null, 
check(cost>=400));
drop table book;
insert into book(isbn,cost) values(10001, 800);
insert into book values(10001, 'sql for dummies',500);
select * from book;


create table mobile(id int primary key, cost float, mb_no bigint);
drop table mobile;
create table mobile(id int primary key, cost float, mb_no int);

insert into mobile values(6565,67000,9009001234); 

create table examination (exam_id int primary key, exam_date date, exam_time time , exam_year year, 
entry_value datetime); 

insert into examination values(565665,current_date(), '12:00:00','2021','2021-10-06 11:40:45');
select * from examination;

create table survey(surve_id int not null primary key auto_increment,
survey_name varchar(20) unique not null ,state varchar(20) not null );
desc survey;

insert into survey (survey_name,state) values('pollution','karnataka');
insert into survey (survey_name,state) values('poverty','andhra');

insert into survey  values(9001,'education survey','tamil nadu');
insert into survey (survey_name,state) values('electricity survey','tamil nadu');

select  distinct(state) from survey;
select  (state) from survey;
select * from survey limit 3;
select * from survey limit 3,5;
select * from survey where state='tamil nadu' or state='karnataka';
select * from survey where state in ('tamil nadu' , 'karnataka');

select * from student;
select * from employee where name like 'k%';
select * from employee where name like '%ar';
select * from employee where name like '%u%';
select * from employee where name like '__m%';
select * from employee where name like '_a%';
show tables;

select * from customer;
select * from book;
select * from employee;
insert into employee (id,name) values(6001,'mahesh kumar');
insert into employee (id,name) values(6002,'suresh kumar');
insert into employee (id,name) values(6003,'jagdish kumar');
insert into employee (id,name) values(6004,'amrendra kumar');
insert into employee (id,name) values(6005,'rahul kumar');
select * from employee;

-- select * from employee where salary=null;
select * from employee  where salary is null;
select * from employee  where salary is not null;
select * from book;

select isbn,count(*) ,bname ,cost from book group by bname ;
select max(cost) ,bname ,cost from book group by bname ;
select isbn,count(*) ,bname ,cost from book group by bname having isbn=8; 
desc employee;

select isbn,bname,avg(cost)   from book group by bname ;
select isbn, bname, avg(cost) over (partition by bname) "total"  from book;

select isbn, bname, sum(cost) over (partition by bname) "total"  from book;
select isbn, bname, rank() over (partition by bname order by isbn) "total"  from book;


select * from employee;
 show create table employee;
use cts_db1;
create table department(dept_id int, dept_name varchar(20) not null unique, dept_location text not null, emp_id int not null,
  primary key(dept_id));
 drop table departmemt;
 
insert into department values(1,'training', 'noida', 8001);
CREATE TABLE `employee` (
  `empid` int(11) NOT NULL,
  `name` varchar(40) DEFAULT NULL,
  `salary` float(10,2) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  PRIMARY KEY (`empid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

insert into department values(2,'transport', 'delhi', 8010);
insert into department values(3,'loan', 'gurgaon', 8002);
insert into department values(4,'development', 'faridabad', 8003);
insert into department values(5,'delievery', 'noida', 8011);
insert into department values(6,'charity', 'noida', 8007);

select * from department;

use cts_db2;
select * from employee;
-- cartesian product 
select  employee.id, employee.name, employee.salary, department.dept_id, department.dept_name, department.dept_location
 from employee, department;

-- equi join with old sql syntax 
select  employee.id, employee.name, employee.salary, department.dept_id, department.dept_name, department.dept_location
 from employee, department where employee.id=department.emp_id;

-- equi join with ansi  sql syntax 
select  employee.id, employee.name, employee.salary, department.dept_id, department.dept_name, department.dept_location
 from employee inner join  department on employee.id=department.emp_id;

-- equi join with ansi  sql syntax  using table alias
select  emp.id, emp.name, emp.salary, dep.dept_id, dep.dept_name, dep.dept_location
 from employee  emp inner join  department dep  on emp.id=dep.emp_id;


-- left outer join 
select  employee.id, employee.name, employee.salary, department.dept_id, department.dept_name, department.dept_location
 from employee left join  department on employee.id=department.emp_id;

-- right outer join 
select  employee.id, employee.name, employee.salary, department.dept_id, department.dept_name, department.dept_location
 from employee right join  department on employee.id=department.emp_id;


  
select * from book;
select * from employee;

select * from employee where salary=12000000.00;

select max(salary) from employee;

select * from employee where salary=(select max(salary) from employee);
select * from employee where salary=(select min(salary) from employee);

select * from employee  where  id in (select  emp_id from department);
select * from employee  where  id not in (select  emp_id from department);
select * from employee  where   exists (select  emp_id from department);
select * from employee  where  not exists (select  emp_id from department);



use cts_db1;
desc book;
select * from book;

insert into book (isbn,bname,cost) values(6556,'java beginner', 566);
show tables;


desc customer;

desc student;
select * from student;
delete from student where subject is null;

set delimiter //
drop procedure searchStudent;
create procedure searchStudent(roll1 int,out name1 varchar(20),out subject1 varchar(20),out marks1 int, out dob1 date)
begin
select name,subject,marks,date_of_birth into name1,subject1,marks1,dob1 from student where roll=roll1;
end;

 

