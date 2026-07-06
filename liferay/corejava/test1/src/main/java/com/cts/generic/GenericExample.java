package com.cts.generic;

public class GenericExample<T>
{
    T t;

    public GenericExample(T t) {
        this.t = t;
    }

    public void add(T t){
        this.t=t;
    }
    public void remove(){
        this.t=null;
    }
    public T get(){
        return t;
    }
    public static  <T> void getAll(T[] t){
        for(T t1:t)
            System.out.print(t1+",");
    }

    @Override
    public String toString() {
        return "{" +
                "t=" + t +
                '}';
    }

    public static void main(String[] args) {

        GenericExample<Integer> example1=new GenericExample<>(10000);
        GenericExample<String> example2=new GenericExample<>("hello world");
        GenericExample<Float> example3=new GenericExample<>(1200.56f);

        GenericExample.getAll(new GenericExample[]{example1,example2,example3});
//
//        System.out.println(example1.get());
//        System.out.println(example2.get());
//        System.out.println(example3.get());
//        System.out.println(example1);
//        System.out.println(example2);
//        System.out.println(example3);
//         example3.remove();
//        System.out.println(example3.get());
    }
}
class Hello<T,U,V>{
    T t;
    U u;
    V v;

    public Hello(T t, U u, V v) {
        this.t = t;
        this.u = u;
        this.v = v;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "t=" + t +
                ", u=" + u +
                ", v=" + v +
                '}';
    }
}