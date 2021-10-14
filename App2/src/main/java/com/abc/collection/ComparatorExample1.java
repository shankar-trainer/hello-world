package com.abc.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample1 {

	static class Survey {

		private int surveyId;
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
	}

		static class SortById implements Comparator<Survey> {
			@Override
			public int compare(Survey o1, Survey o2) {
				return Integer.valueOf(o1.surveyId).compareTo(Integer.valueOf(o2.surveyId));
			}
		}
		
		static class SortByName implements Comparator<Survey> {
			@Override
			public int compare(Survey o1, Survey o2) {
				return o1.surveyName.compareTo(o2.surveyName);
			}
		}

		public static void main(String[] args) {
			List<Survey> list1 = new ArrayList<>();

			list1.add(new Survey(1003, "education", 9000000));
			list1.add(new Survey(1001, "land", 1000000));
			list1.add(new Survey(1002, "water", 4000000));

			System.out.println("Unsorted \n" + list1);

			Collections.sort(list1, new SortById());

			System.out.println("sorted by id  \n" + list1);

			Collections.sort(list1, new SortByName());
			System.out.println("\nsorted by name \n" + list1);
			
//		    for (Survey survey : list1) {
//          System.out.println(survey.surveyName+" "+survey.surveyId);				
//			}	
		}

}
