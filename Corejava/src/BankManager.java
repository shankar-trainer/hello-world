public class BankManager  extends BankEmployee{
    float pf;
    float da;
    float hra;
    String location;
    
    float grossSalary() {
    	 float gross=salary-(salary*pf/100.0f)+
    			 (salary*da/100.0f)+(salary*hra/100.0f);
    return gross;
    }
    
    @Override
    void bankEmployeeInfo() {
    	super.bankEmployeeInfo();
    	System.out.println("\n\tpf  is :"+pf);
    	System.out.println("\n\tDA  is :"+da);
    	System.out.println("\n\thra  is :"+hra);
    	System.out.println("\n\tgross salary  is :"+grossSalary());
    }
	
	
	
}
