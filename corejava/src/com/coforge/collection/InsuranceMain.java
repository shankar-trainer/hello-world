package com.coforge.collection;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class InsuranceMain {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the no of Policy names you want to store");
		int n=scanner.nextInt();
		
		Insurance insurance=new Insurance();
		int x=1;
		while(x<=n) {
			System.out.println("Enter policy ID");
			int id=scanner.nextInt();
			System.out.println("Enter policy Name");
			scanner.nextLine();
			String s=scanner.nextLine();
			insurance.addPolicyDetails(id, s);
			x++;
		}
		
		System.out.println("Id\tName");
		Map<Integer, String> policyMap = insurance.getPolicyMap();
		Set<Integer> keySet = policyMap.keySet();
		
		for (int k : keySet) {
		 System.out.println(k+"   "+policyMap.get(k));	
		}
		
		System.out.println("Enter the policy type to be searched");
		String search=scanner.nextLine();
		
		List<Integer> searchBasedOnPolicyType = insurance.searchBasedOnPolicyType(search);
		
		for (Integer integer : searchBasedOnPolicyType) {
			System.out.println(integer);
		}
		
		
	}
}
