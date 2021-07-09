
public class SurveyMain {

	public static void main(String[] args) {
		Survey survey[]=new Survey[3];
		
		survey[0]=new Survey(8776768, "literacy ", "tamilnadu");
		survey[1]=new Survey(8776769, "poverty ", "tamilnadu");
		survey[2]=new Survey(8776761, "mortality rate", "tamilnadu");
	
		for (Survey survey2 : survey) {
			System.out.println(survey2.getSurveyId()+"  "+survey2.getSurveyName()+"  "
		+survey2.getSurveyState());
		}
		
	}
}
