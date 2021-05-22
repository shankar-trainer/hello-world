import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
	public static void main(String[] args) {

		HashMap<String, String> concurrentHashMap = new HashMap<>();
		// ConcurrentHashMap<String, String> concurrentHashMap = new
		// ConcurrentHashMap<>();
		concurrentHashMap.put("A", "Apple");
		concurrentHashMap.put("B", "Blackberry");
		concurrentHashMap.put("C", "Chocolate");
		concurrentHashMap.put("D", "Doll");

		for (String s : concurrentHashMap.keySet()) {
			//if (s.equals("B"))
			concurrentHashMap.remove(s);
		}

		/*
		 * concurrentHashMap.remove("A"); concurrentHashMap.remove("B");
		 * concurrentHashMap.remove("");
		 */
		System.out.println(concurrentHashMap);
	}
}