   //parent /super class 
public class BankEmployee {
 int id;
 String name;
 float salary;
 
 void bankEmployeeInfo() {
	 System.out.println("Id is "+id);
	 System.out.println("Name is "+name);
	 System.out.println("Salary is "+salary);
 }
}


class BankManager extends BankEmployee{
  // child class , subclass	
	public static void main(String[] args) {
		BankManager m=new BankManager();
		m.id=9898;
		m.name="kamal kant";
		m.salary=9000;
		m.bankEmployeeInfo();
	}
}