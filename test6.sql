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


select * from mybook;
select * from worker where department='hr' or department='account';

select * from worker where department in('hr','account');
select * from worker where department in('hr','account','admin');
select * from worker where department not in('hr','account');


select worker_id ,first_name from worker ;

select worker_id ||'      '|| first_name from worker ;

select worker_id ||' ------------     '|| first_name from worker ;

select sysdate from dual;
select current_date from dual;
select current_timestamp from dual;

select current_date, current_timestamp from dual;
select * from employee;
select * from department;

select * from customer;
select * from student;
select * from product;

select * from product;
insert into customer values(10001,'amar kumar','chennai',12000)
insert into customer values(10002,'amit kumar','madurai',15000)
insert into customer values(10003,'ravi kumar','chennai',22000)
insert into customer values(10004,'devendra kumar','chennai',42000)
insert into customer values(10005,'suranjan kumar','madurai',32000)
insert into customer values(10006,'amrit kumar','chennai',62000)
insert into customer values(10007,'sunayana  kumari','noida',22000)
insert into customer values(10008,'preeti sharma','rameswaram',25000)

drop table customer; 
create table customer (cid int primary key, name varchar(20),location varchar(20),salary number);

desc customer;
commit;

select cid,name, location , salary from customer;

select   distinct (location) from customer;
select   (location) from customer;



select * from customer;

select * from customer where location='chennai'
union
select * from customer where location='madurai';


select * from customer where location='chennai'
union all
select * from customer where location='madurai';

select bname from book
 union 
select bname from mybook


select bname from book
intersect
select bname from mybook


select bname from book
minus
select bname from mybook

--delete from mybook;
rollback;
commit;
insert into mybook values(10090,'practical sql',450);
insert into mybook values(10091,'java beginner',450);
insert into mybook values(10092,'java professional',450);
insert into mybook values(10093,'java advanced',450);


-- aggregate function--
select * from book;
select max(cost)from book;
select min(cost)from book;
select avg(cost) as "average cost" from book;
select sum(cost) as "average cost" from book;
select count(*) from book;

select * from customer;
select  count(location),location  from customer group by location;
select  avg(salary),location  from customer group by location;
select  max(salary),location  from customer group by location;
select  count(location),location  from customer group by location having location='chennai';

select  avg(salary),location  from customer group by location;
select  avg(salary) from customer;
select * from customer;




select max(name) from employee;
select min(name) from employee;

create table survey(id int primary key, city varchar(20),state varchar(20) default 'tamil nadu');
insert into survey values(556656,'delhi', 'delhi');

insert into survey (id,city) values(556658,'chennai');
commit;
select * from survey;


create table city (city_id int, name varchar(20), state varchar(20), country varchar(20),unique(name), 
constraint con_st unique(state), constraint const_cityid primary key (city_id)
)

desc city;
select * from USER_CONSTRAINTS  where TABLE_NAME='CITY';


create table garments(id int , type varchar(20),constraint  id_pk  primary key(id), constraint type_unq unique(type)); 

desc garments;
alter table garments add cost number(10,2);
alter table garments  modify  (type varchar(30));

create table garments_order( order_id int , order_date date, location varchar(20), garment_id int);
alter table garments_order add constraint fk  foreign key(garment_id) references garments(id);
commit;

desc garments;
desc garments_order;
insert into garments_order values(9,'11-jan-2021','delhi',1);
insert into garments  values(1,'formal trouser',1200);
commit;

insert into garments_order values(10,'11-jan-2021','delhi',2);
rollback;
alter table garments_order disable constraint fk;                   -- disable the constraint fk
alter table garments_order enable constraint fk;      
select * from garments;
select * from garments_order;
delete from garments_order where garment_id=2;
commit;

rename city to mycity; -- renaming the table name 
desc mycity;

select * from book;
delete from book;  -- deleted recorsd are rollback 
rollback;
truncate table book; -- no rollback 


