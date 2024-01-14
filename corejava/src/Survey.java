
public class Survey {
	private int surveyId;
	private String surveyLocation;
	private String surveyState;
	private static String country;
	
	public Survey(int surveyId, String surveyLocation, String surveyState) {
		super();
		System.out.println("constructor called ");
		this.surveyId = surveyId;
		this.surveyLocation = surveyLocation;
		this.surveyState = surveyState;
	}

	static{
		country="india";
		System.out.println("static block ");
	}
	
	// static method can call directly static members, for instance members 
	// it requires object
	static void surveyInfo(Survey survey) {
		System.out.println("\nSurvey Id "+survey.surveyId);
		System.out.println("Survey Location "+survey.surveyLocation);
		System.out.println("Survey State "+survey.surveyState);
		System.out.println("Survey Country "+country);
	}

}
