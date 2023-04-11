package com.audintel.collection;

import java.util.Arrays;

public class SurveyMain {

	public static void main(String[] args) {

		int id[] = { 677667, 99898, 787887, 78778788 };
		String location[] = { "delhi", "hyderabad", "chennai", "mumbai" };
		String name[] = { "education", "population", "literacy", "poverty" };
		float cost[] = { 100000, 200000, 120000, 450000 };

		Survey survey[] = new Survey[4];
		int index = 0;
		for (; index < survey.length;) {
			survey[index] = new Survey();
			survey[index].setSurveyId(id[index]);
			survey[index].setSurveyName(name[index]);
			survey[index].setSurveyCost(cost[index]);
			survey[index].setSurveyLocation(location[index]);
			index++;
		}

//		for (Survey survey2 : survey) {
//			System.out.println(survey2);
//		}

		System.out.println(Arrays.toString(survey));

		Arrays.sort(survey);
		System.out.println("sorted by surevy name ");
		System.out.println(Arrays.toString(survey));
	}
}
