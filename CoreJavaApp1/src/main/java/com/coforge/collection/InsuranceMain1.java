package com.coforge.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class InsuranceMain1 {

	static void displayInsurance(List<Insurance> insurance) {
		for (Insurance insurance2 : insurance)
			System.out.println(insurance2);
	}

	public static void main(String[] args) {
		Insurance insurance[] = new Insurance[4];
		insurance[0] = new Insurance(10008, "jeevan surabhi", 15, 30000);
		insurance[1] = new Insurance(10001, "jeevan sulabh", 10, 50000);
		insurance[2] = new Insurance(10002, "jeevan parkash", 9, 20000);
		insurance[3] = new Insurance(10010, "jeevan jyoti", 5, 10000);

		List<Insurance> insuranceList = Arrays.asList(insurance);
		System.out.println("Unsorted");
		displayInsurance(insuranceList);
/*
		Collections.sort(insuranceList, new Comparator<Insurance>() {
			@Override
			public int compare(Insurance o1, Insurance o2) {
				return o1.getInsuranceName().compareTo(o2.getInsuranceName());
			}
		});
*/
		Collections.sort(insuranceList, (a, b) -> a.getInsuranceName().
				compareTo(b.getInsuranceName()));
	
		System.out.println("after sorted");
		displayInsurance(insuranceList);
	}
}
