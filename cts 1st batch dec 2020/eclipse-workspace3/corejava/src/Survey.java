import java.util.Date;

public class Survey {

	private int surveyId;
	private String surveyName;
	private String surveyLocation;
	private Date surveyDate;
	private String country;
	private String state;

	public Survey() {
		super();
		surveyDate = new Date();
		surveyLocation = "delhi";
		surveyName = "population survey";
		surveyId = 544546;
		System.out.println("default constructor called");
	}

	public Survey(int surveyId, String surveyName, String surveyLocation, Date surveyDate) {
		this("india","UP");
		
		this.surveyId = surveyId;
		this.surveyName = surveyName;
		this.surveyLocation = surveyLocation;
		this.surveyDate = surveyDate;
		System.out.println("overloaded constructor called");
	}

	public Survey(String country, String state) {
            this.country=country;
            this.state=state;
	}

	public void getSurveyInfo() {
		System.out.println("\nSurvey Information ");
		System.out.println("Id " + surveyId);
		System.out.println("Name " + surveyName);
		System.out.println("Location " + surveyLocation);
		System.out.println("Date " + surveyDate);

		System.out.println("Country  " + country);
		System.out.println("State " + state);
	}

	public static void main(String[] args) {
		Survey survey = new Survey();
		survey.getSurveyInfo();

		Survey survey1 = new Survey(67677676, "land survey", "noida", new Date());
		survey1.getSurveyInfo();

		Survey survey2 = new Survey("india","tamilnadu");
		survey2.getSurveyInfo();
	}

}
