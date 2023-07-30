import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.CourseConfig;
import com.example.dao.CourseDao;
import com.example.model.Course;

public class CourseMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext
				//(CourseDao.class)
				(CourseConfig.class);
		CourseDao dao = ctx.getBean(CourseDao.class);
		
		Course course1=new Course();
		course1.setId(10001);
		course1.setCoureName("java course");
		course1.setCoureDuration(30);
		
		Course course2=new Course();
		course2.setId(10002);
		course2.setCoureName("angular course");
		course2.setCoureDuration(35);
		
		dao.addCourse(course1);
		dao.addCourse(course2);
		
		
		System.out.println("course added");
		
		dao.findAll().forEach(System.out::println);
		
		dao.delete(10001);
		System.out.println(dao.findById(10002));
		
	}
}
