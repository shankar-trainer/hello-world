package com.abc.abstract1;

/**
 * Created by shankar on 3/23/2023.
 */
public class MyPhone  implements  SmartPhone {

    @Override
    public void call() {
        System.out.println("i can call");
    }

    @Override
    public void message() {
        System.out.println("i can message");

    }

    @Override
    public void playVideo() {
        System.out.println("i can play video");

    }

    @Override
    public void playeGame() {
        System.out.println("i can play game");

    }

    public static void main(String[] args) {
        MyPhone  myPhone=new MyPhone();
        myPhone.call();
        myPhone.message();
        myPhone.playeGame();
        myPhone.playVideo();
    }
}
