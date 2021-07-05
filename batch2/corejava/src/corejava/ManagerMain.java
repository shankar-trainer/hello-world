package corejava;
class ManagerMain{
	public static void main(String[] args) {
		Manager manager=new Manager(54545, "ranjeet kumar", 45, 80000, "chennai");
	
		System.out.println("Manager Data\n");
		System.out.println(manager.getEmployeeId());
		System.out.println(manager.getEmployeeName());
		System.out.println(manager.getEmployeeAge());
		System.out.println(manager.getManagerSalary());
		System.out.println(manager.getManagerLocation());
	}
}