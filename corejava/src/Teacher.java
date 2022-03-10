
public class Teacher {
	private int teacherId;
	private String teacherName;
	private float teacherSalary;
	
//protected
void teacherInfo(int x) {
		System.out.println("\nteacher  record \n");
		System.out.println("\tteacher id  "+teacherId);
		System.out.println("\tteacher name  "+teacherName);
		System.out.println("\tteacher salary  "+teacherSalary);
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public float getTeacherSalary() {
		return teacherSalary;
	}

	public void setTeacherSalary(float teacherSalary) {
		this.teacherSalary = teacherSalary;
	}

	
}
