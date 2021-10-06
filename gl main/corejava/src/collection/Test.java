package collection;

import java.util.ArrayList;
import java.util.List;
class Book{
	int isbn;
	String name;
}
public class Test {
	
	public static void main(String[] args) {
		
		List list1=new ArrayList();
		list1.add(new Integer(100));
		list1.add(new Double(5665.67));
		list1.add(67766);
		list1.add("delhi");
		list1.add(new Book());
		
		System.out.println(list1);
		System.out.println(list1.get(0));
		
		System.out.println("\nusing for loop\n");
		
		for (int i = 0; i <list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		list1.remove(0);
		list1.remove("delhi");
		
		System.out.println("\nusing for each \n");
		
		for (Object object : list1) {
			System.out.println(object);
		}
		
	}
}
