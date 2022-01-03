select * from tab;
create table product(id int primary key, name varchar(20), cost number(10,2));
desc product;
desc product_order;

create table product_order(p_orderid int primary key, product_tot_no int, location varchar(20), p_id int, foreign key(p_id)
 references product(id) )
 
insert into  product values(10001,'trouser',1200);
insert into  product values(10002,'shirt',800);

select * from product;

insert into product_order values(1,100,'delhi',565456);-- error 
insert into product_order values(1,100,'delhi',10001);
insert into product_order values(2,100,'delhi',10001);
insert into product_order values(3,100,'delhi',10001);

commit;
select * from product;

create table book (isbn int primary key, bname varchar(20), cost number(10,2));

insert into book values(66767,'sql beginner', 780);
insert into book values(66768,'sql using oracle', 1200);
insert into book values(66769,'sql for dummies', 900);
insert into book values(66770,'sql using mysql', 500);
insert into book values(66771,'learn postgre sql', 980);
insert into book values(66772,'sql cookbook', 2380);
insert into book values(66773,'sql for expert', 1780);

select * from book;
commit;

create table mybook as  select * from book;-- new table mybook is created with same structure and data
create table mybook1 as  select * from book where 1>100 ; -- new table mybook is created with same structure and  no data

select * from mybook;
select * from mybook1;

insert into mybook1 select * from mybook where cost>900;

select * from book;

insert into book values(&isbn,'&name',&cost);
delete from book;
rollback;
delete from book where isbn=66767;
commit;

select * from book;
update book set bname='practical sql'; -- update all record
rollback;

update book set bname='practical sql', cost=1200 where isbn=66769 ;-- update specific record 


select isbn,bname,cost from book;

select isbn as "book isbn",bname "book name",cost "book price" from book;
select isbn as "book isbn",bname "book name",cost "book price", cost -cost *0.01 from book;
select isbn as "book isbn",bname "book name",cost "book price", cost -cost *0.01 "discount price" from book;


select * from employee;

select * from employee where name like 's%'; -- start with s and ending with any other 

select * from employee where name like 's___t%';

select * from employee where name like '%ar';

select * from employee where name not like '%ar';
select * from employee where name not like 's___t%';

insert into employee (id,name) values(7002,'pravin kumar'); 
insert into employee (id,name) values(7009,'pawan kumar');
commit;

select * from employee;

select * from employee where salary is null;
select * from employee where salary is not null;

desc dual;

select  replace('hello','e','G') from dual;


create table worker (worker_id int primary key ,first_name

char(25),last_name char(25),salary int,joining_date date,department

char(25))
/


insert into worker values
   (001, 'monika', 'arora', 100000, '14-feb-20', 'hr');

insert into worker values   
   (002, 'vishal', 'singhal', 300000, '14-feb-20', 'hr');

insert into worker values 
   (003, 'vishal', 'singhal', 300000, '14-feb-20', 'hr');

insert into worker values   
   (004, 'vivek', 'bhati', 500000, '14-jun-11', 'admin');

insert into worker values   
   (005, 'vipul', 'diwan', 200000, '14-jun-11', 'account');

insert into worker values   
  (006, 'satish', 'kumar', 75000, '14-jan-20', 'account');

insert into worker values   
  (007, 'geetika', 'chauhan', 90000, '14-apr-11', 'admin');

select first_name from worker;
select replace(first_name,'A','a') from worker;



select * from worker;
select * from worker where  department='hr';
