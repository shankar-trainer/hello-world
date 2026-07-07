package com.example;

public class Person {
 private int personId;
 private String  personName;

    public Person(int personId, String personName) {
        this.personId = personId;
        this.personName = personName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", personName='" + personName + '\'' +
                '}';
    }
}
