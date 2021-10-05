

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
   
   [a-z] -- will alow for a- z character 
   [A-Z]  -- A -Z 
   [0-9]   -- 0-9 
  



cookie -- it keeps website information in to the brwoser 
        limited size 4kb 

localStorage   -- keep data 4mb -- data stored is lost after closing
sessionStorage 		data stored is lost after closing

keep data in key and value 

localStorage.setItem("key", "value")

localStorage.getItem("key")

		

  

CSS 

   3 types 
       inline 
	   embedded 
	   external 
	   
	   
	   <table>
	     <tr>
		   <th> 
		   <td> 
     

				   
				   
		Ball --- thrown  player1--------  caught by player2
		Ball --- thrown  player1--------  not caught by player2 --- hit head or  will go to the road 
		
		
		method -- create Exception obejct --- throw it ----  main method - Exception Object to be caught
		                                                       not caught --- JVM -- will give error , terminate program
															   terminate software
															   client  will angry 
															   
															   
		
		Car --- fuel  meter ----  fuel is exhausted --- beep message -- get petrol -- journey will contunue  
		
		Car --- not fuel  meter fuel is exhausted  -- journey is terminated 
	



    kid1 -- throws the ball ----------  kid2 -------------------- kid3	
		

 one try with multiple catch 
 
 
 
 
     Inheritance 
	           -- one class can  get/inherit feature from other class 
			   -- code reusabilty feature 
			   
			   -- the class inheriting -- child/sub/ derieved class 
			   -- the class from which inheritance is done is called super/parent





           Shape  parent/super  class   
          /    \
         /    	\	   
		Circle 	 Rectangle Square 
                    child/sub/derieved class 
					
		
       IS A relation ship 
           Circle is a shape 
           Rectangle is a shape 
           Square  is a shape 
           		   


     Animal 
        |
       Dog 
        Bird 
       Cat 

   Dog is a animal 
   Cat is a animal 

    java -- inherit bt extends keyword 

    class Animal{
		 String name;
		 String color;
		 
		 void sound(){
			 System.out.println("Animal Sound ");
		 }
			
	}	


  class Dog  extends Animal {
	  
	  
	  
  }
		
			   

  Department 

      
   1.EmployeeDepartment 
   2.TraingDepartment    
		
			
abstraction
      use the required/essential attributes, behaviour 
	  
				   Employee
           				   
				        id 
						name
						salary 
									
						 
                      work(){
						  
						  
					  }				   
				   
				   
				     hidden 
					 
				    gender 
						 car 
						 location 
						 family 
						
						
			Car 

                      regNo 
                      Modeno 
					  Cost 
					  
					  
					 Object 
                        private  state   --  attribue/data 					 
					 
       abstraction ---- 
	               abstract class /interface 
				   
				   
				   
				   class Employee{
					    private int id;  ///instance variable
						private String name;
						private float salary;
					    static String country; // class variable 
					    static String company_name;
						
					   
					   
					   
				   }
				   
				    instance variable
				      one copy associated with each of the object 
					  
					  static 
					     members are created in the jvm before the object 
						 
                         it can be called directly with class name
                         single copy is shared by all the objects 

			constructor is used for initialisation of instance variable
			static block is used to initialise the static members  	   
				   
				   
  static -- before the object 
  non static  -- after the object 


   non   static members cannot be used inside non static method 
	  
	  static can be used directly inside static method 
	  


java.lang.System 

  public static final java.io.PrintStream out;
  
  System.out
  
  java.io.PrintStream
       print() 
       printf() 
	   println()

System.out.println()
					 
					 
					 
			static import 		
			
					 in java5 
					  import static members and use it directly without class name
					 
					 Math.pow()
					 System.out. 
					 
					 
	Object class 
         super class of all the classes

		 overriding 
		   -- changing the inherited method in the subclass
		   -- rules 
		      -->no weaker access modifier can be used in sub class
		 
		 
		 public 
		 protected
		 default 
		 private
		 
		 
		 Home 
		     TV 
			 BIke 
		
             room()
          		 new TV()
                 new Bike()
				 
			 
		 
		 
		 Casting  in primitive data type
		   
		   assign the value of one compatible data type to other one.
            1. implicit casting (widening ) 
                   int x=100;
                   float p=x; // no cast is required 

            2.explicit casting(narrowing)
			    higher data type to lower data type 
				cast it using operator 
				
				   float  x=1008998.78;
                   int  p=(int)x; //  cast is required 

		Casting in reference data type
               -- according to inheritance we can cast 
			       
				   Number 
				  /    \
              Float    Integer

               Float -is having no inheritance with Integer 
                 		so we cannot cast from Integer to Float and vice versa   

		   
		 
		   in  higher range we can assign lower range value 
		  
		   
		   Integer 
		         byte ---------------   java.lang.Byte 
		         short ----------------  Short 
		         int ------------------- Integer
				 long ------------------- Long 
				 
				 
		
    incomtabile type cast cannot be done 

      data type is checked at 2 times 
            1. compilation 
            2. run 			
			
			
			
			Dog is an animal   correct  
			Aniaml is a Dog     incorrect 
			Man is a social animal
			
			
			Animal
			  |
			  Dog
			  
			  Animal is a Dog --- jvm   error 
			
			
			Dog dog=new Dog();
		Animal animal=new Animal();
		animal=dog;//dog is a animal 

		dog=(Dog) animal;//animal is a dog // error 

			
			
			
			polymorphism 
			
			   -- one interface with multiple forms 
			   
			   one person --- 
			                 office -- employee
							 bus    -- passenger 
							 home   -- father 
							 hospital -- patient 
							 
			     two types 
				   1. compile time ploymorphism 
				   2. run time ploymorphism
				   
				   
				   
				 method/function overloading
				 
				 one function can be implemented in different ways 
				    -- overloading the methods/ function 
					
					
					
					
					
					final ---  
					      class 
						  variable
						  method 
						  
					  not const keyword


                         final  
						       3 context 
							   class 
							   variable 
							   method 

                      final variable -- it works as constant.
                                       value can not be changed 
                      
                    inside  method
                           local variable can be only final 
                           it cannot be public, protected, private,static, abstract 
                        

                   final method 
				              these methods cannot be overriden 
							  
							  
				  final class 
                         cannot be extended 
						 
						 
						 
						 
						 inner class 
						    -->a class inside the other class 
                            -->it is used as the member of outer class
							-->inner class can be 
                                                   -->private 
                                                   -->public 
												   -->protected
												   -->static 
												   
							--> it is used as helper of outer class
                            --> it can access the member of outer class 

                            static inner class
                                  can have only static members 
 								  called as nested class
							
                           anonymous inner class 							
			  -->when object of abstract class and interface
              -->it will create anonymous inner class 
		      -->it will give you single object 
			  -->we cannot create multiple object for anonymous inner class
			  --> anonymous inner class can be create inside a class or inside method, main method 




     Comparable   -- sorting facilty 
	               compareTo()
				   all classes Integer ,String , Float have implemented this to have sorting facility 
				   
	 Comparator 
	    class HelloMain implements Hello{
			public void disp(){}
			 main(){
				 HelloMain h1=new HelloMain();
				 HelloMain h2=new HelloMain();
				 HelloMain h3=new HelloMain();
			 }
		}
	    interface Hello{
			void disp();
		}
	   class Outer {
		   class Inner{}
		   Hello h1=new Hello(){
			  public  void disp(){}
			
		   };
	   }
								  
								 
								  
								  2 types of methods
								     
									   concrete/normal method()
									      full implementation of the class
										  it has body 
										  method(){
											  
										  }
									  abstract method
                                            is not full/complete method
											denoted as 
									method(); 									  
								  
								  
								  
								  abstract methods can be kept in abstract class 
								  
								  
				abstract class 
                           -- has concrete and abstract methods 
                           -- it is used as super class
                           -- it cannot be instantiated
						   -- can have constructor 
						   -- it is not real time object 
						   
						   
						   
						   abstract Employee 
						      abstract getNetSalary()
							  
						      1.Manager  --- 
							  2.Clerk
							  3.Developer 
							  4.Director
							  5.Trainer 
						   
						   
						   interface 
						       -->100% abstract class 
							   -->by default all methods are 
							          public and abstract 
							   -->we cannot declare concrete methods
							   -->by default all variables are 
							           public static final 
							   --> no constructor
							   --> no instantiation 
							   --> can be used  by sub classes
							   --> implements key word to implement the interface 
							   --> one class can extends one class but can implement
							       multiple interfaces
								--> one interface can extends one or more interfaces 
								
							
                            multiple inheritance feature 
							  subclass can have more than one super class
							  
							  
							  
							----------------------------
							
							Account 
							 |
							 1.Saving Account 
							 2.Current Account
							 3.Corporate Account
							 
							single inheritance
                              one super class can have multiple sub class but sub class cannot have more than one super class 							
							 
							 
							
							abstract class 
							     super class 
								    abstract method, 
									concrete method
								constructor
                                 instance, static variable 



                             multiple inheritance
      							
                               phone 
							   basicphone--> phone
							   basicmobile --> phone, basicphone
							   smartphone  --> phone,basicphone,basicmobile
					     	phone 
                        /      \						
                       /      	\						
				basicPhone		 \
                        \         \
						  basicMobile		    
                              							 
							   
						      
						   
  package -- collection of classes and interfaces 
             with access permission 
   
   system defined package 
   
   -->  java.lang ---------- Integer, Float, Double,String 
        is present by default to all the classes
   
   -->  java.util
           it have util operation related classes
		   Date 
		   Scanner 
  
  -->  java.net 
  -->  java.io
  -->  java.sql 
  
  
  package name should be meaning ful
  
  com.capgemini.model/bean 
  com.capgemini.util 
  
  com.capgemini.main 
  com.capgemini.dao 
  
  throw  -- create exception object then throw it 
  throws  -- declare about different exception method is having 

  
  
  
  
    interestCalc()
      |
	  |
	  Exception Object 
       |
       |
     main
       | catch 
       |   --- rest code will execute 
       jvm 	   
   
  

	  
	  Integer x=100---------------> heap (obj1)

      x=null;---------->c, c++ free() and destructor
	  
	    memory will be released by gc (garbage collector )

	  
   literal 
   
       values assigned to the variable 
	   
	    1234  -- integer literal
		
		"hello" string literal
		
		
		String class 
		  -->  all string literal are string object 
		  -->  it is array of string character 
		  -->   string is constant 
		  -->  its value cannot be changed 
		  -->  it is immutable 
		  
		  
		  
			 
		""  String object 
		"hello" String object
		       heap -- object creates
			   
			 String Pool 
			   -- all objects are created in the heap 
			   -- string literlas are created in string pool which is inside heap 
			   
			   ____heap_____________________________
			   |                   |
			   |   |-----|         |
			   |   |  cat|         |
			   |   |     |         |
			   |    string pool   |
			   |   cat            |
							   
			   
	String s1="cat"  -- cat object in string pool 		   
	String s2="cat"  -- cat object in string pool
      2 reference variable
      1 object 	  
			 
	String s2=new String("cat")	
		
		==    checking  if references are equal 
		.equals -- check the object 
		
 

String is immutable 
   -- cannot make changes in the string object 
   --
   
   If frequent changes are required in string
        
     StringBuffer 
	          -- string literal 
              -- no string pool 
              -- mutable 




  autoboxing 
  
  





			
delhi 
delhi 			

delhi 			
celhi				d-c --  > 1				  

delhi 			
dflhi				e-f  --> -1 				  
								  
							
delhi
delhk   i-k  --->-2
							
								  
								  
								  
								  
                                   

							
							



	java.util.Date 
     Date class 
	 -->    new Date()  ;-- current date and time 
     -->    date start from jan 1 1970 
	 
							
							

  Employee
         id,
         name,
         salary 

  emp1--- write to file --- save the state of the object 
  emp2
  emp3  
                  						
					
			serializable --- 		
			Serializable  ---- add the capability to the class to 
			  serialize(save the state) of the object 
			  
			serialization 
                 saving  the state of the object in the file 
            
			deserialization
                 read the object along with state from the file 
				 
    ==============================================================

     Collection  --- group of objects in a single unit 
	 
	   Array - group of same type of objects 
	   
	   
	     collection 
		              --> add object 
					  --> retrieve obejct
                      --> remove object
                      -->  transfer object from one method to other     method 		method 

    bag -->  keep different type fo stuff 					  
					   
					   --> array size is fixed, collection is autogrowable 
					   --> collection algorithm sorting, searching 
					   --> data structure implemented in the form of class 
					   
					   
	   
	    Framework -- predefined structure with implemented data flow, algorithms
		
	   
	   Collection Framework 
	                     
						  api -- application program interface 
						    collection api 
							jdbc api
							net api
							
					
          Collection interface 
	      /  \    
		List  Set   interfaces
		
		List 
		   --> allows duplicate elements 
		   --> it has index support 
		   --> it is ordered 
		 
	  Set -- 
            no duplicate elements
            not ordered 
            no index support 
 			
   List interface 
      subclasses 
         ArrayList 
		 Vector 
		 LinkedList 
       
	   ArrayList 
	         added in jdk1.2
	        -- generic array
			
		 Vector -- legacy class
	     	       added in jdk1.0
                -- synchronized methods		 
		LinkedList -- all behaviour as of arraylist 
                   -- it allows operation at both ends
                   add
				   addFirst
                   addLast 
				   
                   remove 
				   removeFirst
				   removeLast
			     -----list 
				 
				    --  head
					--
					--
					--   tail 
			
	Generic 
          -- specialised data type
          -- class should be parameterized 
		  -- without generic it must give you runtime error  
		  
	  
  Iterator  -- interface 
               -- traverse or iterate elements
			   -- remove element   
	
	
	For each -- arrays, collection 
	                
					
					
					   it.next()
					1
					2
					3
					4
					5
					6
					7
					8
					9
 					   it.previous()
					   
		  Set --Interface  
            no duplicate elements
            not ordered 
            no index support 
				   
				   classes are 
				     -- hashset
					 -- treeset 
					 
			

       Product.java  -- model/bean  
            

       Set<Product> productset ;

  
	   DAO 
	      ---  Data Access Object 
		  --- separate layer for data work 
		  
		  --- CRUD 
		      C -- create 
			    add product into product set 
		      R -- Retrieve
                retrieve product data from product set 
              U -- Update 
                   update product data in product set 
			  D -- Delete 
                   delete product data in product set 
 
     Collection   Interface 
	   |       \
     List      Set  Interfaces 
 1.ArrayList    1.HashSet 
 2.Vector       2.TreeSet
 3.LinkedList   3.LinkedHashSet
 
		
	Map--   
            interface in collection framework
			 extends the collection 
			key, value 
			 using key can access element 
			 no duplicate keys are allowed
			 
		implemented classes 
                   1.Hashmap		
				       -->elements are added according to hash algorithm
					   --> keys are not ordered 
					   --> allows  key and value to be null
					   
				   2.Treemap		
				       --> elements are added according to sorting of keys 
					   --> keys are not sorted  
					   --> allows  value to be null not keys 
					
				   
				   		Set<Entry<Integer, String>> entrySet = empMap.entrySet();
				  3.LinkedHashmap		
				       -->elements are added according to order
					   --> keys are  ordered 
					   --> allows  key and value to be null
							
		          4.hashtable -- 
				            -->synchronized 
				            --> not ordered
							--> don allows  key and value to be null
						

				  Entry -- interface -- single entry in the map 
				   
				   
				   Set<Entry<Integer, String>> entrySet  -- set of entry

      Collection--  super interface -- list, set have extended 

     Collections -- utility class  , sort , binarysearch, shuffle
	 
				   
				   
				   two utility  classes
				     1.Collections
					 2.Arrays 
					    
						
			 Collections works with list  			
              
            Arrays works with any array 
			
					methods are 
					    1.sort 
						2.equals 
						3.fill 
						4.toString
					   
					   
					============postgres sql =========


C:\Program Files\PostgreSQL\13\bin>psql.exe -U postgres
Password for user postgres:

postgres=# \l   -- list of databases 

postgres=# \c db1  -- connect with given database name
You are now connected to database "db1" as user "postgres".
db1=# \dt  -- show list of table 
          List of relations
 Schema |   Name   | Type  |  Owner
--------+----------+-------+----------
 public | employee | table | postgres
 public | student  | table | postgres
(2 rows)


db1=#\d tablename -- table structure 

create table customer(id int primary key, name varchar(20), location varchar(20))
insert into customer (id,name,location) values(10012,'ram kumar','chennai')
insert into customer (id,name,location) values(10013,'mohan kumar','madurai')
insert into customer (id,name,location) values(10014,'suresh kumar','ooty')
insert into customer (id,name,location) values(10015,'umesh kumar','karnul')
insert into customer (id,name,location) values(10016,'jitendra kumar','belgam')
select * from customer




Driver         -- bus driver ---- one point -- connect other point 
DriverManager 


   bus driver 
   train driver 
   car driver 
   flight driver
   
   
   
   step1. 
      load the driver 
   step2 
        get connection 
   step3  
        work with database 
	


Statement st=connection.createStatement();
	ResultSet rs = st.executeQuery("select * from customer");
			
			ResultSet  -- pointer -- for database record
                  pointer default position 
				  
				  BeforeFirst() --- no record -- default position
				  First
				  2
				  3
				  4
				  .
				  .
				  last 
				  afterlast
            			
						next() -- move to next record 


    select -- executeQuery
    insert , update, delete 
              executeUpdate




java(oop) --  jdbc --> database (sql)
			  
			
			  sql code from java 
			    |
			java database connectivity 
			  (api)
			    |
				|
				  (database/network protocol )
			 postgres
			 
			 
			 jdbc
			    Driver 
				DriverManager -- connection from database 
				
          step 1. 
		       load the driver 
			     2 ways 
				    a)DriverManager.registerDriver(new Driver())
					b)Class.forName("Driver")
     			 
			step 2 
			      getConnection 
                    DriverManager.getConnection("url","username","pasd")				  
			step 3 
			     work with database 
				  Statement -- execute the sql query 
				               ddl sql 
							   dml--select , insert , update , delete 
                                							   
							   