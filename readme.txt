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
  
  
    
			
			
			
	