import java.util.ArrayList;
import java.util.List;

public class StreamPrg2 {

	public static void main(String[] args) {
		List<String> list1=new ArrayList<>();
		list1.add("pizza");
		list1.add("burger");
		list1.add("chowmein");
		list1.add("pizza");
		list1.add("pasta");
		list1.add("uthpam");
		list1.add("idli");
		list1.add("dosa");
		list1.add("idli");
		list1.add("misti dahi");
		list1.add("uthpam");
		
		list1.stream().forEach(a->System.out.println(a));
		System.out.println("limit of 3 from starting");
		list1.stream().limit(3).forEach(a->System.out.print(a+", "));
		
		System.out.println("\nskip  of 3 elements from last ");
		list1.stream().skip(3).forEach(a->System.out.print(a+", "));
		
		System.out.println("\n distinct values ");
		list1.stream().distinct().forEach(a->System.out.print(a+", "));
		
		
		
	}
}
