package com.coforge.lambda;

interface  Greeting{
    void hello();
    void welcome();
}

public class AnonymousInner {

    Greeting greeting=new Greeting() {
        @Override
        public void hello() {
            System.out.println("hello dear");
        }

        @Override
        public void welcome() {
            System.out.println("welcome ..");
        }
    };

    public static void main(String[] args) {
        AnonymousInner inner=new AnonymousInner();
        inner.greeting.hello();
        inner.greeting.welcome();
    }

}
