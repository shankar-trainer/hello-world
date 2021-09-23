
public class DepartmentMain {

	public static void main(String[] args) {

		
		EmployeeDepartment dept1 = new EmployeeDepartment();
		TrainingDepartment dept2 = new TrainingDepartment();
		
		dept1.setDepartmentId(11111);
		dept1.setDepartmentName("manager department");
		dept1.setDepartmentLocation("gindi");
		dept1.setCity("chennai");
		dept1.setCountry("india");
			
		
		dept2.setDepartmentId(11112);
		dept2.setDepartmentName("developer department");
		dept2.setDepartmentLocation("delhi");
		dept2.setTrainingName("fullstack training");
		dept2.setTrainingDuration(50);
		
		
		dept1.departmentInfo();
		
		dept2.departmentInfo();
		
	}
}
