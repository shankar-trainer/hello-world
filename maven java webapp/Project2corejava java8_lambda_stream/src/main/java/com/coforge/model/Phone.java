package com.coforge.model;
public interface Phone {
       //void call();
       public abstract void call();
       //String country;
       public static final String country="india";
}

interface Mobile {
    void call();
     void message();
     void playAudioSongs();
}
interface SmartPhone {
    void call();
    void message();
    void playAudioSongs();
    void playVideo();
    void netSurf();
    void payment();
}
// multiple inheritance -- one subclass have multiple super class
interface MyPhone extends  Phone,Mobile, SmartPhone{
    void calendar();
    void email();
}


