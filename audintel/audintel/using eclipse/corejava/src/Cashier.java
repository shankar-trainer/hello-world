
public class Cashier extends Employee {
	private String work;
	private String companyName;
	private float ta;
	private float da;
	private float pf;
	
	public float getTa() {
		return ta;
	}

	public void setTa(float ta) {
		this.ta = ta;
	}

	public float getDa() {
		return da;
	}

	public void setDa(float da) {
		this.da = da;
	}

	public float getPf() {
		return pf;
	}

	public void setPf(float pf) {
		this.pf = pf;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public float grossSalary() {
          return (getEmpSalary()- (getEmpSalary()*getPf())+(getEmpSalary()*getTa())  +(getEmpSalary()*getDa()));		
	}
}
