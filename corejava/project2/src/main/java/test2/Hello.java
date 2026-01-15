package test2;

class A {
    A() {
        System.out.println("a");
    }
    int p=100;
}

class B extends A {
    B() {
        super();
        System.out.println("b");
    }
    void show(){
        System.out.println(super.p);
    }
}

class C extends B {
    C() {
        System.out.println("c");
    }

    public static void main(String[] args) {
        new C();
    }
}

class Test11 {
    public static void main(String[] args) {
        String s = "hello";
        s.concat("world");
        System.out.println(s);
    }
}


public class Hello {
    //    public static void main(String[] args) {
    static public void main(String[] args) {

        System.out.println("hello");
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));


    }

    public static void main(String s) {

    }
}


class test11 {

    static {
        System.out.println("static called ");
    }

    test11() {
        System.out.println("constructor called");
    }

    static public void main(String[] args) {
        new test11();
        new test11();
        new test11();
    }
}
class test23{
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        String s3=new String("hello");

        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));

    }
}
class Product{
     int id;
     String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Product product1=new Product(1,"abc");
        Product product2=new Product(1,"abc");
        System.out.println(product1.equals(product2));
    }
}


class Employee{
     int id;
     String name;

    public static void main(String[] args) {
        Employee employee[]=new Employee[4];

        for (int i = 0; i <employee.length ; i++) {
            employee[i].id=999;
            employee[i].name="abc";
        }
    }
}