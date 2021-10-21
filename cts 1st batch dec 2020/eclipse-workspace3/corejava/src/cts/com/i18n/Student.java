package cts.com.i18n;

import java.lang.annotation.Documented;
import java.util.Date;

/**
 * Id is unique identifier<br>
 * <br>
 * name is student name
 */

public class Student {

	private int id;

	/**
	 * name is deprecated<br>
	 * use fname and lname instead
	 */

	@Deprecated
	private String name;

	/**
	 * it is method to display student information
	 */

	void studentInfo() {
		@SuppressWarnings("deprecation")
		Date date1 = new Date(2019, 12, 11);

	}

}
