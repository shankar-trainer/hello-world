package deadlock.generics;

public class GenericClass<A> {
    private A a;

    public GenericClass(A a) {
        this.a = a;
    }
    public A get(){
        return  a;
    }

    public static void main(String[] args) {
        GenericClass<Integer> aClass1=new GenericClass<>(111);
        GenericClass<String> aClass2=new GenericClass<>("welcome");
        GenericClass<Float> aClass3=new GenericClass<>(6676767.566f);
        System.out.println(aClass1.get());
        System.out.println(aClass2.get());
        System.out.println(aClass3.get());
    }
}
