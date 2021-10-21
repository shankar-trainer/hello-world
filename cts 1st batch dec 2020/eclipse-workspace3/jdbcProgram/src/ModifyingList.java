import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ModifyingList {
	public static void main(String[] args) {
		List<String> aList = new ArrayList<>();
		//List<String> aList = new CopyOnWriteArrayList<String>();
		
		aList.add("one");
		aList.add("two");
		aList.add("three");
		Iterator<String> listIter = aList.iterator();
		
		while (listIter.hasNext()) {
			System.out.println(listIter.next());
			aList.add("four");
			aList.remove("one");
		}
		
		
		System.out.println(aList);
		
	}
}