

binary digit 
   0, 1
    
	|
	|
   interpretter 
   compiler   
  java 
  
      -- program 
	       
		    compiler  --- compile whole code  --  c, c++  
			interpretter -- line by line     python 
			
			
			
			
			compiler+ interpretter -- platform indepedent 
			   hello.java -- compiler -- hello.class 
			                                byte code 
			
			 
			 
			
			operating  system 
			     unix     hello.class  --- interpretter
				  linux   
				  mac os 
				  window 
			

  
  
  
       java software 
	   
	     jdk -- java development kit  -- compiler+ interpretter
		                                    
		 jre   -- java runtime environmemnt  -- interpretter
		          run the java software 
		 jar     --  java archieve 
		 
		 all libraries   -- .jar 
		 
		 
		 set path  yto C:\Program Files\Java\jdk1.8.0_212\bin
		 
	bin  -- contains executable file to compile and run the java program
		   
		   
	
sts/eclise   --- on save it's compiled automatically 
                incremental compilation 
                          10  line code   -- compile1
                           5 line         -- compile from 11th line 						  
		 
		 
		 +  -- arithmetic addition 
		 +  -- string cacatenation 
		 
		 
		  ""
		  "hello"   -- string 
		  
		  int a=10;
		  
		  "no1 is "+a  -- string 
		           a is appented to the string 
				   
				   
				   
		 if 
		 else 
			 
		 short circuit 
		 
		      and   --  true if aLL conditions are true 
			  or    -- true if any one is true 
			  
		
   while 
      -- top  tested 
	  
	  
	for loop
       -- top tested  loop 
       -- easiest loop
       -- counter variable declarataion, initilisation , check condition'
         and increment/decrement at one place 
     		 
      	   
	  
			  
		 
	counter variable 
                  count  -- fixed  
    sentinel variable 
    	  boolean
		  



     break; 
	   -- come out from the loop and block 
	 continue -- continue the current step (work) 
	 
     
	 1
	 1 2
	 1 2 3
	 1 2 3 4 
	 
	 *
	 *	*
	 *	*	*
	 *	*	* * 
	 
	 


		  
		  
		  
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				//System.out.print(j+"  ");
				System.out.print("*  ");
			}
			System.out.println();
		}
	  
		  
	i=1
    j=1;	j<=1
	     * 
		 
    i=2
    j=1;	j<=2
	  * * 
		 
	i=3
    j=1;	j<=3
	
	* * * 
	
	i=4
    j=1;	j<=4
	
	* * * * 
		 
	i=4
    j=1;	j<=5
	
	* * * * *
		 
	
	
loop 
  1. while   -- top tested 
  2. for loop    -- top tested
  3. do while     -- bottom tested
             condition checked at bottom 
            -  it will execute at least once whether condition is false 
               or true 


     do {
		 
		 
		 
	 }			   
    while(condition);
  
	

  two dimension array 
  
		int ar3[][] = { 
		{ 1, 2, 3, 4 }, 
		{ 5, 6, 3, 7 }, 
		{ 8, 9, 10, 11 }
		
		},

		System.out.println("\n  no of rows  " + ar3.length);
		System.out.println("  no of cols  " + ar3[0].length);

  // ar3[0]   1st row    one row of one d array 1,2,3,4  
  // ar3[1]   2nd  row 
  // ar3[2]   3rd  row 
  
		System.out.println("\nfirst row ");
		for (int is : ar3[0]) {
			System.out.print(is + " , ");
		}
		
		
		void factorial(){
		      	
		}
		
		
		
	static int factorial1(int n) {
		if(n==1)
			return 1;
		else
		return n*factorial1(n-1);
	}
		
		
	factorial1(5)
	  return 5*factorial1(5-1);
	  return 5*factorial1(4)*factorial1(3)*factorial1(2)factorial1(1);
	  
	
		
		c , fortran 
		
		    structure programming 
			   ---  variable, functions 
			   
			   
			   oop 
			     object oriented programming
				 
				    object -- entity -- real entities


                   student1, student2  
				   
                   employee1, employee2  
				   

				      Customer {
						    id,        attributes  
							  name
							  , salary 
						  
						  
						    behaviour---  function 
						    
					  }
			   
			   
			      collection of objects  --- class  
				               employee1, employee2, employee3
				  object is the instance of class 


             class name should be noun 
			 start iwth First letter as Capital 
			 
       class Employee{
		     private int id;  // instance variable 
			 private String name;
		   
		     void employeeWork(){  // instance method 
				 
				 
			 }
		   
		   
	   }
				  
				  employee1-- one copy of attributes and behaviour 
				  employee2
				  employee3
				  
				  
				  employee1 
				        id=7887
						name="ram kumar"
					employee2 
				        id=7888
						name="suresh  kumar"
						
				  
				  
				class -- conceptual entitity, collection of objects 
                          having similar attributes and behaviour 


                object -- instance of class , real entitity
           
               access modifier 
			              --change the access permission 
						  private 
						  protected
						  public 
						   default 
						  
   			   
			   encapsulation  -- capsule 
			               hide the  data
                               data private 
						  						  
						  expose the data using public methods 

                               bind the data (attribute) with the code(methods)
							   
                          
						  setting value
						  getting values
						  
						  for each attribute two type of public methods
						   setter
						   getter

                						   
						   
			   Customer customer=new Customer();
		customer.customerId=8998;  // setting values
		customer.customerName="ravi kant";
		customer.customerLocation="new delhi";
		
		System.out.println("id is "+customer.customerId);// getting value
		
			   
			   
			   array -- collection of elements of same data type 
			     int ar[]=new int[10];
				  array can be used for primitive data type, reference data type 
           and custom class also 

array of 10 customer, 10 employee, 10 user 


class Customer {
	
	
	
}

Customer customer[]=new Customer[10];
                   // array of 10 customer object 
           customer[0]=new Customer();
           customer[1]=new Customer();
           customer[2]=new Customer();
				  
			  
				  
		
		Has a relationship 
		
		  Customer --- Address
		    Customer has Address 
		    Customer has many mobile
		  
		 Customer.java 
		    id, 
			name 
			location 
			Address address;
		    Mobile mobile[] 
		
	relationship 	types 
		  one to one ----------1 ---- 1  
		  one to many ------   1 ---- *
		  many to one       * ---- 1 
		  many to many      * ---- *
		  
		  
		navigation 
		   1.unidirectional
		   2.bi directional 
		   
		  
    Account <------> Customer
               bidirectional
			   
		
		
		A company sells different items to customers who
have placed orders. An order can be placed for
several items. However, a company gives special
discounts to its registered customers.



     company 
	 items
	 order 
	 discounts
	 customers
	 
	 
	 company 1---- * item *--------- customer
	   \                                |  
        \                               |
		1                               *
		reg customer 					customer			
										
										
										
										
						Object -- state --> variable (instance)	
						Object -- behaviour --> method  (instance)	

		Employee has one address 
		Employee has multiple cars 
		
		Employee.java 
		
public class Employee {

	private int empId;
	private String empName;
	private float empsalary;
	// one to one  has a relationship 
	private Address address;
	
	// one to many   has a relationship 
	private Car cars[];
		
}
		
		
		Address.java 
		
		Car.java 
		
		
		constructor 
		   --> have same name as that of class 
		   --> used to initilise the instance variable 
		   --> should not return any value 
		   --> its called when new object is created 
		   --> it can be private  public default protected
		   
		   two types of constructor
		    1.default constructor
			2.overloaded constructor
			
		   -->instance variable is decalred inside the class, outside methd , constructors
           --> instance variable has default value
           --> instance variable is initilised by the constructor with 0 and null value

           --> local variable 
                --> is declared inside method, method parameter 
                --> has no default value 
                --> must be initilised before used 				
						
				1. default constructor
                            no argument
                2. overloaded constructor 
                               argument/parameter
                  							   
					-->	a class can have both default and overloaded constructors
					-->	a class can have multiple overloaded constructor but single default constructor
				




public class User {
	private int userId;
	private String userName;
	private int userAge;
	private String userCountry;

	 User() {
		this("nepal");
		userAge = 44;
		userName = "amit kumar";
		userId = 787897;
		System.out.println("default constructor called ");
	}
	
	 User(int userId, String userName, int userAge) {
		this("india");// another current class constructor 
		this.userId = userId;
		this.userName = userName;
		this.userAge = userAge;
		System.out.println("overloaded  constructor called ");
	}
	
	 User( String country) {
		this.userCountry=country;
		System.out.println("overloaded  constructor2 called ");
	}

	void userInfo() {
		System.out.println("\n user id "+userId);
		System.out.println(" user name "+userName);
		System.out.println(" user age "+userAge);
		System.out.println(" user country  "+userCountry);
	}
	public static void main(String[] args) {
		
		User user1=new User();
		User user2=new User(787887,"amita sinha",34);
		User user3=new User(77687,"muthu maharaja",55);
		
		user1.userInfo();
		user2.userInfo();
		user3.userInfo();
	}
}
				
				this -- current class reference variable 
				 using it call current class methodand variable
				 
			
             this() -- call default constructor from another constructor
             this(parameter1, parameter2) -- this will call overloaded constructor
                         from the other constructor			 
              it must be in first lune inside constructor 			 
			  
			  
			  
			  
			  
			  
			  
			  
			  Object 
			     Customer customer; // this is reference variable 
				                    // it's not referring any object 
									// it's having null value 
									
			      System.out.println(customer.id)--- null pointer exception
				  
				  customer=new Customer();// create object in heap 
				                           // allocate memory , initilise all instance variable
										   // return reference/address  of the object 
			  
			      1 reference variable
				  1 object 
				  
				  customer=new Customer();
				  1 reference variable
				  2 object 
				  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  database -- consists of logical data in the tabular form 
			  
			  
									
									
			  Records     
			             database -- server -- lot of users 
						 
			  primary key -- identify the data from other records
			  
			  
			  
			  database (server)-------------------> java, php , python 
			  
			  
			     data -- ledger 
				 
				 database -- keep all type of data 
				            excelsheet 
							 it consits of rows and columns 
						
						student table 	 
							 roll(pk)    name          subject
                             10001		pankaj kumar	null 
                             10002      madan kumar     science 
                             10003      madan kumar     science 
							 
						student	 related to examination using foreign key 
							 
					   examination
                                   roll           date           subject     marks     					   
                              		10001		   10-02-2021	 math         90
							        10002          10-02-2021    science      81
							        10003          10-02-2021    science      81
									
                   dbms -- data base management system
                   rdbms  --relational data base management system				   
					
                     structured query language(sql) 
				   
						relation between tables 
						
			C:\Program Files\PostgreSQL\13\bin>psql -U postgres
             Password for user postgres:

             postgres=#\list -- list all databases
             postgres=#\l -- list all databases
			 
			 create database  database1--- create the database 
			 \c databasename   --- connect to database 
			 
			 \dt -- show all tables
			 
			 
			 
			 create table employee(empid int primary key, name varchar(20), salary float)
			 
			 insert into employee (empid, name ,salary) values(10001,'amit kumar',10000)
			 insert into employee (empid, name ,salary) values(10002,'sumit kumar',20000)
			 insert into employee (empid, name ,salary) values(10003,'upendra kumar',30000)
			 
			 insert multiple records 
			 
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


create table customer (id bigserial  primary key, name varchar(20) not null  unique  ,dob date not null unique)
			 
			 
			 primary key -- unique + not null 
			 name   -- null 
			 dob -- null 
			 
			 
			 
			 unique  -- not same 
			
			 
			 
			 mysql -- workbench   -- gui client for mysql server 
			 
			 
			 update  -- change the already added values 
			 
			  
			parent               child 
			students ----         course 
			    roll (pk)          courseid(pk) 
				name               course_name
				courseid(fk)       course_cost
				
			
			
						
						
						
			  
			  
		sql query 
                     -- simple 
                     -- complex 
            give the sql query a name using the view 
            later on you can execute it .
			

			  
create view myquery1 as 
select cid,name,location from customer where cid in  (select customer_id from customer_order);
			  
-- execution 

select * from myquery1;
			  


--- insert  -- save  database 
    update  -- save  database
    delete  -- save  database
	  mysql -- autocommit transaction 
	  transaction 
                   will complete(save it into database ) 
            till commit is not called 
           
  -- 2 methods -- commit -- save permanently in database
                  rollback  -- revert     
	

--- transaction -- 
    one account will be debited  
    other account will be credited 
	
  -- atomic 
       
	   
	   -- account credit --
	   both will be isolated 
	   -- account can not be debited  

     dirty reading ---  problem 		
		
		
		durable   -- 

                   third party 
				   
in mysql 
    there is autocommit=1;
	 insert 
	 update
	 delete 
	   -- saved in database automatically 
	   
	set autocommit=0;
	   insert 
	 update
	 delete 
	    -- will saved in database automatically 
	     saved after giving 
		    commit command ;
			
			rollback 

  buy a ticket 
  amount debited from ur account 
  
  booking ticket is failed
  
     rollback  
    amount debited from ur account 

			html 
			
			 heading 
			    h1,h2,h3,h4,h5,h6
				
				<br>  -- line break
				bold <b>  <strong>
	             <i> ,<em>  -- italic 
				 <u>  -- underline
				 <s>  -- strikethru 
				 
				 
<div>  
    this will create division/ block  
<span> 	
       will not create block 
	   its style effect will be till end of line 
	   
				   


pattern --- it wirks with regular expression pattern 


				   