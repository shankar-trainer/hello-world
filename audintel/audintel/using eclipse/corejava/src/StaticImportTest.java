import static java.lang.Math.PI;
import static java.lang.Math.E;
import static java.lang.Math.asin;
import static java.lang.System.out;;

public class StaticImportTest {

	public static void main(String[] args) {
		System.out.println(PI);
		System.out.println(E);
		System.out.println(asin(PI/2));
		
		out.println("hello world");
		
		out.println(PI);
		out.println(E);
		out.println(asin(PI/2));
		
	}
}
