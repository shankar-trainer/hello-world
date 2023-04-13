package com.abc.thread;

/**
 * Created by shankar on 3/24/2023.
 */
public class MyThreadApp1  extends  Thread {

    @Override
    public void run() {
        for (int i = 0; i <=40 ; i++) {

        System.out.println(i+" child thread program "+getName());
        }
    }

    public static void main(String[] args) {
        System.out.println("main thred starts");
        MyThreadApp1 app1=new MyThreadApp1();
        MyThreadApp1 app2=new MyThreadApp1();
        MyThreadApp1 app3=new MyThreadApp1();

        app1.start();
        app2.start();
        app3.start();

        System.out.println("main thred ends ");
    }
}
