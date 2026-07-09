package com.coforge.collection;

// inner class  Outer.class
public class Outer {
    Outer() {
    }

    private String location;
// Outer.Inner.class
    private class Inner {
        Inner() {
        }

        int id;
        String name;
    }
}
