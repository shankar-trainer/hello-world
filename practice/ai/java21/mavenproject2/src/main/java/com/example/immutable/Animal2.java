
package com.example.immutable;

import java.util.ArrayList;
import java.util.List;

public final class Animal2 {

    private final List<String> favouriteFood;

    public Animal2() {
        List<String> food = new ArrayList<>();
        food.add("apple");

        this.favouriteFood = List.copyOf(food);
    }

    public List<String> getFavouriteFood() {
        return favouriteFood;
    }

    public static void main(String[] args) {

        Animal2 zebra = new Animal2();

        System.out.println(zebra.getFavouriteFood());

        // This will throw UnsupportedOperationException
        zebra.getFavouriteFood().add("chocolates");
    }
}
/*

To make your Animal class fully immutable, we need to ensure that:

The class cannot be extended (use final).

All instance variables are private final.

Variables are initialized only through the constructor.

No setter methods are provided.

Mutable objects are defensively copied.

Getters must not expose the internal mutable objects.

*/