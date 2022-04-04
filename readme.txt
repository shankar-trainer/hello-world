software link 
https://dlcdn.apache.org/tomcat/tomcat-9/v9.0.62/bin/apache-tomcat-9.0.62-windows-x64.zip

slide link 
all capg slides

https://drive.google.com/drive/folders/1zghlY-5zxokVE_tzrgDZoMhXHL3kVwUC


corejava 
https://drive.google.com/file/d/1MDUPD1dTC05weGJ6LmO-in2YvevNoKD7/view?usp=sharing
https://drive.google.com/drive/folders/1M-dnYiUl287n7gVqex_G3wGODyRzctaO?usp=sharing


agile slide 
https://drive.google.com/drive/folders/1RO8vAlkgbyaE3Lt-2rEvuoeu4pBGYkm9?usp=sharing

mysql 
https://drive.google.com/drive/folders/1NZCsd6FEd-cZkeaso8d87FaggBJaMdJG?usp=sharing

jenkin git/svn 
https://drive.google.com/drive/folders/1GnMAflZ3PcwNX_OV0Wygy5W1o0dAXEex?usp=sharing 



git link 

https://github.com/shankar-trainer/hello-world/tree/capg_feb22_gcp/corejava/src

jdk   java development kit (javac + java )
jre   java runtime environment (java interpretter)


jdk --  

  compiler +interpretter 
    
	  platform independent 
	 
  compiler   (javac) -- .java -- compile-- .class

  interpretter (java ) -- .class -- machine code -- o/s 
  
  
  eclipse 
    ide   -- integrated development environment 
	       -- advance version of text editor 
		   -- compile and run the code 
		   -- make project 
		   -- intellisense support 
		   -- eclipse incremental compilation 
 eclipse has own java compiler 
 integrated jre to run the program 



   --> a .java file can have multiple classes 
   -->  single class can be public by which it is saved with file name
   
 -->  java high level language 
 -->  everything is class
 -->   
 
 
 
 
    java -- primitive data types
	        int 
			 char 
			 float 
			 short 
			 
			 
			 
			 Integer 
			    byte 
                short
                int 
                long 

            Decimal 
             float 
             double --- default 			 
			
				
			char 
            
            boolean 
			
			
User Input 
Scanner class
   method 
      nextInt()  -- int 
      nextFloat()  -- float
      next()       -- single word
      nextLine()   -- multi words	  
			 

Local variable 

    declared indide the method 
    cannot  have any modifier other than final 
    it can be only final 

    it has no default values 
    so must be initialised before using 


int -- 
  values of 
            decimal ---  0 -9  of 10 digits
            binary   ---- 0,1   of 2 digits
            hexadecimal  -- 0 -9 a-f (total 16 )			
		    octal       0 -7   -- total 8 digits 
			
			
			
			primitive  ----  class  
			Integer data type 
			
			byte -------------------------- java.lang.Byte 
			short ------------------------- java.lang.Short 
			int  ------------------------- java.lang.Integer 
			long  ------------------------- java.lang.Long 
			
			
loop  
   is iterative statement 
   it works in iteration till condition is true 

  types 
     -- while 
     -- do while 
     -- for loop 
     -- for each loop 


  while loop 
  
     -- top tested 
	 
	 syntax
            counter variable 
			
		   while(condition){
		   
		   }	 
	 
  for loop
   -- top tested loop 
   -- easiest loop 
   -- decalre counter variable, counter condition check, counter inc/dec at one place 
   
   
   recursion 
   
      function will call itself til it has value upto 1
	  
	 int fact(int b){
	  if(b<=1)
	   return 1;
	   else 
	   return b*fact(b-1);
	 
	 }		
			
     
	 b=5
	 
	 return 5*fact(4*fact(3*fact(2)))
	 
	 
	 
	 nested loop
	 one loop iniside other loop 
	 
	 *
	 * *
	 * * * 
	 * * * * 
	 
	 do while
	 
	    --> post tested loop
	    --> condition is checked in the last 
		--> it will execute at least once if the condition is false
		
		
		z=1234
		rem=z%10;
		
		
		
	object oriented programming

    1. class and object 
     
    features og the oop are 
     inheritance 
     ploymorphism
     encapsulation 
     abstraction 


strutcure oriented programming 
    ---  dealing with structure 
    --- variable and function 


 class -- collection of obejcts having  similar properties and behavious 

 object   
      instance is class 
	  real time entities 
	  
	  
	  
	  
	  Employee --- collection of lot of employee 
	            each employee is instance / object of the class
				
				
				
				class Employee {
				   id            
				   name 
				   location 
				   
				    work()-- behaviour 
				
				
				}
				
				
				class is conceptual entity 
				object is real entity 
				
	  class Employee 
	          
			 emp1, emp2 
			  object will have one copy of all attributes and behaviour
			  
			  
			  private members can be used with in the class not outside the class
			  
			  
			  
			  
			  Encapsulation 
			  
			  all data (properties) should be hidden 
			  it shoule be exposed to the outer world using public method 
			  
			  
			  capsule -- data (hidden)+code(method)
			             bind the data with code 
              
             			  
			  
			  
			  Constructor 
			      -- private 
				  -- default 
				  -- public 
				  -- protected 
				  
				  
				  
				  default constructor 
				     -- each object have same values 
				  overloaded constructor
				     -- each object will be having differrent values 
					 
				  
				  
			  
			  
			  
			 primitive          reference data type/classes

              int ------------>java.lang.Integer 
              float -----------> java.lang.Float 
              char   ----------> java.lang.Character 

primitive data have 
     no attributes and methods

but  class have attributes, methods 






int a1,a2,a3,a4,a5,a6,a7,a8,a9,10

int ar[]=new int[10];
ar[0]
ar[1]
ar[2]
ar[3]
ar[4]
ar[5]
ar[6]
ar[7]
ar[8]
ar[9]


initialisation    of array is done in 2 ways 

 1. int ar1[]={1,2,3,4,5};
 2. int ar2[]=new int[6]; // each element with zero 
 
 
 
 
 for each loop 
     -- easier than for loop 
	 -- used with array , var args
	 for(int d:ar){
	   
	 }

	 
	  
	instance -- separate attributes/methods 
             -- all object is having separate copy 
       id
       name

  static -- common attributes--single copy  shared by all the objects 
         -- each object is sharing the single copy 
   city  	   
  country name 
  interest rate 

  bus 
  
	  
    
constructor types 

   2 types 
     a) default constructor 
            has no arguments 
			initialise each object with same values 
     b) overloaded constructor 
            has arguments
			initialise each object with differrent values






Question 

 Write a  program to implement BankAccount.
 Write a class with constructor to initialise accountNo, customerName,transactionType,
 tran_amount, balanace amount.

  Add two member method to update the balance  based on the type of transaction
   (withdraw, deposit).
   
  Display the customer Information with balace amount 
  
  
  in a class we can have one deafult(no argument) constructor and many overloaded constructor
  
  
  
  in any constructor in first line either we can use super or this 
    super() -- calling super class constructor
	this()  -- call current class constructor 
	
	
	
	
	Method overloading 
	
	   -- you can have one method in multiple forms with differrent argument 
	   -- methods can be overloaded with different argument 
    
	Wrapper Class 
  primitive         class 
     int -------   Integer 
     float 	       Float 
	 short -------Short 
	 
	 
	 
	 Boxing   -- primitive to wrapper 
	 Unboxing -- wrapper to primitive 
	 
	 
	 autoboxing -- boxing+unboxing 
	 
			
			
	
	
	System.out.println();
	
		// java.lang.System
		
		    public static final PrintStream out = null;
			
System.out.println()

java.io.PrintStream
  println()
  print()
  
  
 static import 

  import static members 
   -- after import write static methods, variable without class name
   
   
   java.lang.Object 
     |
   Animal -- super, base, parent   class 
     |
	Dog   -- child , derieved, subclass, extended  class 
	
	Dog is a Animal 
	
	
	Employee 
	 |
	Manager 
   
    Manager is a Employee 
	
	oveeriding 
	  equal or higher access modifier 
	
	private 
	default 
	protected 
	public 
	
	
	
	oop features
	
	  encapsulation
	  inheritance
	  ploymorphism
	  
	     -- one interface with multiple forms 
		      -- compile time ploymorphism
			overloading
			  -- one method in multiple forms 
			  
			  
			water -- liquid, gas, solid 


            run time ploymorphism
             --- Patient
             --- Passenegr
   Person 	 --- Father
             --- Employee 
			 
			 
			 
			 this and super 
			 
			 -->this is used as current class reference 
			 -->using this you can call instance variable, instance method  
			 
			 super 
			     -- super class variable and methods 
				 
	
      Exception 

        try 
         catch 

        finally block 
        after try and catch we can add finally block 
        it is executed every time if there is exception or no exception

       if some resouces/connection must be closed  add it to the finally block 

      throws 
	     -- declare the exceptions present in the methods
      throw 
          -- throw new Exception Object (optionally with message )




                                   caught by 
   player1 -----------------------player2-------------------------->player3		  
                                    rethrow 

    input --------------------------->main  
    input  (caught exception) ------XXXXXXXX--------------------->main 
	
    input  (caught exception) ------re throw exception--------------------->main  
      	   
   
   
   
     build tool -- ant, maven, gradle(c, c++ android java groovy)   
	    -- build the whole application
		-- compile, execute the application
		-- create project, set classpath 
		-- dependency management () 
		
		
		
		jar --- java archive-- collection of classes 
        war -- web archive 	 	collection of classes , html ,.js, css
		
		
	String class
         -- immutable  in nature 
         -- fixed character length 
        

    String name="ram kumar";
	"".
		
   STring literal   -- "" "hi"
               are object 
			   
		
		
		
   Integer 
   
   byte 
   short
   int 
   long 
   
   
   Decimal 
     float 
	 double 
	 
	 


Reference Casting 

    follows inheritance hierarchy 


     
 Employee 
     -- salary() {   ------------- 
	    System.out.println()
	 }

 Manager  extends Employee 
        -- override salary()
 Clerk  extends Employee
        -- override salary()
 
 
 Employee 
     void salary() ;  // abstract method with no body  

Absract class 
    abstraction -- essential methods should be decaled as abstract methods in the class

  abstract class can contain both methods abstract and normal/concrete methods 
  
 
 abstract method 
    required method with no body 
	 
	--> abstract methods can be defined in abstract class 

 Normal class cannot have abstract method
   -- abstract inherited method must be oveeriden in sub class 
   
 
interface 
     -- extended form of abstract class 
	 -- 100% abstract class
	 -- all methods are abstract, public in nature by default
     -- multiple inheritance 
     -- all variables are by default public static and final 
     --  implements keyword is used to extends the interface 
     -- one interface can extends multiple interface 
     -- a class can extends only one class but can implement multiple classes 
  	 
	 
	 
multiple inheritance
    -- one subclass has more than one parent class 
	
	
	
Mother    Father 	 
	 \     /  
	 Student
	 
	


String 
   -- a constant  sequence of character 	
   -- String literal is also object 
   -- immutable (not modfiable)

String objects are   
 ""   -- it has methods and attributes
 "a"
"abc" 
 
 String literal  --- object in string pool 
	
	
	String s1="hello"      -- string pool -- obj1
	String s2="hello"      -- string pool obj1
 	


	String s3=new String("hello") -- outside string pool -- obj2
	
   s1, s2 -- referes same object 
    s3 refers  differrent object 

  ==   -- double equal  checks references
  .equals -- checks content   
	
   
   java.util.Date
   
   Date  --
   
   
   
   
   
   Objects 
   
       in a table 
	   
	     each object has hashCode
		 
		 
ARRAY  -- HAS FIXED SIZE 
         same data type 

Collection -- group of objects  as a single unit 
              transfer gr of objects from one class/methods to other class/methods
			  
          -- size not fixed 
		  -- auto growable 
		  


java 5 


  generics 
   
   Collection should be generilised with specific data type 
   
   
   List  interface
        sub classes    
        -- ArrayList 
		-- Vector
        -- LinkedList-- 

      featues:  
        -- ordered 
		-- duplicated
		-- index 
		
		
  Set 
      featues:
      -- not ordered 
	  -- no index support 
	  -- no duplicate 
	  -- no get method 
	  -- support of for each, iterator 
	  
     subclass 
	     -- hashset 
         -- treeset 
         --LinkedHashset 	
		 
   		

		Map -- java.util.Map 
		
		    it works on key and value 
			 
			 
			 a -- apple 
			 b ---boy 
			 
       -- classes are 
	      -- hashMap 
		  
		  
		  
		  
		  Functional Interfaces
		  
		   Function<T,R>  -- it accepts input as T and return as R 
		   
		   IntFunction<R> --it accepts only integer and return R 
		   DoubleFunction<R> --it accepts only double and return R 
		   
		   ToIntFunction<T>-- accepts T type but return only integer 


Database Management System(dbms) 

Database -- to keep the data  in table 

      table -- name 
               fields 
               record -- horizontal data 

     
Employee -----  Department ----- Transaction 
  



		   

    
	
	inner class 
	      -->a class inside other class 
		  -->inner class works as members of outer class 
		  --> inner class can access the member of  outer class
		  --> inner class can be private, protected, public 
		  
		  it's of 4 types 
		     a.inner class 
			 b.static inner class/nested class 
			 c.local inner class 
			 d.anonymous inner class 
			 
			 
			1. inner class 
			2. static inner class 
			        inner class having static member must be static 
			3.Local Inner class
			
			4.Anonymous Inner class 
			
			
			
			lambda expression 
			   --- extended form of anonymous inner class using interface 
			   --- interface having single method (functionl interface)
      			   is  used as lambda expression
				   
				   
				   
			Runnable Interface is Functional Interface 
			
			Comparator Interface 
			


   Thread 
      --- Thread can be created in 2 ways 
	       1. extends Thread class
		   2. implements Runnable interfce 
                   Runnable  -- single method run 
				   
				   Thread  --- start, stop, 
dead lock 


    pen 
	ball

kid 1   got ball and crying for pen 
kid 2   got pen and crying for ball 




  100 developer in project 
      
	  code by each developer -- keep on central location 
	  
	  


git configuration 


git config -l    --- it will list all configuration 

set these values 

C:\Users\admin>git config --global  user.name "ram56667"
C:\Users\admin>git config --global  user.email "ram@gmail.com"

-- steps after new repository 

create a new repository on the command line
echo "# capg2022" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/shankar-trainer/capg2022.git
git push -u origin main
…or push an existing repository from the command line
git remote add origin https://github.com/shankar-trainer/capg2022.git
git branch -M main
git push -u origin main



===========
master is the main branch on your local system
origin is the main branch at cvs(remote/server)



 steps done
 
 step0
  $git init 
  
 step1 
 $notepad README.md
 
 step2 
 $git add README.md
 
 step3 
 $git remote add origin https://github.com/shankar-trainer/capg2022.git
 
 step4 
 $git commit -m "readme.md"
 
 step5 
 $git push origin master 
 
 

git pull -- pull the files from the cvs 

clone -- make the clone of repository to local system and it will initilise repository and pull

clone= init+remote add+pull



git branch --> the current  local branch name 
git branch -r --> show all remote branches 



git branch branch_name --> this will create a new branch 

git checkout branchname -->it will change the branch to given name 


  new created branch will inherit all files from master branch 
   add new files to the branch 
   
   commit it 
   
  steps  
  
  git  branch corejava
  git  branch adv_java
  
  git checkout corejava -->switch branch to corejava 
  notepad factorial.java 
  git add *
  git commit -m "factorial"
  git push origin corejava 
  
 --> pull files  in same branch
     git pull origin master  
  
  --> pull the branch 
  
   git pull origin corejava --> it will pull the branch corejava 
   
   delete branch 
   
   git branch -d branch_name 
   
   
===   merging  the branch ===
   
   checkout to master branch 
   git merge branch_name 
   
  
   git branch 
     --> *corejava 
         master 

   git checkout master --> switch to master branch 
   git merge corejava  --> merge the corejava into master branch 
   
   
   git diff ---> show the difference in content  of the previous stage and current stage of the file 
   
   
   
   
   
    
   
  
jdbc 

CRUD 

             sql 
C-- Create   -- insert 
R-- Retrieve -- select
U-- Update   -- update 
D-- Delete   -- delete 




 ResultSet -- after execute query itr contains records 
 
      -- before first -- default position -- no data  
	     1st   -- data  
		 2nd 
		 3rd 
		 
		 .
		 last 
		 afterLast 
      

  
  



ORM --- Object Relational Mapping 

    
	mapping of java object ---- with relational database 
	
	
	
	
	Employee.java  ------ orm ------ Employee table  
	   id                              id
	   name                            name
	   salary                          salary 

    emp1 
	
	
	90% database problem is solved by orm 
	
	
DAO layer 
	
main method file is client file 
client file should be light weight 

all database operation should be done in a separate file having interface and its implementation

this is called as DAO layer 

dao layer can be callled by any application any no of times.

dao layer is having all CRUD operation
                  sql 
C  -- create  -- insert 
R --  retrieve -- select 
U --   update   -- update 
D -- delete     -- delete 






layered application 

		layered application  architecture 
		
		dao layer 
		service layer 
		exception layer 
		client layer 

    



   @oneToOne
book --- author

   @oneToMany
book --- bookorder

table 
  -- 1. book 
  -- 2. author 
  -- 3. bookorder 
  -- 4. book_bookorder ()
  
  

      Account 
       accountid, location
	    actType-- discriminator 
		
Saving     Current


Spring 

    Enterprise Solution 
	
	 ejb is first enterprise solution 
	 
	 
	 ejb is complex 
	 ejb requires heavy application server to run 
	 no unit testing 
	 
	 client forced  to use ejb 
	 
	 ejb server like oracle server, weblogic, web sphere   charge very high 
	 
	 
	 ejb architect  rod johnson 
	   -- simple solution having all failities of ejb in the form of spring 
	   
	   
	   <bean class="com.capgemini.beans.HelloWorld" id="hello1">
    
    </bean>
	
	
	HelloWorld hello1=new HelloWorld();
	
	   
	   @Repository 
	   
	       -- this is used to create the object of dao layer 
		   
	  @Service 
           -- this is used to create the object of service layer 





    DAO   --- layer having all database operation  
	SERVICE -- layer  uses dao and give the services to the client 
	
	
	
	Pizza----

      DAO           \               -- kitchen
       |             \
       | Exception      -- Bean
	       |          /
	  SERVICE --   	/              -- counter 
	   |         can throw   error 
	   |
       |	   
	Presentation Layer(Client) -- user input / display output 
	
		   
	   
	   
	   Railway Ticket 
	   
	     \     
		paytm  amazon irctc 
		
		
		
		
		DAO     -- @Repository 
		SERVICE -- @Service 
		Bean    -- @Component 
		
	Install  Eclipse Plugin 
	 Eclipse Enterprise Java and Web Developer Tool 
	 
	 
	 
	 
	 Corejava application -- it runs in command prompt 
	 
	 WEB Application 
	 
	    html, css, javascript -- web component 
		java , jsp 
		
		maven -- war file (web archieve)
		
		it will run on tomcat server -- using browser 




     to create dynamic web application   
        servlet/jsp 


   spring -- spring mvc


   MVC 
M  --model -- java file 
View  -- html jsp (java server pages )
C     -- Controller




Client-- html -------------- request ---->>>> Server(process) 
   client  --- <<<------    response<<<----- 
		