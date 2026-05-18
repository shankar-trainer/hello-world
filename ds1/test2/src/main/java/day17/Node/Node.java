package day17.Node;

public class Node {

	int data;
	Node next;

	public Node(int data) {
		this.data = data;
	}

	static Node insertAtTail(Node head, int data) {
		Node node = new Node(data);
		node.next = head;
		return node;
	}
}
