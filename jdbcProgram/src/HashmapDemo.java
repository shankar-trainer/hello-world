import java.util.HashMap;
import java.util.Map;


public class HashmapDemo {

	public static void main(String[] args) throws InterruptedException {

		
		Map<Integer, String> hashMap=new HashMap<>();
		
		hashMap.put(1001, "aaa");
		hashMap.put(1002, "aaa");
		
		
		Thread.sleep(10000);
		
		
		hashMap.remove(1001);
		hashMap.remove(1002);
		
		hashMap.put(1003, "aaa");
		hashMap.put(1004, "aaa");
		
		hashMap.remove(1003);
		
		System.out.println("---------------"+hashMap);
	}
}
