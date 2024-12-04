public class Test1 {
    //private
    int x=10;
    //private
    void display(String s) {
         System.out.println("Test1 display method ");
        System.out.println("i m " + s);
    }

    static void show(){
        System.out.println("super class static show  method ");
    }
}

class Test2 extends Test1 {
    int x=100;

    @Override
    //protected
    //public
    //private // error
    void display(String s) {
        int x=1000;
        super.display("suresh kumar");
        System.out.println("Test2 display method ");
        System.out.println("my name is " + s);
        System.out.println("local x is "+x);
        System.out.println("current class x is "+this.x);
        System.out.println("super class x is "+super.x);
    }

   // @Override
    // static method is inherited and can be re written
    // static method can not be overridden
    static void show(){
        System.out.println("sub  class static show  method ");
    }

    public static void main(String[] args) {
        new Test2().display("madan kumar");
        Test2.show();
    }
}
