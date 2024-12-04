
public class ComputerMain {

	public static void main(String[] args) {
		
		Computer computer1=new Computer(1001, "dell", 56000);
		Computer computer2=new Computer(1002, "samsung", 67000);
		
		Computer computer3=computer1;  // both refers same object 
		
		
		computer1.computerData();
		computer3.computerData();
		
		computer3.setCost(98000);
		
		computer1.computerData();
		
		
		
		
	}
}
