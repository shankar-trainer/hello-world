package com.cts;

public abstract interface Phone {
    void call();           // all methods are by default public abstract
    //   public abstract void call();
    void message();
    String country = "india"; // all variables are public static final
    //public static final String country;
}

interface BudgetPhone extends Phone {
    void audioPlay();
}
//interface extends multiple interfaces
// multiple inheritance
//SmartPhone has two parent classes Phone, BudgetPhone
interface SmartPhone extends Phone, BudgetPhone {
    void internetSurfing();
    void banking();
    void videoPlay();
    void gamePlay();
}
//one class can extends only one class but can implement multiple interfaces
// multiple inheritance
class MyPhone extends  A implements  Phone,SmartPhone,BudgetPhone{

    @Override
    public void internetSurfing() {
        System.out.println("MyPhone can do internetSurfing");
    }

    @Override
    public void banking() {
        System.out.println("MyPhone can do banking");
    }

    @Override
    public void videoPlay() {
        System.out.println("MyPhone can do videoPlay");
    }

    @Override
    public void gamePlay() {
        System.out.println("MyPhone can do gamePlay");
    }

    @Override
    public void audioPlay() {
        System.out.println("MyPhone can do audioPlay");
    }

    @Override
    public void call() {
        System.out.println("MyPhone can do call");
    }

    @Override
    public void message() {
        System.out.println("MyPhone can do message");
    }

    public static void main(String[] args) {
        MyPhone myPhone=new MyPhone();
        System.out.println("phone features ");
        myPhone.call();
        myPhone.message();
        myPhone.audioPlay();
        myPhone.videoPlay();
        myPhone.gamePlay();
        myPhone.internetSurfing();
        System.out.println("country name :"+Phone.country);
        //Phone.country=""; // error
    }
}
class A {
}

class B {
}
//class C extends A,B{} // error
// one class can extends only one class but can implement multiple interfaces