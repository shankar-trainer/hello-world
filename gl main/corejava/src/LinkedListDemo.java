import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> list1=new LinkedList<>();
		list1.add("chennai");
		list1.add("madurai");
		System.out.println(list1);
		
		list1.addFirst("kanchipuram");
		System.out.println(list1);
				
		list1.addLast("rameswaram");
		System.out.println(list1);
		
		//list1.remove();
		list1.removeLast();
		System.out.println(list1);
				
		System.out.println(list1.peek()); // head element no remove
		System.out.println(list1.peekLast()); // last element no remove
		System.out.println(list1.poll()); // head element with remove
		System.out.println(list1.pop()); // return and remove last element
		
		System.out.println(list1);
		
		System.out.println(list1.offer(" kanyakumari ")); // add element at last position
	}
}
