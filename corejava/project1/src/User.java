public class User {
    void introduction(){
        System.out.println("i m user");
    }
    static void hello(){
        System.out.println("this is polymorphism");
    }
}
class Passenger extends  User {
  // @Override static methods are inherited but can not be overridden
    //  static methods can be rewritten
     static void hello(){
        System.out.println("this is polymorphism by passenger");
    }

    @Override
    void introduction(){
        System.out.println("i m passenger");
    }
}
class Father  extends  User{
    void introduction(){
        System.out.println("i m father");
    }
}
class UserMain{
    public static void main(String[] args) {
        User user;      //dynamic binding by jvm, by overriding, runtime polymorphism
        user=new Father();
        user.introduction();
        user=new Passenger();
        user.introduction();

        Father.hello();
        Passenger.hello();
    }
}

