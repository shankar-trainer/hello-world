package com.cts.java8.lambda;
import com.cts.collection.User;
import java.util.Arrays;
import java.util.Comparator;

//		return new Integer(o1.getUserId()).compareTo(new Integer(o2.getUserId()));
//		return o1.getUserName().compareTo(o2.getUserName());

public class UserMain2 {

	public static void main(String[] args) {
		User user[] = new User[3];

		user[0] = new User();
		user[1] = new User();
		user[2] = new User();

		user[0].setUserId(1003);
		user[0].setUserName("amit kumar");
		user[0].setUserSalary(12000);

		user[1].setUserId(1001);
		user[1].setUserName("rajendra kumar");
		user[1].setUserSalary(11000);

		user[2].setUserId(1002);
		user[2].setUserName("dilip kumar");
		user[2].setUserSalary(18000);

		Comparator<User> comparator1 = (o1, o2) -> {
			return new Integer(o1.getUserId()).compareTo(new Integer(o2.getUserId()));
		};

		Comparator<User> comparator2 = (o1, o2) -> {
			return o1.getUserName().compareTo(o2.getUserName());
		};

		Arrays.sort(user, comparator1);
		System.out.println("Sorted  By Id ");
		for (User user2 : user) {
			System.out.println(user2.getUserId() + "  " + user2.getUserName() + "  " + user2.getUserSalary());
		}

		Arrays.sort(user, comparator2);
		System.out.println("\nSorted  By Name ");
		for (User user2 : user) {
			System.out.println(user2.getUserId() + "  " + user2.getUserName() + "  " + user2.getUserSalary());
		}

	}
}
