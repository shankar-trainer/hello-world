

customer 
   id
   name
   product
   cost
   
   buyProduct()
   productPayment()
  

student -- 
    roll
    name
    subject
    marks
  
    study()
    exam()

class --logical entity 
         collection of object 
object 
      -- real time entity
      -- one copy of attributes and methods 
	  
	  
	  
	  
	  
	  
	  employee
	  student
	  book
	  
	  
	  employee 
	    attributes (id,name, salary)
		methods(work, travelling )
		
		
		student(roll,name,subject,marks )
		         study()
				 exam()
	  
	  
	  
	  
	  static  --- common to all objects 
	  
	      State- static 
		  Country -- static 
		  CompanyName  -- static 
		  
		  variable   -- static variables or class variables 
 
		  methods    --- class methods 
		   
		   static variable and methods -- classname.variable
		   classname.methodname 
		   
		   so no object is required 
		   
		   --> static members can access static members directly 
		   --> to access no static members object is required 



"hello"  --- string object 


""--- string object		   



  heap  --- String pool 
  
  String s1="hello world";
  String s2="hello world";
	
  s1 and s2 -- 

  String s3=new String("hello world");  --- heap 
  
  
  ==  -- checks reference variable
  
  .equals -- checks equality 
  
 
  
  ---  
    for frequent changes 
	    StringBuffer -- mutable in nature 
 
    In String  String lireral is object 
    in StringBuffer String lireral is not object 
	
 
  reverse()
  delete()
  append()
  



int      --------> Integer
short    --------> Short 
byte     --------> Byte 
double   --------> Double
float    --------> Float 


Integer x=new Integer(100);  // primitive to wrapper class -- boxing 
         -- object 

x++;  // x is object -- arithmetic operation cannot be done on object 

int p=x.intValue() ---- wrapper class-- primitive -- unboxing 
 



  auto boxing 


Integer x=444; // primitive to wrapper
x++      // wrapper to primitive



casting 
  byte b1=34;
  int x=100;
  
  x=b1;// implicit casting  -- widening 
  
  
  
  
  static -- common 
  
         -> it is created before the object in the jvm 
		 -> it's one copy is shared among all objects 
		 
		 
	3 scenario

      --> method 
      --> variable 
      -->  block 
	  
  
  


String 

     "hello"--- string object 
     immutable in nature 
	 
  
    String s1="hello";
    String s2="hello";


    s1-------  string pool
	s2 -------


static -- common methods, attributes

       employee
	      instance variable
     		  id, name, salary --- each employee will have one copy of id,name,salary
	   static or class variable	
   		country -- single copy will be shared by all the objects 
        state  --		
  
 
  "hello"  -- string object 
  
  immutable  -- not modifiable
  
  
  
  oop feature 
  
    1. Encapsulation (bind the code with data, all data private)
	2. Inheritance 
	
	
	student is a person 
	
	dog is a animal 
	 dog  -- sub class, child class , derieved class 
	 animal -- super class, parent class, base class
	 
	 
	 
	 person (id,name,age )
	    |
		|
		v
	student 	
	
	 code reusability feature 
	 
	 
	 
	 Animal 
	   
	 |   |    |
	 Dog  Cow Bird
	 
	 
	 
	 
	 
	 
	
	
	manager is a employee 
	
  
  employee --super, parent, 
    | \
	|  \
	v  clerk
	manager -- child, sub class
 
    
   non private attributes and methods can be inherited

   final  -- with class name -- cannot be extended 
             variable name  -- constant 
			 method name --- cannot be overridden
			 
			 
			 int -------------------- Integer
			 float ------------------- Float
			 char ---------------------Character 
			 short -------------------- Short 
			 
			 primitive types -- no attributes, methods
			 
			 primitive  --> Wrapper class 
			 Wrapper Class --> primitive
			 
			 Wrapper class methods 
			 
			 Integer p1=new Integer(33);
			                       ---- Boxing 
			 no arithmetic operation  allowed over Wrapper class
			 
			   int r=p1.intValue()
			                        -- unboxing
									
									
									
									autoboxing 
									----  boxing +unboxing
									
									
			person (parent, base , super)
			   |
			 employee   --  employee is a person
                |   (child, derieved class)
			manager 	-- manager is an employee
			
			
			
				
			
									
									
		constructors are not inherited 


        each constructor has super() key word as the first line 
        super() calls super class constructor

		
			 
			 primitive data  type               reference data type 
			 int ------------------------------- Integer
			 float ------------------------------Float 
			 double ----------------------------Double 
			 
			 
			 primitive data type 
			 
			     are not objects 
				 so no attribute and methods 
				 
				 
				 
		Integer x=new  Integer(p);// boxing -- primitive to wrapper 
		
		int y=x.intValue();// unboxing  -- wrapper to primitive
		
		
		autoboxing =boxing+unboxing
		
		
		
		oop feature
		
		1. Encapsulation
		2. Inheritance  
		          -- a class can inherit the  attributes and behaviour from other class
                  -- code reusability 
                  
           parent , base, super class 


           child, derieved,  class 		   
		
		   
		   Employee-- parent class 
		      |
			  |
		  Manager 	-- child class 

  manager is a employee 		  
		 --- is a relationship 
		 
		 animal 
		 
		 dog 
		 
		 dog is a animal 
		 
		 	 
		 
		 
		 person  --- office  -- employee
		              train  -- passenger 
					  hospital  -- patient
				 
		
		polymorphism 
		  ---- overloading 
		  ---- overriding	 
			 
			 overloading 
			   -- methods overloaded with diferrent parameter and no of argument 
			   
			 
			 
			 final -- 
			    variable -- constant 
			    method()  -- cannot be overridden 
			    class --  cannot be extended 
			    
			    
			    abst
			    
			
			
			player1 ----------------->-------player2---------->------------------------- player3    
			                                     rethrow 
			    
			    
			    
			 
			 
			 
			 java io 
			 
			 byte stream 
			 character stream 


              inputstream --- FileInputStream
              outputstream  --- FileOutrputStream
              
              
              DataOutputStream
              DataInputStream
              
              character stream 
                
                reader (abstract)--> FileReader
                writer (abstract)-->FileWriter 
                
                
              
ResultSet ---- all records 
       -- maintain the cursor 
       -- beforeFirst --  default position -- no record 
       1
       2
       3
       
       
       last 
       afterlast  
       
         Connection -- 
         
         common to the project 
         static connection --  single copy shared by all files 
         
DAO -->Data Access Object 
   --> insert, update, delete, select 
   
   CRUD 
   C -- create(insert) 
   R -- retrieve (slect)
   U -- Update 
   D -- Delete 
   
   
   
   



