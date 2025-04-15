package package1;

public class ThreadBasedMainTask1   {
    public static void main(String[] args) {
// multiple tasks gets executed in a single process
    Thread t1=new Task1();
    Thread t2=new Task2();

    t1.start();
    t2.start();
    }
}
