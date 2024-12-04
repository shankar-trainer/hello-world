package com.coforge.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class User{}
public class CollectionPrg1 {

    public static void main(String[] args) {

        List list1=new ArrayList();
        list1.add(1233);  // autoboxing converts the primitive to Object
        list1.add(1233.676f);
        list1.add("new delhi");
        list1.add(new User());

        System.out.println(list1);
        System.out.println(list1.get(0));
        //System.out.println(list1.get(1));

        list1.remove(0);
        System.out.println(list1);
        System.out.println(list1.contains(1233.676f));

        System.out.println("========== list1 data ====");
        for (int i = 0; i <list1.size() ; i++) {
            System.out.println(list1.get(i));
        }

        Collections.sort(list1);



    }

}
