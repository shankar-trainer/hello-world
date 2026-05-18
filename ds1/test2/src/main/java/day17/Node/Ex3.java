package day17.Node;

public class Ex3 {

	public static void main(String[] args) {
		Node start = new Node(0);

		Node p = start;

		for (int x = 1; x <= 10; x++) {
			p.next = new Node(x + 1000);
			p = p.next;
		}

		Node head = p.next;
		Node.insertAtTail(head, 30);

		while (start != null) {
			System.out.println(start.data);
			start = start.next;
		}

	}
}
