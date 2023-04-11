
public class sbDemo {

	public static void main(String[] args) {
		
		//StringBuffer buffer="hello";// error
		StringBuffer buffer=  new StringBuffer("hello");// 
		
		System.out.println(buffer);
		buffer.append(" world");
		System.out.println(buffer);
  
		
	   buffer.reverse();
	   System.out.println(buffer);
	   
	   buffer.insert(4, "hi....");
	   System.out.println(buffer);

	   buffer.delete(3, 8);
	   System.out.println(buffer);
	   
		
	}
}
