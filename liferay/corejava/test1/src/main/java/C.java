class A{
    A(){
        super();
        System.out.println("A constructor");
    }
}
class B extends  A{
    B(){
        super();
        System.out.println("B constructor");
    }
}

public class C  extends  B {

    C(){
        super();
        System.out.println("C constructor");
    }

    public static void main(String[] args) {
        new C();
    }
}
