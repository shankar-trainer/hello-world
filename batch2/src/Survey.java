
public class Survey {

	private int surveyId;
	private String surveyName;
	private String surveyState;
	
	public Survey(int surveyId, String surveyName, String surveyState) {
		super();
		this.surveyId = surveyId;
		this.surveyName = surveyName;
		this.surveyState = surveyState;
	}

	public int getSurveyId() {
		return surveyId;
	}

	public String getSurveyName() {
		return surveyName;
	}

	public String getSurveyState() {
		return surveyState;
	}
	
}
