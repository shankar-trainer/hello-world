-- window rank function 
CREATE TABLE `employee` (
  `id` int(11) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `salary` int(11) DEFAULT NULL,
  `city` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`));
  

insert into employee values(1001,'mohan kumar',20000,'chennai');
insert into employee values(1002,'ram kumar',24000,'chennai');
insert into employee values(1003,'amit  kumar',34000,'chennai');
insert into employee values(1004,'rohan kumar',38000,'chennai');
insert into employee values(1005,'abhiskek kumar',13000,'chennai');
insert into employee values(1006,'rohan kumar',93000,'chennai');

select * from employee;

select id,salary,salary,avg(salary),city from employee order by id; 

select id,salary,avg(salary) over (partition by city  order by id)  as "avg sal" , city from employee;


-- 
create table exam(roll int primary key, subject varchar(20));
create table student(roll int primary key references exam(roll), name varchar(20));
--     ^
--    |
-- will not work in mysql

--------------------------------------------
--  working in mysql 
--   |
--   v
   
create table product_detail (prd_id int primary key,prd_no_of_item int, mfd date);
create table product_user (user_id int primary key,user_name varchar(20), user_mb_no int, prd_id int unique);

create table product (id int primary  key, name varchar(20), cost float(10,2), foreign key(id) references product_detail(prd_id), foreign key(id) references product_user(prd_id));

insert into product_detail  values(1001, 5,'2021-10-10');

insert into product_user values(8899, 'm kumar',7677998,1001);

insert into product values(1001,'shirt',700);


===================

use db1;
show tables;
desc employee;
-- create table Employee (empId integer not null, empName varchar(255), salary float, primary key (empId));
drop table employee;
-- create table Employee (empId integer not null, empName varchar(255), salary float, primary key (empId)) ;
desc emp1;

select * from emp1;

------------------------------

show databases;

create database dbaj06;
use dbaj06;

show tables;
create table employee(id int primary key, name varchar(20));

desc employee; 
select * from employee;
insert into employee values(1001, 'ram kumar');
insert into employee values(1002, 'anirudh kumar');
insert into employee values(1003, 'amrendra kumar');
insert into employee values(1004, 'shyam kumar');

select * from employee where id=1001;
select * from employee where name='amit kumar';
select * from employee where name='amrendra kumar';

select * from employee where id>1002;

select * from employee where id>=1002 and id<=1004;
select * from employee where  id  between  1002 and 1004;
-- order by -- sorting the record   ascending order
select * from employee order by name;
                 --  descending order 
select * from employee order by name desc;

select * from employee order by id;
select * from employee order by id desc;

desc employee;
-- modify the table -- add the column 
alter table employee add  salary float(10,2);

select * from employee;
-- without criteria will update all record
update employee set salary=20000;

update employee set salary=25000 where id=1001;
-- update multiple columns 

update employee set salary=45000, emp_name='amrendra kumar' where id=101;

update employee set salary=45000 where id=1002;

-- delete  from table  -- delete all record
-- delete from employee where id=1001; -- delete the matching record
delete from employee where id=1001;

desc employee;

insert into employee values(100, 'mr virendra kumar chauhan', 56789.666);
alter table employee modify name varchar(30);
select * from employee;

-- change the column name 
alter table employee change  name  emp_name varchar(30);
insert into employee (id,emp_name) values(101, 'amrendra');
-- alias 
select * from employee;

select id,emp_name,salary from employee;
select id,emp_name,salary, salary-salary*0.05 from employee;
select id,emp_name,salary, salary-salary*0.05 as "gross salary" from employee;

use dbaj06;

select distinct(emp_name) from employee;
select * from employee;
select * from employee limit 3;


create table customer(id int , name varchar(20) unique, city varchar(20), unique(city), primary key(id)); 
desc customer;
insert into customer values(1001, 'ram kumar', 'chennai');
insert into customer values(1002, 'suresh kumar', 'chennai');

insert into customer values(1003, null,null);
 
 select * from customer;


create table person(id int , name varchar(20) unique not null, city varchar(20) not null, unique(city), primary key(id)); 
insert into person values(1003, null,null);

desc person;

drop table book;
-- foreign key -- book parent table author -- child table 
create table Book(isbn int, bname varchar(20),  cost float, primary key(isbn));
desc book;

create table author(auth_id int primary key, auth_name varchar(20), book_isbn int,  FOREIGN KEY(book_isbn) references 
book(isbn));
desc author;
desc book;

-- insert parent table then child table 
insert into book values(1545445, ' mysql book',678.66);

insert into author values(1001, ' a kumar',1545445);
-- deletion -- child -- then parent 
delete  from author;
delete from book;


create table worker( id int primary key, name varchar(20), wages float, check(wages>1000) );

insert into worker values( 1001, 'a kumar', 900);
insert into worker values( 1001, 'a kumar', 1010);

create table furniture (id int, name varchar(20) default 'assam furniture ',cost float );
insert into furniture (id,cost) values(10088,67000); 

select * from furniture;

select current_date() ;
select current_time();
 
 desc employee;
 alter table  employee add dob date;
 desc employee;
 insert into employee values(7878, ' s kumar',34000,'1996-01-12');
 
 select * from employee;
 select count(*) from employee;
 select max(salary) from employee;
 select min(salary) from employee;
 select avg(salary) from employee;
 select sum(salary) from employee;
 
 select length(emp_name) from employee;
 select char_length(emp_name) from employee;
select * from employee; 

 select replace(emp_name,'mr','MR.') from employee; 
 select substring(emp_name,1,5) from employee; 
 
 update employee set dob='1990-1-26' where id=1001;
 
 select datediff('2011-11-12','2004-01-12');
 select id,emp_name,dob from employee;
 
 select id,emp_name,dob, date_format(dob,'%d-%m-%Y') as date1 from employee;
 select id,emp_name,dob, date_format(dob,'%a %D-%b %Y') as date1 from employee;
 
 select now();
 
 ------------------------------------------ 
 use db1;
 show tables;
 drop table employee;
 -------------------------
 
 show databases;
 
 -------------------------------------------------------------------
 create table survey(id int primary key auto_increment, name varchar(20), location varchar(20)) ;
 insert into survey  values(67768686,'education', 'chennai');
 
 insert into   survey (name,location)  values('education', 'chennai');
 
 select * from survey;
 
 select last_insert_id();
  
 select * from employee;
 select * from employee where id=100 or emp_name='anirudh kumar';
 select * from employee where id=100 and emp_name='anirudh kumar';
 
 
 select * from employee where id!=100;
 select * from employee where id=100;
 
 select * from employee where emp_name='anirudh kumar';
 select * from employee where emp_name!='anirudh kumar';
 
  select * from employee;
  select * from employee where emp_name='anil kumar' or emp_name='anirudh kumar' or emp_name='shyam kumar' ;
  select * from employee where emp_name in ('anil kumar' ,'anirudh kumar' ,'shyam kumar') ;
  
  select * from employee where emp_name not in ('anil kumar' ,'anirudh kumar' ,'shyam kumar') ;
   
 select * from employee where emp_name like 'a%';-- all names starting with a as starting
 select * from employee where emp_name like '%r';
select * from employee where emp_name like '%d%';
select * from employee where emp_name like '__i%';--- all names having 3rd char as  i 

  
 select  * from survey;
 
 insert into   survey (location)  values( 'coimbtore');
 
 select * from survey where name is NULL;
  select * from employee where  dob is null;
 select * from employee order by emp_name;
 select * from employee order by emp_name asc;
 select * from employee order by emp_name desc;-- descending order
   create table department (dept_id int  primary key , dept_name varchar(20), location varchar(20), start_date date);
   desc department;
 delete from department;
 insert into department values(6767677,'training','chennai', '2017-12-25');
 insert into department values(6767671,'training','coibtore', '2014-12-22');
 insert into department values(1676767,'training','banglore', '2019-12-25');
 
 
 insert into department values(6797677,'software development','chennai', '2011-12-25');
 insert into department values(3767677,'software development','chennai', '2011-12-25');

insert into department values(3767677,'transport','kolkotta', '2011-12-25');
insert into department values(9767677,'transport','hyderabad', '2019-1-25');
select * from department;

select * from department group by location; 
select * from department group by dept_name;

select count(*), dept_name, location from department group by dept_name;
select count(*), dept_name, dept_id, location from department group by dept_name having dept_id>6700000 ;
select count(*), dept_name, dept_id, location from department group by dept_name;


select count(*), dept_name from department group by dept_name having  dept_name='training';

select count(*), dept_name from department group by dept_name;


select count(*), location from department group by location;

 
 
 select current_date();
 -- join -- 
 
 create table product(prd_id int primary key, prd_name varchar(20), prd_cost float(10,2));
 create table product_order(order_id int primary key, order_qty int ,prd_id int);
 select * from product;
 select * from product_order;
 -- cartesian join 
 select * from product, product_order;
 -- equi join 
 select * from product p , product_order o where p.prd_id=o.prd_id;
 select p.prd_id,p.prd_name,p.prd_cost, o.order_id,o.order_qty from product p inner join product_order o on 
     p.prd_id=o.prd_id;
 select * from product_order where prd_id in (select prd_id from product_order);
    

-- left join 
select p.prd_id,p.prd_name,p.prd_cost, o.order_id,o.order_qty from product p left join product_order o on 
 p.prd_id=o.prd_id;
 -- right join
 select p.prd_id,p.prd_name,p.prd_cost, o.order_id,o.order_qty from product p right join product_order o on 
 p.prd_id=o.prd_id;
 
select * from employee;
select * from employee where salary=56789.67;
-- subquery 
select * from employee where salary=(select max(salary) from employee);
select * from employee where salary=(select min(salary) from employee);

select * from product where prd_id in (select prd_id from product_order);
select * from product where  exists (select prd_id from product_order);
select * from product where not exists (select prd_id from product_order);

select * from product where prd_id<ALL (select prd_id from product_order);
select * from employee;
select * from employee where salary >ALL (select salary from employee where id>1000 );
select * from employee where salary >ANY (select salary from employee where id>1000 );
select salary from employee where id>1000 ;

select * from db1.book;
  
  show databases;
  
  use dbaj06;
  
  create table student(roll int primary key, name varchar(20), subject varchar(20), marks float(5,2));
  
  insert into student values(1001, 'ram kumar','math',66);
  insert into student values(1002, 'mahesh kumar','science',77);
  insert into student values(1003, 'suresh kumar','tamil',88);
  insert into student values(1004, 'abadhes kumar','telugu',68);
  insert into student values(1005, 'prianshu kumar','computer science',96);
  select * from student;
  
  delimiter //
  
  create procedure searchStudent(roll_1 int ,out name1 varchar(20),out subject1 varchar(20),out marks1 float )
   begin 
     select name,subject,marks into name1,subject1, marks1 from student where roll=roll_1;
   end //
   
  call searchStudent(501,@name,@subject,@marks)//
  select @name,@subject,@marks//

delimiter ;
drop procedure searchStudent;

 
 insert into product_order  values(8001,10,35566);
 insert into product_order  values(8002,4,35567);
 insert into product_order  values(8003,2,35568);
 insert into product_order  values(8004,20,35569);
 insert into product_order  values(8005,16,35570);
 insert into product_order  values(8006,2,35501);
 insert into product_order  values(8007,2,35502);
 insert into product_order  values(8008,7,35503);
 
 
 insert into product values(35566,'pizza',456);
 insert into product values(35567,'burger',200);
 insert into product values(35568,'chicken pizza',856);
 insert into product values(35569,'plain dosa',60);
 insert into product values(35570,'masala dosa',160);
 insert into product values(35571,'rice meal ',260);
 
 
 
  use dbaj06;
  show tables;
select * from book;
 
 select * from db1.student;
create table customer(customerId int primary key, customerName varchar(20), customerLocation varchar(20));
desc customer;
select * from customer;

create database test2;
use test2;
show tables;
select * from bankemployee;
desc bankemployee;

delete  from bankemployee where empid=10001;
