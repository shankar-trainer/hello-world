public class Test1 {
int x=100; // instance , super class
    void info(){
        System.out.println("hello world");
    }
}

class Test2 extends  Test1{
    int x=1000; // instance variable
    @Override
    void info() {
        int x=10000; // local variable
        super.info();
        // super is used to call super class method and variables
        // this -- current class reference, super -- super class reference
        // super and this cannot be used in any static context
        System.out.println("welcome to test2 ");
        System.out.println("local x "+x);   //10000
        System.out.println("instance x  "+this.x);   //1000
        System.out.println(super.x);//100
    }

    public static void main(String[] args) {
        new Test2().info();
    }
}
