/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.immutable;

import java.util.ArrayList;

public class Animal {

    private final ArrayList<String> favouriteFood;

    public Animal() {
        this.favouriteFood = new ArrayList<>();
        this.favouriteFood.add("apple");
    }

    public ArrayList<String> getFavouriteFood() {
        return favouriteFood;
    }

    public static void main(String[] args) {
        var zebra = new Animal();
        System.out.println(zebra.getFavouriteFood());
        zebra.getFavouriteFood().add("chocalates");
        System.out.println(zebra.getFavouriteFood());
    }
}

