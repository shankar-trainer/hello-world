package com.wipro.inheritance;
//super class
public class Animal {
    void speak(){
        System.out.println("animal speak");
    }
}
// subclass
class Dog extends  Animal{
    @Override
    void speak() {
        System.out.println("dog barks");
    }
}
//subclass
class Cat extends  Animal{
    @Override
    void speak() {
        System.out.println("Cat mews ");
    }
}
class AnimalMain{
    public static void main(String[] args) {
        Animal animal;     // runtime polymorphism
        animal=new Dog();// interpretter (jvm) detects animal implementation object
        animal.speak();   // done at run time(dynamic binding)
        animal=new Cat();// interpretter(jvm) detects animal implementation object
        animal.speak();
    }
}