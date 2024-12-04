package com.coforge.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HighestMarkInEachSemester {

    static List<ArrayList<Integer>> marks1 = new ArrayList<>();

    static void  display(List<ArrayList<Integer>> m){
        int x=1;
        for (ArrayList<Integer> list1:m)
            System.out.println("Maximum mark in "+(x++)+" semester:"+Collections.max(list1));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of semester");
        int n = scanner.nextInt();

        ArrayList<Integer> arrayList = null;
        arrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter no of subjects in " + (i + 1) + " semester:");
            arrayList.add(scanner.nextInt());
        }

        ArrayList<Integer> arrayList1 = null;
        for (int i = 0; i < n; i++) {
            System.out.println("Marks obtained in semester " + (i + 1) + ":");
            arrayList1 = null;
            arrayList1 = new ArrayList<>();

            for (int j = 0; j < arrayList.get(i); j++) {
                arrayList1.add(scanner.nextInt());
            }
            Collections.sort(arrayList1);
            marks1.add(arrayList1);
        }
      display(marks1);
    }
}
