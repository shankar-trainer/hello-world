package linkedlist.google;

// Definition of a Node
class Node {
    int data;
    Node next;

    // Constructor to create a new node
    Node(int data) {
        this.data = data;
        this.next = null; // Points to null by default
    }
}

public class MyLinkedList {
    Node head; // Reference to the first node

    // Method to add a new node at the end
    public void append(int data) {
        Node newNode = new Node(data);
        
        // If the list is empty, make the new node the head
        if (head == null) {
            head = newNode;
            return;
        }

        // Otherwise, traverse to the last node
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        
        // Link the last node to the new node
        current.next = newNode;
    }

    // Method to display the list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.append(10);
        list.append(20);
        list.append(30);

        list.display(); // Output: 10 -> 20 -> 30 -> null
    }
}
