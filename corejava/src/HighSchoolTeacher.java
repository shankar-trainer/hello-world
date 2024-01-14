public class HighSchoolTeacher extends Teacher {

	private float pf;
	private float hra;

	public HighSchoolTeacher(int id, String name, float salary, float pf, float hra) {
		super(id, name, salary);
		this.pf = pf;
		this.hra = hra;
	}

	public float getPf() {
		return pf;
	}

	public float getHra() {
		return hra;
	}

	@Override
	void teacherInfo() {
		super.teacherInfo();

		System.out.println("\tpf " + getPf());
		System.out.println("\thra " + getHra());
		System.out.println("\tnet salary  " + (getSalary() - (getSalary() * getPf()) + (getSalary() * getHra())));
	}

	public static void main(String[] args) {

		HighSchoolTeacher teacher = new HighSchoolTeacher(565656, "sunil kumar", 25000, 0.05f, 0.08f);

		teacher.teacherInfo();

	}

}
