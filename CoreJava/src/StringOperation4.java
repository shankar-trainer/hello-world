
public class StringOperation4 {

	public static void main(String[] args) {
		   String  var="I am learning java. java is used world wide";
		   
		   System.out.println(var.indexOf("java"));
		   System.out.println(var.indexOf("java"));
		   System.out.println(var.lastIndexOf("java"));
		   System.out.println(var.substring(0));
		   System.out.println(var.substring(0,8));
		   
		   System.out.println("hello".concat("world"));
		   System.out.println("hello".concat(" world").concat(" to").concat(" java"));
		   System.out.println("hello"+" world"+" to"+" java");
		   
		   System.out.println(var.replace('e', 'z'));//replace will replace char
		   
		   System.out.println(var.replaceAll("java", "python"));
		   
	}
}
