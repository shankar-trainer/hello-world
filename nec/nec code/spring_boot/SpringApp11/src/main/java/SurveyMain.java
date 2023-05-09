import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.Survey;

public class SurveyMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");

		Survey survey = ctx.getBean("survey1", Survey.class);

		System.out.println(survey);

		System.out.println("\nSurveyt\n");

		System.out.println("\tid\t" + survey.getSurveyId());
		System.out.println("\tname\t" + survey.getSurveyName());
		System.out.println("\tlocation\t" + survey.getSurveyLocation());
		System.out.println("\tpin\t" + survey.getSurveyPin());
		System.out.println("\tstate\t" + survey.getSurveyState());

		System.out.println("\nsurvey department\n");

		System.out.println("\tid\t" + survey.getDepartment().getDeptId());
		System.out.println("\tname\t" + survey.getDepartment().getDeptName());
		System.out.println("\tlocation\t" + survey.getDepartment().getDeptLocation());
		System.out.println("\ttotal member \t" + survey.getDepartment().getDeptTotalMember());

	}
}
