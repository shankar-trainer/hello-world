package com.abc.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by shankar on 3/23/2023.
 */
public class MapProgram {

    public static void main(String[] args) {

        Map<Character,String> language=new TreeMap<>();// keys are sorted
                //HashMap<>();// neither sorted nor ordered
        language.put('h',"hindi");// using put- add values
        language.put('n',"nepali");// put(key,value)
        language.put('m',"maithili");
        language.put('t',"tamil");
        language.put('t',"telugu");// no duplicate key

        language.put('k',"tamil");

        language.remove('m'); // remove using key
        System.out.println(language);
        System.out.println(language.get('h'));  // get method using key returns value
        System.out.println(language.get('t'));  // get method using key returns value

        Set<Character> keys = language.keySet();// keySet return all keys in set form

        for (Character k:keys ) {
            System.out.println(k+"    "+language.get(k));
        }

    }
}
