public class Overloading {
    static void addition(int a, int b){
        System.out.println("two integer sum is  "+(a+b));
    }
    static void addition(int a, int b, int c){
        System.out.println("three integer sum is  "+(a+b+c));
    }
    static void addition(float a, int b){
        System.out.println("one float, one integer sum is  "+(a+b));
    }
    static void addition(String a, String b){
        System.out.println("two string concatenation  is  "+(a+"  "+b));
    }
    public static void main(String[] args) {
        addition(22.5f,11);
        addition(1,2,3);
        addition("hello", "world");
        addition(1,2);
    }
}
