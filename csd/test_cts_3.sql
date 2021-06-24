create database cts_db3;
show  databases;
use cts_db3;
show tables;

create table product(prdid int primary key, name varchar(10), cost float(10,2) );
desc product;

insert into product values(8005, 'pizza', 400);
insert into product values(8006, 'burder', 300);
insert into product values(8001, 'biryani', 500);
insert into product values(8007, 'chicken tikka', 350);
insert into product values(8002, 'desert', 200);

select * from product;
select prdid,name from product;
select * from product where  name='pizza';
select * from product where  cost>=300;

select * from product where prdid=8001 or name='pizza';
select * from product where prdid=8001 and name='pizza';
select * from product where prdid=8001 and name='biryani';

select * from product order by cost;
select * from product order by cost desc;

select * from product order by name;

desc product;

alter table product add mfd date;
select * from product;
update product set name='burger' where  prdid=8006;

update product set name='tikka', cost=200 where  prdid=8001;

update product set name='burger', mfd='2021-06-18' where  prdid=8006;

update product set name='chicken burger', mfd=current_date() where  prdid=8005;

select current_date();

desc product;
alter table product modify  name  varchar(40);

alter table product change name prd_name varchar(40);
insert into  product(prdid,prd_name) values(8832, 'momos');

select* from product;
show tables;
create table furniture_customer(customer_id int not null,customer_name varchar(20) not null, 
city varchar(20) not null unique,locaton varchar(20) not null, primary key(customer_id));

desc furniture_customer;

-- insert into furniture_customer (customer_id,customer_name) values(9001,'john'); 
insert into furniture_customer  values(9001,'john','chennai','thoraipakkam');
-- insert into furniture_customer  values(9002,'jack ','chennai','thoraipakkam');
insert into furniture_customer  values(9002,'jack ','madurai','thoraipakkam');

create table passenger (passenger_id int not null, passenger_name varchar(20) not null,country_code varchar(10) not null,
 age int not null, primary key(passenger_id, country_code) );

desc passenger;
insert into passenger values(1001, 'r kumar','in',34);
insert into passenger values(1001, 'r kumar','ne',45);
insert into passenger values(1002, 'r kumar','in',45);
insert into passenger values(1002, 'r kumar','sl',34);
select * from passenger;

create table customer (customer_id int , customer_name varchar(20),customer_mb_no bigint, primary key(customer_id)  );
create table customer_order(order_id int , order_date date, cid int not null, primary key(order_id), 
foreign key(cid) references customer(customer_id));
-- customer -- child table 
-- customer_order -- parent table 
desc customer_order;
insert into customer_order values(788788,'2021-12-12',9001);
insert into customer values(9001,'raaj kumar',7676776760);

select co.order_id, co.order_date,co.cid, cu.customer_id,cu.customer_name,cu.customer_mb_no from customer_order co,customer cu;

select co.order_id, co.order_date,co.cid, cu.customer_id,cu.customer_name,
cu.customer_mb_no from customer_order co,customer cu where co.cid=cu.customer_id;


create table book (isbn int, bname varchar(20)not null  default 'sql beginner' , 
author text not null, cost float, primary key(isbn), check(cost>=300));
drop table book;

insert into book (isbn,author,cost) values(86667,' s john',500);
insert into book (isbn,author,cost) values(86669,' a mark',600);
insert into book (isbn,author,cost) values(86661,' p schildt',700);

insert into book values(99891,'sql in action' ,'k johnson',1200);
select bname from book;
select distinct(bname) from book;
select * from book limit 3;
select * from book limit 0,3;
select * from book limit 3,3;

select * from book  where isbn=86661;
select * from book  where isbn!=86661;

select * from  book where bname='sql beginner' or bname='sql in action' or bname='sql for dummies';
select * from  book where bname in ('sql beginner' ,'sql in action','sql for dummies');
select * from  book where bname not in ('sql beginner' ,'sql in action');
select * from book where author like 's%';
select * from book where author like 'p%';

select * from book where bname like 'sql%';
select * from book where bname like '%es';
select * from book where author like 's_j%';
select * from book;


select * from book;

desc book;

select * from product;
select * from product where mfd is null;
select * from product where mfd is not null;

select count(*) from product;
select max(cost) from product;
select min(cost) from product;
select sum(cost)  as "total  cost " from product;
select avg(cost)  as "average  cost " from product;

select concat(prdid,prd_name) as "id and name" from product;


select concat(prdid,'   ',prd_name) as "id and name" from product;
select prdid, prd_name ,length(prd_name) "name length " from product;
select isbn,bname,author, replace(author,'k johnson', 'mr k johnson' ) from book ;
select isbn,bname, replace(author,'k johnson', 'mr k johnson' )  "author "from book ;
select author ,bname from book;
select author, bname, substring(bname,10) from book;
select author, bname, substring(bname,0) from book;
select author, bname, substring(bname,3,5) from book;

select datediff('2021-12-12','2020-10-12');
select datediff('2021-12-12',current_date());

select * from employee;

create table employee(emp_id int not null, emp_name varchar(20), dob date not null, doj date not null, 
primary key(emp_id));

insert into employee values(10001, 'a kumar', '1992-12-10',current_date());
insert into employee values(10002, 'a kumar', '1990-12-11','2021-01-10');
insert into employee values(10003, 'a kumar', '1991-11-10','2020-10-10');
insert into employee values(10004, 'a kumar', '1989-12-10','2019-09-10');
select emp_id, emp_name, dob, doj from employee;
select emp_id "employee id ", emp_name " employee name", dob "date of birth", doj  "date of joining"
from employee;
select emp_id "employee id ", emp_name " employee name", dob "date of birth", doj  "date of joining" 
 , datediff(doj,dob) "no of days"from employee;

select emp_id, emp_name, date_format(dob,'%d-%m-%Y') "dob", monthname(dob) "dob month", date_format(doj,'%d-%m-%y') "doj" 
from employee;

select emp_id, emp_name, dob, monthname(dob) "dob month", doj from employee;

select current_date();
select date_format(current_date(),'%Y-%m-%d');
select date_format(current_date(),'%d-%m-%Y');

select str_to_date('2012-10-22','%Y-%m-%d');
select now();

select * from employee;

select author, bname, substring(bname,10) from book;


select current_date();


show tables;
select * from customer;
-- select * from customer where customer_mb_no=null;
select * from customer where customer_mb_no is null;
select * from customer where customer_mb_no is not null;

insert into customer (customer_id,customer_name) values(98989,'sajjan kumar');
insert into customer (customer_id,customer_name) values(98981,'ranjan kumar');
insert into customer (customer_id,customer_name) values(98982,'sanjay kumar');

select * from book;
select * from book where author like 'k%';
select * from book where author like '%k';
select * from book where  bname like '____i%';
select * from book where  bname like 'sql in%';
select * from book where author like '___s%';

select isbn, count(bname), bname from book group by bname;
select isbn, count(bname), bname from book group by bname having bname='sql beginner';
select isbn, avg(cost), count(bname),  bname from book group by bname ;

select * from book;
show tables;

create table customer1(customer_id int not null , name text not null, city text not null, 
   primary key(customer_id));
create table order1(order_id int not null, order_date date not null, cid int not null, primary key(order_id)); 

insert into customer1 values(1101,'pankaj kumar' ,'delhi'); 
insert into customer1 values(1103,'aman kumar' ,'noida'); 
insert into customer1 values(1104,'suresh kumar' ,'mathura'); 
insert into customer1 values(1106,'umesh kumar' ,'banaras'); 
insert into customer1 values(1108,'rahul kumar' ,'lucknow'); 

insert into order1 values(1, current_date(),1101);
insert into order1 values(2, '2021-06-6',1101);
insert into order1 values(3, '2021-06-10',1102);
insert into order1 values(4, '2021-06-9',1103);
insert into order1 values(5, '2021-06-16',1104);
insert into order1 values(6, '2021-06-18',1105);
select * from customer1;
select * from order1;

-- cross join 
select customer1.customer_id, customer1.name, customer1.city, order1.order_id,
 order1.order_date from customer1, order1.cid;
 
-- equi join using old sql syntax
select customer1.customer_id, customer1.name, customer1.city, order1.order_id,
 order1.order_date from customer1, order1 where customer1.customer_id=order1.cid;
-- equi join using ansi sql syntax
select customer1.customer_id, customer1.name, customer1.city, order1.order_id,
 order1.order_date from customer1 inner join order1 on customer1.customer_id=order1.cid;

	-- equi join using table alias

	select cust.customer_id, cust.name, cust.city, ord.order_id,
	 ord.order_date from customer1 cust inner join order1 ord on cust.customer_id=ord.cid;
	 
	-- left join 
	select cust.customer_id, cust.name, cust.city, ord.order_id,
	 ord.order_date from customer1 cust left join order1 ord on cust.customer_id=ord.cid;

	-- right join 
	select cust.customer_id, cust.name, cust.city, ord.order_id,
	 ord.order_date from customer1 cust right join order1 ord on cust.customer_id=ord.cid;
	 
     select * from book;
     -- record having max cost 
     select * from book where cost=1200;
select max(cost) from book;

     select * from book where cost=(select max(cost) from book);
     select * from book where cost=(select min(cost) from book);
     use cts_db3;
     select * from customer1;
     select * from order1;
     -- customer who has given order
     select * from customer1 where customer_id in (select distinct cid from order1);

     select customer1.customer_id, customer1.name, customer1.city, order1.order_id,
      order1.order_date from customer1 inner join order1 on customer1.customer_id=order1.cid;

     -- customer who has not given order
     select * from customer1 where customer_id not in (select distinct cid from order1);
     
     select * from customer1 where exists (select distinct cid from order1);
     select * from customer1 where not exists (select distinct cid from order1);
     
select isbn, bname,avg(cost) from book group by bname ;     
select isbn, bname, avg(cost)  over ( partition by  bname) from book  ;     

select isbn, bname,  rank()  over ( partition by bname order by isbn) from book  ;     













 




