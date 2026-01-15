package hello;

public class SynchExample1 {

    static class Counter {
        static int count = 1;
    }

    synchronized    static void increment() {
        System.out.print("   " + Counter.count++);
    }
}

class Test1 extends Thread {
    @Override
    public void run() {
        SynchExample1.increment();
        SynchExample1.increment();
        SynchExample1.increment();
    }
}

class Test2 extends Thread {
    @Override
    public void run() {
        SynchExample1.increment();
        SynchExample1.increment();
        SynchExample1.increment();
    }
}

class Main {
    public static void main(String[] args) {
      /*Test1 test1=new Test1();
      Test2 test2=new Test2();
      test1.start();
      test2.start();
     */
    /* Test1 test1=new Test1();
     Test1 test2=new Test1();
     test1.start();
     test2.start();*/
        Thread test1 = new Test1();
        Thread test2 = new Test1();
        test1.start();
        test2.start();
        // above all 3 works
    }
}
