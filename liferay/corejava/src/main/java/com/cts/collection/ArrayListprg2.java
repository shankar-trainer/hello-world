package com.cts.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListprg2 {

    public static void main(String[] args) {
        ArrayList<String> cityList=new ArrayList<>();
        cityList.add("chennai");
        cityList.add("madurai");
        cityList.add("chennai");
        cityList.add("mumbai");
        cityList.add("chennai");
//        cityList.add(8878);// error

        System.out.println(cityList);
        Collections.sort(cityList);
        System.out.println("sorted "+cityList);

        // binary search
        int  index=Collections.binarySearch(cityList,"mumbai");
        if(index>=0)
        System.out.println(":found at "+index);
        else
            System.out.println("not found");

//        ArrayList<String> cityList1=new ArrayList<>(cityList);
        ArrayList<String> cityList1=new ArrayList<>();
        cityList1.add("kolkotta");
        cityList1.add("banglore");
        cityList1.add("delhi");

        cityList1.addAll(cityList);

        System.out.println(cityList1.contains("delhi"));
        System.out.println(cityList1.containsAll(cityList));
    }
}
