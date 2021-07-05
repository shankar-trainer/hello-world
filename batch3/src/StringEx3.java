import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringEx3 {

	public static void main(String[] args) throws IOException {

		String var = "java is broadly used  language. we will learn java 8 too";

		System.out.println(var.replace('a', 'z'));
		System.out.println(var.replaceAll("java", "python"));

		System.out.println(var.substring(5));
		System.out.println(var.substring(5, 12));

		String ar[] = var.split(" ");
		for (String string : ar) {
			System.out.print(string + ", ");
		}
		
		var="ram-goes-to-school";
		
		System.out.println("split using - as separator");
		ar = var.split("-");
		for (String string : ar) {
			System.out.print(string + ", ");
		}
		
		var="chennai-is-capital&of=tamilnadu";
		
		System.out.println("split using  = & - as separator");
		ar = var.split("-|&|=");
		for (String string : ar) {
			System.out.print(string + ", ");
		}
		
		String city[]= {"delhi","chennai","coimbtore","madurai"};
		
		System.out.println("\n using join \n");
		String mycity=String.join(" and ", city);
		System.out.println(mycity);
		
		String s1="hi how are you";
		char cc[]=s1.toCharArray();
		
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String s=reader.readLine();
		
	}
}
