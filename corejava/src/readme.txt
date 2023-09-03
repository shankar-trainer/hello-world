public
protected
defualt 
private 

 Overriding 
     -- no weaker access modifier
     -- same or hihger access modifier

Cannot reduce the visibility of the 
inherited method from Computer  

this and super 
   this -- current class reference
   super -- parent class reference
   
   
   static method is not overridden
   but it can be re written 
   
   
   inside static this and super can not be used
   
   constructor is not inherited.
   it is called by the super() keyword    


  Reference Casting 
  
    -- allows casting in inheritance hierarchy.
    
    abstract class 
    
         super class with abstract method
         abstract method has only declaration no body
         
         it gives abstraction feature
         
         abstraction -- class should have essential methods(abstract methods)
         
         abstract class cannot be instantiated.
         
         abstract class can be sub classed.
         
         abstract class can have constructor, abstract methods and non abstract
         
         
    interface 
             -- 100% abstract class 
             -- it has only abstract methods, no concrete methods 
             -- all methods are by default public abstract
             -- multiple inheritance 
             
             -- one interface can extends multiple interfaces
             -- one class  can extends only one class but it can implements multiple interfaces
             
             -- can have only class variable 
             -- by default all variables are public static and final
             
          in sub class abstract class is used by extends key word
          in sub class interface is used by implements keyword 
                     
         
         
IndexOutOfBoundsException         
   |
   1. StringIndexOutOfBoundsException
   2. ArraysIndexOutOfBoundsException



Exception Handling 

    on abnormal situation it creates exception object and throw it.
    
    
    throw new Exception();
    throw new RunttimeException();
    
    
    









Collection Framework 

  Collection
     |

     List  duplicate, index, ordered
     Set  -- no duplicate
     Map 
 	 
	 
	 List interface 

       classes
	      ArrayList 
		  Vector   legacy(old) 
		  LinkedList 
		  
        	 
			 Vector is old class 
			   it is synchronized 
			   it is slow 
			   
			 ArrayList has come as alternate of Vector
                 ArrayList is faster
                 ArrayList is not synchronized



java 7 
 Date 
     java.util 
	 
	 it gives both date and time 
	 it is mutable 
	 
	 it starts from 1970 
	 
	 
	 
	 
	 jdbc 
	    -- select * from table 
		    
			  beforeFirst -- default position(no record) 
			  first 
			  2 
			  
			  last 
			  afterLast 
				
		ResultSet 
		  have multiple records 
		  
		  ResultSet has pointer  for the records 
		   pointer by default points to  beforeFirst
		   
		   move to first or next record 
		   first()
		   next()
		  
		
 
 
 			 create table employee(id int primary key, name varchar(20), salary float(10,2));	 
	    

      