import java.util.function.Consumer;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {

        Stream.of(new Integer[]{1,2,3,4}).forEach(a->System.out.println(a));

        Consumer<Integer> c=(a)-> System.out.println(a);
        c.accept(20);


    }
}
