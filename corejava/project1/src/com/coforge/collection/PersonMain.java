package com.coforge.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortedByName implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

public class PersonMain {

    public static void main(String[] args) {
        List<Person> personList= Arrays.asList(
                new Person[]{
                 new Person(10004,"hari parsad",23000),
                 new Person(10002,"parmila devi",21000),
                 new Person(10009,"basant kumar",20000),
                }
        );
        System.out.println(personList);
        Collections.sort(personList,new SortedByName());

        System.out.println("sorted by name");
        System.out.println(personList);

        Comparator<Person> personComparator=new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return new Float(o1.getSalary()).compareTo(new Float(o2.getSalary()));
            }
        };

        Collections.sort(personList, personComparator);

        System.out.println("sorted by salary");
        System.out.println(personList);

    }
}
