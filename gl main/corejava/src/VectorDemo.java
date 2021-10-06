import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		// List<Integer> list1=new Vector<>();
		Vector<Integer> list1 = new Vector<>();

		System.out.println(list1.size() + "   " + list1.capacity());

		for (int i = 1; i <= 10; i++)
			list1.add(new Random().nextInt());

		System.out.println(list1.size() + "   " + list1.capacity());
		list1.add(999);

		System.out.println(list1.size() + "   " + list1.capacity());
		
		Enumeration<Integer> en1=list1.elements();
		
		while(en1.hasMoreElements())
		   System.out.println(en1.nextElement());
		
		//Iterator<Integer> it=list1.iterator();
		
		ListIterator<Integer> it=list1.listIterator();
		
		while (it.hasNext()) {
			System.out.print(it.next()+"  ");
			//it.remove();
		}
	
		System.out.println("In reverse order");
		
		while(it.hasPrevious())
			System.out.println(it.previous());
		
		System.out.println("\n..."+list1);

	}
}
