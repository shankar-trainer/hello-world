ledger 

    rows and cols
	
	-- database management system
	   table -- 
	   server 
	   
	   
	   table -- structure 
	          --- query -- language-- sql 
			      structure query language
				  
				  
				oracle server 

                   2 tools 
                       a)sql plus 
                       b)sql developer 


https://download.oracle.com/otn-pub/otn_software/db-express/OracleXE213_Win64.zip

https://www.oracle.com/tools/downloads/sqldev-downloads.html#license-lightbox

https://www.oracle.com/database/technologies/xe-prior-release-downloads.html#license-lightbox

or operator 
         → any condition should be true 
           truth table
  condition1     condition2     result
     T				T				T
     T				F				T
     F				T				T
     F				F				F


and operator 
    • all condition should be true 
   
           truth table

  condition1     condition2     result
     T				T				T
     T				F				F
     F				T				F
     F				F				F
	primary key --
    • no duplicate , not null 

       in a table we can have single primary key 
	   
    •         for other columns to have not null values we can use not null	   
    •         for other columns to have no duplicate  values we can use unique	

   primary key --
                        consists of single column 
                        consists of multiple column -- composite key 
   check constraint 
          check values with the columns 
		  
  sorting 
      -- order by 
      -- order by  -- sort by column name in ascending order 
	  
  	  
	  https://writexo.com/cts_sql21
	   
Assignment day1
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



Q-1. Write An SQL Query To Fetch “FIRST_NAME” From Worker Table Using

The Alias Name As <WORKER_NAME>.

Q-2. Write An SQL Query To Fetch “FIRST_NAME” From Worker Table In Upper Case.

Q-3. Write An SQL Query To Fetch Unique Values Of DEPARTMENT From Worker Table.

Q-4. Write An SQL Query To Print The First Three Characters Of

FIRST_NAME From Worker Table.

Q-5. Write An SQL Query To Find The Position Of The Alphabet (‘A’) In

The First Name Column ‘Amitabh’ From Worker Table.

Q-6. Write An SQL Query To Print The FIRST_NAME From Worker Table

After Removing White Spaces From The Right Side.

Q-7. Write An SQL Query To Print The DEPARTMENT From Worker Table

After Removing White Spaces From The Left Side.

Q-8. Write An SQL Query That Fetches The Unique Values Of DEPARTMENT

From Worker Table And Prints Its Length.

Q-9. Write An SQL Query To Print The FIRST_NAME From Worker Table

After Replacing ‘A’ With ‘a’.

Q-10. Write An SQL Query To Print The FIRST_NAME And LAST_NAME From

Worker Table Into A Single Column COMPLETE_NAME. A Space Char Should

Separate Them.

Q-11. Write An SQL Query To Print All Worker Details From The Worker

Table Order By FIRST_NAME Ascending.

Q-12. Write An SQL Query To Print All Worker Details From The Worker

Table Order By FIRST_NAME Ascending And DEPARTMENT Descending.

Q-13. Write An SQL Query To Print Details For Workers With The First

Name As “Vipul” And “Satish” From Worker Table.

Q-14. Write An SQL Query To Print Details Of Workers Excluding First

Names, “Vipul” And “Satish” From Worker Table.

Q-15. Write An SQL Query To Print Details Of Workers With DEPARTMENT

Name As “Admin”.

Q-16. Write An SQL Query To Print Details Of The Workers Whose

FIRST_NAME Contains ‘A’.

Q-17. Write An SQL Query To Print Details Of The Workers Whose

FIRST_NAME Ends With ‘A’.

Q-18. Write An SQL Query To Print Details Of The Workers Whose

FIRST_NAME Ends With ‘H’ And Contains Six Alphabets.

Q-19. Write An SQL Query To Print Details Of The Workers Whose SALARY

Lies Between 100000 And 500000.

Q-20. Write An SQL Query To Print Details Of The Workers Who Have

Joined In Feb’2014.

Q-21. Write An SQL Query To Fetch The Count Of Employees Working In

The Department ‘Admin’.

Ans.

Q-22. Write An SQL Query To Fetch Worker Names With Salaries >= 50000

And <= 100000.

Ans.

Q-23. Write An SQL Query To Fetch The No. Of Workers For Each

Department In The Descending Order.

Q-24. Write An SQL Query To Print Details Of The Workers Who Are Also Managers.




create table student(roll int(8), name varchar(20) not null, subject varchar(20), marks number(6), primary key(roll))


ram kumar -- 9 chars 

varchar  -- variable chars


name char(20)  
ram kumar -- 20 chars 

dbms software   database management software 
                      table   only 

rdbms relational database management software 
                        
                  relationship between two or more tables 

                                               pk    parent table   
                                     product (id,name,cost)
                                               |
                                  				  child table 	 
product_order(order_id, order_date, location, prd_id)	----  product_payment						   

                 pk                           foreign key                  					  






create table product(id int primary key, name varchar(20), cost number(10,2));

create table product_order(p_orderid int primary key, product_tot_no int, location varchar(20), p_id int, foreign key(p_id)
 references product(id)
)

describe product_order;
                                                   pk
                                         product (id, name,cost)
                                                  |
												  |
product_order(p_orderid,product_tot_no,location,p_id)
                pk                               fk
				
				
				
				
	TABLE PRODUCT
Column	Null?	Type
ID	NOT NULL	NUMBER
NAME	 - 	VARCHAR2(20)
COST	 - 	NUMBER(10,2)

DBMS
  database  management system

– only data in table
– no relationship







RDBMS
relational  database  management system
  --relationship between tables

  primary key-- used with the table for rows identification and to maintain table integrity
  
 foreign key – key in other table to make the relationship with the current and other tables 
         foreign key 
              → can be primary key
             →  other key in the table 
product table  (parent table)
   pk
Id
Name
cost
  


  (child table)
   pk                                                  fk
p_orderId
total_no
location
p_id
product_order table

create table product(id int primary key, name varchar(20), cost number(10,2));

create table product_order(p_orderid int primary key, product_tot_no int, location varchar(20), p_id int, foreign key(p_id)
 references product(id)
 )
describe product
TABLE PRODUCT
Column	Null?	Type
ID	NOT NULL	NUMBER
NAME	 - 	VARCHAR2(20)
COST	 - 	NUMBER(10,2)




Oracle  Server 
                –> it is a database server 

it can  be accessed by sql client 

Oracle Server – one tool – sql plus 
sqlpplus – is a client tool to connect with server 
              – by default it is present with each server

sql developer – another client tool gui based to connect with oracle server. 




DBA –

  database administrator

 
