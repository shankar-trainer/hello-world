package collection;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<String> country=new Stack<>();
		country.push("india");
		country.push("china");
		country.push("srilanka");
		
		System.out.println(country);
		System.out.println(country.peek());// peek return top element
		System.out.println(country.pop()); // pop will remove n return top element

		System.out.println(country.firstElement());
		
		for (String string : country) {
			System.out.println(string);
		}		
	}
}
