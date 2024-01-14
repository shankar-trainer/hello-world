
public class SurveyMain {

	public static void main(String[] args) {
		
		Survey survey1=new Survey(90001, "bhopal", "MP");
		Survey survey2=new Survey(90002, "lucknow", "UP");
		Survey survey3=new Survey(90003, "jaipur", "Rajsthan");
		Survey survey4=new Survey(90001, "patna", "Bihar");
		
		
		Survey.surveyInfo(survey1);
		Survey.surveyInfo(survey2);
		Survey.surveyInfo(survey3);
		Survey.surveyInfo(survey4);
	}
}
