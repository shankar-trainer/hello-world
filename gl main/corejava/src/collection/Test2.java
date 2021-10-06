package collection;

import java.util.ArrayList;
import java.util.List;
public class Test2 {
	
	public static void main(String[] args) {
		//List<String> list1=new ArrayList<String>();
		List<String> list1=new ArrayList<>();
		
		//list1.add(6776766);
		list1.add("java");
		list1.add("nodejs");
		list1.add("ruby");
		list1.add("perl");
		list1.add("unix");
		
		list1.add("nodejs");
		
		System.out.println(list1);
		
		for (String string : list1) {
			System.out.println(string);
		}
		
		System.out.println("java is present in the list "+list1.contains("java"));
		System.out.println("java is present in the list at  "+list1.indexOf("java")+"  position");
		
		System.out.println("nodejs  is present in the list at  "+list1.indexOf("nodejs")+"  position");
		System.out.println("nodejs  is present in the list at  "+list1.lastIndexOf("nodejs")+"  position");
		
		
	}
}
