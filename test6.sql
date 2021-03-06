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

---                
  desc mybook;
 select rowid,rownum, isbn,bname,cost from mybook;
 -- display last two rows 
 
 select  * from mybook where rownum<2;
 
 select rownum, isbn,bname,cost from mybook;
select isbn,bname, length(bname)*10,cost from mybook;

select * from customer;
-- case expression
select  cid,name,location,salary from customer;


select  cid,name,location,
  case location 
   when 'chennai' then salary*1.10
   when 'madurai' then salary*1.15
   when 'noida' then salary*1.08
   else 
   salary
  end, 
salary from customer;

select  cid,name,location,salary,
  case location 
   when 'chennai' then salary*1.10
   when 'madurai' then salary*1.15
   when 'noida' then salary*1.08
   else 
   salary
  end
  "revised salary"
 from customer;

-- date function
select sysdate from dual;

select sysdate+5 from dual;-- add 5 days 
select sysdate-2 from dual;-- minus 2 days 
select * from customer;
alter table customer add  dob date;
desc customer;

update customer set dob='01-jan-1998' where cid=10001;
update customer set dob='02-feb-1998' where cid=10002;
update customer set dob='10-jun-1999' where cid=10003;
update customer set dob='21-jan-1991' where cid=10004;
update customer set dob='22-mar-1993' where cid=10005;
update customer set dob='11-apr-1992' where cid=10006;
update customer set dob='12-jul-1977' where cid=10007;
update customer set dob='18-aug-1978' where cid=10008;

select  cid,name,location,salary,dob, sysdate-dob from customer;

select  cid,name,location,salary,dob, (sysdate-dob)/365 "age" from customer;
select sysdate-to_date('05-jan-2021') from dual;
select sysdate-to_date('05-jan-2021','dd-mon-yyyy') from dual;

select sysdate from dual;
select  to_date('31-aug-2004','dd-mon-yyyy')  from dual;
select  to_date(sysdate,'dd-mon-yyyy')  from dual;
select  to_date(sysdate,'dd-mm-yyyy')  from dual;
select  to_date(sysdate,'yyyy-mm-dd')  from dual;
select  to_date(sysdate,'yyyy-mon-dd')  from dual;


select sysdate, trunc(sysdate) from dual;

select trunc(sysdate)-to_date('05-jan-2021') from dual;  -- no of days 
select (sysdate)-to_date('05-jan-2021') from dual;

select trunc((sysdate)-to_date('05-jan-2021')) from dual; -- no of days without decimal
select (trunc(sysdate)-to_date('05-jan-2021'))/7 from dual; -- no of weeks with decimal 
select trunc((trunc(sysdate)-to_date('05-jan-2021'))/7) from dual;---- no of weeks without decimal

select  cid,name,location,salary,dob, sysdate-dob from customer;
select  cid,name,location,salary,dob, trunc(sysdate)-dob from customer;
select trunc(777667.67776) from dual;
-- interval 
create  table dateTest1 (a interval year(3) to month);
insert into dateTest1 values(to_yminterval('01-02'));
select * from dateTest1;
select a "year-month" from dateTest1;
select sysdate from dual;

select sysdate+20 from dual;

select add_months(sysdate,5) from dual; -- add the number of months in the given date

select round(45.566) from dual;
select round(45.896) from dual;

select round(45.366) from dual;
select round(45.366) from dual;

select trunc(45.896) from dual;

select  trunc(sysdate)-to_date('31-aug-2004') from dual;
select  (sysdate)-to_date('31-aug-2004') from dual;

select '01-jan-2021', to_date('01-jan-2021','dd-mm-yyyy') from dual; -- convert charater to other date  format
select to_char(sysdate,'yyyy') from dual;-- date into character format 
select to_char(sysdate,'mon') from dual;-- date into character format 
select to_char(sysdate,'dd') from dual;-- date into character format 
select to_char(sysdate,'dd-mon') from dual;-- date into character format 


create table department(dept_id int primary key, name varchar(20), location varchar(20))

create table employees(empid int primary key, name varchar(20), age int, deptid int, foreign key(deptid) references department(dept_id));  

insert into department values(1,'training', 'delhi');
insert into department values(2,'account', 'noida');
insert into department values(3,'development', 'gurgaon');
insert into department values(4,'hr', 'faridabad');

insert into employees values(90001,'ram kumar',30,1);
insert into employees values(90002,'amit kumar',20,2);
insert into employees values(90003,'saurav kumar',22,1);
insert into employees values(90004,'shivani kumari',30,1);
insert into employees values(90005,'amita kumari',27,3);
insert into employees values(90006,'ramdevi',38,2);
commit;
select * from department,employees; -- cross join 

select department.dept_id, department.name, department.location, employees.empid, employees.name, employees.age, 
employees.deptid from department,employees;  -- cross join

select d.dept_id, d.name, d.location, e.empid, e.name, e.age, 
e.deptid from department d,employees e; -- cross join

select d.dept_id, d.name "department name", d.location, e.empid, e.name "emp name", e.age, 
e.deptid from department d,employees e; -- cross join
 --  equi join

select d.dept_id, d.name "department name", d.location, e.empid, e.name "emp name", e.age, 
e.deptid from department d,employees e where d.dept_id=e.deptid;  -- equi join

select d.dept_id, d.name "department name", d.location, e.empid, e.name "emp name", e.age from department d,employees e 
where d.dept_id=e.deptid;  -- equi join

--  left  outer join
list of employees which are  present in department

select d.dept_id, d.name "department name", d.location, e.empid, e.name "emp name", e.age from department d,employees e 
where d.dept_id=e.deptid(+);  --left outer join

select d.dept_id, d.name "department name", d.location, e.empid, e.name "emp name", e.age from 
department d
left outer join
employees e 
on d.dept_id=e.deptid;  --left outer join using ansi sql
 
 -- right outer join

select d.dept_id, d.name "department name", d.location, e.empid, e.name "emp name", e.age from department d,employees e 
where d.dept_id(+)=e.deptid;  --right outer join

select d.dept_id, d.name "department name", d.location, e.empid, e.name "emp name", e.age from 
department d
right outer join
employees e 
on d.dept_id=e.deptid;  --right outer join using ansi sql

-- self join 
  drop table emp;
  create table emp(id int primary key, name varchar(20), mgr int);
  
insert into emp values(1001,'arvind kumar', 1003);
insert into emp values(1002,'praveen kumar', 1005);
insert into emp values(1003,'mohan kumar', 1004);
insert into emp values(1004,'suman kumar', 1001);
insert into emp values(1005,'ajeet kumar', 1002);
commit;

select  e1.name||'    is manager of     '||e2.name from emp e1, emp e2 where e1.id=e2.mgr;

create table students (roll int primary key , name varchar(20), city varchar(20));
create table examination (roll int primary key , subject varchar(20), marks number(5,2));

insert into students values(9001,'amit kumar','manglore');
insert into students values(9002,'sumit kumar','banglore');
insert into students values(9003,'jairam kumar','hyderabad');
insert into students values(9007,'mohan kumar','rameswaram');
insert into students values(9009,'sanjay kumar','chennai');

insert into examination values(9001,'math',89.577);
insert into examination values(9002,'science',69.577);
insert into examination values(9003,'kannada',79.577);
insert into examination values(9004,'tamil',62.577);
insert into examination values(9005,'telugu',82.577);
insert into examination values(9006,'history',87.577);

select * from students;
select * from examination;
-- equi join
  -- all students who are going to give examination
select s.roll,s.name,s.city,e.subject,e.marks from students s, examination e where s.roll=e.roll;

-- natural join if same column name 
-- all students who are going to give examination
select roll,name,city,subject,marks from students  natural join examination  ;

-- left outer join 
select s.roll,s.name,s.city,e.subject,e.marks from students s  left outer join examination e  on s.roll=e.roll ;
-- right outer join 
select s.roll,s.name,s.city,e.subject,e.marks from students s  right outer join examination e  on s.roll=e.roll ;


-- subquery 

select * from employee;

select max(salary) from employee;
select * from employee where salary=70000;
select * from employee where salary=(select max(salary) from employee);
select * from employee where salary=(select min(salary) from employee);

select * from employee where exists(select name from employee where id=1001);
select * from employee where exists(select name from employee where id=100);


-- equi join
select s.roll,s.name,s.city,e.subject,e.marks from students s, examination e where s.roll=e.roll;
-- inner query 
select * from students s  where exists(select roll from examination where examination.roll=s.roll)

-- left outer join
select s.roll,s.name,s.city,e.subject,e.marks from students s, examination e where s.roll=e.roll(+);
-- right outer join
select s.roll,s.name,s.city,e.subject,e.marks from students s, examination e where s.roll(+)=e.roll;

-- inner query 
select * from students s  where not exists(select roll from examination where examination.roll=s.roll)

select * from students s  where roll > any(select roll from examination where examination.roll=s.roll)

select * from employee where salary=(select max(salary) from employee);
select * from employee where salary>any(select salary from employee);

select * from employee where salary>all(select salary from employee); -- no record
select * from employee where salary>all(select salary from employee);
select * from employee where salary<all(select salary from employee where salary>10000);-- record
select * from employee where salary>all(select salary from employee where salary>10000);--no record

select * from employee where salary>all(select salary from employee where salary<30000); -- record
select * from employee where salary>all(select salary from employee where salary>30000);


select * from employee;
select * from department;




select e.empid,e.name,e.age,e.deptid,d.name,d.location from employees e,department d where e.deptid=d.dept_id(+);
select e.empid,e.name,e.age,e.deptid,d.name,d.location from employees e,department d where e.deptid(+)=d.dept_id;

select e.empid,e.name,e.age,e.deptid,d.name,d.location from employees e,department d where e.deptid=d.dept_id;
-- list of employees related to department
select *  from employees e where exists  (select dept_id from department d where e.deptid=d.dept_id);
select *  from employees e where not exists  (select dept_id from department d where e.deptid=d.dept_id);

-- list of  department having
select *  from department d where exists  (select deptid from employees e where e.deptid=d.dept_id);
select *  from department d where not exists  (select deptid from employees e where e.deptid=d.dept_id);

-- correlated sub query 

select *  from employee e where salary> (select avg(salary) from employee);

select *  from employee e where salary= (select max(salary) from employee);

desc employee;
desc department;


-- view
create view empview as select * from employees;
select * from empview;

create view depview_withemployees as select *  from department d where exists  (select deptid from employees e where e.deptid=d.dept_id);
select * from depview_withemployees;
desc depview_withemployees;

desc employees;
desc empview;

create view empview1 as select * from employee;
select * from empview1;
select * from empview1 where id=1001;
insert into empview1 values(7045,'munendra kumar',34000);
commit;
create view empview2 as select * from employee with check option; -- no update
insert into empview2 values(7049,'munendra kumar',34000);
commit;

create view empview3 as select * from employee with read only; -- no insert 
insert into empview3 values(70555,'munendra kumar',34000);


select * from mybook;
desc mybook;
create index  book_index on mybook(isbn);

select * FROM USER_CONSTRAINTS;
--synonym
create synonym mybook5 for mybook;
select * from mybook;
select * from mybook5;

--sequence 
create sequence book_sequence;
create sequence book_sequence1 start with 20000 increment by 10;
desc mybook;
insert into mybook values(book_sequence.nextval,'javascript',678.555);
insert into mybook values(book_sequence1.nextval,'javascript',678.555);
select * from mybook;

select book_sequence.currval from dual;
select book_sequence1.currval from dual;

--- functions --
select * from employee;
select id,name,salary from employee;
select id,upper(name),salary from employee;
select id,initcap(name),salary from employee;

select id,concat('mr.',name),salary from employee;
select concat(id,name) from employee;
select id||''||name||''||salary from employee;
select id||'  '||name||'  '||salary from employee;
select name, substr(name,4) from employee;
select name, length(name) "name length " ,substr(name,2,8) "name from 2 - 8 character" from employee;
select power(4,2) from dual;


select name, substr(name,4),instr(name, 'kumar') from employee;
select id,name,salary from employee;
select id,name,lpad(name,20,'*'),salary from employee;
select id,name,rpad(name,20,'*'),salary from employee;
select id,name,trim('s',name)salary from employee;

select ' hello world', trim(' hello world') from dual;

select trunc(1000.8767676) from dual;
select round(1000.8767676),round(1000.1767676),round(1000.4867676) from dual;
select isbn,bname,trunc(cost) from mybook;
select isbn,bname,cost,trunc(cost),round(cost) from mybook;


select lpad('hello world',20,'*') from dual;
select mod(12,5) from dual;

select sysdate from dual;
select next_day(sysdate,'sunday') from dual;
select next_day(sysdate,'friday') from dual;
select last_day(sysdate) from dual;
select add_months(sysdate,10) from dual;
select months_between(sysdate,'09-oct-22') from dual;
select months_between('09-oct-22',sysdate) from dual;

select trunc(months_between ('09-oct-22',sysdate)) from dual;
select trunc(sysdate) from dual;
select sysdate,round(sysdate) from dual;

select to_date('10-mar-2020') from dual;
select to_date('10-mar-2020') from dual;
select to_char(sysdate,'dd-mm-yyyy') from dual;
select to_char(sysdate,'yyyy-dd-mm') from dual;
select to_char(sysdate,'yyyy-dd-mon') from dual;
select to_char(sysdate,'yyyy-dd-mon hh mi ss ww') from dual;

select * from examination;
select * from students;
select * from department;
select id,name,nvl(salary,0) from employee;
select id,name,nvl2(salary,salary,0) from employee;
select id,name,salary,nvl2(salary,salary*1.10,0) from employee;


select round(sysdate) from dual;
select round(to_date('06-jan-2022 12:22:00','dd-mon-yyyy hh:mi:ss')) from dual;
select (to_date('06-jan-2022')),sysdate from dual;

select coalesce(10001,null,null) from dual;
select coalesce(null,76766,null) from dual;
select coalesce(null,null,1) from dual;

-- merge 
select * from employee;
select * from employee1;
create table employee1 as select * from employee;
delete from employee1 where salary is null;
commit;

merge into employee e1 using employee1 e
on (e1.id=e.id)
when matched then 
 update set e1.name=e.name,e1.salary=e.salary
when not matched then 
 insert values (e.id,e.name,e.salary);

 


select * from mybook; 

 delete from mybook;
  savepoint a;
 insert into mybook values(9000,'python beginner',678);
  savepoint b;
 
 select * from mybook;
 rollback b;
 
 --DCL
 create user user2 identified by abcd;
 grant create table, create view,create session, unlimited tablespace  to user2;
 
Table created.
SQL> connect
Enter user-name: user2/abcd
Connected.
create table test1 (id int primary key);


 --create role manager;
--grant create table, create view,create session, unlimited tablespace  to manager;
--grant manager to user2;
 
 
 -- pl sql 
 
set serveroutput on
declare
x int:=100;

begin 
 dbms_output.put_line('hello plsql');
 dbms_output.put_line('x is '||x);
end;
/


set serveroutput on
declare
id1 int:=&id;
name1 varchar(20);
salary1 int;
begin 
  select name,salary into name1,salary1 from employee where id=id1;
  dbms_output.put_line('id is '||id1);
  dbms_output.put_line('name is '||upper(name1));
  dbms_output.put_line('salary is '||salary1);
end;
/

-- bind variable 
variable name2 varchar(20)
variable salary2 int

set serveroutput on

declare
id1 employee.id%type:=&id;
name1 employee.name%type;
salary1 employee.salary%type;
begin 
  select name,salary into name1,salary1 from employee where id=id1;
    select name,salary into :name2,:salary2 from employee where id=id1;
  dbms_output.put_line('id is '||id1);
  dbms_output.put_line('name is '||name1);
  dbms_output.put_line('salary is '||salary1);
end;
/

print name2
print salary2
select * from  employee;

<<outer>>
	declare 
	 x int:=111;
	begin 
	   dbms_output.put_line('outer x '||x);
	  <<inner>>
		   declare 
		   y int:=900;
		   begin
		   dbms_output.put_line('inner y '||y);
		   dbms_output.put_line('outer x inside inner block '||x);
		   end;
		   --dbms_output.put_line('inner  y inside outer block '||y);
	end;

 select * from employee;  
 select * from customer;
 select sum(salary) from customer;
 select sum(salary),location from customer group by location;
 
 -- aggregate function
 declare 
  sum_salary customer.salary%type;
 begin 
  select sum(salary) into sum_salary from customer where location='chennai';
  dbms_output.put_line('sum of salary for chennai location is '||sum_salary);
 end;
 
 -- insert data 
 declare 
	  cid1 customer.cid%type;
	  name1 customer.name%type;
	  location1 customer.location%type;
	  salary1 customer.salary%type;
	  dob1 customer.dob%type;
 begin 
	 cid1:=&cid;
	 name1:='&name'; 
	 location1:='&location';
	 salary1:='&salary';
	 dob1:='&date_of_birth';
     insert into customer values(cid1,name1,location1,salary1,dob1);
	 dbms_output.put_line(SQL%ROWCOUNT||' row added');
 end;
 
 --if then  end if 
 
  declare 
  hra number(5,2);
  deptid1 employees.deptid%type;
  empid1 employees.empid%type;
  name1  employees.name%type;
  age1  employees.age%type;
 begin 
   empid1:=&employeeid;
   select name,age, deptid into name1,age1,deptid1 from employees where empid=empid1;
   if deptid1=1 then 
    hra:=0.1;
   elsif deptid1=2 then 
    hra:=0.8;
   elsif deptid1=3 then 
    hra:=0.5;
   else 
    hra:=0.2;
   end if;
   dbms_output.put_line('employee id '||empid1);
   dbms_output.put_line('employee name '||name1);
   dbms_output.put_line('employee age '||age1);
   dbms_output.put_line('employee hra '||hra);
 end;
/

 
 select * from mybook;
  select * from employees; 
 
 
  declare 
  hra number(5,2);
  deptid1 employees.deptid%type;
  empid1 employees.empid%type;
  name1  employees.name%type;
  age1  employees.age%type;
 begin 
   empid1:=90001;
   select name,age, deptid into name1,age1,deptid1
   from employees

   where empid=empid1;
   hra:=
  case deptid1
  when 1 then 0.1
  when 2 then  0.8
  when 3 then  0.5
  when 1 then  0.3
  else 
  0.1
  end; 
  
   dbms_output.put_line('employee id '||empid1);
   dbms_output.put_line('employee name '||name1);
   dbms_output.put_line('employee age '||age1);
   dbms_output.put_line('employee hra '||hra);
 end;
/


-- loop 
-- basic loop 

declare 
 x int:=1;
begin 
 loop 
 dbms_output.put_line(x);
 x:=x+1;
 exit when x>=5;
 end loop ;
 
end;


-- while loop 

declare 
 x int:=1;
begin 
 while x<=10 loop 
 dbms_output.put_line(x);
 x:=x+1;
 end loop ;
end;

-- for  loop 
begin 
 for i in  1..10 loop 
 dbms_output.put_line(i);
 end loop ;
end;

begin 
 for i in  reverse 1..10 loop 
 dbms_output.put_line(i);
 end loop ;
end;
  
 declare 
  cid1 int:=10;
  
 begin 
 
 for i in  1..3 loop 
     insert into customer values(cid1,'&name','&location',&salary,'&dob');
	 dbms_output.put_line(SQL%ROWCOUNT||' row added');
 cid1:=cid1+1;
 end loop;
 end;
  / 
   
  
  select * from customer;
  
  set serveroutput on
  -- %rowtype 
  
 declare 
  emp employees%rowtype;
  id employees.empid%type;
 begin 
 id:=&emp_id;
   select * into emp   from employees where empid=id;
  dbms_output.put_line('empid is '||emp.empid);
  dbms_output.put_line('name is '||emp.name);
  dbms_output.put_line('age is '||emp.age);
  dbms_output.put_line('department id is '||emp.deptid);
  
  end;
  
  select * from employees;
  
  --record (composite data type)
  declare
  type emp_record is record
  (
   empid int,
   name varchar(20),
   age int,
   deptid int
   );
   emp1 emp_record;
   
   begin 
  emp1.empid:=98998;
   emp1.name:='arvind swamy';
   emp1.age:=67;
   emp1.deptid:=1;
  
	  dbms_output.put_line('empid is '||emp1.empid);
	  dbms_output.put_line('name is '||emp1.name);
	  dbms_output.put_line('age is '||emp1.age);
	  dbms_output.put_line('department id is '||emp1.deptid);
   end;
  / 
  -- exception 
  declare 
  emp employees%rowtype;
  id employees.empid%type;
 begin 
   id:=&emp_id;
   select * into emp   from employees where empid=id;
    dbms_output.put_line('empid is '||emp.empid);
    dbms_output.put_line('name is '||emp.name);
    dbms_output.put_line('age is '||emp.age);
    dbms_output.put_line('department id is '||emp.deptid);
  exception 
  when no_data_found then 
       dbms_output.put_line('no record found for id  '||id);
       dbms_output.put_line(' error code is     '||sqlcode);
       dbms_output.put_line(' error message is     '||sqlerrm);	   
  when too_many_rows  then 
       dbms_output.put_line('multiple rows found for the id   '||id);
  when others then 
          dbms_output.put_line('some error    ');
  end;
/

   
select * from mybook;

set serveroutput on
-- user defined exception
declare 
	isbn_exception exception;
	book mybook%rowtype;
	isbn1  mybook.isbn%type;

begin 
    isbn1:=&isbn;
    if isbn1<0 then  raise isbn_exception;
    else
    select  * into book from mybook where isbn=isbn1;
   end if;
     dbms_output.put_line(' isbn '||book.isbn);
     dbms_output.put_line(' name '||book.bname);
     dbms_output.put_line(' cost '||book.cost);
    
EXCEPTION

   when isbn_exception then 
    dbms_output.put_line('invalid isbn ');
   when no_data_found then 
    dbms_output.put_line('no record found  '); 
end;


declare 
	book mybook%rowtype;
	bname1  mybook.bname%type;

begin 
    bname1:='&book_name';
   
    select  * into book from mybook where bname=bname1;
     dbms_output.put_line(' isbn '||book.isbn);
     dbms_output.put_line(' name '||book.bname);
     dbms_output.put_line(' cost '||book.cost);
    
EXCEPTION

   when no_data_found then 
    dbms_output.put_line('no record found  '); 
   when too_many_rows then 
    dbms_output.put_line('multiple rows  found  for the book name  '); 
end;

-- raise_application_error 

declare 
	book mybook%rowtype;
	isbn1 mybook.isbn%type;

begin 
    isbn1:=&book_isbn;
   
  delete  from mybook where isbn=isbn1;
 
  if SQL%FOUND then 
    dbms_output.put_line('record deleted');
  elsif SQL%NOTFOUND then 
    dbms_output.put_line('isbn not present  ');
    raise_application_error(-20000,'isbn not found ........');
  end if;
end;



declare 
	book mybook%rowtype;
	isbn1  mybook.isbn%type;

begin 
    isbn1:=&book_isbn;
   
    select  * into book from mybook where isbn=isbn1;
     dbms_output.put_line(' isbn '||book.isbn);
     dbms_output.put_line(' name '||book.bname);
     dbms_output.put_line(' cost '||book.cost);
    
EXCEPTION

   when no_data_found then 
    raise_application_error(-20001,'no isbn is present');
    --dbms_output.put_line('no record found  '); 
end;
 select * from mybook; 
  
-- PRAGMA Error propagation 

declare 
 pk_violation exception;
 PRAGMA EXCEPTION_INIT(pk_violation,-0001);
begin
  insert into mybook values(2,'two states',1200);
  dbms_output.put_line('record added ');
exception
 when pk_violation then 
   dbms_output.put_line('primary key error  ');
end;



  desc mybook;
  alter table mybook modify isbn int primary key;
  truncate table mybook;
  select * from mybook;
  


select * from employee;
-- cursor 

declare
  emp employee%rowtype;
begin
	select *  into emp from employee where id=1;
	if SQL%FOUND then 
	  dbms_output.put_line('record found');
	  dbms_output.put_line('total no of records are  '||sql%rowcount);
	  dbms_output.put_line('id is '||emp.id);
	  dbms_output.put_line('name is '||emp.name);
	  dbms_output.put_line('salary is '||emp.salary);
	end if;
	if SQL%NOTFOUND then 
	  dbms_output.put_line('record not present ');
	end if ; 
  
  exception 
   when no_data_found then 
     dbms_output.put_line('record not found ');
     
end;

-- cursor 1
declare 
	id1 employee.id%type;
	name1 employee.name%type;
	salary1 employee.salary%type;

    cursor emp_cursor is select id,name,salary from employee;

begin 

   open emp_cursor;
   loop 
   fetch emp_cursor into id1,name1,salary1;
   exit when emp_cursor%notfound;
    dbms_output.put_line(id1||'   '||name1||'   '||salary1);
   end loop;
end ;


-- cursor 2 using %rowtype 
declare 
	emp employee%rowtype;
	
    cursor emp_cursor is select * from employee;

begin 

   open emp_cursor;
   loop 
   fetch emp_cursor into emp;
   
   exit when emp_cursor%notfound;
    dbms_output.put_line(emp.id||'   '||emp.name||'   '||emp.salary);
   end loop;
   close emp_cursor;
end ;

-- cursor 3 using while loop  
declare 
	emp employee%rowtype;
    cursor emp_cursor is select * from employee;
begin 
   open emp_cursor;
     fetch emp_cursor into emp;
   
    while(emp_cursor%found) loop 
     dbms_output.put_line(emp.id||'   '||emp.name||'   '||emp.salary);
     fetch emp_cursor into emp;
   
   end loop;
   close emp_cursor;
end ;



-- cursor 3 using while loop -- by parameter  
declare 
	emp employee%rowtype;
    cursor emp_cursor(id1 number) is select * from employee where id=id1;
begin 
   open emp_cursor(1001);
     fetch emp_cursor into emp;
   
    while(emp_cursor%found) loop 
     dbms_output.put_line(emp.id||'   '||emp.name||'   '||emp.salary);
     fetch emp_cursor into emp;
   
   end loop;
   close emp_cursor;
end ;


-- cursor using for loop 
declare 
	cursor emp_cursor is select * from employee;

begin 

   for i in  emp_cursor    loop 
     dbms_output.put_line(i.id||'   '||i.name||'   '||i.salary);
   end loop;
 
end ;

-- procedure 
set serveroutput on 

create or replace procedure 
  addition(x int, y int)
  is 
   z int;
  begin 
   z:=x+y;
   dbms_output.put_line('no1 is '||x);  
   dbms_output.put_line('no2 is '||y);
   dbms_output.put_line('sum is '||z);
 end;
  
 -- calling procedure
 -- using pl sql code 
 declare 
  x int;
  y int;

 begin 
	 addition(11,22);
	 
	 x:=&no1;
	 y:=&no2;
	 addition(x,y);
 end;

 -- calling procedure
 -- using  sql code  
execute addition(11,22);
 
-- procedure with out parameter 

create or replace procedure 
  calculation(x int, y in int, a out int,b out int ,c out int ,d out int  )
  is 
   
  begin 
   a:=x+y;
   b:=x-y;
   c:=x*y;
   d:=x/y;
  end;
  
 -- calling 
 -- using pl sql block 

declare 
	x int;
	y int;
	z int;
	p int;
begin 
 calculation(10,2,x,y,z,p);
 dbms_output.put_line('addition is '||x);
 dbms_output.put_line('subtraction is '||y);
 dbms_output.put_line('multiplication is '||z);
 dbms_output.put_line('division is '||p);
end;
 

 -- calling 
 -- using  sql code 

variable k number 
variable l number
variable m number 
variable n number

execute  calculation(10,2,:k,:l,:m,:n)

print k
print l
print m
print n


-- procedure to update the salary 

create or replace procedure update_employee_salary(id1 int) 
 is 
begin 
 update employee set salary=salary+salary*0.5 where id=id1;
 	dbms_output.put_line('record updated ');
exception
	when no_data_found then 
	dbms_output.put_line('no record found ');
end;

-- calling procedure using  pl sql 
set serveroutput on
declare 
 id1 int;
begin
 id1:=&id;
 update_employee_salary(id1);
end;

 
select * from employee; 
 
-- procedure with in and out parameter 
-- search employee 

create or replace procedure search_employee(id1  int,  name1 out varchar, salary1 out number) 
is 

begin
select name, salary into name1,salary1 from employee where id=id1;

exception
	when no_data_found then 
	dbms_output.put_line('no record found ');
end;


-- call using  pl sql 
declare 
 id1 employee.id%type;
 name1 employee.name%type;
 salary1 employee.salary%type;
 
begin
 id1:=&id;
 search_employee(id1,name1,salary1);

 if name1 is not null then
	 dbms_output.put_line('record found with id '||id1);
	 dbms_output.put_line('name '||name1);
	 dbms_output.put_line('salary '||salary1);
end if; 
end;


-- call using sql 

variable name1 varchar2
variable salary1 number 
 
execute search_employee(1001,:name1,:salary1)
 print name1
 print salary1


-- inout 

create or replace procedure square (a in out number) 
is 
begin 
 a:=a*a;
end;

-- calling using pl sql 
declare 
 q int;
begin 
 q:=&no;
square(q);
if q is not null then 
 dbms_output.put_line('square is '||q);
end if;

end;


-- function 

create or replace function sum1(a int, b int)
  return number
is
 c int;
begin
 c:=a+b;
return c;
end;
/

-- calling function using pl sql 

declare
 p int;
begin
p:=sum1(1,2);
dbms_output.put_line('sum is'||p);
end;
/

-- calling using sql

variable x number
 execute :x:=sum1(11,22)
print x

-- database function 
create or replace function search_emp_salary(id1 int)
  return number
is
 salary1 int;
begin 
select salary into salary1 from employee where id=id1;
return salary1;

exception 
 when no_data_found then 
  dbms_output.put_line('no record present for the id '||id1);
end;

-- calling function 
declare 
  salary1 int;
  id1 int;
begin
  id1:=&id;
  salary1:=search_emp_salary(id1);
  dbms_output.put_line('record found ');
  dbms_output.put_line('salary for the id  '||id1||' is '||salary1);
end;


 select id,name,search_emp_salary(1001) from employee where id=1001;
 
-- using sql 
variable salary number
execute :salary:=search_emp_salary(1001) 
print salary

set serveroutput on 
-- trigger 
select * from employee;
insert into employee values(7871,'bandna kumari',28000);

-- trigger after insert event 

create or replace trigger trg1 after insert on employee 
begin
 dbms_output.put_line( 'record added  by user  '||user ||' at '||systimestamp);
end;


create table employee_log(user1 varchar(20),date1 systimestamp);

create or replace trigger trg2 after insert on employee 
begin
 insert into employee_log values(user,systimestamp);
end;

select * from employee_log;
select to_char(sysdate,'dd-mm-yyyy') from dual;
select to_char(sysdate,'dy') from dual;
select to_char(sysdate,'HH24:MI') from dual;

create or replace trigger trg3 before insert on employee 
begin
 if to_char(sysdate,'dy') in ('SAT','SUN')  or  (to_char(sysdate,'HH24:MI')not between '08:00' and '18:00')
  then 
  raise_application_error(-20001,'insert can be done on business hours');
  end if;
end;

select user from dual;

create table employee_log1(user1 varchar(20),date1 timestamp,message varchar(50));
alter table employee_log1 modify message varchar(50);

create or replace trigger trg4 before  insert or update or delete  on employee 
begin
 if deleting then 
   insert into employee_log1 values(user,systimestamp,'delete record from employee table' );
 elsif updating then 
   insert into employee_log1 values(user,systimestamp,'update record in employee table' );
 elsif inserting then 
   insert into employee_log1 values(user,systimestamp,'insert  record in employee table' );
 end if;
end;

select * from employee_log1;

insert into employee values(78765,'bandn kumar',29000);
delete from employee where id=1001;
select * from employee;

create table employee_backup as select * from employee where 1>100;

create or replace trigger employee_backup_trigger after  delete  on employee 
 for each row 
 begin
     insert into employee_backup values(:old.id,:old.name,:old.salary);
 end;
 
select * from employee_backup;
select * from employee;
delete from employee where id=1002;
commit;


set serveroutput on;
-- package specification
create or replace package pack1 is 
  procedure employee_search(id1  int,  name1 out varchar, salary1 out number);
end;  

-- package body
create or replace package body  pack1 is 
  procedure employee_search(id1  int,  name1 out varchar, salary1 out number)  is
    begin 
       select name,salary into name1,salary1 from employee where id=id1;
       exception
	when no_data_found then 
	dbms_output.put_line('no record found ');
    end employee_search;
end pack1;  

--calling using pl sql 
set serveroutput on

declare 
name1 employee.name%type;
salary1 employee.salary%type;
begin 
 pack1.employee_search(1003,name1,salary1);
 dbms_output.put_line('record found ');
 dbms_output.put_line('name is  '||name1);
 dbms_output.put_line('salary is  '||salary1);
end;


-- analytical function
select * from customer;

select  count(location) ,location from customer group by location;
select  cid,name,location,dense_rank() over (partition by location order by cid ) from customer;


create table person1 (id int primary key, name varchar(20), married number(1,0));
insert into person1 values(1001,'arvind kumar',1);
insert into person1 values(1002,'suman kumar',0);
insert into person1 values(1003,'suman kumar',7);
select * from person1;

create table person2 (id int primary key, name varchar(20), marriage number, check (marriage in (1,0)));

insert into person2 values(1001,'arvind kumar',1);
insert into person2 values(1002,'suman kumar',0);
insert into person2 values(1003,'suman kumar',7);


create table person3 (id int primary key, name varchar(20), marriage number,salary int,  check (marriage in (1,0)), check (salary>=5000));
