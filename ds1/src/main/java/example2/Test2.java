package example2;

//class Node {
//    int data;
//    Node next;
//
//    Node(int x) {
//        this.data = x;
//    }
//}

public class Test2 {
    void prg1() {
        Node node = new Node(0);
        Node start = node;
        node.next = new Node(1);
        node.next.next = new Node(2);
        node.next.next.next = new Node(3);
        System.out.println("prg1");
        while (start != null) {
            System.out.print(start.data + ", ");
            start = start.next;
        }
    }

    void prg2() {
        Node node = new Node(0);
        Node start = node;
        node.next = new Node(1);
        node = node.next;
        node.next = new Node(2);
        node = node.next;
        node.next = new Node(3);

        System.out.println("prg2");
        while (start != null) {
            System.out.print(start.data + ", ");
            start = start.next;
        }
    }

    Node start = null;

    void pushatbeg(int x) {
        Node node = new Node(x);
        node.next = start;
        start = node;
    }

    // working as push at beginning
    void pushatlast(int x) {
        if (start == null) {
            System.out.println("List is empty");
        }
        Node node = new Node(x);
        node.next = start;
        Node p = start;
        while (start != null) {
            start = start.next;
        }
        start = node;
    }

    // working
    void pushatlast1(int x) {
        Node node = new Node(x);
        Node p;
        if (start == null) {
            start = node;
            return;
        }
        p = start;
        while (p.next != null) {
            p = p.next;
        }
        p.next = node;
    }

    void display1() {
        //Node node = start;
        System.out.println("\ndisplay1 ");
        while (start != null) {
            System.out.print(start.data + ", ");
            start = start.next;
        }
    }

    void display() {
        Node node = start;
        System.out.println("\ndisplay ");
        while (node != null) {
            System.out.print(node.data + ", ");
            node = node.next;
        }
    }

    void delete(int x) {
        if (start == null) {
            System.out.println("List is empty");
            return;
        }
        if (start.data == x) {
            start = start.next;
            return;
        }
        Node p=start;
        while(p.next!=null){
            if(p.next.data==x)
                break;
            p=p.next;
        }

    }

    public static void main(String[] args) {

        Test2 t2 = new Test2();
        t2.prg1();
        t2.prg2();
        t2.pushatbeg(11);
        if(t2.start==null)
            System.out.println("start is null");
        t2.pushatbeg(22);
        t2.pushatbeg(33);
        t2.pushatbeg(44);
        t2.display();
        t2.display1();

        t2.pushatlast(100);
        t2.pushatlast(101);
        t2.pushatlast(102);

        if(t2.start==null)
            System.out.println("start is null");

        t2.display1();

        t2.pushatlast1(100);
        t2.pushatlast1(101);
        t2.pushatlast1(102);
        System.out.println("after pushatlast1 ");
        t2.display1();

        System.out.println("\ndelete operation");

        t2.delete(100);
        t2.display();
    }
}
