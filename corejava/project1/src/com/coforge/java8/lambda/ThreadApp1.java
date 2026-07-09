package com.coforge.java8.lambda;

/*public class ThreadApp1  implements  Runnable {
    @Override
    public void run() {
    }
}*/

// anonymous inner class
/*public class ThreadApp1  {
    public static void main(String[] args) {
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println(" child  thread runs");
            }
        };
    }
}*/

import com.coforge.thread.ThreadPrg1;

import java.util.Comparator;

public class ThreadApp1  {
    Comparable c;// not functional interface
    Runnable r;// functional interface
    Comparator co;//functional interface
    public static void main(String[] args) {
        Runnable runnable=()-> System.out.println("child thread runs");
        Thread t1=new Thread(runnable);
        t1.start();
    }
}




