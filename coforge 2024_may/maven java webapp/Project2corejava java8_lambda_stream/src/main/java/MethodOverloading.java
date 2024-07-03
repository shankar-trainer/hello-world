public class MethodOverloading {

     void addition(int a, int b){
         System.out.println("addition is "+(a+b));
     }

     void addition(int a, int b,int c){
         System.out.println("addition is "+(a+b));
     }
     void addition(float a, float b){
         System.out.println("addition is "+(a+b));
     }
     void addition(String a, String  b){
         System.out.println("addition is "+(a+b));
     }

    public static void main(String[] args) {
        MethodOverloading methodOverloading=new MethodOverloading();
        methodOverloading.addition(1,2,3);
        methodOverloading.addition(1.4f,2.0f);
        methodOverloading.addition(10,20);
        methodOverloading.addition("shyam"," kumar");

    }

}
