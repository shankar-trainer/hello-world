package com.abc.collection;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by shankar on 3/24/2023.
 */
class MyStringOrder implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}

public class StringReverse {

    public static void main(String[] args) {
        String ar[] = {"hello", "greeting", "world", "good"};
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));

        Arrays.sort(ar, new MyStringOrder());
        System.out.println(Arrays.toString(ar));

    }

}
