package com.cts.model;

public class Person {
    private int personId;
    private String personName;
    private float personSalary;

    public Person(int personId, String personName, float personSalary) {
        this.personId = personId;
        this.personName = personName;
        this.personSalary = personSalary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", personName=" + personName +
                ", personSalary=" + personSalary +
                '}';
    }
}
