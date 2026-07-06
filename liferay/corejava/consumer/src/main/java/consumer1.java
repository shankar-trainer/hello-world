import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class consumer1 {

    public static void main(String[] args) {
        Consumer<String> cts = str -> System.out.println(str);

        cts.accept("hello");
        cts.accept("hello");
        cts.accept("hello");
        cts.accept("hello");
        cts.accept("hello");

        String ar[] = {"aaa", "bbb", "ccc"};
        Stream.of(ar).forEach(System.out::print);


        List<String> items = List.of("A", "B");
        items.stream().forEach(String::toLowerCase);
        items.forEach(String::toLowerCase);
        items.stream().map(String::toLowerCase).forEach(System.out::println);

        String collect = items.stream().map(String::toLowerCase).collect(Collectors.joining(", "));
        System.out.println(collect);

        Consumer<Integer> integerConsumer1 = (t) -> System.out.println("square root  is " + Math.sqrt(t));
        Consumer<Integer> integerConsumer2 = (t) -> System.out.println("square  is " + (t * t));
        Consumer<Integer> integerConsumer3 = integerConsumer1.andThen(integerConsumer2);

        integerConsumer3.accept(25);

    }
}
