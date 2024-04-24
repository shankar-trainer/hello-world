public class Person {
    void info() {
        System.out.println(" I am person ");
    }
}

class Manager extends Person {
    @Override
    void info() {
        System.out.println(" I am Manager");
    }
}
class Passenger extends Person {
    @Override
    void info() {
        System.out.println(" I am passenger");
    }
}
class Father extends Person {
    @Override
    void info() {
        System.out.println(" I am father");
    }
}
class PersonMain{
    public static void main(String[] args) {
         Person p;
         p=new Passenger();
         p.info();

         p=new Father();
         p.info();

         p=new Manager();
         p.info();
    }
}

