package example1;

public class Test4 {

    static class Node {
        int data;
        Node next;

        Node(int k) {
            data = k;
        }
    }

    static void display(Node start) {
        while (start != null) {
            System.out.print(start.data + ",\t");
            start = start.next;
        }
    }

    public static void main(String[] args) {
        Node start = new Node(201);
        Node node = start;

        node.next = new Node(202);

        node = node.next;
        node.next = new Node(203);

        node = node.next;
        node.next = new Node(204);
        System.out.println(start.data);
        System.out.println(start.next.data);
        System.out.println(start.next.next.data);

        display(start);

        //    LinkedList linkedList;

    }
}
