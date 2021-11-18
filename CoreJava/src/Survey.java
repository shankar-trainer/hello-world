
public class Survey {

	private int surveyId;
	private String surveyName;
	private String surveyLocation;
	
	public Survey(int surveyId, String surveyName, String surveyLocation) {
		super();
		this.surveyId = surveyId;
		this.surveyName = surveyName;
		this.surveyLocation = surveyLocation;
	}

	/*@Override
	public String toString() {
		return "Survey Information\n Id "+surveyId+"\nName  "+surveyName+"\nLocation  "+surveyLocation;
	}
   */
	
	@Override
	public String toString() {
		return "Survey [surveyId=" + surveyId + ", surveyName=" + surveyName + ", surveyLocation=" + surveyLocation
				+ "]";
	}
	
	public static void main(String[] args) {
		Survey survey=new Survey(78787, "education", "delhi");
		System.out.println(survey);
		//System.out.println(survey.toString());
	}

}
