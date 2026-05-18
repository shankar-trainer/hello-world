package  test1;
public class List1 {

    public static void main(String[] args) {

        Node start=new Node(1);
        Node node=start;

        //Node start=node;
        System.out.print(node.data+",");
        //node=node.next;
        node.next=new Node(2);
        System.out.print(node.data+",");

        node = node.next;
        node.next = new Node(3);
        System.out.println(node.data);

        while(start!=null){
            System.out.println(start.data);
            start=start.next;
        }
    }

}
