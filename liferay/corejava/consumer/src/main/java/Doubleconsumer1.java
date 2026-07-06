import java.util.function.DoubleConsumer;

public class Doubleconsumer1 {
    public static void main(String[] args) {


        DoubleConsumer doubleConsumer = (s) -> System.out.println(s);
        doubleConsumer.accept(11.445);

        DoubleConsumer doubleConsumer1 = (s) -> {
            if (s % 2 == 0)
                System.out.println(s + " is divisible by 2");
            else
                System.out.println(s + " is not divisible by 2");
        };

        doubleConsumer1.accept(11.445);

        System.out.println(11.445%2==0);
        System.out.println(11.445%2!=0);

        DoubleConsumer doubleConsumer2=(t)-> System.out.println("square "+(t*t));
        DoubleConsumer doubleConsumer3=(t)-> System.out.println("10 percent "+(t*0.01));

        DoubleConsumer doubleConsumer4 = doubleConsumer2.andThen(doubleConsumer3);

        doubleConsumer4.accept(5);

    }
}
