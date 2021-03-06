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
select instr('hello world','h') from dual;
select rpad('hello world',20,'*') from dual;

select trim('   hello world  ') from dual;
select replace('hello world ','hello','greeting') from dual;
select chr(111)from dual;
select ascii('a')from dual;

select sysdate from sys.dual;


select next_day(sysdate,'sunday') from sys.dual;
select last_day(sysdate) from sys.dual;
select add_months(sysdate,5) from dual;
select months_between(sysdate,'26-apr-20') from dual;

select sysdate from dual;
select to_char(sysdate,'dd-mm-yy') from dual;
select to_char(sysdate,'dd-mon-yyyy') from dual;
select to_char(sysdate,'dd-mon-yyyy hh::mi:ss') from dual;
select * from product;

select prdid, name,cost, purchase_date from product;
select prdid, name,nvl(cost,0),nvl2(cost,1000,999), nvl(purchase_date,sysdate) from product;

select * from product;

-- aggregate function 

select max(cost), min(cost),sum(cost), avg(cost) from product;

select max(cost) "max cost", min(cost) "min cost",sum(cost) "total cost", avg(cost) "average cost" from product;


select count(*) "total no of rows" from product;
select * from employee;

select count(location) "total no of rows" from employee; -- 10
select count(distinct location) "total no of rows" from employee; -- 7

select * from product;

select count(location), location from employee group by location;

select count(location), location from employee group by location  having location='jaipur';

select avg(salary), location from employee group by location;
select avg(salary), location from employee group by location having avg(salary)>=25000 ;

desc employee;
select rowid,id, name from employee;

select id, name, salary from employee;
select id|| '     '  || name, salary from employee;
select id|| '     '  || name "id            name", salary from employee;

select sqrt(144)+12*14 from dual;

select * from employee;
select id,name,salary ,location from employee;

select id,name,salary ,location,
case   location
   when 'madurai' then salary*1.5 
   when 'pune' then salary*1.7
   when 'jaipur' then salary*1.8
   when 'mumbai' then salary*1.0
   else 
    salary 
  end
    "revised salary"
from employee;


select sysdate+10 from dual;
select sysdate-10 from dual;
desc dual;

create table t1(c1 interval year(3) to  month);
insert into t1 values(to_yminterval('01-02'));
select * from t1;
select dump(c1) from t1;

create table  products (prdid int primary key, name varchar(20),cost float );
create table  product_orders (order_id int primary key, location varchar(20),quantity int );

insert into products values(1001,'trouser', 1200);
insert into products values(1002,'book', 500);
insert into products values(1003,'shirt', 800);
insert into products values(1004,'mobile', 12000);
insert into products values(1005,'tv', 20000);

insert into product_orders values(1001,'delhi', 8);
insert into product_orders values(1002,'noida', 8);
insert into product_orders values(1003,'gurgaon', 8);
insert into product_orders values(1006,'laxminagar', 8);
insert into product_orders values(1007,'mayur vihar', 8);
commit;

select * from products;
select * from product_orders;
-- cross join 
select * from products, product_orders;

--select prdid,name,cost, location,quantity from   products natural join   product_orders;



-- equi join with all columns of both tables
select * from products, product_orders where products.prdid=product_orders.order_id;

-- equi join with specific  columns of both tables 
select prdid,name,cost, location,quantity from   products,  product_orders  where products.prdid=product_orders.order_id;

-- equi join with specific  columns of both tables using table name
select products.prdid,products.name,products.cost, product_orders.location,product_orders.quantity from   products,  product_orders  where products.prdid=product_orders.order_id;

-- equi join with specific  columns of both tables using table alias
select p.prdid,p.name,p.cost, o.location,o.quantity from   products p,  product_orders o where p.prdid=o.order_id;

-- non equi join with specific  columns of both tables using table alias
select p.prdid,p.name,p.cost, o.location,o.quantity from   products p,  product_orders o where p.prdid!=o.order_id;
select p.prdid,p.name,p.cost, o.location,o.quantity from   products p,  product_orders o where p.prdid>=o.order_id;

-- right outer join
-- --list of product which are not ordered
select p.prdid,p.name,p.cost, o.location,o.quantity from   products p,  product_orders o where p.prdid(+)=o.order_id;
-- ansi sql
select p.prdid,p.name,p.cost, o.location,o.quantity from   products p right outer join   product_orders o  on  p.prdid=o.order_id;


--left outer join
--list of product which are ordered
select p.prdid,p.name,p.cost, o.location,o.quantity from   products p,  product_orders o where p.prdid=o.order_id(+);
-- ansi sql
select p.prdid,p.name,p.cost, o.location,o.quantity from   products p left outer join   product_orders o  on  p.prdid=o.order_id;

-- full outer join
select p.prdid,p.name,p.cost, o.location,o.quantity from   products p full outer join   product_orders o  on  p.prdid=o.order_id;



-- self join 
drop table emp1;
create table emp1 (empno int primary key, ename varchar(20), mgr_id int);
delete from emp1;
insert into emp1 values(1, 'ravi kumar', 4);
insert into emp1 values(2, 'suraj kumar', 3);
insert into emp1 values(3, 'mohan kumar', 2);
insert into emp1 values(4, 'suresh kumar', 5);
insert into emp1 values(5, 'amit kumar', 1);
select * from emp1;

select e1.ename||' works for '||e2.ename from emp1 e1, emp1 e2 where e1.empno=e2.mgr_id;
desc emp1;


-- subquery 
select * from employee1;
-- diaply employee having highest salary 
select max(salary) from employee1;
select * from employee1 where salary=75000;

select * from employee1 where salary=(select max(salary) from employee1);
select * from employee1 where salary=(select min(salary) from employee1);

select * from employee1 where salary > any (select salary from employee1);
select * from employee1 where salary > all (select salary from employee1);
select * from employee1 where salary > all (select salary from employee1 where salary<=25000);
select * from employee1;
select * from employee1 where location in ('madurai','pune');

select * from product;
select * from product_orders;
select * from employee1;

-- equi join
 -- product  order is given
select p.prdid,p.name,p.cost, o.location,o.quantity from   products p,  product_orders o where p.prdid=o.order_id;
-- subquery using exits 
select * from products p  where exists (select prdid from product_orders o where p.prdid=o.order_id );

-- product  order is not  given
select * from products p  where not exists (select prdid from product_orders o where p.prdid=o.order_id );


select * from products  where exists (select prdid from product_orders);
select * from products  where not exists (select prdid from product_orders);

-- view 


create view product_view as select * from product;
select * from product_view;
create view product_view1 as select prdid,name,cost from product;
select * from product_view1;
create view product_ordered as select p.prdid,p.name,p.cost, o.location,o.quantity from   products p,  product_orders o where
p.prdid=o.order_id;

select * from product_ordered;

select * from employee1;
-- sequence 
create sequence emp_seq1; -- start with 1 
create sequence emp_seq2 start with 1007; -- start with 1007

INSERT INTO employee1  VALUES
  (emp_seq1.nextval,'&name',&salary, '&location' );
INSERT INTO employee1  VALUES
  (emp_seq1.nextval,'ajit sharma',34000, 'mumbai' );
  select * from employee1;
INSERT INTO employee1  VALUES
  (emp_seq2.nextval,'mohit sharma',39000, 'sholapur' );

  -- union -- data from both tables with out duplicate
  select * from employee1
  union
  select * from employee;
-- union all -- data from both tables with  duplicate
  
  select * from employee1
  union all
  select * from employee;

--  intersect -- common data
  select * from employee1
  intersect
  select * from employee;
  
  
  synonym 
     another name for database obejcts(table,view)
	 hides the table name, its owner
	 additional security layer 

    create synonym name for tabel/view name
	drop synonym name;

  create synonym prd1 for product;
  select * from prd1;
  
  -- plsql 
  
   set serveroutput on
  -- code1 
 declare 
   id int:=1001;
   name varchar(20):='shiv kumar';
 begin 
    dbms_output.put_line('hello to oracle');
    dbms_output.put_line('id is '||id);
    dbms_output.put_line('name is '||name);
 end;


  --code2 -- select 
  --select * from employee where;
    declare 
     id1 int:=&id;
     name1 varchar(20);
     salary1 float;
      bonus float;
    
     location1 varchar(20);
     
     begin
      select name, salary,location into name1,salary1,location1 from employee where id=id1;
      dbms_output.put_line('name is '||name1);
      dbms_output.put_line('salary is '||salary1);
      dbms_output.put_line('location is '||location1);
      
      select salary*0.1 into bonus  from employee where id=id1;
      dbms_output.put_line('bonus is '||bonus);
            
     end;

  -- calculation
  
   declare 
    n1 int:=&no1;
    n2 int:=&no2;
    n3 int:=n1+n2;
    n4 int:=n1-n2;
    n5 int:=n1*n2;
    n6 int:=n1/n2;
     
	 
   begin
      dbms_output.put_line('no1 '||n1);
      dbms_output.put_line('no2 '||n2);
      dbms_output.put_line('sum is  '||n3);
      dbms_output.put_line('subtraction  of  '||n1||' and '||n2||' is '||n4);
      dbms_output.put_line('multiplication   of  '||n1||' and '||n2||' is '||n5);
      dbms_output.put_line('division of  '||n1||' and '||n2||' is '||n4);
   end;

 -------- %type and bind variable  
  declare 
     id1 employee.id%type:=&id;
     name1 employee.name%type;
	   name2 employee.name%type;
    
     salary1 employee.salary%type;
     bonus employee.salary%type;
    
     location1 employee.location%type;
     
     begin
      select name, salary,location into name1,salary1,location1 from employee where id=id1;
      dbms_output.put_line('name is '||name1);
      dbms_output.put_line('salary is '||salary1);
      dbms_output.put_line('location is '||location1);
      
      select salary*0.1 into bonus  from employee where id=id1;
      dbms_output.put_line('bonus is '||bonus);
    
      select name into :name2 from employee where id=id1;
     	
     end;

   
    print name2;
-- nested block
declare 
x int:=100; -- global
begin 
  
  declare 
   y int:=200; -- local
  begin
   dbms_output.put_line('inside nested  ');
   dbms_output.put_line('x is '||x);
   dbms_output.put_line('y is '||y);
  end;
 
   dbms_output.put_line('outside nested  ');
   dbms_output.put_line('x is '||x);
   --dbms_output.put_line('y is '||y);
 end;

-- label 
<<hello>>
declare 
dob1 date:='12-jan-1999';
begin 
  declare
  dob1 date:='19-jan-1990';
  begin
   dbms_output.put_line('dob outer is '||hello.dob1);
   dbms_output.put_line('dob inner is '||dob1);
  end;
 end;


	select * from employee;
	delete from employee;

-- insert.sql
begin   
 insert into employee values(1001,'prithiv chand',12000,'delhi');  
end;

--delete.sql
declare 
id int:=&id;
row_del int;
begin   
 delete from employee where id=id;
  row_del:=SQL%ROWCOUNT; 
 dbms_output.put_line('no of rows deleted '||row_del); 
end;


select * from employee;


-- if 
declare 
x int:=100;
begin
 if x>=100 then 
  dbms_output.put_line('ok '); 
 else 
  dbms_output.put_line('not ok'); 
 end if;
end ;


-- case  
declare 
	id1 int:=1001;
	salary1 employee1.salary%type;
	grade employee1.name%type;

begin
 select salary into salary1 from employee1 where id=id1;
  grade:=
  case 
   when salary1>25000 then 'very good'
   when salary1>50000 then 'excellent'
   else 'poor'
  end;
  dbms_output.put_line(salary1 ||'  '||grade) ; 
 
end ;
-- loop

-- basic  loop 
   set serveroutput on
  
   declare 
   x number:=1;
   
   begin
     dbms_output.put_line('basic loop');
     loop
       dbms_output.put_line(x);
      exit when x=10;
        x:=x+1;
     end loop;
   end;
   
   
   
   declare 
   id1  number:=1001;
   name1 varchar(20);
   salary1 employee.salary%type;
   location1 employee.location%type;
   
   begin
     loop
	    select name,salary, location into name1,salary1, location1 from
		employee1 where id=id1;
		
       dbms_output.put_line(id1||'    '||name1||'     '||salary1||'     '||location1);
      exit when id1=1010;
        id1:=id1+1;
     end loop;
   end;
   
-- while loop 

 
   declare 
   x number:=2;
   
   begin
     dbms_output.put_line('while  loop');
   while x<=20 loop 
   dbms_output.put_line(x);
        x:=x+2;
     end loop;
   end;
   	
  
  declare
   x int;  
   id1  number;
   --name1 varchar(20);
   --salary1 employee.salary%type;
   --location1 employee.location%type;
   
  begin
  select max(id) into id1 from  employee;
  x:=1;
    while x<=3 loop 
	   id1:=id1+1;
       insert into employee values(id1,'&name',&salary,'&location' ) ;
	   x:=x+1;
	end loop;
  end;	
select * from employee;

-- for loop 

  begin 
    for i in 1 .. 100 loop
     dbms_output.put_line(i);
	 /*if i>=20 then 
	    exit;
	 end if;	
	 */
	 exit when i>=20;
	 
    end loop;
  end;
 
  begin 
    for i in reverse 1 .. 10 loop
     dbms_output.put_line(i);
    end loop;
  end;
  
   begin 
    for  i in (select * from employee) loop
	    dbms_output.put_line(i.id||'   '||i.name||'   '||i.salary||'    '||i.location);
    end loop;
   end;
   
	
-- nested loop 

 declare 
  x number;
  y number;
  begin 
  
    x:=10;
	<<outer>>
	loop 
    dbms_output.put_line(x);
    x:=x+10;
    exit when x=110;
		<<inner>>
			y:=1;
		loop 
			dbms_output.put_line(y);
			y:=y+1;
			exit when y=10;
		end loop inner;
    end loop outer;
  end;
	
-- cursor 
 -- using basic loop

declare 
 emp employee%rowtype;
 cursor c1 is select * from employee;

begin 
   open c1;
   loop
   fetch c1  into   emp;
   dbms_output.put_line(emp.id||'   '||emp.name||'   '||emp.salary);
   exit when c1%notfound;
   end loop;
 close c1;
end;

-- using while loop
declare 
 emp employee%rowtype;
 cursor c1 is select * from employee;

begin 
   open c1;
   fetch c1  into   emp;
   while (c1%found) loop
   dbms_output.put_line(emp.id||'   '||emp.name||'   '||emp.salary);
   fetch c1  into   emp;
   end loop;
 close c1;
end;

	
--select * from employee;	
--using for loop 
declare 
 emp employee%rowtype;
 cursor c1 is select * from employee;

begin 
   for emp in c1 loop
   dbms_output.put_line(emp.id||'   '||emp.name||'   '||emp.salary);
   end loop;
 close c1;
end;



-- exception
--  program1  
	
	declare 
	 emp employee%rowtype;
     
	begin 
	  select *  into emp from employee where id=1001;
	  dbms_output.put_line(emp.id||'   '||emp.name||'     '||emp.salary||'    '||emp.location);
	exception
    when no_data_found then 
		dbms_output.put_line('no record found for the id ');
		
	  when too_many_rows then 
		dbms_output.put_line('multiple  record found for the id ');
     
	 
	  dbms_output.put_line('sql error code is   '||sqlcode);
      dbms_output.put_line('error message   '||sqlerrm);
    
  
	end;
	
-- user defined exception

   declare 
     eid employee.id%type;
     ename employee.name%type;
     elocation employee.location%type;
     esalary employee.salary%type;
     
     sal_exception1 exception;
     sal_exception2 exception;
     
   begin
	   eid:=&id;
	   ename:='&name';
	   elocation:='&location';
	   esalary:=&salary;
	   
	   if eid<=0 then 
	       raise sal_exception1;
	   elsif esalary>=100000 then 
	       raise sal_exception2;
	  else 
         insert into employee values(eid,ename,eloaction,esalary);	  
	   end if;
   exception   
   
	   when sal_exception1 then 
		  dbms_output.put_line('invalid id < 0');   
	   
	   when sal_exception2 then 
		  dbms_output.put_line('salary very high >100000');   
   end;
   
   -- dvivied by zero error 
   
declare 
   x number;
   y number;
   ex exception;
begin
   x:=&no1;
   y:=&no2;
   if y=0 then 
   raise ex;
    else 
   dbms_output.put_line('division is '||x/y);
   end if;
exception
  when ex then 
     dbms_output.put_line('divided by zero error  ');
     dbms_output.put_line('sql error code is   '||sqlcode);
     dbms_output.put_line('error message   '||sqlerrm);
   end;

 -- raise_application_error  
   
   declare 
     eid employee.id%type;
     ename employee.name%type;
     elocation employee.location%type;
     esalary employee.salary%type;
     sal_exception2 exception;
   begin
	   eid:=&id;
	   ename:='&name';
	   elocation:='&location';
	   esalary:=&salary;
	   if eid<=0 then 
	       raise_application_error(-20000,'invalid id < 0');
	   elsif esalary>=100000 then 
	           raise_application_error(-20001,'salary very high >=100000');
	  else 
         insert into employee values(eid,ename,elocation,esalary);	  
	   end if;
    end;

-- procedure  in parameter 
create or replace procedure 
   addition(n1 int, n2 int )
   is 
   
begin 
  dbms_output.put_line('sum of '||n1||'  and '||n2||' is '|| (n1+n2));
  dbms_output.put_line('subtraction of '||n1||'  and '||n2||' is '|| (n1-n2));
  dbms_output.put_line('multiplication of '||n1||'  and '||n2||' is '|| (n1*n2));
  dbms_output.put_line('division of '||n1||'  and '||n2||' is '|| (n1/n2));
end;
-- calling procedure 
--SQL> execute addition(1,2)
--sum of 1  and 2 is 3
-- sql block  

set serveroutput on
execute addition(1,2);

-- pl sql 

begin 
  addition(11,22);
end;

-- procedure with out parameter

create or replace procedure 
   calculation(n1 int, n2 int , n3 out int,n4 out int,n5 out int,n6 out int)
   is 
  
begin 
	n3:=n1+n2;
	n4:=n1-n2;
	n5:=n1*n2;
	n6:=n1/n2;
end;
 
-- calling above procedure
declare 
	a int;
	b int;
	c int;
	d int;

begin
 calculation(10,2,a,b,c,d);
 dbms_output.put_line('sum is '||a);
 dbms_output.put_line('subtraction is '||b);
 dbms_output.put_line('multiplication is '||c);
 dbms_output.put_line('division is '||d);
end;

-- database procedure 
select * from employee;

-- in parameter 

create or replace procedure 
	emp_insert(id1 int, name1 varchar, salary1  employee.salary%type,location1 employee.location%type)
	is 
begin
	insert into employee values(id1,name1,salary1,location1);
exception
  when no_data_found then 
     dbms_output.put_line('no record found');
  when too_many_rows then 
		dbms_output.put_line('multiple  record found for the id ');
end;
set serveroutput on

-- calling using sql 
execute emp_insert(7001,'suranjan singh',67000,'patna');
select * from employee; 
desc employee;
truncate table employee;
alter table employee modify id int primary key;
--  in out parameter
create or replace procedure 
	emp_query(id1 int, name1 out varchar, salary1 out employee.salary%type,location1 out employee.location%type)
	is 
begin
	select name,salary, location into name1,salary1,location1 from employee where id=id1;
exception
  when no_data_found then 
     dbms_output.put_line('no record found');
  when too_many_rows then 
		dbms_output.put_line('multiple  record found for the id ');
end;

-- calling 

  declare 
  name employee.name%type;
  salary  employee.salary%type;
  location  employee.location%type;
  
  begin 
   
	emp_query(1002,name,salary,location);
	dbms_output.put_line('name is '||name);
	dbms_output.put_line('location is '||location);
	dbms_output.put_line('salary is '||salary);
  end ;

-- procedure in out parameter
create or replace procedure 
  square(n1 in out int )
 is 
begin 
   n1:=n1*n1;
end ;
  
-- calling inout  procedure
  declare 
  x int;
  begin 
    x:=4;
	square(x);
	dbms_output.put_line('square is '||x);
  end ;
  
  
  
-- function 

create or replace function circle_area(radius int) 
   return int 
   is 
   area int;   
begin
 area:=3.14*radius*radius;
 return area;
end;
 
--  calling function 

begin
dbms_output.put_line('area is '||circle_area(5.5));
end;

declare 
	area int;
	radius int;
begin
	radius:=6.5;
	area:=circle_area(6.5);
	dbms_output.put_line('area  of circle with radius  '||radius||' is '||area);
end;   

--calling from sql prompt
--SQL> variable result number
--SQL> execute :result:=circle_area(55.5)
--SQL> print result

variable result number
execute :result:=circle_area(55.5)
print result


create or replace function employee_average_salary 
  return int 
  is 
  avg_salary int;
  
  begin
     select avg(salary) into avg_salary from employee;
	 return avg_salary;
	 
    exception 
	  when no_data_found then 
	  dbms_output.put_line('no record found ');
	  
	  when too_many_rows then 
	  dbms_output.put_line('multiple record found for the id  ');
	  
  end;
  
  -- calling above function employee_average_salary
  
  declare 
    avg_salary  employee.salary%type;
  begin 
    avg_salary:=employee_average_salary();
	  dbms_output.put_line('average salary is '||avg_salary);
  end;
  
   select id,name,salary,location, employee_average_salary() from employee;
   select id,name,salary,location, employee_average_salary() as "average salary" from employee;
	  
	
-- package 
-- specification
create or replace package pack is
    total_row int;
   procedure emp_search(id1 int);
   function  emp_rowcount()  
   return int;
end;
	-- package body
create or replace package body pack is
   procedure emp_search(id1 int) is
    name1 varchar(20);
   salary1 int;
   location1 varchar(20);
     begin 
		 select name,salary,location into name1,salary1 ,location1 from employee where id=id1; 
		 dbms_output.put_line('id is '||id1);
		 dbms_output.put_line('name is '||name1);
		 dbms_output.put_line('salary is '||salary1);
		 dbms_output.put_line('location is '||location1);
	exception
      when no_data_found then
	    dbms_output.put_line(' no record found');	 
    end emp_search;
	function emp_rowcount 
         return int
          is 
         begin
	  select count(*) into total_row from employee;
         return total_row;	 
	end emp_rowcount;
end pack;
/
-- calling package  from SQL prompt   
execute pack.emp_search(1002);
-- calling package from procedure  
create or replace procedure emp_search2(id int) is 
begin 
  pack.emp_search(id);
end;

execute  emp_search2(1002);
execute  emp_search2(1001);

select id, name, pack.emp_rowcount() from employee;


-- composite data type 
--  type Record 
 declare
 type emp_record is record 
 (
 id int,
 name varchar(20),
 salary int,,
 salary int,
 location varchar(20)
 );
 emp_rec emp_record;
 begin 
	 emp_rec.id:=100001;
	 emp_rec.name:='ghanshyam mohan';
	 emp_rec.salary:=34000;
	 emp_rec.location:='thane';
	 
	 dbms_output.put_line(' id is '||emp_rec.id);
	 dbms_output.put_line(' name is '||emp_rec.name);
	 dbms_output.put_line(' salary is '||emp_rec.salary);
	 dbms_output.put_line(' location is '||emp_rec.location);
 end;

-- index by  
-- index by table -- associative array -- key value  
declare 
  type 
  name1 is table of 
  varchar(25)
   index by binary_integer;
   name name1; 
 begin 
    name(1):='umesh parsad';
    name(2):='suresh parsad';
    name(3):='parmod kumar';
    name(4):='anil kumar';
    name(5):='sunil kumar';
  dbms_output.put_line(name(1));
  dbms_output.put_line(name(2));
  dbms_output.put_line('all values using for loop');
   for i in name.first.. name.last loop 
   dbms_output.put_line('roll '||i||' is '||name(i));
   end loop;
  end;
/

 
   
-- key and value
declare 
  type 
  employee  is table of 
  varchar(25)
   index by binary_integer;
   emp1 employee; 
 begin 
  emp1(1001):='ganesh kumar';
  emp1(1002):='sarvesh kumar';
  emp1(1003):='saumesh kumar';
  emp1(1004):='priayasnhi verma';
  emp1(1005):='hemlata sharma';
  emp1(1006):='karthik ganesh';
  
  dbms_output.put_line(emp1(1001));
  dbms_output.put_line(emp1(1002));
  
  for i in emp1.first..emp1.last loop
    dbms_output.put_line('id '||i||'   '||emp1(i));
  end loop;  
 end;

 -- varray 
 declare 
  type marks is varray(10) of integer;
  m  marks;
 begin
  m:=marks(56,67,44,90,77);
  m.extend(); -- extend size and add null value
   m.extend(2,2);-- 99 
    dbms_output.put_line('marks1 '||m(1));
    --for i in m.first..m.count loop
    for i in m.first..m.last loop
     dbms_output.put_line(i||'---------'||m(i));
     end loop;
  end;
 
 -- methods 
   /*
   first --first index of the collection
   last --last index of the collection
   prior -- prior index 
   next -- next index
   extend  -- extend and append null 
   extend(n)-- extend and append n null values
   extend(n,j)-- append n copies of jth element
   delete    -- remove all elements
   delete(n) -- remove nth element
   trim -- remove one element  from end 
   trim(n) --remove nth element   
     
   */
set serveroutput on

-- trigger 
-- table for backup
--create table emp_audit(user1 varchar(20),date1 date);
--drop table emp_audit;
create table emp_audit(user1 varchar(20),date1 timestamp);

create or replace trigger emp_insert
  after insert on employee,
 begin
 insert into emp_audit values(user,sysdate);
 dbms_output.put_line('Record added by '||user||' on date '||sysdate);
 end;
 insert into employee values(8080,'ranjit kumar',35000,'mumbai');
 commit; 
 
--select current_timestamp from dual;
 create table employee_backup as select * from employee where 1<0;
 
create or replace trigger emp_delete 
  after delete on employee for each row 
begin
  insert into employee_backup values(:old.id,:old.name,:old.salary,:old.location);
end;
  
create or replace trigger emp_insert1
  before  insert on employee for each row 
   begin
	  if(:new.id<=0) then 
	  raise_application_error(-20006,'invalid employee id <=0');
	  end if;
  end;
  
insert into employee values(-8080,'ranjit kumar',35000,'mumbai');
insert into employee values(8081,'ranjit kumar',35000,'mumbai');
 
-- rank, dense rank
create table employees(id int primary key, name varchar(20), salary int, city varchar(20)) ;
INSERT INTO Employees VALUES (10001,'sudhir kumar',10000,'delhi');
INSERT INTO Employees VALUES (10002,'mukesh kumar',24000,'noida');
INSERT INTO Employees VALUES (10003,'dayakant kumar',250000,'delhi');
INSERT INTO Employees VALUES (10004,'manoj kumar',30000,'grugaon');
INSERT INTO Employees VALUES (10005,'dhiraj kumar',280000,'noida');
INSERT INTO Employees VALUES (10006,'neeraj kumar',40000,'mathura');
INSERT INTO Employees VALUES (10007,'pawan kumar',890000,'delhi');
INSERT INTO Employees VALUES (10008,'radhika rawat',840000,'delhi');
commit;
select city, count(city), avg(salary) from employees  group by city;

-- error not group by--select id,salary,city, count(city) from employees  group by city;
select avg(salary) from employees;
select id,name,salary,avg(salary) over(partition by city) as "avg salary", city from employees;
select id,name,salary,avg(salary) over(partition by city order by id) as "avg salary", city from employees;
--  not a group by expression  ---select id,name,salary,avg(salary) from employees  group by city;

-- rank() function

select id,name,salary, rank() over(partition by city order by id) as "rank", city from employees;
select rownum, id,name,salary, dense_rank() over(partition by city order by id) as "rank", city from employees;

-- pivot table
-- cross tabulation

desc employees;
select * from 
(select id,name,city from employees) 
 pivot
 (
  count(city)
  for city in('delhi','noida','mathura')
 )
 
 -- flashback table 
 purge recyclebin; -- empty recyclebin
 create table hello(id int primary key);
 insert into hello values(10);
 insert into hello values(11);
 select * from hello;
 
 drop table  hello;
 select * from hello;
 select * from recyclebin;
 flashback table hello to before drop; 
 select * from hello;
 --
 create  table course(courseid int , course_name varchar(20), duration int, primary key(courseid));
 create table student(roll int primary key, name varchar(20) , age int, courseid int, foreign key(courseid) references course(courseid));

 create table examination(examid int primary key,examname varchar(20),exam_date date ,courseid int, foreign key(courseid) references course(courseid));

 
 
/* one to one
                pk        fk
      student(roll,name,couseid)
                            |
                     course(courseid,coursename,duration)
			                      |
examination(examid,examname,date,courseid);
        PK                     FK


one to many 

person -- many cars 
person -- many phone 
                                
								 FK 
person (id, name, location,phone_id)
                               | primary key relationship
							   |
                       phone(phone_id, model,cost)
                                    PK
									
		PK							  FK
person (id, name, location,phone_id,car_id)
                                      |
									  |          foreign key relationship
           car(car_regno,model,cost,car_id)
                PK                    

*/ 
 -- composite key -- pk with multiple columns
create table passenger(passengerId varchar(10), country_code varchar(10),name varchar(20),age int,primary key(passengerId,country_code)) 
 
--jdbc 

select * from employee;
desc employee;

select * from employee;
 
desc student; 
create table department (dept_id int primary key , name varchar(20), empid varchar(20), dob date);
desc department;
select * from department;
 
 
 
 
select * from place; 


