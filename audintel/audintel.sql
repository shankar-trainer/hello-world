show databases;
use db1;
show tables;
desc employee;
select id from employee where name='ram kumar';
select * from employee where name='ram kumar';

select * from employee where name='ram kumar' or id=10003; 
select * from employee where name='ram kumar' and id=10003; -- using and
select * from employee where name='ram kumar' or id=10001; -- using or 

select * from employee ;

select * from employee order by name; -- order by ascending 
select * from employee order by name asc;
select * from employee order by name desc; -- order by descending order
show columns from employee;
desc employee;
show create table employee;-- create table syntax
alter table employee add dob date;
select * from employee;
insert into employee values(10007,'sri sri mohan kumar bhattacharya',70000.56656,'1978-12-22');

alter table employee modify name varchar(60);
alter table employee  change id emp_id int;
alter table employee  change name  emp_name varchar(60);
alter table employee add  location varchar(20);
alter table employee drop  location;
insert into employee  (emp_id,emp_name) values (5009,'sai teja');
select * from employee;

update employee set dob='1990-12-11';-- update all record

update employee set salary=78000 , dob='1995-10-11' where emp_id=5009;-- update specific record record
delete from employee where emp_id=10002;


create table user1(id int, name varchar(20), primary key(id));

show tables;
drop table user1;
create database db2;
show databases;
drop database db2; 

create table passenger (passenger_id int, name varchar(20),age int, country_code varchar(20), 
  primary key(passenger_id,country_code));
desc passenger;
insert into passenger values(10011,'avinash kumar',34,'in');
insert into passenger values(10011,'suman kumar',34,'ne');
insert into passenger values(10011,'amrendra kumar',44,'us');
insert into passenger values(10012,'avinash kumar',34,'in');
update employee set dob='1990-12-11';-- update all record
select * from passenger;
 
 
create table customer(id int, name varchar(20)   unique  not null, location varchar(20) not null, 
state varchar(20)  default 'telengana' ,primary key(id));
desc customer;

insert into customer (id,name,location) values(6766767,'mohan babu','hyderabad');
insert into customer (id,name,location) values(6766769,'mohan babu','hyderabad');

select * from customer;

create table manager(id int, name varchar(20), salary float(10,2),primary key(id), check(salary>=10000));

desc manager;
insert into manager values(4655656,'anand kumar',500); -- check constraint error 
insert into manager values(4655656,'anand kumar',12500);

desc customer;



create table customer(id int, name varchar(20)   unique  not null, location varchar(20) not null, 
state varchar(20)  default 'telengana' ,primary key(id));

delete from customer;

  -- parent table
create table product(prd_id int, prd_name varchar(20) ,cost float,primary key(prd_id));
  -- child table 
create table product_order(order_id int , order_date date,location varchar(20),
 order_prd_id int, primary key(order_id), foreign key(order_prd_id) references product(prd_id));
 
 insert into product values(10001,'tv',20000);
 insert into product values(10002,'mobile',10000);
 insert into product values(10003,'refrigerator',15000);
 insert into product values(10004,'washing machine',12000);
 insert into product values(10005,'induction oven',3000);
  
 insert into product_order values(1,current_date(),'hyderabad',10001);
 insert into product_order values(2,'2022-08-12','manglore',10002);
 insert into product_order values(3,'2022-09-12','sikandarabad',10003);
 insert into product_order values(4,'2022-08-17','nellore',10004);
 insert into product_order values(5,'2022-08-18','rayal sima',10005);
 
 
  insert into product_order values(1,current_date(),'hyderabad',10001);
  insert into product_order values(6,current_date(),'hyderabad',10001);

use db1;

create table student (roll int primary key auto_increment, name text, subject text,marks float(5,2)  );
  desc student;
 insert into student(name,subject,marks) values('subodh kumar','mathematics',67.56566);
 insert into student(name,subject,marks) values('abdhes sharma','science',57.76566);
 insert into student(name,subject,marks) values('sambhu kumar','telugu',67.56566);
 insert into student(name,subject,marks) values('mahadev verma','tamil',67.56566);
 select * from student;
 insert into student(name,subject,marks) values('subodh kumar','english',67.56566);
 insert into student(name,subject,marks) values('subodh kumar','english',67.56566);
 insert into student(name,subject,marks) values('subodh kumar','hindi',67.56566);
 
 insert into student(name,subject,marks) values('parmod kumar','telugu',67.56566);
 insert into student(name,subject,marks) values('aarif khan','telugu',67.56566);
 insert into student(name,subject,marks) values('aarif khan','telugu',67.56566);
 
select min(salary) from employee;
select min(salary)  as "minimum salary" from employee;
select max(salary)  as "maximum salary" from employee;
select sum(salary)  as "total salary" from employee;

select count(salary) "total record",min(salary)  as "minimum salary",  max(salary)  as "maximum salary", sum(salary)  as "total salary", avg(salary)  as "average salary" from employee; 
 
 

 select * from employee;

select emp_id,emp_name,salary, "pf is 5%", salary-(salary*0.05) "gross salary " from employee;
 
 select datediff('2001-10-22',current_date);
 
 select * from customer;
 
 desc customer;
 create table customer_order(order_id int primary key, order_name varchar(20),order_date date,customer_id int);
 
 insert into customer values(9001,'viresh kumar','hyderabad','telengana'); 
 insert into customer values(9002,'suman kumar','mumbai','maharastra'); 
 insert into customer values(9004,'ravi kumar','new delhi','delhi'); 
 insert into customer values(9007,'chiranjeevi kumar','jaipur','rajsthan'); 
 insert into customer values(9009,'satya prasad','mysore','karnataka'); 
 
 insert into customer_order values(1,'sql book','2022-10-12',9001); 
 insert into customer_order values(2,'java book','2022-10-12',9002);
 insert into customer_order values(3,'react book','2022-10-12',9003);
 insert into customer_order values(4,'spring boot book','2022-10-12',9004);
 insert into customer_order values(5,'html book','2022-10-12',9006);
 insert into customer_order values(6,'javascript book','2022-10-12',9007);
 
 -- cartesian join  -- get record from two or more tavbles with no condition
 
 select * from customer,customer_order;
 -- inner join or equi join  -- get record from two or more tavbles with equal condition
 select * from customer,customer_order where id=customer_id;
  -- inner join or equi join using table name
  -- all customer who have given the order
 select customer.id,customer.name,customer.location,customer.state, customer_order.order_id,
    customer_order.order_name,customer_order.order_date from customer,customer_order where id=customer_id;
 
 -- inner join or equi join using table alias name
 
 select c.id,c.name,c.location,c.state, o.order_id,
 o.order_name,o.order_date from customer c,customer_order o where id=customer_id;
   -- inner join using ansi sql 
   
 select c.id,c.name,c.location,c.state, o.order_id,
 o.order_name,o.order_date from customer c inner join  customer_order o on  id=customer_id;
 
 -- left join 
 select c.id,c.name,c.location,c.state, o.order_id,
 o.order_name,o.order_date from customer c left join  customer_order o on  id=customer_id;
 
 -- display customer who has not given order
 select c.id,c.name,c.location,c.state, o.order_id,
 o.order_name,o.order_date from customer c left join  customer_order o on  id=customer_id where order_id is null;
 
 -- display customer who have  given orders -- same as equi join
 select c.id,c.name,c.location,c.state, o.order_id,
 o.order_name,o.order_date from customer c left join  customer_order o on  id=customer_id where order_id is not null;
 
 
 -- right join 
 select c.id,c.name,c.location,c.state, o.order_id,
 o.order_name,o.order_date from customer c right join  customer_order o on  id=customer_id;
 
 

-- sub query 
   -- using equi join
    select c.id,c.name,c.location,c.state, o.order_id,
 o.order_name,o.order_date from customer c,customer_order o where id=customer_id;
  -- same using subquery 
select * from customer where id in (select distinct customer_id from customer_order );
select * from customer where id >all (select distinct customer_id from customer_order );


desc customer; 
 

use db1;
desc product;
delimiter //
create procedure productAvgPrice()
begin
select avg(cost) from product;
end;

delimiter;
drop procedure productAvgPrice();
call productAvgPrice;


delimiter //
create procedure searchUsingId(id1 int)
begin
select *   from product where prd_id=id1;
end;
call  searchUsingId(10001);


delimiter //
create procedure searchUsingId1(id1 int,out name1 varchar(20),out cost1 float)
begin
select prd_name,cost  into name1, cost1   from product where prd_id=id1;
end;
call  searchUsingId1(10001,@name,@cost);
select @name,@cost;
 
 
 
 
 