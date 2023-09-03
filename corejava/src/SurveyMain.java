
public class SurveyMain {

	public static void main(String[] args) {
		Survey survey=new Survey();
		//survey.surveyId=-989889;
		//survey.surveyName="";
		//survey.surveyLocation="";
		
		survey.setSurveyId(76778);
		survey.setSurveyName("agriculture survey");
		survey.setSurveyLocation("rajsthan");

		
		System.out.println("id "+survey.getSurveyId());
		System.out.println("name "+survey.getSurveyName());
		System.out.println("location "+survey.getSurveyLocation());
	}
}
