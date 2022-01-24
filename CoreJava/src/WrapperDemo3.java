
public class WrapperDemo3 {

	public static void main(String[] args) {
		//parseXXX(String)-- static method convert string to primitive data type 
		
		String id="1234";
		System.out.println(id+12);
		
		int id1 = Integer.parseInt(id);
		System.out.println(id1+100);
		
		String salary="12000.45";
		float sal=Float.parseFloat(salary);
		
		System.out.println(sal+900);
	}
}
