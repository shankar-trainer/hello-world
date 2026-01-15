import java.util.Scanner;

public class StringPool {
    public static void main(String[] args) {

        String var1="welcome";
        String var2="welcome";   // both will be present inside string pool
                                // two reference one object

        System.out.println(var1==var2); // == checks references

        String var3=new String("welcome");
                                   // created outside string pool, create new object

        System.out.println(var1==var3); // == checks references , false
        System.out.println(var1.equals(var3)); // == checks references but .equals checks contents

        System.out.println("hello"=="hello");
        System.out.println("hello"==new String("hello"));
        System.out.println("hello".equals(new String("hello")));
        System.out.println(new Scanner(System.in).next()=="hello");
        System.out.println(new Scanner(System.in).next().equals("hello"));
    }

}

