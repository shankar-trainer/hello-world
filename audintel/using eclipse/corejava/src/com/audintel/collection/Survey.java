package com.audintel.collection;

public class Survey implements Comparable<Survey> {

	private int surveyId;
	private String surveyName;
	private String surveyLocation;
	private float surveyCost;

	public int getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(int surveyId) {
		this.surveyId = surveyId;
	}

	public String getSurveyName() {
		return surveyName;
	}

	public void setSurveyName(String surveyName) {
		this.surveyName = surveyName;
	}

	public String getSurveyLocation() {
		return surveyLocation;
	}

	public void setSurveyLocation(String surveyLocation) {
		this.surveyLocation = surveyLocation;
	}

	public float getSurveyCost() {
		return surveyCost;
	}

	public void setSurveyCost(float surveyCost) {
		this.surveyCost = surveyCost;
	}

	@Override
	public String toString() {
		return "\nSurvey [surveyId=" + surveyId + ", surveyName=" + surveyName + ", surveyLocation=" + surveyLocation
				+ ", surveyCost=" + surveyCost + "]";
	}

	/*
	 * @Override public int compareTo(Survey o) { if (this.surveyId > o.surveyId)
	 * return 1;
	 * 
	 * else if (this.surveyId < o.surveyId) return -1; else return 0; }
	 */

	@Override public int compareTo(Survey o) {
		//return Integer.valueOf(this.surveyId).compareTo(Integer.valueOf(o.surveyId));
		return Integer.compare(this.surveyId, o.surveyId);
	}
	/*
	 @Override 
	 public int compareTo(Survey o) {
	    return this.surveyName.compareTo(o.surveyName)	; 
	 }
	*/
}
