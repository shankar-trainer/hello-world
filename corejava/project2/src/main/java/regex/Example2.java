package regex;

public class Example2 {
    public static void main(String[] args) {

        String no="78878778";

        System.out.println(no.matches("[0-9]+"));
        System.out.println(no.matches("\\d+"));
        no="1234567891";
        // mob number must if 10 digit

        System.out.println(no.matches("\\d{10}"));

        String empId="ram656556CTS";  // alphanumeric a-z A-Z 0-9 and _
        //[a-zA-Z0-9_] equivalent is \w

        System.out.println(empId.matches("[a-zA-Z0-9_]+"));

        System.out.println(empId.matches("\\w+"));

        System.out.println("ram kumar".matches("[a-z]+\\s[a-z]+"));
        System.out.println("ram kumar".matches("\\w+\\s\\w+"));
        System.out.println("ram  kumar".matches("\\w+\\s\\s\\w+"));
        System.out.println("ram  kumar".matches("\\w+\\s+\\w+"));

        System.out.println(empId.matches("^ram.*"));// ram word in start then anything
        System.out.println(empId.matches(".*CTS$"));// CTS word in last

        System.out.println("hello123hello".matches("^.*(123).*$"));
        System.out.println("hello123hello".matches("^.*\\d+.*$"));

    }
}
