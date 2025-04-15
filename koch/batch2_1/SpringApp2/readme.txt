@Component
   -- class as component 
   -- create the instance of the class
   
   
   Spring  program is done in 3 ways 
   
   1. xml
   2. xml +annotation
   
   3. annotation
   
   java architecture 
   
     1. Dao layer (Data access object) -- all data related operation
         @Repository 
         
     2. Service Layer    uses Dao layer 
              if any error it will handle 
              @Service
              
     3. Client layer           


        Dao \
        |     \            
        v        ------Model
        Service/ --> Exception
        |
        V
       Client 






mysql> create database db1;
Query OK, 1 row affected (0.02 sec)

mysql> use db1;


mysql> create table employee(id int primary key, name varchar(20), salary float);


mysql> select * from employee;




  MVC 
  
   Model  java bean files 
    View   -- html, css (.jsp) -- java server pages
    Controller --  are java files --                          
    
                                                                    view
                                        Model                       regularUser.jsp
      View1    request                |                        / 
    Login.jsp-------------------> Controller-------------->  --/
                id                      checks type             \
                name                    regularUser              \specialUser.jsp
                userType 




     Client Browser -- html -------------- request --->>>>---- server -- process request
                                      ----<<response----
                                      

rt click pom.xml
   run as -- maven build 

 in goals 

spring-boot:run
                                      
           






