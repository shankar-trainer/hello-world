public class Overloading {

    static void add(int a , int b ){
        System.out.println("Addition of two integer is "+(a+b));
    }
    static void add(int a , int b, int c ){
        System.out.println("Addition of 3 integer is "+(a+b+c));
    }
    static void add(String  a , int b ){
        System.out.println("Addition of String name integer is  "+(a+b));
    }

    static void add(String a, String  b) {
        System.out.println("Full name  is " + (a +"  "+ b));
    }
    static void add(float a, float  b) {
        System.out.println("Addition of two float decimal  is " + (a + b));
    }

    public static void main(String[] args) {
        add(1,2,3);
        add(10,12);
        add("hello",122);
        add("suresh ","kumar");
        add(12.34f,34.56f);

    }
}
