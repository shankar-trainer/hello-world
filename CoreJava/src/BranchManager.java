
public class BranchManager  extends Manager{
     String branch;
     float hra;
     
     public BranchManager(String branch, float hra) {
	   this.branch=branch;
	   this.hra=hra;
     }
     
	
	public static void main(String[] args) {
		BranchManager branchManager=new BranchManager("thoraipakkam",2000);
		branchManager.setEmpId(766767);
		branchManager.setLocation("Chennai");
		branchManager.setEname("s kumar");;
		branchManager.setSalary(45000);
		
		System.out.println("branch manager information ");
		System.out.println("empId is "+branchManager.getEmpId());
		System.out.println("emp Name is "+branchManager.getEname());
		System.out.println("emp Location is "+branchManager.getLocation());
		System.out.println("emp Salary is "+branchManager.getSalary());
		System.out.println("emp Branch is "+branchManager.branch);
		System.out.println("emp hra is "+branchManager.hra);
		
	}

}
