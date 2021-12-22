
public class PGT_Teacher  extends Teacher{
	private float pf;
	private float hra;
	
	public void setPf(float pf) {
		this.pf = pf;
	}
	public void setHra(float hra) {
		this.hra = hra;
	}
	
	@Override
	//public
	//protected
	//private
	float grossSalary() {
		return  getSalary()-(getSalary()*pf+getSalary()*hra);
	}
	
	@Override
	public void teacherInfo() {
		super.teacherInfo();
		System.out.println("Pf amount  is "+getSalary()*pf);
		System.out.println("HRA  is "+getSalary()*hra);
		System.out.println("gross salary "+grossSalary());
	}
}
