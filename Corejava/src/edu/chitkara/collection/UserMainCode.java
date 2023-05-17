package edu.chitkara.collection;

import java.util.HashMap;
import java.util.Scanner;

public class UserMainCode {

	static int sizeOfResultandHashMap(HashMap<Integer, String> map1) {

		for (Integer k : map1.keySet()) {
			if (k % 4 == 0)
				map1.remove(k);
		}
		return map1.size();
	}

}

class Main1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		for (int x = 0; x < n; x++)
			hashMap.put(scanner.nextInt(), scanner.next());

		int sizeOfResultandHashMap = UserMainCode.sizeOfResultandHashMap(hashMap);
		System.out.println(sizeOfResultandHashMap);
		scanner.close();
	}
}
