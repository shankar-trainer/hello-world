package example3;
class Node{
    int data;
    Node prev;
    Node next;

    Node(int t){
        data=t;
        prev=next=null;
    }
}
public class DoublyLinkedList {
    public static void main(String[] args) {
        Node node1=new Node(10);
        Node node2=new Node(11);
        Node node3=new Node(12);

        node1.next=node2;
        node2.prev=node1;

        node2.next=node3;
        node3.prev=node2;

        System.out.println("node1");
        System.out.print(node1.data);
        System.out.print(","+node1.next.data);
        System.out.print(","+node1.next.next.data);

        System.out.println("\nnode2");
        System.out.print(node2.prev.data);
        System.out.print(", "+node2.data);
        System.out.print(", "+node2.next.data);

       System.out.println("\nnode3");
        System.out.print(node3.prev.prev.data);
        System.out.print(", "+node3.prev.data);
        System.out.print(", "+node3.data);

    }
}
