package com.montran.bean;

public class Survey {

	private int surveyId;
	private  String  surveyName;
	private  String  surveyLocation;
	
	public Survey(int surveyId, String surveyName, String surveyLocation) {
		super();
		this.surveyId = surveyId;
		this.surveyName = surveyName;
		this.surveyLocation = surveyLocation;
	}
	
	@Override
	public String toString() {
		return "Survey Information \n"+
	            "Id is "+surveyId+"\n"+
	            "Name is "+surveyName+"\n"+
	            "Location is "+surveyLocation+"\n";
	}
	
	public static void main(String[] args) {
		Survey survey=new Survey(676776, "education", "mathura");
		System.out.println(survey);
		
	}
}
