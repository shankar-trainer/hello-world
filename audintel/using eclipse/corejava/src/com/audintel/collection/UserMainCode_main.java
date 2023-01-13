package com.audintel.collection;

import java.util.HashMap;
import java.util.Scanner;

public class UserMainCode_main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int x=scanner.nextInt();
		HashMap<Integer, String> map1=new HashMap<>();
		
		for (int i = 0; i < x; i++) {
			map1.put(scanner.nextInt(), scanner.next());
		}
		System.out.println(UserMainCode.sizeOfResultandHashMap(map1));
	}
}
