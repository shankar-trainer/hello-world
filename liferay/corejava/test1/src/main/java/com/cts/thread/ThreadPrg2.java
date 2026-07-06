package com.cts.thread;

public class ThreadPrg2  implements  Runnable{
    @Override
    public void run() {
        for (int i = 0; i <=10 ; i++)
        System.out.println(Thread.currentThread().getName() + " child program runs ");
    }
}

 class ThreadPrg3  implements  Runnable{
    @Override
    public void run() {
        for (int i = 0; i <=10 ; i++)
        System.out.println(Thread.currentThread().getName() + " child program runs ");
    }
}


 class ThreadPrg4  implements  Runnable{
   Thread t=Thread.currentThread();
    @Override
    public void run() {
        for (int i = 0; i <=10 ; i++)
        System.out.println(Thread.currentThread().getName() + " child program runs ");
    }
}
class ThreadMain{
    public static void main(String[] args) {
        ThreadPrg2 threadPrg2=new ThreadPrg2();
        ThreadPrg3 threadPrg3=new ThreadPrg3();
        ThreadPrg4 threadPrg4=new ThreadPrg4();

        Thread thread1=new Thread(threadPrg2,"process1");
        Thread thread2=new Thread(threadPrg3,"process2");
        Thread thread3=new Thread(threadPrg4,"process3");

//        thread1.setName("process1");
//        thread2.setName("process2");
//        thread3.setName("process3");

        thread1.start();
        thread2.start();
        thread3.start();

    }
}

