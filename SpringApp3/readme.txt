com.coforge.model;
     User 
   
   
com.coforge
     UserMain    
     
     
     @Component 
     @Autowired 

     
     @Service --- service layer 
     @Resource  --- dao layer 
     
     
     Layered Architecture 
    
      
      model   Customer 
         |
      dao    CustomerDao 
      |
      service -- handling error 
       |
      client  
      
           
      
      
      
   
    
    
    
     
     
     