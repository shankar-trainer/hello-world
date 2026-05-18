package example2;

public class Test1 {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    static void display1() {
        Node node = new Node(1);
        Node start = null;
        start = node;
        node.next = new Node(2);
        node = node.next;
        node.next = new Node(3);

        System.out.println("display1");
        while (start != null) {
            System.out.print(start.data + ",");
            start = start.next;
        }
    }

    static void display2() {
        Node node = new Node(1);
        Node start = null;
        start = node;
        node.next = new Node(2);
        node.next.next = new Node(3);

        System.out.println("\ndisplay2");
        while (start != null) {
            System.out.print(start.data + ",");
            start = start.next;
        }
    }

    static Node start = null;

    static void displayMain() {
        System.out.println("\ndisplay3");

        Node node = start;
        while (node != null) {
            System.out.print(node.data+", ");
            node = node.next;
        }
    }

    public static void addNodeAtBeginning(int d) {
        Node node = new Node(d);
        node.next = start;
        start = node;
    }

    public static void addNodeAtEnd(int d) {
        Node node = new Node(d);
       start=null;
        start=node;
    }

    public static void main(String[] args) {
        //display1();
        //display2();
        addNodeAtBeginning(11);
        addNodeAtBeginning(22);
        addNodeAtBeginning(33);
        addNodeAtBeginning(44);

        displayMain();
    }
}
