show databases;
use coforge_db;
show tables;

show tables;

create table student(id int primary key auto_increment, name varchar(20), 
city varchar(20), gender enum ('male','female'), 
hobbies set ('music','movie','touring','reading'), check( city in('chennai','delhi','noida')));


drop table student;

describe student;

insert into student(name,city,gender, hobbies) values('amit kumar', 'noida','male','music,reading');



create table product(prdid int primary key,pname varchar(20), cost float );

create table product_order(order_id int primary key, order_date date,
 location varchar(20), product_id int , FOREIGN KEY(product_id) 
 references product(prdid));



insert into product values(10001,'mobile',12000);
insert into product values(10002,'bike',90000);

insert into product_order values (1,current_date,'delhi',10001);

insert into product_order values (2,'2026-5-29','chennai',10001);

 select * from product;
  select * from product_order;
 -- display the values of the product  for which  order has been placed 
 
 select * from product p  , product_order  po where p.prdid=po.product_id;
 
 
  create table product_delivery(prd_del_id int primary key,delivery_date date, prd_id int , order_id1 int , foreign key (prd_id) references product(prdid), foreign key (order_id1) references product_order(order_id) );
 
 insert into product_delivery values(9001,'2026-7-12',10001, 1 );
 insert into product_delivery values(9001,'2026-7-12',10001, 2 );
 
 
-- alter 

create table book(isbn int , bname varchar(10), publish_date date);
desc book;  
-- add column 
alter table book  add column author varchar(20);
-- modify column 
alter table book  modify column bname varchar(20);
-- add constraint primaryt key to  isbn  
alter table book  modify column isbn int primary key;


-- rename column  
alter table  book change isbn book_isbn int ;
-- add auto_increment
alter table book  modify column book_isbn int  auto_increment;

-- drop column
alter table book drop column  publish_date;
-- update 
 update student set name='kamal kumar', city='chennai' where id=1;
 update student set name='kamal kumar', city='chennai',hobbies='movie,touring' where id=1;
 
 update student set name='kamala kumari', city='chennai',hobbies='movie,touring', gender='female' where id=1;
 
 select * from  student limit 2;
 select * from  student limit 3,2;
 
 select * from student where city='chenni' or city='noida';
 select * from student where  city  in('chenni' ,'noida');
 select * from student where  city  not in('chenni' ,'noida');

-- like OPERATOR
 
 select * from student where name like 'a%';
   select * from student where city  like '%i';
 select * from student where city  like '%a';

 select * from student where name like '__i%';
 
-- aggregate function

 select count(*) from student;
  select count(city) from student;
  select count(*) from employee;
   select count(salary) from employee;
  select min(salary)  ' min salary ' from employee;
  select max(salary)  ' max salary ' from employee;
  
  select sum(salary)  ' total  salary ' from employee;
 select avg(salary)  ' average salary ' from employee;
 select avg(salary)  ' average salary ' from employee;
 
  select city ,count(city)  from student group by city;
  
   select city ,count(city)  from student group by city having city='chennai';
   
   join 
   
   create table customer(cid int primary key, name varchar(20),age int);
   
   create table customer_order (c_order_id int primary key, order_date date, status enum('delivered','not delivered'),  customer_id  int);	

insert into customer values(90001,'pawan kumar',24);
insert into customer values(90002,'aman kumar',22);
insert into customer values(90003,'suman kumar',21);
insert into customer values(90004,'raman kumar',34);
insert into customer values(90005,'chaman kumar',45);
insert into customer values(90006,'shyam kumar',29);


insert into customer_order values(10001,current_date,'delivered',90001);
insert into customer_order values(10002,current_date,'delivered',90002);
insert into customer_order values(10003,current_date,'delivered',90009);
insert into customer_order values(10004,current_date,'delivered',90008);
insert into customer_order values(10005,current_date,'delivered',90004);	
-- cartesian product 

 select * from customer_order, customer;
-- inner join or equi join 
-- list of customers who have placed the orders 

select * from customer,customer_order  where  customer.cid=customer_order.customer_id;

 select * from customer c,customer_order co  where  c.cid=co.customer_id;
 
 -- new sql syntax , ansi sql 
 
  select * from customer c inner join customer_order co on c.cid=co.customer_id;

 select c.cid, c.name,c.age, co.c_order_id, co.order_date,co.status  from customer c inner join customer_order co on c.cid=co.customer_id;
 -- left join
  select c.cid, c.name,c.age, co.c_order_id, co.order_date,co.status  from customer c left  join customer_order co on c.cid=co.customer_id;
  
  -- list of customers who have not placed the orders
  
  select c.cid, c.name,c.age, co.c_order_id, co.order_date,co.status  from customer c left  join customer_order co on c.cid=co.customer_id   where co.c_order_id is null;
  
  -- list of customers who have  placed the orders using left  join 
  
   select c.cid, c.name,c.age, co.c_order_id, co.order_date,co.status  from customer c left  join customer_order co on c.cid=co.customer_id   where co.c_order_id is  not null;
   -- or 
   select c.cid, c.name,c.age, co.c_order_id, co.order_date,co.status  from customer c inner   join customer_order co on c.cid=co.customer_id  ;
 
  -- right join 
 select c.cid, c.name,c.age, co.c_order_id, co.order_date,co.status  from customer c right    join customer_order co on c.cid=co.customer_id ;
 
  -- list of orders not placed by any customer 
    select c.cid, c.name,c.age, co.c_order_id, co.order_date,co.status  from customer c right    join customer_order co on c.cid=co.customer_id where c.cid is null;

-- list of orders placed by the customers;

	 select c.cid, c.name,c.age, co.c_order_id, co.order_date,co.status  from customer c right    join customer_order co on c.cid=co.customer_id where c.cid is not null;
   
  
  -- right join 
select c.cid, c.name,c.age, co.c_order_id, co.order_date,co.status  from customer c right   join customer_order co on c.cid=co.customer_id;
 
   -- full outer join 
   
    select c.cid, c.name,c.age, co.c_order_id, co.order_date,co.status  from customer c left  join customer_order co on c.cid=co.customer_id
	
	 union 
	 
	  select c.cid, c.name,c.age, co.c_order_id, co.order_date,co.status  from customer c right  join customer_order co on c.cid=co.customer_id;
	  
   -- subquery 
   --  list of customers who have placed the orders 
select * from customer where customer.cid in (select customer_id from customer_order);

--  list of customers who have not placed the orders 

 select * from customer where customer.cid not in (select customer_id from customer_order);
 
   -- exists 
   
   select * from customer where exists (select customer_id from customer_order);
   
   -- index 
    create index customer_index on customer(cid);
  
   show index from customer;

  use coforge_db;
   -- procedure 
   
   drop procedure employee_avg_salary;
   delimiter //
   create procedure employee_avg_salary()
     begin
       select avg(salary) 'average salary' from employee;
	 end ;
   
   call employee_avg_salary;
   
    show create table  employee;
	show create procedure employee_avg_salary;
	
	delimiter //
    create procedure employee_search_byid(id1 int)
     begin
     select * from employee where id=id1;
    end;
     
	call employee_search_byid(10001);
	 
	delimiter //
    create procedure student_search_byid(in id1 int, out name1 varchar(20) ,out city1 varchar(20) )
     begin
     select name, city into name1, city1 from  student  where id=id1;
    end;
    
	call student_search_byid(1,@name,@city);
    select @name,@city;
    
	
    