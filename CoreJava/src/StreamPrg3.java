import java.util.ArrayList;
import java.util.List;

public class StreamPrg3 {

	public static void main(String[] args) {
		List<String> list1=new ArrayList<>();
		list1.add("pizza");
		list1.add("burger");
		list1.add("chowmein");
		list1.add("pizza");
		list1.add("pasta");
		list1.add("uthpam");
		list1.add("idli");
		
		System.out.println("\nun sorted \n");
		list1.stream().sorted().forEach(p->System.out.println(p));
		
		System.out.println("\nsorted \n");
		list1.stream().sorted().forEach(p->System.out.println(p));
	}
}
