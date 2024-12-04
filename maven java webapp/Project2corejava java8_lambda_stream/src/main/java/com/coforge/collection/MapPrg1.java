package com.coforge.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapPrg1 {

    public static void main(String[] args) {
        Map<Integer,String> employeeMap=new HashMap<>();
           // key, value
        //  no duplicate key
        employeeMap.put(1001,"ram kumar");
        employeeMap.put(1002,"shyam kumar");
        employeeMap.put(1003,"ram kumar");
        employeeMap.put(1001,"amit kumar");

        System.out.println("1001 is id of "+employeeMap.get(1001));
        System.out.println("1002 is id of "+employeeMap.get(1002));
        System.out.println("1005 is id of "+employeeMap.get(1005));

        System.out.println(employeeMap);
        Set<Integer> keys  = employeeMap.keySet();//keySet returns keys in the form of set

        for(Integer k:keys)
            System.out.println(k+"  ------   "+employeeMap.get(k));

        employeeMap.remove(1001);// remove element using key

        System.out.println(employeeMap.containsKey(1001));
        System.out.println(employeeMap.containsValue("ram kumar"));

        Collection<String> values = employeeMap.values(); // returns values

        Set<Map.Entry<Integer, String>> entries = employeeMap.entrySet();

        for(Map.Entry<Integer, String> entry:entries)
            System.out.println(entry.getKey()+"    "+entry.getValue());


    }
}
