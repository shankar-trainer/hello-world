import java.util.stream.Stream;

public class StreamPrg1 {

	public static void main(String[] args) {
		
		Stream<Integer> of = Stream.of(1,2,3,4,5,6);
		
		of.forEach(a->System.out.print(a+","));
		System.out.println("\nusing filter display even no  ");
		
		Stream.of(1,2,3,4,5,6).filter(a->(a%2==0)).forEach(a->System.out.print(a+","));
		
		System.out.println("\nusing filter display odd  no  ");
		
		Stream.of(1,2,3,4,5,6).filter(a->(a%2!=0)).forEach(a->System.out.print(a+","));
		
		System.out.println("\nusing map to  display square of   no \n ");
		
		Stream.of(1,2,3,4,5,6).map(a->(a*a)).forEach(a->System.out.print(a+","));
		
		System.out.println("\nusing limit to  display    no \n ");
		Stream.of(1,2,3,4,5,6).limit(3).forEach(a->System.out.print(a+","));
		
		
		System.out.println("\nusing limit and map  to  display    no \n ");
		
		Stream.of(1,2,3,4,5,6).limit(3).map(a->a*a).forEach(a->System.out.print(a+","));
		
	}
}
