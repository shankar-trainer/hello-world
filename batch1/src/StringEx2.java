
public class StringEx2 {

	public static void main(String[] args) {
		
		String var="we are learning java. java is most used programming language ";
		
		System.out.println(var.indexOf("java"));
		System.out.println(var.lastIndexOf("java"));
		
		System.out.println(var.indexOf("a"));
		System.out.println(var.indexOf(97));
		
		System.out.println(var.replace('e', 'z'));
		System.out.println(var.replaceAll("java", "python"));
		
		System.out.println(var.codePointAt(4));
		System.out.println(var.charAt(4));
		
		
		String empId="cts53555";
		if(empId.startsWith("cts"))
			System.out.println("valid emp id ");
		else 
			System.out.println("not valid id");
		
		String empmailId="cts_ram@cts.com";
		if(empmailId.startsWith("cts") &&  empmailId.indexOf("@") >0 && empmailId.endsWith(".com"))
		{
			System.out.println("valid email id ");
		}
		
		
		System.out.println(var.substring(5));
		System.out.println(var.substring(5, 10));
		
		String id="  3232233  ";
		
		System.out.println(id.length());
		System.out.println(id.trim().length());
		
		
		
	}
}
