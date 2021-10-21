import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class UserMainCode {
	static int sizeOfResultandHashMap(ConcurrentHashMap<Integer, String> hashMap) {
		Set<Integer> set1 = hashMap.keySet();
	
		for (Integer integer : set1) {
			if (integer % 4 == 0)
				hashMap.remove(integer);
		}
		return hashMap.size();
	}
}

class Main1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		ConcurrentHashMap<Integer, String> map2 = new ConcurrentHashMap<>();

		for (int i = 1; i <= x; i++) {
			map2.put(scanner.nextInt(), scanner.next());
		}

		System.out.println(UserMainCode.sizeOfResultandHashMap(map2));
	}
}