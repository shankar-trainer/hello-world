package example1;

public class Test2 {

    static class Node {
        int data;
        Node next;

        Node(int k) {
            data = k;
        }
    }

    public static void main(String[] args) {
        Node start = new Node(101);
        Node node = start;
        node.next = new Node(102);
        node.next.next = new Node(103);
        node.next.next.next = new Node(104);

        while (start != null) {
            System.out.println(start.data);
            start=start.next;
        }

    }
}
