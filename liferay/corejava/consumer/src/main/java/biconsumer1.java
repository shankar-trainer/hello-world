import java.util.function.BiConsumer;
import java.util.function.DoubleConsumer;

public class biconsumer1 {
    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (s1, s2) -> System.out.println(s1 + "  " + s2);
        biConsumer.accept("ram", "kumar");

        BiConsumer<Integer,Integer> biConsumer1=(p,q)-> System.out.println(p+q);
        BiConsumer<Integer,Integer> biConsumer2=(p,q)-> System.out.println(p-q);

        biConsumer1.accept(10,5);
        biConsumer2.accept(10,5);

    }
}
