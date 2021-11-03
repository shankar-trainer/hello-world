


EJB 
   --- Enterprise  Java Beans -- sun microsystem 
   --- 1st enterprise solution to the world
   
   transaction
   messaging 
   remote connectivity
   
   JMS 
   
   ejb2.1 -- 10 java file, 3-4 xml files 
   
   heavy application server 
   
   one of architect rod johnson 
   
   --- spring 
   --- j2ee without ejb


   java ee -- jee -- java enterprise edition 



spring core 
spring expression



Employee  has Address

class Employee {
  int id;
  String name;
  
  Address address;
  
  
  
  Coffee making 
     --- milk , coffee -- do urself 
	 
	 -- coffee machine 
	 
	 
}    

https://writexo.com/capg21


EmployeeInfo 


   main(){

   EmployeeInfo info=new EmployeeInfo();

}

<bean id="info">
    
    </bean>


scope -- singleton 
        single instance -- will be shared 
scope -- prototype
         each bean will be having differrent instance'
		 
spring --- 

   enterprise solution 

   BFS-- banking and financial service 
          bank , insurance 

  Textile 
  Pharmaceutical 
  Transport 
  Hotel 
  Cement 

  Servlet and jsp -- 
  Struts --         web site 
  


   EJB -- remote interface 
   
   class  implements Remote{
   
   }

  POJO plain old java object 
  
   Hard Coupling 
   
  class  Employee {
     int id;
	 String name;
	 float salary;
	 	 
	 Address addr1;
	 Employee(){
	   addr1=new Address(10092,"new delhi","delhi);
	 }	 
  }
  
  
   
  class  Employee {
     int id;
	 String name;
	 float salary;
	 	 
	 Address addr1;
	 
    Employee(int id, String name, float salary, Address addr1){
	  this.id=id;
	  this.name=name;
	  this.salary=salary;
	  this.addr1=addr1;
	}	 
  }
  
  
  
  spring application 
  
  1. using xml 
  2. xml+annotation
  3. only annotation
  
  
  

  class Address 
    {
	 int pin;
	 String city;
	 String location;
	 
	 Address(int pin, String city, String location){
	 
	 
	 }
	}


class EmployeeMain{



}

rod johnson --- spring framework -- sold to vmware 

spring basics 
  spring core 
  
  spring mvc -- web application-- server -- html ,css, jsp , java 
  spring boot 
  spring rest 
  spring data 
  
  
DAO  -- data access object 
   data work in differrent layer
DAO layer 
    CRUD operation 
     C -- create -- addProduct --  sql -- insert 
     R -- retrieval  -- getAllProduct -- sql -- select 
     U -- update                         sql -- update 
     D -- delete     -- removeProduct    sql --	delete  
  
   
   List
   Set 
   Map 
   





   
   java code -- lengthy code 
   
    expression language   EL --jsp 
	
	Spel -- spring expression language 
	
   
   list -- lot of object 
            query over list, array
			first element, last element , arithmetic operation
			
	XML 
    annotation
	
	
	spring mvc 
	
	  M -- model 
	  V -- view 
	  C -- controller 
	  
	  
	  
	  Spring boot 
	  spring jpa 
	  
	  
	  Spring Rest  --   angular application 
	  
      
      spring --- mvc, rest, jpa
              loft of configuration 

     spring boot 
                 -- less configuration
                 -- fast development 
                 -- embedded  tomcat, database 

				 
				 @SpringBootApplication=
  @Configuration, @EnableAutoConfiguration and @ComponentScan. 	
   
   
   Restful application  
   
     -- Rest -- webservice -- url 
	 
	 @RestController 
	 
	 
	 
	 
	 
	 
	 ORM ---  object relational mapping  -- tool
	 
	   EJB -- hibernate -- jpa 
	   
	   JPA -- java persistence api 
	   
	   
	   Employee.java ------ORM----------  Employee table (database) 
	       
		   id                           -- id (pk)
		   name                         -- name
		   salary                       -- salary 
		   
		   
		   
	 JPA -- oracle 
	   spring jpa using jpa 
	   
	   
	 spring data  jpa 
       spring boot+ spring jpa --- > spring data jpa 
	   
   

     Rest ful web service 
     webservice --- 


     java app1 -----> dotnet, php , java 
          
		  types 
		   1. rest
		   2. soap
                    soap 
                          xml 
                    rest --- url
                 
   rest application -- java , spring, nodejs, dotnet 
                      output -- xml , json(by default), html 
					 
    

   spring rest -- using spring mvc 
   
					  
   @RestController 
     
   handler -- ResponseEntity ---->  required class -->  json 
   
   
   
   angular/react -- ui --------------data ----> restful application 
   
   
   two development
      1. UI ---
	  2. api (rest application)
   
		rest api---> json -- consumed by angular/react
		
	  

  
 

  
   
   
