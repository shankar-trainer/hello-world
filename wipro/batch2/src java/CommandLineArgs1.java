public class CommandLineArgs1 {

    public static void main(String[] args) {

        int no1=200,no2=5;

        if(args[0].equals("addition"))
            System.out.println(no1+no2);
        if(args[0].equals("subtraction"))
            System.out.println(no1-no2);

    }

}
