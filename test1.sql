create  table employee(id int primary key, name varchar(20),salary int);
insert into employee  values(1001,'mohan kumar',23000.00);
insert into employee  values(1002,'suresh kumar',25000.00);

desc  employee;
select * from employee;

select * from employee where id=1001;
select * from employee where name='mohan kumar';
select * from employee where id=1001 or name='mohan kumar';
select * from employee where id=1001 or name='suresh kumar';
select * from employee where id=1001 and name='suresh kumar';
select * from employee where id=1002 and name='suresh kumar';
select id from employee;
select id, name from employee;
select id, name,salary from employee;

select * from employee

create table product (prdid int primary key, name varchar(20), cost float)
desc product
describe product

insert into product values(887788,'sql beginner book',456.67);
insert into product values(887781,'sql learning book',756.67);
insert into product values(887782,'sql for dummies book',156.67);
insert into product values(887783,'sql advanced book',256.67);
select * from product;
--insert into product values(8877,'sql beginner book for everyone',456.67);
select * from product order by name;  -- record in ascending order
select * from product order by cost;
select * from product order by cost desc; -- record in descending order

-- add multiple record 
insert all 
into product values(7001,'mobile',6700)
into product values(7002,'tv',16900)
into product values(7003,'refrigerator',17000)
into product values(7004,'cooker',1400)
select 1 from dual;

select * from tab; -- display all entities like table synonym view
select * from tab where TABTYPE='TABLE'; -- display all tables 

select * from employee1;
drop table employee1; --drop/delete the table

desc employee;

alter table employee add location varchar(20);-- alter and add column 
alter table employee  modify  name varchar(40); -- alter modify column name 

select * from employee;

delete from employee; -- rollback(undo the operation before commit)

rollback;

truncate table employee; -- delete all records permanently, can not be rolled back
rollback;

rename employee to emploee1; 
rename  emploee1 to employee1 ; 

desc employee1;

create table product (product_id int primary key, name varchar(20),cost float);
desc product;
alter table product add purchase_date date;
alter table product modify  name varchar(40);

insert into product values(87887,'food product',5678.00000,current_date);
insert into product values(87888,'food product',5678.00000,'11-Jan-20');
insert into product (prdid,name) values(87889,'sweets');

select * from product;
select current_date from dual; 

create table library(id int, name varchar(20) not null,location  varchar(20) not null);  
create table library1(id int, name  varchar(20) unique not null,location  varchar(20) not null, primary key(id));

desc library;
desc library1;
insert into library1 values(8778,'kids library','kolkotta');
insert into library1 (id,name) values(8779,'user library');
insert into library1 values(8771,'kids library','bardhman');

create table customer(id int, name  varchar(20) unique not null,location  varchar(20) default 'chennai' not null , primary key(id));
desc customer;
insert into customer (id,name) values(1001,'sundar c');
select * from customer;

create table person(id int, name  varchar(20) unique not null,location  varchar(20) default 'chennai' not null ,salary float not null, 
primary key(id), check(salary>5000));

insert into person values(1001,'a kumar','delhi',4000);
insert into person values(1001,'a kumar','delhi',6000);



create table sales(sales_id int, product_name varchar(20), amount number, primary key(sales_id));
create table delievery(delievery_id int , location varchar(20), delievery_date date,primary key(delievery_id),
   foreign key(delievery_id) references sales(sales_id));  

-- sales -- parent table 
-- delievery-- child table 
-- first add record in parent table 
-- then add record in child table 

-- one sales -- one delievery

insert into sales values(1,'trouser',1200);
insert into delievery values(1,'dadri','11-nov-2021');

-- one book -- multiple chapter 
create table book(isbn int, name varchar(20), cost float, primary key(isbn))

create table chapter(chapter_no int , chapter_name varchar(20), page_no int, book_isbn_no int, primary key(chapter_no),
foreign key(book_isbn_no) references book(isbn)) 

desc book;
insert into book values(1,'java beginner',1200);
desc chapter;
insert into chapter  values(1,'java basics',1,1);
insert into chapter  values(2,'java oop',20,1);
insert into chapter  values(3,'java io',30,1);

select * from book;
select * from chapter;


select * from product;
delete from product;
rollback;

delete from product where cost<200;

update product set purchase_date='11-nov-2021' where prdid=887788;
update product set purchase_date='12-nov-2020' , name='java beginner'  where prdid=887788;

--connect sys as dba

select * from tab;
select * from tab where TABTYPE='TABLE';

select * from employee1;
desc employee1;
insert into employee1  values(1001,'mohan kumar',23000.00,'chennai');
insert into employee1  values(1002,'suresh kumar',25000.00,'madurai');

insert into employee1  values(1003,'amit kumar',13000.00,'sholapur');
insert into employee1  values(1004,'suman kumar',45000.00,'amrabati');
commit;

select * from employee1;
select id,name, salary,  (salary-salary*0.05)    from employee1;
select id,name, salary,  (salary-salary*0.05)   as "gross salary"  from employee1;

select id as "emp id ",name as "emp name", salary,  (salary-salary*0.05)   as "gross salary"  from employee1;
create table employee as select * from employee1;-- create table with same structure and data 
drop table employee2;
create table employee2 as select * from employee1 where 0>1;-- create table with same structure without data

select * from employee2;

select * from employee;
select * from employee1;

insert into employee1  values(1005,'parshant kumar',25000.00,'pune');
insert into employee1  values(1006,'abadh kishor kumar',75000.00,'jaipur');

set auto commit on;
set auto commit off;


merge into employee  e1 using  employee1   e
	on (e1.id=e.id)
when matched  then 
	update set  e1.name=e.name, e1.salary=e.salary, e1.location=e.location
when not matched  then
	insert  values(e.id,e.name,e.salary,e.location);


select * from employee;

insert into employee  values(1007,'arpita tomar',85000.00,'udaipur');
savepoint a;

delete from employee where id=1001;
savepoint b;

commit b;


alter session set "_ORACLE_SCRIPT"=true;
create user user5 identified by manager;
grant create table,create session, unlimited tablespace to user5;


select * from employee;

insert into employee  values(1008,'sumita suman',65000.00,'udaipur');
insert into employee  values(1009,'pallavi sharma',65000.00,'jaipur');
insert into employee  values(&id,'&name',&salary,'&location');
select location from employee;

select distinct(location) from employee;
select location from employee;


-- single row function
select lower('HELLO') from dual;
select id,name,salary,location from employee;
select id,upper(name) salary,upper(location) from employee;

select sysdate from dual;
select * from product;
select prdid,initcap(name), cost, purchase_date from product;


select concat('hello','world') from dual;
select concat(id,name) from employee;

select prdid,initcap(name),length(name) as "length of name    ", cost, purchase_date from product;
select substr('hello world',3,6) from dual;
select substr('hello world',3) from dual;