import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest1 {

    public static void main(String[] args) {

        Integer ar[] = {20, 12, 2, 3, 11, 1, 11, 20, 3};
        //Set<Integer> collect = Stream.of(ar).sorted().collect(Collectors.toSet());
        List<Integer> collect = Stream.of(ar).sorted().collect(Collectors.toList());
        System.out.println(collect);

        //Stream.of(ar).sorted().forEach(System.out::println);
        System.out.println("sorted  ");
        Stream.of(ar).sorted().forEach(a -> System.out.print(a + ","));

        System.out.println("duplicate remove ");
        Stream.of(ar).distinct().forEach(a -> System.out.print(a + ","));

        System.out.println("\ndivisible by 2 ");
        Stream.of(ar).filter(a -> a % 2 == 0).forEach(a -> System.out.print(a + ","));

        System.out.println("\nsorted and divisible by 2 ");
        Stream.of(ar).sorted().filter(a -> a % 2 == 0).forEach(a -> System.out.print(a + ","));

        System.out.println("\nsorted and no duplicate  ");
        Stream.of(ar).sorted().distinct().forEach(a -> System.out.print(a + ","));

        System.out.println("\n   ");
        Stream.of(ar).forEach(a -> System.out.print(a + ","));

        System.out.println("\n  using limit  display start 3 elements  ");
        Stream.of(ar).limit(3).forEach(a -> System.out.print(a + ","));
        System.out.println("\n  using skip  display last 3 elements  ");
        Stream.of(ar).skip(6).forEach(a -> System.out.print(a + ","));

        int sum =Stream.of(ar).reduce((a,b)->a+b).get();
        System.out.println("\n sum is "+sum);
        System.out.println("\n sum of  "+ Arrays.toString(ar)+"  is "+sum);


    }
}
