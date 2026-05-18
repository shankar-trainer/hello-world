package test1;
public class Node {
public int data;
public  Node next;

    public Node(int data) {
        this.data = data;
        this.next =null;
    }
    static Node insertAtTail(Node tail, int data) {
        Node node = new Node(data);
        node.next = tail;
        return node;
    }
}
