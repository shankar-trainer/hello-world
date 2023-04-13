import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Created by shankar on 4/7/2023.
 */
public class Test2 {

    public static void main(String[] args) {

        // java8  LocalDate, LocalTime LocalDateTime

        LocalDate localDate=LocalDate.now();
        System.out.println(localDate);

        LocalDate localDate1=LocalDate.of(2019,11,23);
        System.out.println(localDate1);

        LocalTime localTime=LocalTime.now();

        System.out.println(localTime);
        LocalTime localTime1=LocalTime.of(11,22,33);
        System.out.println(localTime1);

    }

}
