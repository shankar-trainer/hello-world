
class Node {
    int data;

    public Node(int data) {
        this.data = data;
    }

    Node next;

    static Node insertAtTail(Node tail, int data) {
        Node node = new Node(data);
        node.next = tail;
        return node;
    }
}

public class LinkedList1 {

    public static void main(String[] args) {
        prg1();
        prg2();
    }
    static void prg1(){
        Node node = new Node(1);
        System.out.println(node.data);
        node.next = new Node(2);
        System.out.println(node.next.data);
        node.next = new Node(3);
        System.out.println(node.next.data);
    }

    static void prg2(){
        Node start = new Node(0);
        Node node = start;

        node.next = new Node(1);
        node = node.next;

        node.next = new Node(2);
        node = node.next;

        node.next = new Node(3);
        node = node.next;

        while(start!=null){
            System.out.print(start.data+", ");
            start=start.next;
        }
    }
    /*static void prg3(){
        Node node=new Node(1);
        Node.insertAtTail(2);
        Node.insertAtTail(3);
        Node.insertAtTail(4);
    }*/
}
