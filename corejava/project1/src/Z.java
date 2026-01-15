public class Z {
 Z(){
    // super();
     System.out.println("z constructor");
 }
}

class Y extends  Z{
    public Y() {
      //  super();
        System.out.println("Y constructor");
    }
}
class X extends  Y{
    public X() {
        //super();
        System.out.println("X constructor");
    }

    public static void main(String[] args) {
        new X();
    }
}

