\-- create table employee(id int primary key, name varchar(20) ,salary float );

\--create table student(roll int primary key, name varchar(20) ,marks float );



\--insert into employee values(10001,'ram kumar',2000);

\--insert into employee values(10002,'shyam kumar',50000);

\--insert into employee values(10004,'rita kumari',80000);



\--select \* from employee;

\--select \* from employee where id=10001;

\--select \* from employee where id>10002;

\--select id from employee;

\--select id,name from employee;

\--  and operator  all conditions must be true

\--select \* from employee where id=10001 and name='ram kumar';

\--select \* from employee where id=10001 and name='shyam kumar';

\--  or operator  any conditions must be true

\--select \* from employee where id=10001 or  name='shyam kumar';

\--select \* from employee order by id ;

\--select \* from employee order by id desc ;

\--select \* from employee order by name asc;

\--select \* from employee order by name  desc;



\-- delete  -- delete from table name where



\--delete from employee where id=10001;

\--delete from employee where id=10001 or name='shyam kumar';

\--insert into employee values(10001,'ram kumar',20000);



\--select \* from employee;

\--- between operator -- range



\--select \* from employee where salary>=20000 and salary<=50000;

\--select \* from employee where salary between 20000 and 50000;



\-- update -- make changes to the existing record

\--update  employee set name='anita kumari' where id=10004;

\--update  employee set name='anita kumari', salary=60000 where id=10004;

\--select \* from employee;



\--like operator

\--select \* from employee;

\--select \* from employee where name like 'a%';

\--select \* from employee where name like '%r';

\--select \* from employee where name like '\_\_m%';



\--insert into employee values(10001,'ram kumar',20000);

\--insert into employee (id, name) values(10005,'ramesh kumar');

\--select \* from employee;

\--select \* from employee where salary is null;

\--select \* from employee where salary is not null;



\--select \* from employee;

\--select id, name,salary from employee;

\-- using alias

\--select id as "emp id", name  "employee name",salary "emp salary" from employee;



\--select id as "emp id", name  "employee name",salary "emp salary", salary---salary\*5/100 "gross salary" from employee;





\--select current\_date;-- current date



\-- alter command   make the changes to the table;

\--modify, add , change

\-- add columns

\--alter table employee add dob date;

\--select \* from employee;

\--update employee set dob=current\_date;

\--update employee set dob='2001-11-24' where id=10002;



\--- alter with modify -- modify the column size



\--create table insurance( id int primary key , name varchar(15), maturity int, amount float(8,2));

\--insert into insurance values(100001,'child insurance',10, 20000);



insert into insurance values(100002,'child insurance above twenty years',15, 30000); -- error

\--alter table insurance **modify** name varchar(50);

\-- insert into insurance values(100002,'child insurance above twenty years',15, 30000);



\-- change table column name

&#x20;alter table insurance change  name insurance\_name varchar(50);

alter table insurance change maturity maturity\_time int;





&#x20;create table survey(survey\_id int primary key auto\_increment, survey\_name varchar(20) not null  unique , location varchar(20) default 'chennai');





&#x20;insert into survey (survey\_name,location) values ('education','madurai');

&#x20;**insert into survey (survey\_name,location) values ('education','madurai');-- error**

**insert into survey (survey\_name) values ('population'); --**



&#x20;**select \* from survey;**

**+-----------+-------------+----------+**

**| survey\_id | survey\_name | location |**

**+-----------+-------------+----------+**

**|         1 | education   | madurai  |**

**|         3 | population  | chennai  |**

**+-----------+-------------+----------+**





create table employee (id int primary key, name varchar(20), salary float, location text, check (salary>5000), check(location in('mumbai','delhi','chennai')));



**check -- salary>5000**

**location in('mumbai','delhi','chennai'))**





mysql> insert into employee values(100001,'mohan singh',1000,'madurai'); error



mysql> insert into employee values(100001,'mohan singh',6000,'madurai'); error



mysql> insert into employee values(100001,'mohan singh',6000,'mumbai');





**relationship   1 to 1**

one product owned by one customer



product       	customer



&#x20;  prd\_id **pk**    customer\_id **pk**

&#x20;  name         name

&#x20;  cost         location

&#x20;  qty          prdid  **fk unique**

&#x20;

create table product(pid int primary key, name text, cost float, qty int);

create table customer(cid int primary key, name text, location text, prdid int unique , foreign key(prdid) references product(pid));



&#x20;insert into product values(1,'apple',200,2);

&#x20;insert into customer values(10001,'arvind kumar','chennai',2);// error

&#x20;insert into customer values(10001,'arvind kumar','chennai',1);



&#x20;customer who have purchased the product



&#x20;select \* from customer, product where customer.prdid=product.pid;



**relationship   1 to many**

one product owned by multiple customer



product       	customer



&#x20;  prd\_id **pk**    customer\_id **pk**

&#x20;  name         name

&#x20;  cost         location

&#x20;  qty          prdid  **fk**

&#x20;

create table product(pid int primary key, name text, cost float, qty int);

create table customer(cid int primary key, name text, location text, prdid int  , foreign key(prdid) references product(pid));



**-- aggregate functions**



create table employee (id int primary key, name varchar(20), salary float, location text, check (salary>5000), check(location in('mumbai','delhi','chennai')));



&#x20;

&#x20;insert into employee values(100002,'suman kumar',7000, 'chennai'),(100003,'pawan kumar',67000, 'delhi'),(100004,'amit kumar',78000, 'chennai'), (100005,'arvind kumar',17000, 'mumbai');



&#x20;select avg(salary) from employee;

&#x20;select sum(salary) from employee;

&#x20;select max(salary) from employee;

&#x20;select min(salary) from employee;

&#x20;select count(salary) from employee;

&#x20;select count(\*) from employee;



**group by**



select count(location), location from employee group by location ;



&#x20;select max(salary) ,count(location), location from employee group by location ;

select sum(salary),avg(salary), min(salary), max(salary) ,count(location), location from employee group by location ;

+-------------+------





**group by with having**



select sum(salary),avg(salary), min(salary), max(salary) ,count(location), location from employee group by

location having location='mumbai';







\-----------------------------

cartesian product



set1={a,b}



set2={c,d}



set1 x set2 ={a,c}{a,d} {b,c}{b,d}



&#x20;create table  user\_product(pid int primary key, pname varchar(20), cost float );

mysql> create table  user\_order(id int primary key, order\_date date, location text, prd\_id int );



&#x20;insert into user\_product values(1,'cool drink',200),(2,'biscuit',190),(3,'book',670),(4,'garment',450),(5,'shoe',4200),(6,'sweater',700);



insert into user\_order values(9001,current\_date,'chennai',1), (9002,'2025-11-22','madurai',2),(9003,current\_date,'delhi',5),(9004,current\_date,'kolkotta',11),(9005,current\_date,'kochi',9);



&#x20;select \* from user\_product,user\_order;



**join**

**inner or equi join**

display all values for which order is placed



select \* from user\_product,user\_order where user\_product.pid=user\_order.prd\_id;

&#x20;select \* from user\_product u,user\_order o where u.pid=o.prd\_id;



&#x20;select u.pid,  u.pname, u.cost, o.id, o.order\_date,o.location from user\_product u,user\_order o where u.pid=o.prd\_id;



new syntax with inner join keyword



&#x20;select u.pid,  u.pname, u.cost, o.id, o.order\_date,o.location from user\_product u inner join user\_order o on u.pid=o.prd\_id;



left join

display all values for which order is not placed



select u.pid,  u.pname, u.cost, o.id, o.order\_date,o.location from user\_product u left join user\_order o on u.pid=o.prd\_id;





right join



select u.pid,  u.pname, u.cost, o.id, o.order\_date,o.location from user\_product u right join user\_order o on u.pid=o.prd\_id;



========================



sub query

&#x20;get the person who got the max salary;

&#x20;select \* from employee where salary=(select max(salary) from employee);



display all values for which order is placed





select u.pid,  u.pname, u.cost, o.id, o.order\_date,o.location from user\_product u inner   join user\_order o on u.pid=o.prd\_id;



display product table values for which order is placed



select \* from user\_product where pid in (select prd\_id from user\_order);

