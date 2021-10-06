package corejava;
import java.time.*;
import java.util.*;
import java.time.format.DateTimeFormatter;
public class MyClass {
    public static void main(String args[]) {
       DateTimeFormatter T = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
       Scanner h = new Scanner(System.in);

       System.out.print("Enter date of birth[dd/mm/yyyy hh:mm]: ");
       String b = h.nextLine();

       LocalDateTime bd = LocalDateTime.parse(b,T);
       LocalDateTime cd = LocalDateTime.now();

       int hr = cd.getHour() - bd.getHour();
       int mn = cd.getMinute() - bd.getMinute();

       Period time = Period.between(bd.toLocalDate(),cd.toLocalDate());
       
       System.out.print("Age is: "+time.getYears()+ " years,"+time.getMonths()+ " months, " +time.getDays()+ " days, "+hr+ " hours, " +mn+ " minutes old");
    }
}
