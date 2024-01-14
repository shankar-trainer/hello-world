show databases;

create database coforge;
drop database coforge;

create database coforge;
use coforge;

show tables;

create table test1(id int, name varchar(20)); 

-- create table test1(col_name  data type , col_name data_type); 
desc test1;

insert into test1 values('hello','hello');
insert into test1 values(10001,'hello');
insert into test1 values(10001,'hello');
insert into test1 values(10001,'hello');

select * from test1;
create table employee(id int primary key, name varchar(20), 
salary float(10,2));
desc employee;
insert into employee values(10001,'ram kumar',20000.545454,'2001-10-12');
select * from employee;
select id from employee;
select id,name from employee;
select id,name,salary  from employee;

-- adding multiple records 

insert into employee values
(10003,'arvind kumar',14000.545454,'2001-10-12'),
(10004,'jayant kumar',24000.545454,'2001-11-12'),
(10005,'suresh kumar',434000.545454,'2001-12-12'),
(10006,'shyam kumar',56000.545454,'2003-10-12');

select * from employee;

select id as "employee id ", name "employee name", salary from em
ployee;
 select id as "employee id ", name "employee name", 
 salary- salary*0.1 "gross salary",  salary  from employee;
 
 
 -- sort the record bt order by 
select * from employee order by name;
select * from employee order by name asc;
select * from employee order by id ;

select * from employee order by name desc;
 
 select * from employee where  id=10001;
 select * from employee where  id=776778;
 select * from employee;
 
select * from employee where  id=10003 or name='suresh kumar' ;
select * from employee where  id=50001 or name='suresh kumar' ;
select * from employee where  id=10003 or name='suresh kumar' ;
select * from employee where  id=10003 and name='suresh kumar' ; 

select * from employee  where salary>=30000;
select * from employee  where salary>=20000 and salary<=70000;
select * from employee  where salary between 20000 and 70000;

alter table employee add column dob date;

desc employee;
select current_date();

insert into employee values(90001,'pawan kumar',45000,
current_date);

insert into employee values(90002,'suman kumar',55000,
'1999-12-10');

use coforge;
show tables;
alter table employee add column entry_time time;
select current_date();
select current_time();
select now();
desc employee;
insert into employee values(90003,'aman kumar',59000,'1996-12-30','09:00:00');
select * from employee;
desc employee;

insert into employee values(90005,'sri kamleshwar prasad bhattacharya',59000,
'1996-12-30','09:00:00');

alter table employee modify name varchar(50);
alter table employee change  name emp_name varchar(50);
alter table employee drop entry_time;

insert into employee (id,emp_name) 
 values(90006,'sri kamleshwar prasad bhattacharya');
 
desc employee;
select * from employee;

create table product(id int auto_increment, name varchar(20) not null, 
cost float not null, primary key(id) );
desc product;
insert into product values(10001,null, null);
insert into product(id,name) values(10001,null);
insert into product values(10001,'java book ', 1200);
select * from product;
insert into product (name,cost) values('spring  book ', 1500);

show tables;

-- parent table 
create table customer(id int primary key, name text not null, age int, 
income float);
-- child table 
create table customer_order(id int primary key, cost float,order_date date,
customer_id int, foreign key(customer_id) references customer(id));

insert into customer values(450, 'priyansh kumar',34,45000.00);
select * from customer;
select * from customer_order;
insert into customer_order values(1,1200, current_date(),450);
insert into customer_order values(2,1100, current_date(),450);
insert into customer_order values(3,100, current_date(),450);
insert into customer_order values(4,200, current_date(),450);  

-- first delete from child table the parent table 
delete from customer_order where id=1;
delete from customer where id=1;


create table delievery(id int primary key, delievery_date date,location text,
order_id int,
customer_id int, 
foreign key(order_id) references customer_order(id),
foreign key(customer_id) references customer(id));

insert into delievery values(101,'2023-12-8','new delhi',1,450);
insert into delievery values(102,'2023-12-9','aagra',2,450);
insert into delievery values(103,'2023-12-10','mathura',3,450);
insert into delievery values(104,'2023-12-18','gurfgaon',4,450);

create table Book(id int, bname varchar(20) not null unique, 
cost float not null default 100,
check(cost>0), primary key(id));
--  drop table book;
insert into book values(10001,'java in action', 1200);
insert into book values(10002,'java in action', 1600); -- unique constraint
insert into book values(10003,'spring in action', 0); -- check constraint
insert into book values(10003,'spring in action', 0); -- check constraint
insert into book (id,bname) values(10003,'spring in action');-- default cost 
select * from book;

create table book1 as select * from book; -- create table with data
select * from book1; 

create table book2 as select * from book where 1>100; -- create table with no data
select * from book2;
insert into book2 select * from book where id=10001; 

select * from book;
update book set bname='java beginner'; -- update all rows 
select * from employee;
use coforge;
update employee set dob='2001-1-31';-- update all rows 
update employee set dob='2003-3-31' where id=10001; -- update single row with single column
update employee set dob='2003-3-31', emp_name='mahesh kumar' where id=10001; -- update single row with multiple column 

delete from employee;

select * from employee;

select * from employee where emp_name like 's%';
select * from employee where emp_name like '__m%';
select * from employee where emp_name like '%r';
select * from employee where emp_name like '%ya%';
select * from book;
select * from product;

insert into product values(10003,'java book',500);
insert into product values(10004,'spring book',800);
insert into product values(10005,'java book',500);

select * from product;
select distinct name  from product;
select length(name),name from product;


select * from employee;

select * from employee limit 3;-- display first 3 record
select * from employee limit 0,3;-- display first 3 record

select * from employee limit 2,3;-- display last 3 record 
select * from employee limit 1,3;
-- aggregate function

select * from employee;
select count(*) from employee;

select count(*), avg(salary), sum(salary), min(salary), max(salary) 
 from employee;

select id,emp_name,salary,dob from employee;
select id,concat('Mr.',emp_name), length(emp_name),
 salary,dob from employee;
 select * from employee;
 select id,name,cost from product;
 select id,replace (name,'java book','python beginner'),cost 
 from product;
 select emp_name, substring(emp_name,4) from employee;
 select emp_name, substring(emp_name,3,4) from employee;
 SELECT DATEDIFF(CURRENT_DATE, '2022-11-11');
 select datediff(current_date,current_date);
 select current_date();
select  current_date(),date_format(current_date,'%d-%m-%y');
 
select * from employee;
select * from employee where salary=20000.55 or salary=14000.55 or salary=56000.55;

select * from employee where salary in(20000.55,14000.55,56000.55);
select * from employee where  emp_name='ram kumar' or emp_name='arvind kumar' 
or emp_name='shyam kumar';
select * from employee where  emp_name in('ram kumar','arvind kumar' 
,'shyam kumar');
select * from employee where  emp_name not in('ram kumar','arvind kumar' 
,'shyam kumar');
select * from employee where id=10001;
select * from employee where not id=10001;
select * from employee where id!=10001;


desc product;
desc book;
desc employee;
insert into employee values(4501,'anand kumar',35000,'1997-02-12');
insert into employee (id,emp_name,salary) values(4502,'suyash kumar',39000);
insert into employee (id,emp_name,salary) values(4505,'rakesh kumar',56000);
insert into employee (id,emp_name,dob) values(4506,'suyash kumar','2000-10-30');

select * from employee;
select * from employee where dob is null;
select * from employee where dob is not null;
select * from employee where salary is null;
select * from employee where salary is not null;
select * from employee where emp_name not like '%ya%';

create table course(course_id int primary key auto_increment, name text, 
duration int, fee float); 
delete from course;

insert into course (name,duration,fee) values('b.tech',12,100000);
insert into course (name,duration,fee) values('b.tech',24,175000);

insert into course (name,duration,fee) values('m.tech',12,125000);
insert into course (name,duration,fee) values('m.tech',24,200000);
insert into course (name,duration,fee) values('m.tech',18,160000);

select * from course;
select count(name),name from course group by name ;
select count(name),name, sum(fee) from course group by name ;
select count(name),name, sum(fee), min(fee), max(fee) from course group by name ;
select count(name),name, sum(fee), min(fee), max(fee) from course group by name 
 having name='b.tech';






create table student(roll int primary key auto_increment, name varchar(20), 
location varchar(20));
create table examination(roll  int primary key, subject varchar(20), 
marks float); 
insert into student values(50001, 'chandan kumar','mathura');
insert into student(name,location) values( 'vijay kumar','bhopal');
insert into student(name,location) values( 'ajay kumar','indore');
insert into student(name,location) values( 'sanjay kumar','delhi');
insert into student(name,location) values( 'ram partap kumar','sonipat');
select * from student;



insert into examination values(50001,'english',78.9);
insert into examination values(50002,'hindi',56.9);
insert into examination values(50003,'science',67.8);
insert into examination values(500010,'social science',71.56);
insert into examination values(500011,'math',89.1);
insert into examination values(50006,'botany',55.12);

-- cartesian join 
 select * from student, examination;
 
 -- inner join or equi join
 -- records of all students who appered in examination
 
  select * from student, examination where student.roll=examination.roll;
  select s.roll,s.name,s.location, e.subject, e.marks from student s, 
   examination e where s.roll=e.roll;
 
  -- using ansi sql 
  -- records of all students who appered in examination
use coforge; 
  select s.roll,s.name,s.location, e.subject, e.marks from 
  student s 
  inner join 
  examination e 
  on  s.roll=e.roll;
  -- left join
  -- display all students list
  select s.roll,s.name,s.location, e.subject, e.marks from 
  student s 
  left join 
  examination e 
  on  s.roll=e.roll;
 
 -- right join
 -- display list of all students who have appeared in examination
   select s.roll,s.name,s.location, e.subject, e.marks from 
  student s 
  right join 
  examination e 
  on  s.roll=e.roll;
 
  -- full outer join not supported in mysql 
  -- get it by th union of left join and right join 
  select s.roll,s.name,s.location, e.subject, e.marks from 
  student s 
  left join 
  examination e 
  on  s.roll=e.roll
  
  union
  
  select s.roll,s.name,s.location, e.subject, e.marks from 
  student s 
  right join 
  examination e 
  on  s.roll=e.roll;
  
  select * from employee;
  
select c.id,c.name,c.age,c.income,o.id,o.cost,o.order_date from customer c, customer_order o where 
c.id=o.customer_id;

select c.id,c.name,c.age,c.income,o.id,o.cost,o.order_date from 
customer c 
inner join 
customer_order o 
on  c.id=o.customer_id;


select c.id "customer id",c.name,c.age,c.income,o.id "order id",o.cost,o.order_date,d.id "delievery id", d.delievery_date, d.location from customer c, customer_order o, delievery d where c.id=o.customer_id and d.order_id=o.id and d.customer_id=c.id;

select c.id "customer id",c.name,c.age,c.income,o.id "order id",o.cost,o.order_date,d.id "delievery id", d.delievery_date, d.location from customer c 
inner join 
customer_order o 
inner join 
delievery d 
on 
c.id=o.customer_id and d.order_id=o.id and d.customer_id=c.id;

--self join
create table employee1(id int primary key, name varchar(20), 
                    designation varchar(20), manager_id int);
delete from employee1;                    
insert into employee1 values(10001, 'suresh kumar','managing director',10004);                    
insert into employee1 values(10002, 'amit kumar','engineer',10002);
insert into employee1 values(10003, 'sumit kumar','marketing executive',10001);
insert into employee1 values(10004, 'ram kumar','analyst',10003);                    
select * from employee1;
  
select e1.id, e1.name 'manager of', e2.name from employee1 e1,employee1 e2 where 
e1.id=e2.manager_id;

-- sub query
select max(salary) from employee;
select * from employee;
-- display information of employee having highest salary
 select * from employee where salary=(select max(salary) from employee);
 -- display information of employee having lowest salary
select * from employee where salary=(select min(salary) from employee);
 


-- equi join 
-- all students who have given the  examination
  select s.roll,s.name,s.location, e.subject, e.marks from 
  student s 
  inner join 
  examination e 
  on  s.roll=e.roll;
  -- using sub query 
  select * from student where roll in (select distinct roll from examination);
  -- all students who have not given the  examination
  select * from student where roll not  in (select distinct roll from examination);
  -- exists 
  
  select * from examination;
   -- display all students who have given examination and have marks between 70- 100
  
  select * from student where exists 
  (select  roll from examination where marks between 70 and 100); 
  
  select  roll from examination where marks between 70 and 100;
      select * from student where not exists 
  (select distinct roll from examination where marks between 70 and 100); 
   
  select roll from examination where marks between 70 and 100;
  
  -- desc examination;
  
  
select * from student where roll<All 
  (select  roll from examination where marks between 70 and 100);
   
select * from student where  roll<Any 
  (select  roll from examination where marks between 70 and 100);
  
  select * from student where roll<All 
  (select  roll from examination where marks =(select min(marks) from examination));
  
   select  roll from examination where marks =(select min(marks) from examination);
   
   
   select * from employee;
     -- stored procedure with argument
      DELIMITER //
      create procedure all_employee()
      begin
      select * from employee;
      end;
    -- calling procedure 
  call all_employee();
  
   select * from employee;
     -- stored procedure with argument
      DELIMITER //
      create procedure search_employee(IN id1 int)
      begin
      select * from employee where id=id1;
      end;
    -- calling procedure   
  call search_employee(10001);
  
   DELIMITER //
      create procedure increment_employee_salary(percent float)
      begin
      update employee set salary=salary+salary*percent;
      end;
      
  call increment_employee_salary(0.05);
  call increment_employee_salary(0.08);
  
   DELIMITER //
	create procedure search_employee1(IN id1 int,out name1 varchar(20), 
    out salary1 float)
      begin
      select emp_name,salary into name1,salary1 from employee where id=id1;
      end;
      -- calling
      call search_employee1(10001, @name,@sal);
      select @name,@sal;
      
    DELIMITER //
    create function sumof3(x int, y int, z int) 
    returns int 
    deterministic
    begin 
      return (x+y+z);
    end;
    -- calling function
    select sumof3(1,2,3);
    drop function search_employeebyid;
    DELIMITER //
    create function search_employeebyid(id1 int) 
    returns varchar(20)
    deterministic
    begin 
    declare name1 varchar(20);
    select emp_name into name1 from employee where id=id1;
    return name1;
    end;
    -- calling 
     select search_employeebyid(10001);
     select search_employeebyid(10001),current_date;
     select search_employeebyid(10001),current_date, id,name,age from customer ;
    
    
    
    
      
      
  
  
      
      
      
   
  