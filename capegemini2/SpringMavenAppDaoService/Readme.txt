3 interfaces for DI

BeanFactory
ApplicationContext
Resource

 
    BeanFactory
    ApplicationContext
    interface  has following  implemented classes
  
  1.  classPathXmlApplicationContext
  2.  FileSystemXmlApplicationContext
  
  
  
  Resource
  	 interface  has following  implemented classes
	  1. ClassPathResource
	  2. FileSystemResource

	  
	  
	  
	  
	  
French    Hindi    Jerman
	  
	User Form  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  @Component  
	    class Employee{
	  }
	  
	  Employee with object employee
	  
	  
	    @Resource(value="dao")
	 class EmployeeDao{
	  }
	  
	 	  
	  EmployeeDao object with  employeeDao
	  EmployeeDao object with  dao
	  
	  
	  service-- @Service
	  model  -->@Component
	  dao  -->  @Resource
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  