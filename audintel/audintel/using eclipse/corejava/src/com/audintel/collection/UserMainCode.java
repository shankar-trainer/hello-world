package com.audintel.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserMainCode {

	public static int sizeOfResultandHashMap(HashMap<Integer, String> hashMap) {
		
		List<Integer> list1=new ArrayList<>(hashMap.keySet());
		//Set<Integer> keySet = hashMap.keySet();
		
		for(Integer x:list1) {
			 if(x%4==0)
			 {
				int p=x;
				 hashMap.remove(p);
			 }
		 }
		 return   hashMap.size();
	}
}
