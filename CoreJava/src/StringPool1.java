
public class StringPool1 {

	public static void main(String[] args) {
		
		System.out.println("hello"=="hello");//true
		System.out.println("hello"==new String("hello"));//false
		System.out.println("hello".equals( new String("hello")));//true
		
		System.out.println(new String("hello") ==( new String("hello")));//false
		System.out.println(new String("hello") .equals(( new String("hello"))));//true
	}
}
