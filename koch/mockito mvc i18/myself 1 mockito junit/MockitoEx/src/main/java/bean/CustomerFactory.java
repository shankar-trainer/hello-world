package bean;

public class CustomerFactory {

      Customer cust;
      public   Customer createCustomer(){
           if(cust==null) {
               cust = new Customer();
              cust.setCid(10001);
              cust.setCname("arvind kumar");
              cust.setCsalary(34000);
           }
           return  cust;
      }

}
