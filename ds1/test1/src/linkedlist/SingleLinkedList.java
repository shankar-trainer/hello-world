package linkedlist;

public class SingleLinkedList {
    private Node start = null;
// at last
    public void create(int data) {
        Node node = new Node(data);
        if (start == null) {
            start = node;
            return;
        }
        //else
        {
            Node current = start;

            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }
// add at start
    public void insert(int data){
    Node node=new Node(data);
    node.next=start;// Point new node to current head
    start=node;   // Make new node the new head
    }

    public void displayList() {
        Node p;
        if (start == null) {
            System.out.println("list is empty");
            return;
        }
        p = start;
        while (p != null) {
            System.out.print(p.data + ",");
            p = p.next;
        }
    }

    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.create(1);
        list.create(2);
        list.create(3);
        list.displayList();
    }
}

