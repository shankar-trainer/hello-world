package example2;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
    }
}

public class SingleLinkedList {
    Node start;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = start;
        start = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (start == null) {
            start = newNode;
        } else {
            Node current = start;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    void display() {
        System.out.println("---------- display -------------");
        Node current = start;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        // add first
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.display();

        // add at the last
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.display();
    }
}
