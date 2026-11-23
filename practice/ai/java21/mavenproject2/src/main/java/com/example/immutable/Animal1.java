/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.immutable;

import java.util.ArrayList;

public class Animal1 {

    private final ArrayList<String> favouriteFood;

    public Animal1() {
        this.favouriteFood = new ArrayList<>();
        this.favouriteFood.add("apple");
    }

//    public ArrayList<String> getFavouriteFood() {
//        return favouriteFood;
//    }
    
    public int getFavouriteFoodCount() {
        return favouriteFood.size();
    }
    
    public String  getFavouriteFoodItem(int i) {
        return favouriteFood.get(i);
    }
    

    public static void main(String[] args) {
        var zebra = new Animal1();
        System.out.println(zebra.getFavouriteFood());
        zebra.getFavouriteFood().add("chocalates");
        System.out.println(zebra.getFavouriteFood());
    }
}
