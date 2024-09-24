public class Person1 {
    void info() {
        System.out.println("i m person");
    }
}

class Engineer extends Person1 {
    @Override
    void info() {
        System.out.println("i m engineer");
    }
}

class Passenger extends Person1 {
    @Override
    void info() {
        System.out.println("i m passenger");
    }
}

class Father extends Person1 {
    @Override
    void info() {
        System.out.println("i m Father");
    }
}

class PersonMain {
    public static void main(String[] args) {

        Person1 person1;

        person1 = new Passenger();
        person1.info();

        person1 = new Father();
        person1.info();

        person1 = new Engineer();
        person1.info();
        //runtime ploymorphism
        //late binding

    }

}

