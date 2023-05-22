package edu.chitkara.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class sortByName implements Comparator<User>{
	@Override
	public int compare(User o1, User o2) {
		return o1.getUserName().compareTo(o2.getUserName());
	}
}

public class UserMain {

	public static void main(String[] args) {
		User user[] = new User[4];
		user[0] = new User(5343434, "surendra kumar", 90000);
		user[1] = new User(5343431, "amit kumar", 89000);
		user[2] = new User(5343432, "sunita jain", 67000);
		user[3] = new User(5343433, "vimal jalan", 95000);

		List<User> list1 = new ArrayList<User>();
		for (User u : user) {
			list1.add(u);
		}

		System.out.println("user data ");
		for (User u : list1)
			System.out.println(u.getUserId() + "\t" + u.getUserName() + "\t" + u.getUsersalary());

		System.out.println("sort by name");
		Collections.sort(list1,new sortByName());
		for (User u : list1)
			System.out.println(u.getUserId() + "\t" + u.getUserName() + "\t" + u.getUsersalary());


	}

}
