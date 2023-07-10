package com.coforge.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class InsuarnceSortById implements Comparator<Insurance> {
	@Override
	public int compare(Insurance o1, Insurance o2) {
//		if (o1.getInsuranceId() > o2.getInsuranceId())
//			return 1;
//		else if (o1.getInsuranceId() < o2.getInsuranceId())
//			return -1;
//		else
//			return 0;

		return Integer.valueOf(o1.getInsuranceId()).compareTo(Integer.valueOf(o2.getInsuranceId()));

	}
}

class InsuarnceSortByName implements Comparator<Insurance> {
	@Override
	public int compare(Insurance o1, Insurance o2) {
		return o1.getInsuranceName().compareTo(o2.getInsuranceName());
	}
}

public class InsuarnceMain {

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

		Collections.sort(insuranceList, new InsuarnceSortById());

		System.out.println("\nsorted by insurance id");
		displayInsurance(insuranceList);

		Collections.sort(insuranceList, new InsuarnceSortByName());

		System.out.println("\nsorted by insurance name");
		displayInsurance(insuranceList);
	}
}
