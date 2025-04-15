singleton   -- design pattern 
            ==>it allows single instance to be created
            ==> static instance 
            
            
            java.lang.Object 
               super class of all the classes
               methods
                 toString()
                 equals()
                 
                all classes in java directly or indirectly inherits all methods of java.lang.Object
                
                 
            
            toString() 
                      return Class Code with hex decimal Code
                      
                      
                      
                      Spring 3 ways 
                        1. xml 
                        2. xml+annotation
                        
                        3. only annotation 
                        
                      
                      
                      
 (all data operation)  Dao  \      
                       |      \     
                       |         model
                       v         /
 (Error Handling)     Service  /
                       |
                       Client (Presentation Layer)
                      
                      
                      
                      
                      
                      Dao -- @Repository
                      Service -- @Service
                      
                      
                      
                      
                      
                      
                      ORM   Object Relational Mapping 
                      
                 Book.java         ---->  table book            
                   isbn                      isbn
                   name                      name
                   cost                      cost 
                   
                   book1
                    set
                    Save(book1) ---- insert book1 in book table 
                    
                    Hibernate 
                    Jpa  
                    
                      
                      
                      
                      