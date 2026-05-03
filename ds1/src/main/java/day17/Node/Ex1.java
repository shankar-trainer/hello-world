package day17.Node;

public class Ex1 {

	public static void main(String[] args) {
		Node start=new Node(10);
		start.next=new Node(20);
		start.next.next=new Node(30);
		start.next.next.next=new Node(40);
		
		//start-->start.next-->start.next.next-->start.next.next.next
		//  1---- 2------------3--------------------4
		
		System.out.println(start.data);
		System.out.println(start.next.data);
		System.out.println(start.next.next.data);
		System.out.println(start.next.next.next.data);
		
		
	}
}
