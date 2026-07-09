public class A {
    public A() {
//        super();
        System.out.println("a constructor");
    }
}

class B extends  A {
    public B() {
//        super();
        System.out.println("b constructor");
    }
}

class C  extends  B{
    public C() {
//        super();
        System.out.println("c constructor");
    }

    public static void main(String[] args) {
        new C();
    }
}
