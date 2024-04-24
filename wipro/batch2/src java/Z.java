

// constructor are not inherited
class X {
    public X() {
        //super();
        System.out.println("X constructor called");
    }
    int p = 100;
    void disp(){
        System.out.println("X class disp method");
    }
}
// in each constructor compiler adds super() in first line
// super() -- calling super class constructor  , super -- call super class variables, methods
// this() -- calling current class constructor , this -- call current class variables, methods
public class Z extends X {
    int p=1000;
    public Z() {
        //super();
        System.out.println("Z constructor called");
    }

    @Override
    void disp() {
        super.disp();
        int p=999;
        System.out.println("Local p "+p);
        System.out.println("this  p "+this.p);
        System.out.println("super p "+super.p);
    }

    public static void main(String[] args) {
        new Z().disp();
    }
}
