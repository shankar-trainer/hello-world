public class Overloading {

    void welcome(String s){

    }
    void welcome(String s, Integer y){

    }
    void welcome(String s, String s2){

    }
    void welcome(Float s){

    }

    public static void main(String[] args) {
        Overloading overloading=new Overloading();
        overloading.welcome("hello");
        overloading.welcome(54565f);
        overloading.welcome("hello","india");
        overloading.welcome("hello",123);
    }



}
