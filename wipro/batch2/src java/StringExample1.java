public class StringExample1 {
    public static void main(String[] args) {

        String var1="hello world";
        System.out.println( var1.length());

        System.out.println("car"=="car");
        System.out.println("car"==new String("car"));
       java.util.Scanner sc=new java.util.Scanner(System.in);

        //== checks references
        System.out.println(sc.next()=="ramkumar");//false scannner.next() user input returns value outside string pool

        // .equals checks contents
        System.out.println(sc.next().equals("ramkumar"));
        // charAt(index) -- return char present at given index

        String  p1="we are learning java ";
        System.out.println(p1.charAt(0));
        System.out.println(p1.charAt(1));
        System.out.println(p1.charAt(2));
        System.out.println(p1.charAt(3));

        System.out.println("hello".equals("hello"));
        System.out.println("hello".equals("HeLlo"));
        System.out.println("hello".equalsIgnoreCase("HeLlo"));
    }
}
