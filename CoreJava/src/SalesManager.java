
public class SalesManager  extends Manager{
     String branch;
     float hra;
     float salestarget;
     float pf;
     
     public SalesManager(String branch, float hra,float salestarget, float pf) {
	   this.branch=branch;
	   this.hra=hra;
	   this.salestarget=salestarget;
	   this.pf=pf;
     }
     
	
	public static void main(String[] args) {
		SalesManager salesManager=new SalesManager("thoraipakkam",2000,200000,5000);
	
		salesManager.setEmpId(766767);
		salesManager.setLocation("Chennai");
		salesManager.setEname("s kumar");;
		salesManager.setSalary(45000);
		
		System.out.println("Sales manager information ");
		System.out.println("empId is "+salesManager.getEmpId());
		System.out.println("emp Name is "+salesManager.getEname());
		System.out.println("emp Location is "+salesManager.getLocation());
		System.out.println("emp Salary is "+salesManager.getSalary());
		System.out.println("emp Branch is "+salesManager.branch);
		System.out.println("emp hra is "+salesManager.hra);
		System.out.println("emp sales  target is "+salesManager.salestarget);
		System.out.println("emp PF is "+salesManager.pf);
		
		
	}

}
