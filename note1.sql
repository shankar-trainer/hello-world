
SQL*Plus: Release 18.0.0.0.0 - Production on Wed Nov 24 09:21:11 2021
Version 18.4.0.0.0

Copyright (c) 1982, 2018, Oracle.  All rights reserved.

Enter user-name: system
Enter password:
Last Successful login time: Sun Nov 21 2021 01:38:56 +05:30

Connected to:
Oracle Database 18c Express Edition Release 18.0.0.0.0 - Production
Version 18.4.0.0.0

SQL> select * from dual;

D
-
X


SQL> create  table employee(id int primary key, name varchar(20),salary int);

Table created.

SQL>
SQL>
SQL> desc employee;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 ID                                        NOT NULL NUMBER(38)
 NAME                                               VARCHAR2(20)
 SALARY                                             NUMBER(38)

SQL> describe  employee;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 ID                                        NOT NULL NUMBER(38)
 NAME                                               VARCHAR2(20)
 SALARY                                             NUMBER(38)

SQL> ed
Wrote file afiedt.buf

  1* create  table employee(id int primary key, name varchar(20),salary int)
SQL> ed
Wrote file afiedt.buf

  1* create  table employee1(id int primary key, name varchar(20),salary int, location varchar(20))
SQL> /

Table created.

SQL> ed
Wrote file afiedt.buf

  1* create  table employee1(id int primary key, name varchar(20),salary int, location varchar(20))
SQL> desc employee;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 ID                                        NOT NULL NUMBER(38)
 NAME                                               VARCHAR2(20)
 SALARY                                             NUMBER(38)

SQL> desc employee1;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 ID                                        NOT NULL NUMBER(38)
 NAME                                               VARCHAR2(20)
 SALARY                                             NUMBER(38)
 LOCATION                                           VARCHAR2(20)

SQL> insert into employee  values(1001,'mohan kumar',23000.00);

1 row created.

SQL> insert into employee  values(1002,'suresh kumar',25000.00);

1 row created.

SQL> ed
Wrote file afiedt.buf

  1* insert into employee  values(1003,'raja kumar',56000.00)
SQL> /

1 row created.

SQL> commit;

Commit complete.

SQL> select * from employee;

        ID NAME                     SALARY
---------- -------------------- ----------
      1001 mohan kumar               23000
      1002 suresh kumar              25000
      1003 raja kumar                56000

SQL> ed
Wrote file afiedt.buf

  1* select * from employee
SQL> save test1.sql
Created file test1.sql
SQL> ed test1.sql

SQL> run test1.sql
  1* select * from employee

        ID NAME                     SALARY
---------- -------------------- ----------
      1001 mohan kumar               23000
      1002 suresh kumar              25000
      1003 raja kumar                56000

SQL> @test1.sql

        ID NAME                     SALARY
---------- -------------------- ----------
      1001 mohan kumar               23000
      1002 suresh kumar              25000
      1003 raja kumar                56000

SQL> list
  1* select * from employee
SQL>



livesql.oracle.com

  signin 
  


primary key -- only one column can be primary key
               it is not null and unique 
			   
unique      -- no duplicate 
not null    -- no null  value is allowed 

unique+ not null -- combination 





primary key 
     table 
foreign key 
         is the key in other table which is referenced by the first table column 

department                           employee   ----------- multiple customer  ---- loan  

dept_id----------->                   emp_id
name                                  name
location			                 



oracle server ---->1.sqlplus tool
                   2.sql developer
				   



 set1   ={a,b}
 set2   ={c,d}
 
 
 set1 X set2 
     {a,c},{a,d}{b,c}{b,d}
	 

