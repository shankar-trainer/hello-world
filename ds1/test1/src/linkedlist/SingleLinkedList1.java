package linkedlist;

public class SingleLinkedList1 {

    Node start=null;
    void addLast(int data){
        Node newnode=new Node(data);
        Node current=start;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newnode;
    }

    public static void main(String[] args) {

    }

}

