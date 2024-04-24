
public class A {
   int x=100;
   int y=20;
   String city="delhi";
   void disp(){
       System.out.println("disp method ");
   }
}
//A class is parent class
//B class is child class

class B extends A{
    int z=7887;
    String country ="india";
    public static void main(String[] args) {
        B b=new B();
        System.out.println("x is "+b.x);
        System.out.println("Y is "+b.y);
        System.out.println("City  is "+b.city);
        System.out.println("method is  ");
        b.disp();

        System.out.println("Z is "+b.z);
        System.out.println("Country is "+b.country);
    }
}

