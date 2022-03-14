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
	 
	 


  	 
	
   
   
   