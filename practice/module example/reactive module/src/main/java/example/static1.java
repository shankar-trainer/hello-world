package example;

class Parent {
    static void display() {
        System.out.println("Parent static method");
    }
    void show() {
        System.out.println("Parent instance method");
    }
}

class Child extends Parent {
    // This hides the Parent's static method, it does NOT override it
    static void display() {
        System.out.println("Child static method");
    }
    // This overrides the Parent's instance method
    @Override
    void show() {
        System.out.println("Child instance method");
    }
}

class Main {
    public static void main(String[] args) {
        Parent p = new Child();
        p.display(); // Calls Parent's static method (resolved at compile time by reference type)
        p.show();    // Calls Child's instance method (resolved at runtime by object type)
    }
}
