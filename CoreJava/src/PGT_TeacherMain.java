
public class PGT_TeacherMain {

	public static void main(String[] args) {
		PGT_Teacher pgt_Teacher=new PGT_Teacher();
		
		pgt_Teacher.setId(10001);
		pgt_Teacher.setName("hemant kumar");;
		pgt_Teacher.setSalary(40000);
		pgt_Teacher.setPf(0.05f);
		pgt_Teacher.setHra(0.03f);
		
		pgt_Teacher.teacherInfo();
	}
}
