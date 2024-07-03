public class Animal {
    void speak(){
        System.out.println("animal speak");
    }
}
class Dog extends Animal{
    @Override
    void speak() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    @Override
    void speak() {
        System.out.println("Cat mews");
    }
}
class Horse extends Animal{
    @Override
    void speak() {
        System.out.println("Horse neighs");
    }
}
class AnimalMain{

    public static void main(String[] args) {
        Animal animal;

        animal=new Dog();
        animal.speak();

        animal=new Cat();
        animal.speak();
        animal=new Horse();
        animal.speak();
    }
}