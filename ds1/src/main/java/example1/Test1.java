package example1;

public class Test1 {

static  class Node{
        int data;
        Node next;
        Node(int k){
            data=k;
        }
    }

    public static void main(String[] args) {
        Node node1=new Node(1);
        node1.next=new Node(2);
        node1.next.next=new Node(3);

        System.out.println(node1.data);
        System.out.println(node1.next.data);
        System.out.println(node1.next.next.data);
    }
}
