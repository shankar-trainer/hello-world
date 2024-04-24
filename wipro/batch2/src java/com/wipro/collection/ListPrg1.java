package com.wipro.collection;

import java.util.ArrayList;
import java.util.List;

public class ListPrg1 {
    public static void main(String[] args) {
        List  list1=new ArrayList();
        list1.add(4454554);
        list1.add(4000.45f);
        list1.add("hyderabad");
        list1.add(new Customer());

        System.out.println(list1);
        System.out.println(list1.get(0));
        System.out.println(list1.get(1));
        System.out.println(list1.get(2));
//generics collection
        List<String> language=new ArrayList<>();
        language.add("java");
        language.add("python");
        language.add("java");
        language.add("c++");
       // language.add(123);// error
        for (int i = 0; i <language.size() ; i++) {
            System.out.print(language.get(i)+", ");
        }



    }
}
class Customer{

}