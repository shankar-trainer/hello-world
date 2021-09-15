create database db2;
show databases;
use db2;
show tables;

create table employee (empid int primary key, ename varchar(20), salary float(10,2));

describe employee;

insert into employee  values(1001, 'anand mukhopadhya',67000.00000);
insert into employee  values(1002, 'sumanth varma',57000.00000);
insert into employee  values(1003, 'ranjan sharma',17000.00000);
insert into employee  values(1004, 'sanjay mukherji',27000.00000);

select * from employee;
select * from employee where salary>=50000;
select empid,ename from employee;

select * from employee where empid=1001 or ename='ranjan sharma';
select * from employee where empid=1001 and ename='ranjan sharma';
select * from employee where empid=1003 and ename='ranjan sharma';

create table survey (surveyid int auto_increment, survey_name varchar(20) not null unique, survey_location varchar(20) not null,
              primary key(surveyid));
desc survey;
desc employee;

insert into survey  (survey_name, survey_location) values('education','kolkotta');
insert into survey  (survey_name, survey_location) values('health','chennai');
insert into survey  (survey_name, survey_location) values('corruption','pune');
insert into survey  (survey_name, survey_location) values('population','delhi');

insert into survey  (survey_name, survey_location) values
('training','noida'), 
('development','noida'), 
('cleanliness','noida')
;
select * from survey;
-- adding column  
alter table survey add survey_state varchar(20);
desc survey;
-- changing/modifying the column 
alter table survey modify survey_state varchar(40);
 -- renaming column name
alter table survey change surveyid survey_id int;
-- check , default 
create table furniture (id int primary key, name varchar(20) default 'chair', cost float(10,2), check(cost>1000) );
 -- chevk will check the data added at runtime 
 -- if value not given then it will add default instead of null
 desc furniture;
insert into furniture value(9989,'table',400); 
insert into furniture value(9989,'table',1400);
insert into furniture (id,cost) value(9981,1001);
 select * from furniture;

create table furniture1 (id int primary key, name varchar(20) not null default 'chair', cost float(10,2), check(cost>1000) );

 select * from employee;
 
update employee set ename='anand kumar' where empid=1001;
update employee set ename='suman anand ',salary=90000 where empid=1002;

create table courses( course_id int primary key , course_name varchar(20),course_cost float);
create table students(roll int primary key auto_increment, name varchar(20), courseid int, foreign key(courseid) references courses
(course_id));

-- courses -- parent table 
-- students -- child table 
  insert into courses values(7899,'java course',7000);
  insert into courses values(7891,'ui course',8000);

insert into  students (name,courseid) values('arvind kumar',7899) ;
insert into  students (name,courseid) values('sanjay kumar',7899) ;
insert into  students (name,courseid) values('amit kumar',7891) ;
select * from courses;


select course_id, course_name, course_cost from courses;
select courses.course_id, courses.course_name, courses.course_cost from courses;

select courses.course_id, courses.course_name, courses.course_cost, students.roll, students.name, students.courseid from courses, students 
where courses.course_id=students.courseid;

--	course_id	course_name	course_cost	roll	name	courseid
--	7891	ui course	8000	4	amit kumar	7891
--	7899	java course	7000	2	arvind kumar	7899
--	7899	java course	7000	3	sanjay kumar	7899




