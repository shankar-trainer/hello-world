use cts_db1;

show tables;
select * from student;
desc student;

create table furniture(customer_id int, customer_name varchar(20) unique not null,
customer_address varchar(20) not null,city varchar(20) not null,state  varchar(20) not null, 
postal_code int not null,primary key(customer_id));

desc furniture ;
insert into furniture (customer_id,customer_name) values(1001,'a kumar');

create table passenger(passenger_id int, passenger_name varchar(20),age int, primary key
(passenger_id, passenger_name));

insert into passenger values(10001, 's kumar',30);
insert into passenger values(10001, 'p kumar',30);
select * from passenger;
desc passenger;
create table  customer (customer_id int, customer_name varchar(20),adddrss varchar(20), city varchar(20),
 primary key (customer_id));
 
create table customer_order(order_id int primary key, order_date date,cid int unique not null, 
 foreign key(cid) references customer(customer_id));
 -- customer_order -- parent table  cid fk
 -- customer child table customer_id -pk
insert into customer values(7890, 'd kumar','thoraipakkam','chennai');
insert into customer_order  values(1221, '2021-10-09',7890);

insert into customer values(7891, 'a kumar','gindi','chennai');
insert into customer_order  values(1222, '2021-10-09',7891);

select * from customer_order co, customer c where co.cid=c.customer_id;

 delete from customer_order where order_id=1221;
-- delete from customer where customer_id=7891; 
-- while deleting delete from parent table then child table 
-- while insert add first in chid table then in parent table 
-- check contraint 
create table employee(id int primary key , name varchar(20) not null, salary float(10,2),check(salary>=10000));
insert into employee values(8001, 's kumar', 9000);
insert into employee values(8001, 's kumar', 10000);
insert into employee values(8006, 'k kumar', 10000.0066776);
insert into employee values(8007, 'amit  kumar', 66000.006);

select * from employee;
select count(*) from employee;
select max(salary) from employee;
select min(salary) as "min salary " from employee;
select avg(salary) as "average salary " from employee;
select sum(salary) as "total salary " from employee;
 
select * from employee limit 0,3;

create table worker(workder_id int , worker_name varchar(20) not null default 'john trevolta',wages float);

desc worker;
insert into  worker (workder_id,wages) values(67767,8900); 
select * from worker;

create table  book (isbn int primary key auto_increment, bname text, cost float, author text, publish_date_time  datetime);
insert into book (bname,cost,author,publish_date_time) values('sql beginner',400,'april mathew','2016-06-21 12:33:44');

insert into book (bname,cost,author,publish_date_time) values('sql expert',1200,'john clark ','2018-06-21 12:33:44');
select * from book;
select bname from book;
select distinct(bname) from book;


delete from book;
truncate table book;
drop table book;
desc book;
desc worker;
alter table worker change column workder_id worker_id int primary key auto_increment;

select * from worker;

insert into  worker (wages) values(19000); 
desc worker;
alter table worker modify worker_name varchar(40);


create table kids(id int, name varchar(20) , age int);
insert into kids values (1001, 'suman kumar',3);
select * from kids; 

desc kids ;
alter table kids add primary key(id);
truncate kids;
select * from book;
select isbn, concat(bname, author) as "book ---->author" from book;  
select length (bname), bname from book;
select char_length (bname), bname from book;

select * from student;
select replace(name,'kumar','sharma') from student;
select substring(name, 5,5) from student; 
select substring(name, 5,5) from student; 
select substr(name, 5,5) from student; 

select * from student;               
select * from student where marks=80;
select * from student where marks!=80;

select * from student where subject='science' or subject='tamil' or subject='telugu';
select * from student where subject  in ('science' , 'tamil' , 'telugu');
select * from student where subject  in ('science' , 'tamil' );
select * from student where subject  not in ('science' , 'tamil' );
-- like operator 
select * from student where subject like 't%';
select * from student where name like '%ar';
select * from student;
select * from student where name like '%u%';
select * from student where name like '_u%';
select * from student where name like '___u%';

show tables;
select * from book;
select * from customer;
desc student;

select * from student;
select * from student where marks is null;
select * from student where marks is not null;



insert into student (roll,name)  values(7001,'a kumar');
insert into student (roll,name)  values(7002,'suraj kumar');
insert into student (roll,name)  values(7003,'jayant kumar');
insert into student (roll,name)  values(7004,'manoj kumar');

--- date time 

select datediff('2022-10-10' ,current_date());
select current_date();
select date_format(current_date(),'%Y-%m-%d') ;
select date_format(current_date(),'%d-%m-%Y') ;
select roll,name,subject,marks, date_format(date_of_birth,'%d-%m-%Y') from student;
select str_to_date('12,05,2021','%d,%m,%Y');
select now();
select * from book;

select count(bname), bname from book group by bname;
select count(bname), bname from book group by bname having bname='sql primer';
select count(bname), bname from book group by bname;


select * from student where monthname(date_of_birth)='october';

show tables;


desc product;
create table product(prd_id int , prd_desc varchar(20),cost float, primary key(prd_id));
create table prd_order (order_id int , order_date date,prd_id int, order_qty int, primary key(order_id));
-- caretesian product
select prd.prd_id,prd.prd_desc,prd.cost, po.order_id,po.order_date,po.order_qty from product prd, prd_order po;
-- equi join  --old syntax
select prd.prd_id,prd.prd_desc,prd.cost, po.order_id,po.order_date,po.order_qty from product prd, prd_order po where 
prd.prd_id=po.prd_id;

-- equi join with ansi sql
select prd.prd_id,prd.prd_desc,prd.cost, po.order_id,po.order_date,po.order_qty from product prd inner join prd_order po 
on prd.prd_id=(po.prd_id);

-- left join with ansi sql
select prd.prd_id,prd.prd_desc,prd.cost, po.order_id,po.order_date,po.order_qty from product prd left join prd_order po 
on prd.prd_id=(po.prd_id);

-- right join with ansi sql
select prd.prd_id,prd.prd_desc,prd.cost, po.order_id,po.order_date,po.order_qty from product prd right join prd_order po 
on prd.prd_id=(po.prd_id);



insert into product values(90001,'tv',60000);
insert into product values(90003,'cooler',16000);
insert into product values(90004,'ac',40000);
insert into product values(90007,'laptop',51000);
insert into product values(90008,'mobile',12000);

insert into prd_order values(8001,'2021-01-10',90001,12);
insert into prd_order values(8002,'2021-02-11',90002,16);
insert into prd_order values(8003,'2021-01-16',90003,10);
insert into prd_order values(8004,'2021-01-12',90004,1);
insert into prd_order values(8005,'2021-03-10',90005,2);
select * from product;
select * from prd_order;

select * from student;
-- get student detail who have obtained max marks

select max(marks) from student;
select * from student where marks=92;
select * from student where marks=(select max(marks) from student);
select * from student where marks=(select min(marks) from student);
select * from student where marks in (select marks  from student where marks>=80);
select * from student where marks not in (select marks  from student where marks>=80); 

select * from student where  exists (select marks  from student where marks>=80);


create table employee_1(emp_id int primary key, name varchar(20), salary float, location varchar(20));
insert into employee_1 values(1001,'suresh kumar',20000, 'delhi');
insert into employee_1 values(1002,'amrendra kumar',30000, 'chennai');
insert into employee_1 values(1003,'mahesh kumar',25000, 'delhi');
insert into employee_1 values(1004,'anil kumar',27000, 'delhi');
insert into employee_1 values(1005,'vipin  kumar',21000, 'chennai');
insert into employee_1 values(1006,'rahul  kumar',28000, 'madurai');
insert into employee_1 values(1007,'raja  kumar',18000, 'madurai');

select * from employee_1;
select  count(name), avg(salary) from employee_1;
select  count(name), sum(salary) from employee_1;
select  emp_id,name, avg(salary)   over (partition by location order by emp_id ) "avg salary", location from employee_1;
select  emp_id,salary, rank()   over (partition by location ) "rank", location from employee_1;
select  emp_id,salary, rank()   over (partition by location order by emp_id ) "rank", location from employee_1;




use test;
show tables;


CREATE TABLE employee (id int(11) NOT NULL,  name varchar(20) NOT NULL,  salary float(10,2) DEFAULT NULL,
  PRIMARY KEY (id),  CONSTRAINT employee_chk_1 CHECK ((salary>= 10000)))
  
show databases;
