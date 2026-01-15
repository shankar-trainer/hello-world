package test;

class Test {
    static int p = 1;

 // synchronized
    static void  increment() {
      System.out.print(Test.p+++",");
    }
}

public class Test2 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            Test.increment() ;
        }
    }
}
 class Test3 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            Test.increment() ;
        }
    }
}
class Main{
    public static void main(String[] args) {
        Thread t2=new Test2();
        Thread t3=new Test3();
        t2.start();
        t3.start();
    }
}