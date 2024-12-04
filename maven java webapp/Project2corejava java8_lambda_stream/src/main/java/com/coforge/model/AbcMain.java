package com.coforge.model;

public class AbcMain {
    public static void main(String[] args) {
        AbcPhone abcPhone=new AbcPhone(8776768,"samsumg",12000);
        System.out.println(abcPhone);

        abcPhone.calendar();
        abcPhone.call();
        abcPhone.email();
        abcPhone.message();
        abcPhone.netSurf();
        abcPhone.payment();
        abcPhone.playAudioSongs();
        abcPhone.playVideo();

       // abcPhone.country="nepal"; // error
    }
}
