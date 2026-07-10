public class PatternCase {

    public static void main(String[] args) {
        Days day = Days.Sunday;
//        Days day = Days.Monday;

        switch (day){
            case Monday,Tuesday,Wednesday,Thursday,Friday -> System.out.println("working day");
            case Saturday,Sunday -> System.out.println("week end  days/ holiday");
        }
    }
}
enum Days{
  Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
};