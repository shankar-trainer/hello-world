package example1;

import java.util.LinkedList;

public class Test3 {

    static class Node {
        int data;
        Node next;

        Node(int k) {
            data = k;
        }
    }

    public static void main(String[] args) {
        Node start = new Node(201);
        Node node = start;

        node.next = new Node(202);

        node = node.next;
        node.next = new Node(203);

        node = node.next;
        node.next = new Node(104);
        System.out.println(start.data);
        System.out.println(start.next.data);
        System.out.println(start.next.next.data);

        while (start != null) {
            System.out.print(start.data + ",\t");
            start = start.next;
        }
        //    LinkedList linkedList;

    }
}
