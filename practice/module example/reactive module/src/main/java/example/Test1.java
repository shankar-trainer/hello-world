package example;

import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.logging.Logger;

interface Test{
 int add(int a);
}

public class Test1 {
//   (int x) -> x + 1;

    Test t1=a -> a+20;
  static Logger logger=Logger.getLogger(Test1.class.getName());
    public static void main(String[] args) {
        IntFunction<Integer> integerIntFunction = (int x) -> x + 1;

        Consumer consumer;
        Predicate<Integer> p= x->(x>5);

        System.out.println(p.test(10));
        logger.info("hi "+p.test(10));

    }
}
