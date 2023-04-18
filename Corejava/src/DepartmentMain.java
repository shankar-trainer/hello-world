
public class DepartmentMain {

	public static void main(String[] args) {
		Department department=new Department();
		//department.deptId=-9898;
		//department.deptName="";
		//department.deptLocation="a";
		
		department.setDeptId(44545);
		department.setDeptName("training");
		department.setDeptLocation("rajpura");
		
		
		System.out.println("department detail ");
		System.out.println("\tid "+department.getDeptId());
		System.out.println("\tname "+department.getDeptName());
		System.out.println("\tlocation "+department.getDeptLocation());
		
	}
}
