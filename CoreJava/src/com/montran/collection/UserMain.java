package com.montran.collection;

import java.util.Map;

public class UserMain {

	public static void main(String[] args) {
		User user[] = new User[4];
		user[0] = new User(7887, "parvin kumar", 20000);
		user[1] = new User(7881, "jayant kumar", 10000);
		user[2] = new User(7889, "amit kumar", 30000);
		user[3] = new User(7882, "suman kumar", 12000);

		UserDAO dao = new UserDAO();
		for (User user2 : user) {
			dao.addUser(user2);
		}
//-------
		User user2 = new User(78890, "parvin kumar", 20000);

		System.out.println(dao.searchUser(user[0]));
		System.out.println(dao.searchUser(user[1]));
		System.out.println(dao.searchUser(user2));

		dao.removeUser(user[1]);
//-------------		
		Map<Integer, User> allUsers = dao.getAllUsers();

		for (Integer i : allUsers.keySet()) {
			User u = allUsers.get(i);
			System.out.println(u.getUserId() + "  " + u.getUserName() + "   " + u.getUserSalary());
		}

	}
}
