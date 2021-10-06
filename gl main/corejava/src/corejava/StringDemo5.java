package corejava;

public class StringDemo5 {

	public static void main(String[] args) {

		//StringBuffer buffer="";
		StringBuffer buffer=new StringBuffer("hello");
		
		System.out.println(buffer);
		
		buffer.append(" world");
		
		System.out.println(buffer);
			
		buffer.delete(2, 4);
		System.out.println(buffer);
		
		buffer.insert(2, " welcome ");
		
		System.out.println(buffer);
		
		
		
		
		

	}
}
