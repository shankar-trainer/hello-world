package linkedlist1;

public class Node {
    int element;
    Node next;

    Node(int x){
        this.element=x;
    }

    Node head,tail;
    int size=0;

    public void addFirst(int  n){
        Node newNode=new Node(n);
        newNode.next=head;
        head=newNode;
        size++;
        if(tail==null)
            tail=head;
      }


    public static void main(String[] args) {
        Node head=null;
        Node tail=null;
        head=new Node(10001);
        tail=head;
        tail.next=new Node(10002);
        tail=tail.next;
        tail.next=new Node(10003);
        tail=tail.next;

        while(head!=null){
            System.out.println(head.element);
            head=head.next;

        }
    }


}
