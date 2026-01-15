package test;

public class TestSynchronization {
    public static void main(String args[]) {
        // Only one object of Table is created and shared
        Table obj = new Table(); 

        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);

        t1.start();
        t2.start();
    }
}
