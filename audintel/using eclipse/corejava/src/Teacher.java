
public class Teacher {

	private int teacherId;
	private String teachername;
	private float teacherSalary;
	private String teacherCity;

	private String teacherState;
	private String teacherCountry;

	public int getTeacherId() {
		return teacherId;
	}

	public String getTeachername() {
		return teachername;
	}

	public float getTeacherSalary() {
		return teacherSalary;
	}

	public String getTeacherCity() {
		return teacherCity;
	}

	public String getTeacherState() {
		return teacherState;
	}

	public String getTeacherCountry() {
		return teacherCountry;
	}

	public Teacher(int teacherId, String teachername, float teacherSalary, String teacherCity, String teacherCountry,
			String teacherState) {
		// this("india","telengana");
		this(teacherCountry, teacherState);
		this.teacherId = teacherId;
		this.teachername = teachername;
		this.teacherSalary = teacherSalary;
		this.teacherCity = teacherCity;
	}

	public Teacher(String teacherCountry, String teacherState) {
		this.teacherState = teacherState;
		this.teacherCountry = teacherCountry;
	}

}
