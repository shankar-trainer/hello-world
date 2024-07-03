public class Z {
    public Z() {
        super();
        System.out.println("z constructor ");
    }
}
// constructor is not inherited
class Y  extends Z{
    public Y() {
        super();
        System.out.println("y constructor ");
    }
}
class X extends  Y {
    public X() {
        super();
        System.out.println("x constructor ");
    }

    public static void main(String[] args) {
        new X();
    }
}
