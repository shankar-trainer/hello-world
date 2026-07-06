package com.cts.thread;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class ParralelSort {

    public static void main(String[] args) {
        int ar[]={11,22,1,0,9,7};
//        Arrays.sort(ar);// sequential sort

        Arrays.parallelSort(ar);

        System.out.println(Arrays.toString(ar));

    }
}
