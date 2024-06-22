import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {

		Integer ar[] = { 11, 1, 2, 4, 9, 6, 7, 1, 11 };

		System.out.println("distinct ");
		Stream.of(ar).distinct().forEach(b -> System.out.print(b + ","));

		System.out.println("sorted and distinct ");
		Stream.of(ar).sorted().distinct().forEach(b -> System.out.print(b + ","));
				
		System.out.println("\nmapping ");
		Stream.of(ar).forEach(b -> System.out.print(b + ","));
		System.out.println("\n");
		Stream.of(ar).map(a->a*a).forEach(b -> System.out.print(b + ","));

		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1000);
		list1.add(10);
		list1.add(200);
		list1.add(1);
		list1.add(1000);

		System.out.println();
		list1.stream().distinct().forEach(a -> System.out.print(a + ","));

		System.out.println();
		list1.stream().filter(a -> a % 2 == 0).forEach(a -> System.out.print(a + ","));

	}

}
