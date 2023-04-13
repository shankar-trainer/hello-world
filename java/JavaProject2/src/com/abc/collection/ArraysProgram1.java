package com.abc.collection;

import java.util.Arrays;

/**
 * Created by shankar on 3/23/2023.
 */
public class ArraysProgram1 {

    public static void main(String[] args) {
        int arr1[]={11,2,3,1,8,90};
        int arr2[]={11,2,3,1,8,90};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.equals(arr1,arr2));
        Arrays.sort(arr1);

        System.out.println("after sort arr1 is "+Arrays.toString(arr1));

        int i = Arrays.binarySearch(arr1, 33);
        if(i>=0)
            System.out.println("found at "+i);
        else
            System.out.println(" not found");
    }

}
