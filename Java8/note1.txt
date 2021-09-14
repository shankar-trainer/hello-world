

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
										