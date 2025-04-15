package package1;

import javax.swing.*;

public class ThreadByRunable {
}



//class MyTask1 extends JFrame, Thread {  // error one class can extends only one  class

class MyTask1 extends JFrame implements  Runnable {

    //one class can extends only one class but can implement multiple interface
    // interface allows to have multiple inheritance feature

    @Override
    public void run() {
        for (int i = 0; i <30 ; i++) {
            System.out.println(i+"  Task1 ");
        }
    }
}
class MyTask2 extends JFrame implements  Runnable {

    @Override
    public void run() {
        for (int i = 0; i <30 ; i++) {
            System.out.println(i+"  Task2 ");
        }
    }
}
class MyTask3 extends JFrame implements  Runnable {

    @Override
    public void run() {
        for (int i = 0; i <30 ; i++) {
            System.out.println(i+"  Task3 ");
        }
    }
}
class MyTask4 {
    Runnable runnable=()->{
        for (int i = 0; i <30 ; i++) {
            System.out.println(i+"  Task4 ");
        }
    };

}

class RunnableMain{
    public static void main(String[] args) {
        Thread thread1=new Thread(new MyTask1());
        Thread thread2=new Thread(new MyTask2());
        Thread thread3=new Thread(new MyTask3());
        Thread thread4=new Thread(new MyTask4().runnable);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }

}

