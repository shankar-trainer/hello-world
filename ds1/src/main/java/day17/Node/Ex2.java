package day17.Node;

public class Ex2 {

	public static void main(String[] args) {
		Node start=new Node(0);
	    
		Node p=start;
	    p.next=new Node(1);
	    
	    p=p.next;
	    p.next=new Node(2);
	    
	    p=p.next;
	    p.next=new Node(3);
	    
	    p=p.next;
	    p.next=new Node(4);
	    // start -->p.next-->p.next
	    
	    while(start!=null){
	    	System.out.println(start.data);
	    	start=start.next;
	    }
	    
		
	}
}
