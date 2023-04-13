package com.abc.collection;

import java.util.LinkedList;

/**
 * Created by shankar on 3/23/2023.
 */
public class LinkedListPrg1 {

    public static void main(String[] args) {
        LinkedList<String>  linkedList=new LinkedList<>();
        linkedList.add("delhi");
        linkedList.add("kathmandu");
        linkedList.add("veeratnagar");// add at last
        linkedList.addFirst("janakpur");// add at first position

        System.out.println(linkedList);
       // linkedList.add

        linkedList.remove();//remove from first position
        linkedList.removeLast();//remove from last position
        System.out.println(linkedList);
    }

}
