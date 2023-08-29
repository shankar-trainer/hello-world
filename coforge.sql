show databases;
create database coforge;
use coforge;
show tables;

create table student(id int primary key, name varchar(20),
subject varchar(20));

desc student;
insert into student values(10001,'ram kumar','math');
select * from student;
insert into student (id,name) values(10002,'suresh kumar');
select id,name from student;
select id from student;
select * from student where id=10001;
select * from student where id=10001 or name='suresh kumar';
select * from student where id=10001 and name='suresh kumar';

select current_date();
select now();
select user();

desc student;
alter table student add marks float(5,2);
insert into student values(10004,'ram parvesh kumar','hindi',55.7);
insert into student values(10005,'sunil kumar','english',89.7);

insert into student values(10006,'amrit kumar','science',81.7),
(10007,'piryanshu kumar','math',82.7),(10008,'jai parkash kumar','hindi',81.7);
select * from student;
 update student set marks=71.5, subject='science' where id=10001;
 update student set marks=77.5 where id=10001;
 select * from student;
 select * from student where marks>=60 and marks<=90;
 select * from student where marks between 60 and 90;
 desc student;

insert into student values(10009,'prithvi raj kapoor jhunjhunwala','science',81.7);
alter table student modify name varchar(40);
insert into student values(100010,'parthmesh kumar','science',77.7,current_date());
insert into student values(100011,'vijay kumar','hindi',71.7,'1992-01-28');

select current_date();

alter table student add dob date;
-- order by ascending 
select * from student order by name asc;
-- order by descending 
select * from student order by name desc;
select * from student order by subject desc;
select * from student;

select * from student where name like 'r%';
select * from student where name like '%ar';
select * from student where name like '___i%';

select * from student where subject like '%s%';

create table customer (id int primary key, name varchar(20) not null unique, 
location varchar(20) default 'new delhi',
salary float(8,2), check (salary>0));

insert into customer (id,location) values(10001,'chennai');-- not work 
insert into customer (id,name,salary) values(10001,'suman kumar',-1001);-- not work
insert into customer (id,name,salary) values(10001,'suman kumar',56000);
insert into customer (id,name,salary) values(10002,'suman kumar',56000);-- not work
select * from customer;


desc customer;

-- realtionship between table 

create table product(id int , name varchar(20), cost float, primary key(id));

create table product_order(order_id int, location varchar(20), 
deleviery_date date,prdid int ,primary key(order_id), foreign key(prdid) 
references product(id) );

create table payment(payid int primary key, amount float,pay_date date,
prdid int);

alter table payment add  foreign key(prdid)  references product(id);
alter table payment drop foreign key payment_ibfk_1;


delete from product;

delete from product_order;
delete from product;

insert into product values(1001,'mobile',12000);
insert into product_order values(1,'delhi',current_date(),1001);

insert into product values(1002,'laptop',66000);
insert into product_order values(2,'noida','2023-06-30',1001);

insert into product values(1003,'bike',90000);
insert into product_order values(3,'gurgaon','2023-05-30',1003);

select * from product;
select * from product_order;
create table book
(isbn int primary key auto_increment, bname varchar(20), cost float, 
author varchar(20));

alter table book modify  bname varchar(40); 

insert into book (bname,cost,author) values
('java beginner',600,'a kumar'),
('sql beginner',600,'p kumar'),
('spring professional',1200,'s sharma'),
('spring boot beginnner',1500,'vasant sah'),
('servlet and jsp',900,'arvind k');

select * from book;

create table customer_1(id int, cname varchar(20), salary float);
desc customer_1;
alter table customer_1 add primary key(id);
alter table customer_1 modify cname varchar(20) unique; 
alter table customer_1 modify cname varchar(20); 
alter table customer_1 drop primary key; 
select * from student;
select subject from student;
select * from student limit 5;
select * from student limit 3,5;
select * from  student where id=10005;
select * from  student where id!=10005;

select * from  student where subject='math' or subject='english' or subject='hindi';

select * from  student where subject in('english','math','hindi');
select * from  student where subject not in('english','math','hindi');
select * from student where dob is null;
select * from student where dob is not null; 

-- aggregate function 

select count(*) from student;
select count(subject) from student;
select count(marks) from student;
select max(marks)  from student;
select max(marks) "maximum marks" from student;
select min(marks) "minimum marks" from student;
use coforge;
select max(marks) "maximum marks", min(marks) "min marks", sum(marks) "total marks",
avg(marks) "average marks" from student;

select * from student;
select subject,count(subject) from student group by subject;
select subject,count(subject),max(marks), min(marks) from student group by subject;
select subject,count(subject) "count ",max(marks) "max marks", 
min(marks) "min marks", sum(marks) 
"total marks", avg(marks) "marks percentage" from student group by subject;

select subject,count(subject) "count ",max(marks) "max marks", 
min(marks) "min marks", sum(marks) 
"total marks", avg(marks) "marks percentage" from student group by subject 
having subject='science';

select subject,count(subject) "count ",max(marks) "max marks",min(marks) "min marks",
sum(marks) "total marks", avg(marks) "marks percentage" 
from student group by subject having count(subject)>=2;


select subject,count(subject) "count ",max(marks) "max marks",
min(marks) "min marks",sum(marks) "total marks", avg(marks) "marks percentage" 
from student group by subject having max(marks)>=85;
show tables;

create table product_1(product_id int primary key,product_description varchar(20),
product_finish varchar(15), standard_price float );
alter table product_1 rename column stadard_price to standard_price;
desc product_1; 
insert into product_1 values
(100,'End Table','Cherry',175),
(101,'Dinning Table','Cherry',175),
(102,'Computer Desk','Cherry',175),
(103,'Writer\'s Desk','Cherry',175);
insert into product_1 values
(1,'End Table','Cherry',175),(2,'Coffee Table','Natural Ash',200),(3,'Computer Desk','Natural Ash',375),(4,'Entertainment Center','Natural Ample',650),(5,'Writer\'s Desk','Cherry',325),(6,'8-Drawer Dresser','White Ash',750),(7,'Dining Table','Natural Ash',800),(8,'Computer Desk','Walnut',250)
 ;

drop table order_1;
create table order_1(order_id int ,product_id int,order_quantity int);
delete from order_1;
insert into order_1 values
(10015,17,2),
(10016,18,1),
(10017,20,3),
(10018,22,4),
(10019,23,3)
;

insert into order_1 values
(1001,1,2),(1001,2,2),(1001,4,1),(1001,3,5),(1002,3,3),(1003,6,2),(1004,8,2),
(1004,4,4),(1005,4,1),(1006,5,2),(1006,7,2),(1006,1,3),(1007,2,2),(1007,3,3),
(1008,8,3),(1008,4,2),(1009,7,3),(1009,8,10);
 
select * from student;
select * from customer;
-- cross join
 select * from product_1,order_1;
 -- equi join
 select * from product_1,order_1 where product_1.product_id=order_1.product_id;

select p.product_id,product_description,product_finish,standard_price,order_id,
order_quantity from product_1 p,order_1 o where p.product_id=o.product_id;
-- ansi sql 

select p.product_id,product_description,product_finish,standard_price,order_id,
order_quantity from product_1 p inner join order_1 o on p.product_id=o.product_id;

-- left join
select p.product_id "product id",o.product_id "order product id",product_description,product_finish,standard_price,order_id,
order_quantity from product_1 p left join order_1 o on p.product_id=o.product_id;

-- right join
select p.product_id "product id",o.product_id "order product id",product_description,product_finish,standard_price,order_id,
order_quantity from product_1 p right join order_1 o on p.product_id=o.product_id;

create table employee_1(id int primary key, name varchar(20), manager_id int);
delete from employee_1;
insert into employee_1 values
(1001,'ram kumar',1003),(1002,'shyam kumar',1001),(1003,'mohan kumar',1004),
(1004,'amit kumar',1002);
select * from employee_1;
select  e1.name, "    is manager of   ", e2.name from employee_1 e1, employee_1 e2 
where  e1.id=e2.manager_id;

select  e1.name, "    is manager of   ", e2.name from employee_1 e1 
inner join employee_1 e2 
on  e1.id=e2.manager_id;
    
select * from student;    
select max(marks) from student;    

select * from student where marks=(select max(marks) from student);    
select * from student where marks=(select min(marks) from student);
-- inner join
select p.product_id,product_description,product_finish,standard_price,order_id,
order_quantity from product_1 p inner join order_1 o on p.product_id=o.product_id;
use coforge;
-- same result using sub suqry
select * from product_1 where product_id in
(select distinct product_id from order_1);

select * from product_1;
select * from product_1 where exists
(select distinct product_id from order_1 );

select * from product_1 where exists
(select distinct product_id from order_1 where 
order_quantity>=4 );

select * from product_1 where not exists
(select distinct product_id from order_1 where 
order_quantity>=4 );


select * from product_1 where  standard_price<any(select standard_price from product_1  where  
standard_price between 300 and 500 );

select * from product_1 where  standard_price<all(select standard_price from product_1  where  
standard_price between 300 and 500 );

select * from product_1 where standard_price>Any
(select distinct product_id from order_1 where 
standard_price >=200 );



select * from order_1;
select * from product_1;
select * from product_1 where  exists
(select * from product_1  where  standard_price > 500 );

-- corelated query 


select * from product_1 p1 where  standard_price<any
(select standard_price from product_1 p2  where  
p1.product_id!=p2.product_id);

create table booking(bd_id char(2) primary key, accno int,name varchar(20),
user_id int);

desc user;
desc booking;

select u.name,u.address from user u inner join booking b on u.user_id=b.user_id 
  where u.user_id  in
(select user_id from booking where name!='hdfc')
order by u.name
;
select user_id from booking where name!='hdfc';
select * from user;
select * from booking;

delimiter //
create  procedure user_data()  
begin
select * from user;
end;
//
delimiter ;
call user_data();
show tables; 
select * from student;

delimiter //
create  procedure update_marks()  
begin
update student set marks=marks+0.05;
end;
//

delimiter //
create  procedure search_student(id1 int)
begin
select * from student where id=id1;
end;
select * from student;
call search_student(10001);

call update_marks();
use coforge;
select * from employee_1;
select * from student;
desc student;
delimiter //
create  procedure search_student1(id1 int, out name1 varchar(20), 
out subject1 varchar(20))
begin
select name,subject into name1,subject1 from student where id=id1;
end;

call search_student1(10001,@name,@subject);
select @name,@subject; 
