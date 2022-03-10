
public class HighSchoolTeacher extends Teacher {

	private String location;
	private float hra;
	private float da;
	private float pf;

	public String getLocation() {
		return location;
	}

	public float getHra() {
		return hra;
	}

	public float getDa() {
		return da;
	}

	public float getPf() {
		return pf;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setHra(float hra) {
		this.hra = hra;
	}

	public void setDa(float da) {
		this.da = da;
	}

	public void setPf(float pf) {
		this.pf = pf;
	}

	@Override
	//private
	//protected
	//public
	void teacherInfo(int y) {

		System.out.println("\nhich school teacher  record \n");
		System.out.println("\tid  " + getTeacherId());
		System.out.println("\tname  " + getTeacherName());
		System.out.println("\tsalary  " + getTeacherSalary());

		System.out.println("\tlocation  " + getLocation());
		System.out.println("\thra  " + getHra());
		System.out.println("\tda  " + getDa());
		System.out.println("\tpf  " + getPf());
		System.out.println("\n\tgross salary  " + (getTeacherSalary() + (getTeacherSalary() * getDa())
				+ (getTeacherSalary() * getHra()) - (getTeacherSalary() * getPf())));

	}

	public static void main(String[] args) {
		HighSchoolTeacher teacher = new HighSchoolTeacher();
		teacher.setTeacherId(10001);
		teacher.setTeacherName("raj kumar sharma");
		teacher.setTeacherSalary(50000);

		teacher.setDa(0.04f);
		teacher.setHra(0.05f);
		teacher.setPf(0.02f);
		teacher.setLocation("noida");

		teacher.teacherInfo(0);
	}
}
