select version();
 select user();
 
show databases;
create database db1;

use db1;
show tables;
create table employee(id int primary key, name varchar(20),
salary float(10,2));
desc employee;
describe employee;

insert into employee values(1001,'ram kumar',34000.45546);
insert into employee values(1001,'shyam kumar',37000.4546);
insert into employee values(1002,'shyam kumar',37000.4546);
insert into employee values(1003,'amit kumar',78000.767);
insert into employee values(1004,'sumit kumar',89000.767);

insert into employee values
(1005,'priyanshu kumar',67000.767),
(1006,'pankaj kumar',55000.767),
(1007,'anil kumar',45000.767),
(1008,'umesh kumar',90000.767); 


select * from employee;
select id,name,salary from employee;
select id,name from employee;
select id from employee;



drop database db1;
select user();
select version();
select current_date();
select now();
select current_time();


alter table employee add dob date; 
-- add column dob with data type date 
desc employee;

alter table employee modify name  varchar(50);  

insert into employee values(10010,'sri sri priyanshu kumar sharma',67000.767,'1998-12-12');

select current_date();

alter table employee change dob employee_dob date;


insert into employee values(10011,'raman kumar sharma',67000.767);

insert into employee (id,name,salary) values(10011,'raman kumar sharma',67000.767);

insert into employee (id,name) values(10012,'ram lal sharma',76000.767);
	
select * from employee where salary>=34000 and salary<=50000;


alter table employee add gender varchar(10);
alter table employee add location varchar(10);
alter table employee drop  location ;
use db1;
update employee set gender='male';

update employee set gender='male' where id=1001;
update employee set gender='male' , employee_dob='1996-12-28' where id=1001; 

create database database1;
create database database2;
show databases;
drop database database1;
show databases;

delete from employee where id=1001 and salary=89000.77;

delete from employee where id=1001 and salary=34000.46;

delete from employee where id=1002 and salary=89000.77;

delete from employee where id=1002 or  salary=89000.77;


select * from employee;
select id,name,salary, employee_dob, gender  from employee;

select id as "emp id ",name as "employee name",salary, salary-salary*0.05 as "gross salary" ,  employee_dob, gender  from employee;
-- order by   -- 
select * from employee;
select * from employee order by name;
select * from employee order by  name asc;
select * from employee order by  name desc;
select * from employee order by  salary;
select * from employee order by  name,salary;
select * from employee order by  name;



create table student(roll int , name varchar(20) unique not null, primary key(roll));

insert  into student values(1001,null);
insert  into student (roll) values(1001);

insert  into student values(1001,'ram kumar');
insert  into student values(1002,'ram kumar');

drop table student;
create table student(roll int , name varchar(20) unique not null default 'amit kumar', primary key(roll)); 

create table person(id int, name varchar(20), salary float(10,2), primary key(id), check(salary>5000) );

insert into person values(10001,'suresh kumar',1000);
insert into person values(10001,'suresh kumar',10000);	
	
select * from employee where name='amit kumar' || name='pankaj kumar' || name='umesh kumar';

select * from employee where name in('amit kumar' , 'pankaj kumar' , 'umesh kumar');

show tables;

create table customer(customer_id int , name varchar(20), location varchar(20), primary key(customer_id));

create table order_customer(order_id int ,cost float, order_name varchar(20), cid int, primary key(order_id), foreign key(cid) references customer(customer_id) );

create table order_customer(order_id int ,cost float, order_name varchar(20), cid int, primary key(order_id), foreign key(cid) references customer(customer_id) on delete cascade);	
	

insert into customer values(10001,'amit kumar','noida');
 insert into order_customer values(1,340,'pizza capsicum',9001);-- error 

 insert into order_customer values(1,340,'pizza capsicum',10001); -- work 



-- delete cascade 
 insert into customer values(10001,'amit kumar','noida');
 insert into customer values(10002,'amit kumar','noida');
 insert into customer values(10003,'sumit kumar','delhi');


insert into order_customer values(1,340,'pizza capsicum',10001);
insert into order_customer values(2,150,'burger',10001);
insert into order_customer values(3,300,'biryani',10001);

delete   from customer where customer_id=10001;
-- it will delete related record with cid from child table order_customer 	

create table worker(id int primary key auto_increment, name text,wages decimal,entry_time time);

insert into worker (id,name,wages,entry_time) values(10001,'sudhanshu partap',800,'10:00:00');  

insert into worker (name,wages,entry_time) values('parmod kumar',800,'10:00:00');
insert into worker (name,wages,entry_time) values('suman kumar',870,'9:00:00');
insert into worker (name,wages,entry_time) values('pawan kumar',810,'9:30:50');
insert into worker (name,wages,entry_time) values('surendra kumar',700.60,'10:00:00');

alter table worker add joining_year year;
update worker set joining_year='2024';

alter table worker add entry_date_time timestamp;
update worker set entry_date_time=current_timestamp();

select current_timestamp();


select * from worker;
select name, length(name) from worker ;


-- adding auto_increment

create table test3(id int, primary key(id));


desc test3;
-- change  used to change the column name 
alter table test3 change id  id int  auto_increment;


-- add primary key 
create table test4(id int, name text);

alter table test4 add primary key(id);


create table myproduct(id int primary key, name text, cost decimal);

create table mypayment(id int primary key, amt float );
-- foreign key using child table primary key 

alter  table mypayment add foreign key(id) references myproduct(id);

alter table myproduct  modify column name varchar(20) unique; 
desc myproduct;

select * from employee limit 2;  -- 2 record (count) from start position
select * from employee limit 5,2; -- 1st arg is offset(start), 2nd arg is count

-- like 
select * from employee where name like 'a%'; -- all names start with a character 

select * from employee where name like '___t%';
select * from employee where name like '%sharma';
 -- start anything in last must have sharma
select * from employee where name like '%sh%'; -- name having sh any where 


 select max(salary) 'max salary', min(salary) 'min salary', avg(salary) 'avg salary', sum(salary) 'total salary',count(*) , count(employee_dob)  from employee;

select concat(id, ' --- ',name) from employee;
select concat(name,'   has id   ',id) from employee;
select concat(name,'   has id   ',id,'  salary is ',salary) from employee;


select name, length(name), char_length(name) from employee;

select id,name, replace(name,'kumar','bharti') from employee;

select id,name, replace(name,'kumar','bharti') from employee where id=1003;
select name, substr(name,3)  from employee;
select name, substr(name,3,5)  from employee;


select datediff(current_date,'1998-10-21') ;

select id,name,salary, datediff(current_date(),employee_dob) from employee;

select date_format(current_date(),'%d-%m-%Y');
select date_format(current_date(),'%D-%m-%Y');
select date_format(current_date(),'%a-%m-%Y');
select date_format(current_date(),'%w-%m-%Y');
select date_format(current_date(),'%W-%m-%Y');

select * from employee;
update employee set employee_dob='1997-12-30';

select id,name,salary,employee_dob,date_format(employee_dob,'%d-%m-%Y'), gender from db1.employee;

select id,name,salary,employee_dob,date_format(employee_dob,'%D-%m-%Y'), gender from db1.employee;


select id,name,salary,employee_dob,date_format(employee_dob,'%a-%m-%Y'), gender from db1.employee;

select id,name,salary,employee_dob,date_format(employee_dob,'%W-%m-%Y'), gender from db1.employee;

select str_to_date('21-10-1999','%d-%m-%Y');

select str_to_date(date_format(current_date,'%d-%m-%y'),'%d-%m-%Y');
 
select now();
select current_timestamp();
select current_time();
select current_date();

select current_user();

select * from employee where name='amit kumar';
-- not equal to 
select * from employee where name!='amit kumar';

insert into employee (id,salary)  values(90001,55000);
insert into employee (id,name,salary)  values(90002, 'pawan kumar',59000);

-- is null
select * from employee where name is null;
select * from employee where name is not null;

select * from employee where name is null;
select * from employee where gender is not null;



create table course(id int auto_increment, name text , cost float , duration int, location text, primary key(id));


insert into course values(90001,'core java',5000,10,'new delhi' );
insert into course (name,cost,duration,location) values('core java',4000,15,'noida' );
insert into course (name,cost,duration,location) values('core java',4500,15,'gurgaon' );
insert into course (name,cost,duration,location) values('spring',7000,25,'noida' );
insert into course (name,cost,duration,location) values('spring',7000,27,'new delhi' );
insert into course (name,cost,duration,location) values('spring boot',9000,16,'new delhi' );
insert into course (name,cost,duration,location) values('spring boot',10000,20,'aagra' );

 select * from course;
 select name,count(name) from course group by name;
 select location,count(location) from course group by location;
 select name,count(name),max(cost), min(cost) from course group by name;
 select location,count(location),max(cost), min(cost) from course group by location;


select name,count(name),max(cost), min(cost), min(location) from course group by name;

select location,count(location),max(cost), min(cost) from course group by location having location='new delhi';


select location,count(location),max(cost), min(cost) from course group by location having count(location)=2;

-- join 
create table product(prdid int , pname text, cost float, primary key(prdid));

create table product_order(order_id int, order_date date, pid int, primary key(order_id), foreign key(pid) references product(prdid));


insert into product values(10001,'shirt',1200);
insert into product values(10002,'pant',1500);
insert into product values(10003,'mobile',7000);
insert into product values(10004,'tablet',12000);

insert into product_order values(1,current_date(),10001);
insert into product_order values(2,'2024-05-10',10002);
insert into product_order values(3,'2024-05-10',10002);
insert into product_order values(4,'2024-04-11',10003);
insert into product_order values(5,'2024-04-11',10003);
insert into product_order values(6,'2024-04-11',10004);
-- cartesian product 
select * from product; -- 4
select * from product_order; -- 6

select * from product, product_order;-- 4*6=24 


-- inner join or equi join old sql 
select * from product, product_order where product.prdid=product_order.pid;

select p.prdid, p.pname,p.cost, o.order_id, o.order_date   from product p, product_order o where p.prdid=o.pid;
-- ansi sql  
select p.prdid, p.pname,p.cost, o.order_id, o.order_date   from product p inner join product_order o on  p.prdid=o.pid;



drop table user;
create table user(uid int auto_increment, name text , location text , primary key(uid));

create table user_product(pid int auto_increment, pname text, cost float , uid int,
primary key(pid)
 );

insert into user values(10001,'suresh kumar','delhi');
insert into user (name,location)values('anand kumar','noida');
insert into user (name,location)values('parmod kumar','guragaon');
insert into user (name,location)values('suman kumar','aagra');
insert into user (name,location)values('aman kumar','mathura');
insert into user (name,location)values('vimal kumar','guragaon');

insert into user values(90001,'anil kumar','delhi');
insert into user values(90002,'jai kumar','ghaziabad');
insert into user values(90003,'dinesh kumar','faridabad');	
select * from user;


insert into user_product (pname,cost,uid) values('pizza',300,10001);
insert into user_product (pname,cost,uid) values('burger',150,10007);
insert into user_product (pname,cost,uid) values('sandwich',90,10009);
insert into user_product (pname,cost,uid) values('cold drink',50,10010);
insert into user_product (pname,cost,uid) values('samosa',40,10002);
insert into user_product (pname,cost,uid) values('dosa',80,10003);
insert into user_product (pname,cost,uid) values('idli',66,10004);
insert into user_product (pname,cost,uid) values('rice',48,10008);
insert into user_product (pname,cost,uid) values('pulao',60,10005);
insert into user_product (pname,cost,uid) values('daal',48,10006);

	
-- inner join user whose order are placed 

select u.uid,u.name,u.location, p.pid,p.pname,p.cost from user u inner join user_product p on u.uid=p.uid;


select u.uid,u.name,u.location, p.pid,p.pname,p.cost from user u left join user_product p on u.uid=p.uid;

   -- user who have not given order 
 select u.uid,u.name,u.location, p.uid, p.pid,p.pname,p.cost from user u left join user_product p on u.uid=p.uid where p.uid is null;

-- product  which  have been not ordered 

 select u.uid,u.name,u.location, p.uid, p.pid,p.pname,p.cost from user u right join user_product p on u.uid=p.uid where u.uid is null;

 -- subquery
  select * from course where cost=(select max(cost) from course);
  select * from course where cost=(select min(cost) from course);


select u.uid,u.name,u.location, p.pid,p.pname,p.cost from user u inner join user_product p on u.uid=p.uid;

--instead of join use subquery 
--user whose order are placed

select * from user, user_product where user.uid=user_product.uid;

select * from user where uid in (select uid from user_product);

-- -- user who have not given order
select u.uid,u.name,u.location, p.uid, p.pid,p.pname,p.cost from user u left join user_product p on u.uid=p.uid where p.uid is null;

select * from user where uid not in (select uid from user_product);
select u.uid,u.name,u.location from user u left join user_product p on u.uid=p.uid where p.uid is null;

-- using exists  -- with subquery and left join 
select u.uid,u.name,u.location from user u left join user_product p on u.uid=p.uid ;
select * from user where  exists (select uid from user_product);

-- empty result
 select * from user where  not exists (select uid from user_product);

--all 
select * from user where uid  >all (select uid from user_product);

-- any
select * from user where uid  >any (select uid from user_product);-- exclude first 
select * from user where uid  >=any (select uid from user_product);-- include first result 
-- procedure 
select * from employee;


delimiter //
create procedure getallemp()
begin
select * from employee;
end;
//
call getallemp()//


delimiter //
create procedure ordernotplaced()
begin
select u.uid,u.name,u.location, p.uid, p.pid,p.pname,p.cost from user u left join user_product p on u.uid=p.uid where p.uid is null;
end;
//

call ordernotplaced()//


delimiter //
create procedure searchemp(id1 int)
begin
select * from employee where id=id1;
end;
//
call searchemp(1003)//

-- procedure with out parameter 


delimiter //
create procedure count_course_byname(name1 varchar(20), out count1 int )
begin
select count(*) into count1 from course where name=name1;
end;
//

call count_course_byname('spring',@count10);
select @count10;


delimiter //
create procedure course_search_byid(in id1 int, out name1 varchar(20), out cost1 float  )
begin
select  name, cost  into name1, cost1  from course where id=id1;
end;
//


call course_search_byid(90001,@name,@cost);
select @name, @cost ;



use db1;

delimiter  //
create function employee_avg_salary()
     returns float
     deterministic
     begin
     declare salary1 float;
    select avg(salary) into salary1 from employee;
    return salary1;
    end;
    //
    
    
    delimiter //
    create function employee_search_id(id1 int)
     returns varchar(20)
  deterministic
    begin
   declare name1 varchar(20);
     select name into name1 from employee where id=id1;
     return name1;
    end;
    
    select employee_search_id(1003);
    
select current_date() "date",employee_avg_salary() "avg salary ", employee_search_id(1003) "search"//
