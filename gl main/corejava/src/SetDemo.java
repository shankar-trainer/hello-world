import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<String> set1=new //LinkedHashSet<>();
				//TreeSet<>();
				HashSet<>();
		
		set1.add("book");
		set1.add("shirt");
		set1.add("mobile");
		set1.add("book");
		
		System.out.println(set1);
		
	 Iterator<String> it=	set1.iterator();
		
		while (it.hasNext()) {
			String string =  it.next();
			System.out.println(string);		
		}
		
		for (String string : set1) {
			System.out.println(string);
		}
	
	}
}
