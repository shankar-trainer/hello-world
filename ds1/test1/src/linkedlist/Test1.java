package linkedlist;

import java.util.LinkedList;

public class Test1 {
    public static void main(String[] args) {
        Node node1=new Node(10);
        node1.next=new Node(11);
        node1.next.next=new Node(13);

//        System.out.println(node1.data);
//        System.out.println(node1.next.data);
//        System.out.println(node1.next.next.data);

        while(node1!=null){
            System.out.print(node1.data+",");
            node1=node1.next;
        }
 //       LinkedList list1;
   //     list1.addFirst("");
    }
}
