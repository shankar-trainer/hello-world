public class Test1 {
    int y; // instance variable has default value , no need to initialize

    public static void main(String[] args) {

        //local variable is not having any default value

        // local value cannot be public, private , static

        // local variable  can be only final

        int x=9890898;
        System.out.println("x is "+x);
        System.out.println("y is "+new Test1().y);


    }
}
