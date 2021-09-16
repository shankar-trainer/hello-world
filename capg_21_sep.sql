create database db2;
show databases;
use db2;

show tables;

create table employee (empid int primary key, ename varchar(20), salary float(10,2));

describe employee;

insert into employee  values(1001, 'anand mukhopadhya',67000.00000);
insert into employee  values(1002, 'sumanth varma',57000.00000);
insert into employee  values(1003, 'ranjan sharma',17000.00000);
insert into employee  values(1004, 'sanjay mukherji',27000.00000);

select * from employee;
select * from employee where salary>=50000;
select empid,ename from employee;

select * from employee where empid=1001 or ename='ranjan sharma';
select * from employee where empid=1001 and ename='ranjan sharma';
select * from employee where empid=1003 and ename='ranjan sharma';

create table survey (surveyid int auto_increment, survey_name varchar(20) not null unique, survey_location varchar(20) not null,
              primary key(surveyid));
desc survey;
desc employee;

insert into survey  (survey_name, survey_location) values('education','kolkotta');
insert into survey  (survey_name, survey_location) values('health','chennai');
insert into survey  (survey_name, survey_location) values('corruption','pune');
insert into survey  (survey_name, survey_location) values('population','delhi');

insert into survey  (survey_name, survey_location) values
('training','noida'), 
('development','noida'), 
('cleanliness','noida')
;
select * from survey;
-- adding column  
alter table survey add survey_state varchar(20);
desc survey;
-- changing/modifying the column 
alter table survey modify survey_state varchar(40);
 -- renaming column name
alter table survey change surveyid survey_id int;
-- check , default 
create table furniture (id int primary key, name varchar(20) default 'chair', cost float(10,2), check(cost>1000) );
 -- chevk will check the data added at runtime 
 -- if value not given then it will add default instead of null
 desc furniture;
insert into furniture value(9989,'table',400); 
insert into furniture value(9989,'table',1400);
insert into furniture (id,cost) value(9981,1001);
 select * from furniture;

create table furniture1 (id int primary key, name varchar(20) not null default 'chair', cost float(10,2), check(cost>1000) );

 select * from employee;
 
update employee set ename='anand kumar' where empid=1001;
update employee set ename='suman anand ',salary=90000 where empid=1002;

create table courses( course_id int primary key , course_name varchar(20),course_cost float);
create table students(roll int primary key auto_increment, name varchar(20), courseid int, foreign key(courseid) references courses
(course_id));

-- courses -- parent table 
-- students -- child table 
  insert into courses values(7899,'java course',7000);
  insert into courses values(7891,'ui course',8000);

insert into  students (name,courseid) values('arvind kumar',7899) ;
insert into  students (name,courseid) values('sanjay kumar',7899) ;
insert into  students (name,courseid) values('amit kumar',7891) ;
select * from courses;


select course_id, course_name, course_cost from courses;
select courses.course_id, courses.course_name, courses.course_cost from courses;

select courses.course_id, courses.course_name, courses.course_cost, students.roll, students.name, students.courseid from courses, students 
where courses.course_id=students.courseid;

--	course_id	course_name	course_cost	roll	name	courseid
--	7891	ui course	8000	4	amit kumar	7891
--	7899	java course	7000	2	arvind kumar	7899
--	7899	java course	7000	3	sanjay kumar	7899
show tables;
desc employee;

-- must use --use database name when mysql workbench or mysql command line is started
use db2;
-- order by -- for sorting

select * from employee order by salary;

select * from employee order by salary asc;

select * from employee order by salary desc;


--  create copy of employee table with the data 
create table employee1 as select * from employee;
select * from employee1;

--  create copy of employee table without  the data
create table employee2 as select * from employee where 1>100;
select * from employee2;
desc employee2;
insert into employee2 select * from employee where salary>=50000;

select * from employee order by salary desc;
create table book(isbn int auto_increment, bname varchar(20), author varchar(20), primary key(isbn));
insert into book(bname,author) values 
('java beginner','a kumar'),('java in action','deepak kumar'),
('python beginner','a kumar'),('docker deep dive ','surendra kumar'),
('gradle in action','a kumar'),('jpa pro','surendra kumar');

select * from book;
select author  from book;
select distinct author from book;
-- like operator 

select * from book where bname like '%beginner' ;
select * from book where bname like 'java%' ;
select * from book where bname like '%action' ;
select * from book where bname like '___a%' ;
select * from book where bname like '____o%' ;

alter table book add cost1 float not null;

select * from book where author='a kumar';
select * from book where author!='a kumar';
select * from book where not author='a kumar';

select * from book where bname like '____o%' or author like '%kumar' ;
select * from book where bname='java beginner' or bname='java in action' or bname='python beginner';
select * from book where bname in ('java beginner' ,'java in action','python beginner');

select * from book;
select * from employee where salary>=50000 and salary<=100000;
select * from employee where salary between 50000 and 100000;
select * from employee;
desc employee;
insert into employee values(4588,'anand mohan',null);
insert into employee(empid,ename) values(4582,'pritam kumar');

select * from employee where salary is null;
select * from employee where salary is not null;

-- aggregate function
select count(*) from employee;
select count(salary) from employee;
select count(ename) from employee;
select  * from employee;

select max(salary) from employee;
select max(salary)  as "maximum salary" from employee;
select min(salary)  as "minimum salary" from employee;
select count(*) "total no of row", max(salary) "maximum salary", min(salary) as "minimum salary" from employee;
select count(*) "total no of row", max(salary) "maximum salary", min(salary) as "minimum salary", sum(salary) "total salary" , avg(salary) "average salary " 
from employee;

select  * from employee;
select  empid 'Employee Id',ename "Employee Name" ,salary "Salary", salary-salary*0.05    "Gross Salary"   from employee;

select * from book;
select   count(author) ,author from  book group  by author;
select   count(bname) ,author, bname from  book group  by bname;

select   count(author) ,author from  book group  by author having author='a kumar' ;
select   count(author) ,author from  book group  by author having author='a kumar' or author='surendra kumar'   ;
select   count(author) ,author,bname  from  book group  by author having author in('a kumar','surendra kumar')   ;
create table studentcourse(sdtudentId int primary key, course_id varchar(20),cname varchar(20) , fee float );

insert into studentcourse values(1001, 'java001','java core', 1000);
insert into studentcourse values(1002, 'java001','java advanced', 2000);
insert into studentcourse values(1003, 'java001','java web', 3000);
insert into studentcourse values(1004, 'sql001','mysql basic', 600);
insert into studentcourse values(1005, 'sql001','mysql adv', 1600);
insert into studentcourse values(1007, 'sql001','mysql admin', 2600);
insert into studentcourse values(1008, 'php001','php basic', 600);
insert into studentcourse values(1006, 'php001','php advanced', 1600);

select * from studentcourse;
select course_id, sum(fee) from studentcourse group by course_id;

select course_id, count(sdtudentid) ,sum(fee) from studentcourse group by course_id;
select course_id "course name", count(sdtudentid) "no of students enrolled" ,sum(fee) "total fee" from studentcourse group by course_id;

select * from students;
select * from courses;

desc customer;

create table customer(cid int primary key ,name varchar(20), location varchar(20));
create table customer_order(orderid int primary key, order_name varchar(20), order_cost float, customer_id int);

insert into customer values
(1001,'amit kumar','gurgaon'),(1002,'subodh kumar','noida'),(1004,'parmod kumar','delhi'),
(1006,'amit kumar','gurgaon'),(1007,'sumit kumar','ghaziabad'),(1009,'kush kumar','faridabad');

insert into customer_order values
(9001,'capscicum pizza',677,1001),(9002,'cheese burger',177,1002),(9003,'french fries',77,1003),
(9004,'chilly potato',77,1004),(9005,'chicken chowein',277,1005),(9006,'dosa',100,1006),
(90017,'bada pao',50,1007);
select * from customer;
-- cross join
select customer.cid,customer.name,customer.location, customer_order.orderid, customer_order.order_name,customer_order.order_cost from 
    customer, customer_order;
select c.cid,c.name,c.location, co.orderid, co.order_name,co.order_cost from 
    customer c, customer_order co;
select cid,name,location, orderid, order_name,order_cost from 
    customer , customer_order ;    
    -- inner join or equi join    -- old sql 
select c.cid,c.name,c.location, co.orderid, co.order_name,co.order_cost from 
    customer c, customer_order co where c.cid=co.customer_id;
-- ANSI sql
select c.cid,c.name,c.location, co.orderid, co.order_name,co.order_cost from 
    customer c inner join customer_order co on  c.cid=co.customer_id;
-- left join    
select c.cid,c.name,c.location, co.orderid, co.order_name,co.order_cost from 
    customer c left join customer_order co on  c.cid=co.customer_id;
-- right join    
select c.cid,c.name,c.location, co.orderid, co.order_name,co.order_cost from 
    customer c right join customer_order co on  c.cid=co.customer_id;
-- selft join    
create table employee3(id int primary key , name varchar(20), manager_id int );
drop table employee3;
insert into employee3 values(1,'p kumar',3);
insert into employee3 values(2,'a kumar',1);
insert into employee3 values(3,'s kumar',2);

select * from employee3;

select e1.name, e2.name as " is manager of " from employee3 e1 
inner join 
employee3 e2 on e1.manager_id=e2.id;


create table user1(id int primary key , name varchar(20), age int);
create table user2(id int primary key , name varchar(20), age int);

insert into user1 values
(1001, 'a kumar', 33),
(1002, 'p kumar', 35),
(1003, 's kumar', 56),
(1004, 'k kumar', 67);


insert into user2 values
(1007, 'ram kumar', 33),
(1008, 'shyam kumar', 35),
(1003, 's kumar', 56),
(1004, 'kamal kumar', 17),
(1005, 'sumit kumar', 37),
(1006, 'lalan kumar', 61);

select * from user1;

select * from user1 
union
select * from user2;

select * from user1 
union all
select * from user2;


select upper("hello world");
select empid, upper(ename),salary from employee; 
select lower("HELLO WORLD");
select reverse("HELLO WORLD");
select empid, reverse(ename),salary from employee; 

select empid, (ename),substring(ename,5), salary from employee; 
select empid, (ename),substring(ename,1), salary from employee; 
select empid, (ename),substring(ename,1,6), salary from employee;
select substring("helloworld",5); -- 5 to last  position
select substring("helloworld",1,5); -- 5 to last  position
select substring("helloworld",1,6);

select * from employee;
select concat(empid,'       ' ,ename)  'id        name'from employee;

insert into employee values(9002,'  sonu kumar ',67000);

insert into employee values(9002,trim('  sonu kumar'),67000);
select empid, ename,length(ename),salary from employee where empid=9001;

select empid, ltrim(ename),length(ltrim(ename)),salary from employee where empid=9001;
select empid, trim(ename),length(ltrim(ename)),salary from employee where empid=9001;
select empid, (ename),length((ename)),salary from employee where empid=9001;

select empid, ename,length((ename)),salary from employee where empid=900;

select round(788.55) ;
select round(788.44) ;
select round(788.1) ;

select abs(-788) ;
select sqrt(788) ;
select sqrt(25) ;
select date('2000-11-22');
select current_date();
select curdate();
select day('2000-11-22');
select day(current_date());
select date_add(current_date(), interval 1 day);
select date_add(current_date(), interval 1 year);
select * from customer;

-- subquery 
select * from employee;
select max(salary) from employee;
--
select * from employee where salary=90000;
select * from employee where salary=(select max(salary) from employee);


select c.cid,c.name,c.location, co.orderid, co.order_name,co.order_cost from 
    customer c, customer_order co where c.cid=co.customer_id;
desc customer;
desc customer_order;

select cid,name,location from customer where cid in  (select customer_id from customer_order);






