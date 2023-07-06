
public class BankManager extends Manager {

	private float pf;
	private float hra;

	public BankManager(int empId, String empName, float empSalary, float pf, float hra) {
		super(empId, empName, empSalary);
		this.pf = pf;
		this.hra = hra;
	}

	@Override
	public void managerInfo() {
		System.out.println("Bank Manager data ");
		System.out.println("\tId  :" + getEmpId());
		System.out.println("\tName  :" + getEmpName());
		System.out.println("\tSalary  :" + getEmpSalary());

		System.out.println("\tPf  :" + getPf());
		System.out.println("\tHRA  :" + getHra());
System.out.println("Gross salary " +(getEmpSalary()- (getEmpSalary() * pf) +  (getEmpSalary() * hra)));
	}

	public float getPf() {
		return pf;
	}

	public float getHra() {
		return hra;
	}

}
