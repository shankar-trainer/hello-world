package com.abc.collection;

import java.util.Set;
import java.util.TreeSet;

class Survey implements Comparable<Survey> {

//private	
int surveyId;
	String surveyName;
	float surveyCost;

	public Survey(int surveyId, String surveyName, float surveyCost) {
		super();
		this.surveyId = surveyId;
		this.surveyName = surveyName;
		this.surveyCost = surveyCost;
	}

	@Override
	public String toString() {
		return "\nSurvey [surveyId=" + surveyId + ", surveyName=" + surveyName + ", surveyCost=" + surveyCost + "]";
	}

	@Override
	public int compareTo(Survey o) {
		if (this.surveyCost == o.surveyCost)
			return 0;
		else if (this.surveyCost > o.surveyCost)
			return 1;
		else
			return -1;
	}

}

public class TreeSetPrg2 {

	public static void main(String[] args) {
		Set<Survey> set1 = new TreeSet<>();
		// HashSet<>();

		set1.add(new Survey(1003, "education", 9000000));
		set1.add(new Survey(1001, "land", 1000000));
		set1.add(new Survey(1002, "water", 4000000));

		System.out.println(set1);
		for (Survey survey : set1) {
		  System.out.println(survey.surveyId);	
		}
	}
}
