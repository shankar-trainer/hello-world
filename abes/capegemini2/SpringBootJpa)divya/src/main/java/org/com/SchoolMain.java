package org.com;

import java.util.List;

import org.com.dao.SchoolDao;
import org.com.model.School;
import org.com.service.SchoolService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SchoolMain {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(SchoolMain.class, args);
		SchoolService service = ctx.getBean(SchoolService.class);
		String name[] = { "dav", "dps", "sunbeam", "kv" };
		String location[] = { "noida", "delhi", "gurgaon", "varanasi" };

		School school[] = new School[4];

		for (int i = 0; i < school.length; i++) {
			school[i] = new School();
			school[i].setName(name[i]);
			school[i].setLocation(location[i]);
			service.addSchool(school[i]);
		}
		service.showAllSchool();
		service.searchBySchoolId(3);
		service.searchBySchoolId(30);
		service.searchBySchoolName("dps");
		service.searchBySchoolName("zee public");

		service.searchBySchoolNameOrderById("dps");

		service.sortBySchoolName();
		
		service.totalNoOfSchool();
		
		SchoolDao dao = ctx.getBean(SchoolDao.class);
		
		System.out.println("\nid and name only \n");
		
		List<Object>  list1=dao.selectIdandname();
		for (Object object : list1) {
			
			System.out.println(object.toString());
		}

	}
}
