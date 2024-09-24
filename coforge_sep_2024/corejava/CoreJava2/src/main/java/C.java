// inheritance using default constructor
public class C {
    public C() {
        //super();
        System.out.println("constructor c called ");
    }
}

class B extends C{
    public B() {
        //super();
        System.out.println("constructor B called");
    }
}
class A extends B{
    public A() {
        //super();
        System.out.println("constructor A called");
    }

    public static void main(String[] args) {
        new A();
    }
}
