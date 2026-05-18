package node.example1;

public class Test4 {
    //private static Node next;

    static class Node {
        int data;
        Node next;

        Node(int k) {
            this.data = k;
        }
    }

    public static void main(String[] args) {
     Node start=new Node(1);
     Node node=start;
     node.next=new Node(2);
     node.next.next=new Node(3);
     node.next.next.next=new Node(4);
     
     while(start!=null){
      System.out.println(start.data);
      start=start.next;
      }     
    
    start=new Node(11);
    Node node1=start;
    
    //Node node1=new Node(11);
    Node node2=new Node(12);
    Node node3=new Node(13);
    Node node4=new Node(14);

    node1.next=node2;
    node2.next=node3;
    node3.next=node4;

     while(start!=null){
     System.out.println(start.data);
     start=start.next;
     }
    }
}
