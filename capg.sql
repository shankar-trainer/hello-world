create table employee (empid int primary key, name varchar(20), salary float);

			 insert into employee (empid, name ,salary) values(10001,'amit kumar',10000)
			 insert into employee (empid, name ,salary) values(10002,'sumit kumar',20000)
			 insert into employee (empid, name ,salary) values(10003,'upendra kumar',30000)
			 
			 -- insert multiple records 
			 
			 insert into student (roll,name,marks) values
			(1003,'amar kumar',71),
			(1004,'pravin kumar',89),
			(1005,'jayant kumar',90),
			(1006,'amita kumari',91)

             
			 select * from employee
			 select * from employee where empid=10001
			 
			 10001	"ram kumar"	20000
			 10002	"mohan kumar"	30000
             10003	"upendra kumar"	40000

select * from employee where name='ram kumar'

select * from employee where name='ram kumar' or empid=10003
select * from employee where name='ram kumar' and empid=10003
select * from employee where name='upendra kumar' and empid=10003

select * from employee where salary>=10000 and salary<=30000

select * from employee where salary between  10000 and 30000

create table customer (id bigserial  primary key, name varchar(20),dob date) 
 
 
insert into customer (name, dob)values('ram kumar','1997-10-12') 
select * from customer

--			 primary key -- unique + not null 
--			 name   -- null 
--			 dob -- null 
--			 unique  -- not same 
	

create table customer (id bigserial  primary key, name varchar(20) not null  unique  ,dob date not null unique)
insert into student2 (roll,name,marks,dob) values(1001, 'amit kumar',90.67,'1998-12-21')
insert into student2 (roll,name,marks,dob) values(1002, 'saumesh kumar',90.67,current_date)
select * from student2

insert into student2 (roll,name,marks) values(1003, 'priyanshu kumar',90.67)


create table customer (id bigserial  primary key, name varchar(20),dob date) 
insert into customer (name, dob)values ('ram kumar','1997-10-12') 
select * from customer
insert into customer (name)values ('pawan kumar') 


delete from customer where id=1
delete from customer where name='ram kumar'

create table user1(id int primary key , name  varchar(20) not null, dob date  not null unique) 

create table user2(id int, name  varchar(20) not null, dob date  not null unique, primary key(id)) 

alter table  user2 add  salary float
alter table  user2 alter  column  name  type varchar(40)   

select * from user2
insert into user2 (id,name,dob,salary) values(8778,'rameshwar  kumar sharma','1988-12-24',76667)



insert into user1 (id,name,dob) values(8778,'ram kumar','1988-12-24')
insert into user1 (id,dob) values(8778,'1988-12-25')
insert into user1 (id,name) values(8771,'ram kumar')
insert into user1 (id,name,dob) values(8772,'ram kumar','1988-12-24')









