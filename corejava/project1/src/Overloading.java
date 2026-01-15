public class Overloading {
// first type of polymorphism, compile time polymorphism
    void addition(int a, int b){
        System.out.println("addition is "+(a+b));
    }

    void addition(int a, int b, int c){
        System.out.println("addition is "+(a+b));
    }

    void addition(float a, float  b){
        System.out.println("addition is "+(a+b));
    }

    void addition(String  a, String  b){
        System.out.println("addition is "+(a+b));
    }

    public static void main(String[] args) {
        Overloading overloading=new Overloading();
        overloading.addition(11,12,13);
        overloading.addition(11.5f,12.5f);
        overloading.addition("shyam","kumar");
        overloading.addition(33,45);
    }

}
