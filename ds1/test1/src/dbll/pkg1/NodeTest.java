class NodeTest{
	public static void main(String args[]){

		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);

		n1.next=n2;
		n2.prev=n1;
		n2.next=n3;
		n3.prev=n2;

		System.out.println(n1.data);
		System.out.println(n1.next.data);
		System.out.println(n2.next.data);

		System.out.println(n2.data);
		System.out.println(n2.next.data);
		System.out.println(n2.prev.data);

		}

}