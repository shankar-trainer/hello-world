package com.coforge.model;

public interface  WeekDays {

    int monday=1;
    int tuesday=2;
    int wednesday=3;
    int thursday=4;
    int friday=5;
    int saturday=6;
    int sunday=7;
}

class Birthday{
    public static void main(String[] args) {
        int day=WeekDays.monday;
        System.out.println("birthday is on "+day);
    }
}
