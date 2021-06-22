show databases;
create database db3;
use db3;
create table employee(empid int , name varchar(20), salary float(8,2), primary key(empid));
desc employee;

insert into employee values(1001,'mohan kumar', 120000);
insert into employee values(1002,'suresh kumar', 110000);
insert into employee values(1003,'anand kumar', 130000);
insert into employee values(1004,'priyanshu kumar', 140000);
select * from employee;

delimiter //
create procedure searchproduct(id1 int, out name1 varchar(20),out cost1 float(8,2),out mfd1 date)
begin 
select name, cost, mfd  into name1, cost1, mfd1 from product where id=id1;
end //
delimiter ;

call searchproduct(76767,@name,@cost,@date1);

select @name,@cost,@date1;


