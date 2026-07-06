create database coforge_db;

show databases;

use coforge_db;

drop database coforge_db;

create database coforge_db;
 
create table employee (id  int primary key, name varchar(20), salary float(10,2));

desc employee;
describe employee;

show tables;
insert into employee values(10001,'ram kumar', 25000.567657);

select * from employee;


insert into employee values(10002,'shyam kumar', 25000.567657), (10003,'amit kumar',340000),(10004, 'sumit kumar', 670000);



select id, name, salary 'total salary', salary-salary*0.05 as  'gross salary'  from employee;


-- sorting 

mysql> select id, name, salary 'total salary', salary-salary*0.05   from employee order by id  ;

mysql> select id, name, salary 'total salary', salary-salary*0.05   from employee order by id asc ;

mysql> select id, name, salary 'total salary', salary-salary*0.05   from employee order by id desc ;


-- between 
select * from employee where salary>=300000 or salary<=700000;
  
select * from employee where salary between 300000  and 700000;
mysql> insert into employee values(10009,null, null);
 insert into employee (id) values(100010);
 
  select * from employee where name is null ;
   select * from employee where name is not null ;


 create table insurance(id int, name varchar(20) not null unique, location varchar(20) default 'noida' , premium float , check (premium>10000), primary key(id));


mysql> insert into insurance values(77879,'health insurance','delhi',9000);
ERROR 3819 (HY000): Check constraint 'insurance_chk_1' is violated.
mysql> insert into insurance values(77879,'health insurance','delhi',19000);
ERROR 1062 (23000): Duplicate entry 'health insurance' for key 'insurance.name'
mysql> insert into insurance  (id,name, premium)values(77871,'car insurance',19000);
Query OK, 1 row affected (0.03 sec)






 
 
 



 
 

 
 




