package deadlock.generics;

import java.util.*;

public class Example1 {

    public static void main(String[] args) {
        List  list1=new ArrayList();
        list1.add(767667);
        list1.add("hello");
        list1.add(new Employee());
        list1.add("java");
        System.out.println(list1);
        Collections.sort(list1);
    }
}
class Example2 {

    public static void main(String[] args) {
        List<String> list1=new ArrayList<>();
        //list1.add(767667);
        list1.add("java");

        list1.add("hello");
        //list1.add(new Employee());
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);

        TreeSet<Integer> treeSet=new TreeSet<>();
        treeSet.add(767676);
        treeSet.add(767671);
        treeSet.add(767672);
        treeSet.add(767679);
        //treeSet.add("welcome");

        System.out.println(treeSet);
    }
}

class Employee{

}