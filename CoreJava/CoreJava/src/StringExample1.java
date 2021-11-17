
public class StringExample1 {

	public static void main(String[] args) {

		String s1 = "cat";
		String s2 = "cat";
		String s3 = "cat";

		String s4 = new String("cat");

		System.out.println(s1 == s2); //true
		System.out.println(s1 == s3);//true
		System.out.println(s2 == s3);//true

		System.out.println(s2 == s4);// false
		System.out.println(s2.equals(s4));//true

		// == checks references
		// .equals checks content

		System.out.println("hello" == "hello");// true
		System.out.println("hello" == new String("hello"));// false
		System.out.println("hello".equals(new String("hello")));// true
		
		System.out.println(s1=="cat");

	}
}
