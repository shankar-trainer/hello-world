import java.util.ListIterator;
import java.util.Vector;

public class ListDemo2 {

	public static void main(String[] args) {
		Vector<Integer> list1 = new Vector<>();
		for (int i = 1; i <= 10; i++) {
			list1.add(1000 + i);
		}

		ListIterator<Integer> it = list1.listIterator();

		while (it.hasNext()) 
			System.out.print(it.next() + "  ");
		

		System.out.println("In reverse order");

		while (it.hasPrevious())
			System.out.println(it.previous());
	}
}
