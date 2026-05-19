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
 -- parent table 
 create table customer_order(order_id int , order_name varchar(20) not null,cost float not null, cust_id int, 
 primary key(order_id), foreign key (cust_id) references customer(cust_id));
  
 -- child table
  create table customer(cust_id int , name varchar(20) not null, location varchar(20) not null default 'chennai',
    primary key(cust_id));
    
desc customer;
desc customer_order;
 insert into customer_order values(1,'book order',1788, 1001);  -- first add record to child table  then add to parent
  insert into customer_order values(2,'book order',1788, 1002);
 insert into customer values(1001,'a kumar','madurai');    -- add record here then in parent table 
 insert into customer values(1002,'a kumar','madurai');

delete from customer where cust_id=1001;
delete from customer_order where cust_id=1001; -- first delete from parent then child table 


select * from customer; 
select * from customer_order; 


select * from customer where cust_id=1001; 

-- aggregate function

select * from employee;
select count(*) from employee;
select sum(salary) from employee;
select sum(salary) as "total salary" from employee;
select avg(salary) as "average salary" from employee;
select max(salary) as "max salary" from employee;
select min(salary) as "minimum salary" from employee;

create table department (deptid int primary key, dept_name varchar(20), dept_loc varchar(20), no_of_employee int);
insert into department values(9001,'transport','delhi', 20);
insert into department values(9002,'training','noida', 30);
insert into department values(9003,'development','delhi', 20);
insert into department values(9004,'transport','chennai', 20);
insert into department values(9005,'development','madurai', 20);
insert into department values(9006,'development','delhi', 10);
insert into department values(9007,'training','hyderabad', 20);
insert into department values(9008,'development','hyderabad', 20);

select   count(dept_name) , dept_name from department  group by  dept_name;
select   count(dept_name) , dept_name, dept_loc from department  group by  dept_name;

select   count(dept_loc) , dept_loc, dept_name from department  group by  dept_loc;
select   count(dept_name) , dept_name,dept_loc from department  group by  dept_name having dept_name='transport';


-- join 

create table student (roll int primary key, name varchar(20) , location varchar(20));
create table examination (roll int primary key, subject varchar(20) , marks varchar(20));

insert into student values(1001, 'surendra kumar','delhi');
insert into student values(1003, 'virendra kumar','delhi');
insert into student values(1004, 'amar kumar','noida');
insert into student values(1006, 'amit kumar','gurgaon');
insert into student values(1007, 'jagadish kumar','delhi');

insert into examination values(1001, 'math',90);
insert into examination values(1002, 'science',80);
insert into examination values(1005, 'social science',78);
insert into examination values(1006, 'english',88);
insert into examination values(1007, 'hindi',91);
insert into examination values(1008, 'marathi',90);
use montran;
-- cartesian product
select * from student,examination;
-- equi join   old syntax  all  fields 
select * from student,examination where student.roll=examination.roll;

-- equi join   old syntax  using table name with fields
select student.roll, student.name, student.location, examination.subject, examination.marks  
 from student,examination where student.roll=examination.roll;

-- equi join   old syntax  using table alias with fields
select s.roll, s.name, s.location, e.subject, e.marks  
 from student s,examination e where s.roll=e.roll;

-- equi join or inner  join ansi sql  syntax  using table alias with fields
select s.roll, s.name, s.location, e.subject, e.marks  
 from student s inner join  examination e on s.roll=e.roll;

-- left join 
select s.roll, s.name, s.location, e.subject, e.marks  
 from student s left join  examination e on s.roll=e.roll;

 -- left join list of student who have not appeared in examination

 select s.roll, s.name, s.location, e.subject, e.marks  
 from student s left join  examination e on s.roll=e.roll where e.roll is null;
-- right join 
 select s.roll, s.name, s.location, e.subject, e.marks  
 from student s right join  examination e on s.roll=e.roll;

select * from employee;

create table  employee_1 as select * from employee where 1<0;
 desc employee_1;
 select * from employee_1;
 alter table  employee_1 drop column dob;
alter table  employee_1  add  designation varchar(20);
alter table  employee_1  add  manager_id int;
insert into employee_1 values (1001, 'suraj kumar',70000, 'clerk', 1003);
insert into employee_1 values (1002, 'amit kumar ',60000, 'consultant', 1004);
insert into employee_1 values (1003, 'sunil kumar ',90000, 'manager', null);
insert into employee_1 values (1004, 'pravin kumar ',95000, 'manager', null);

select * from employee_1;

select * from employee_1 e1, employee_1 e2 where e1.emp_id=e2.manager_id;

select e1.emp_id,e1.name, e1.salary ,  ' are manager of ' as '  ---->', e2.name   from employee_1 e1, 
employee_1 e2 where e1.emp_id=e2.manager_id;

-- sub query 
select max(salary) from employee_1;
select * from employee_1 where salary=95000;
select * from employee_1; 
 select * from employee_1 where salary=(select max(salary) from employee_1);
 select * from employee_1 where salary=(select min(salary) from employee_1);

-- using self  join 
select e1.emp_id,e1.name, e1.salary ,  ' are manager of ' as '  ---->', e2.name   from employee_1 e1, 
employee_1 e2 where e1.emp_id=e2.manager_id;
-- same result using subquery 
select emp_id,name, salary from employee_1 where emp_id in(select emp_id from employee_1 where 
    designation='manager' ); 


-- students who have not appered exam
 select s.roll, s.name, s.location, e.subject, e.marks  
 from student s left join  examination e on s.roll=e.roll where e.roll is null;
-- same output using subquery 
 select s.roll, s.name, s.location 
 from student s where s.roll not in( select distinct(roll) from examination);

--    student appeared at exam  using inner join 
select s.roll, s.name, s.location, e.subject, e.marks  
 from student s inner join  examination e on s.roll=e.roll;
-- same output using subquery 
 select roll, name, location 
 from student  where roll in( select distinct(roll) from examination);

select roll from student  where  exists( select distinct(roll) from examination);
select roll,name,location from student  where  exists( select distinct(roll) from examination);
select roll,name,location from student  where  not exists( select distinct(roll) from examination);



create table user1 (id int primary key, name varchar(20), city varchar(20));
create table user2 (id int primary key, name varchar(20), city varchar(20));

insert into user1 values(10001, 'a kumar' ,'chennai');
insert into user1 values(10002, 'pankaj kumar' ,'madurai');
insert into user1 values(10003, 'pawan kumar' ,'chennai');
insert into user1 values(10004, 'sawan  kumar' ,'madurai');

insert into user2 values(10001, 'a kumar' ,'chennai');
insert into user2 values(10002, 'raman kumar' ,'chennai');
insert into user3 values(10003, 'mohan kumar' ,'delhi');
insert into user2 values(10004, 'janardan kumar' ,'noida');

select * from user1;

select * from user2;

select * from user1
union 
select * from user2;

select city from user1
union 
select city from user2;
  --  view   create 
create view employee_view as select * from employee;
 -- execure view 
select * from employee_view;
 -- update view
update   employee_view set name='laxmi kant' where emp_id=801;
-- insert into view 
 insert into employee_view values(8080,'suman parbhu',67000,'2000-11-11'); 
 -- delete view 
  delete from  employee_view where emp_id=802;
  -- drop view 
   drop view employee_view;

create view union_view as  
select * from user1
union 
select * from user2;

select * from union_view;

-- sequence  not supported in  mysql 
-- h2.jar for sequence ,minus 

create table employee( id int primary key, name varchar(20));
-- create sequence emp_seq;
insert into employee values(emp_seq.nextval, 'mahesh kumar');
--  create sequence seq4 start with 1000;
insert into employee values(seq4.nextval, 'mahesh kumar');
select * from employee;
delimiter ;
drop procedure emp_search;
delimiter //
create procedure emp_search1(empid1 int ,out name1 varchar(20), out salary1 float)
begin
select name,salary  into name1,salary1 from employee where emp_id=empid1;
end;
//

call emp_search1(802,@name,@salary);
select @name, @salary;
-- trigger 
create table log(user varchar(20),time date);
select * from  log;
delimiter //
create trigger emp_trg1 after insert on employee  for each row 
begin
insert into log values(current_user(), now());
end;
//
select * from log//
select * from employee;
insert into employee values(6,'p k',8998899,'2001-10-10');

delimiter ;
create table employee_backup as select * from employee where 1<0;

delimiter //

create trigger emp_backup  after delete  on employee  for each row
begin 
insert into employee_backup values(old.emp_id, old.name,old.salary,old.dob);

end ;
//
desc employee//
 
select * from employee//
desc employee;
delete from employee//


use montran;
create table test1(dob date);
desc test1;

insert into test1 values('2020-10-10');

select * from test1 where month(dob)=10;



use montran;
select * from employee;
select count(*) from employee;

desc employee;
select * from survey;
delimiter //

select * from student;
select * from employee;
insert into employee values(10001, 'deepak anand',89000,'1999-12-23');
insert into employee values(10002, 'abhishek anand',90000,'1999-12-23');
insert into employee values(10003, 'jeet anand',19000,'1999-12-23');
insert into employee values(10004, 'pritam anand',29000,'1999-12-23');
insert into employee values(10005, 'subhaam anand',44000,'1999-12-23');

select * from employee;

delimiter //
create procedure emp_avg_salary()
begin
select avg(salary) from employee;
end;
//
call emp_avg_salary;

select * from employee;
delimiter //
create procedure emp_update_salary()
begin
update employee set salary=salary*0.05+salary ;
end;
//
call emp_update_salary;








