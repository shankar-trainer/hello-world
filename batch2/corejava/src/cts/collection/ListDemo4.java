package cts.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo4 {

	public static void main(String[] args) {
		List<String> language1 = new ArrayList<>();

		language1.add("java");
		language1.add("php");
		language1.add("python");
		language1.add("jython");

		Iterator<String> it = language1.iterator();

		while (it.hasNext()) {
		   if(it.next().equals("java"))
			   it.remove();
		   else
		   System.out.println(it.next());
		}
		
		System.out.println(language1);

	}
}
