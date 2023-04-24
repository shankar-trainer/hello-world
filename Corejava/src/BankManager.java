public class BankManager  extends BankEmployee{
    float pf;
    float da;
    float hra;
    String location;
    
    public BankManager(int empId, String name, float salary, float pf, float da, float hra, String location) {
		super(empId, name, salary);
		this.pf = pf;
		this.da = da;
		this.hra = hra;
		this.location = location;
	}

	float grossSalary() {
    	 float gross=salary-(salary*pf/100.0f)+
    			 (salary*da/100.0f)+(salary*hra/100.0f);
    return gross;
    }
    
    @Override
    void bankEmployeeInfo() {
    	super.bankEmployeeInfo();
    	System.out.println("\n\t PF  is :"+pf);
    	System.out.println("\t DA  is :"+da);
    	System.out.println("\t HRA  is :"+hra);
    	System.out.println("\t Gross Salary  is :"+grossSalary());
    }
    
    public static void main(String[] args) {
        BankManager bankManager=new BankManager(212122, "anand kumar", 12000, 5, 10, 7, "rajpura");

        bankManager.bankEmployeeInfo();
	}
}
