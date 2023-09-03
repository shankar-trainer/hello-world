package com.coforge.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Insurance {

	Map<Integer, String> policyMap;

	public Insurance() {
		policyMap=new HashMap<>();
	}

	public Map<Integer, String> getPolicyMap() {
		return policyMap;
	}

	public void setPolicyMap(Map<Integer, String> policyMap) {
		this.policyMap = policyMap;
	}

	void addPolicyDetails(int id, String name) {
		policyMap.put(id, name);
	}

	List<Integer> searchBasedOnPolicyType(String searchpolicyName) {
		List<Integer> list1 = new ArrayList<>();

		Set<Integer> keySet = policyMap.keySet();

		for (Integer integer : keySet) {
			String s = policyMap.get(integer);
			if (s.contains(searchpolicyName))
				list1.add(integer);
		}
		return list1;
	}

}
