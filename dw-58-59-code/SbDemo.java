
public class SbDemo {

	public static void main(String[] args) {
		
		//StringBuffer buffer="hello";
		StringBuffer buffer=new StringBuffer("hello");
		System.out.println(buffer);
		
		System.out.println(buffer.append( "world "));
		
		buffer.delete(2, 4);
		System.out.println(buffer);
		
		buffer.reverse();
		System.out.println(buffer);
		
		buffer.replace(0, 10, "welcome");
		
		System.out.println(buffer);
		
		buffer.insert(3, "hello");
		
		System.out.println(buffer);
		
		String s1="we are learning java ";
	
		String arr1[]=	s1.split(" ");
		
		for (String string : arr1) {
			System.out.print(string+", ");
		}
		
		s1="hello&world-to&the-cts";
		
		System.out.println("using - separator");
           arr1=	s1.split("[-&]");
		for (String string : arr1) {
			System.out.print(string+", ");
		}
		
	}
}
