
public class SbDemo2 {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer("hello world");
		sb1.setLength(5);
		
		System.out.println(sb1);

		sb1.append(" world ").append("to").append("java").insert(5, "greeting").delete(4, 8);
		 
		 System.out.println(sb1);
	
	}
}
