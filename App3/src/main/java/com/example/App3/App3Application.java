package com.example.App3;

import com.example.dao.UserDao;
import com.example.model.Person;
import com.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Map;
import java.util.Set;

@SpringBootApplication(scanBasePackages = {"com.example.model","com.example.dao"})
public class App3Application  implements CommandLineRunner {

	public static void main(String[] args) {

		ConfigurableApplicationContext bean = SpringApplication.run(App3Application.class, args);
		Person bean1 = bean.getBean(Person.class);
        bean1.show();

//		User user[]=new User[4];
//		user[0]=new User(10001,"mark luis",20000);
//		user[1]=new User(10002,"max john",34000);
//		user[2]=new User(10003,"albert luis",80000);
//		user[3]=new User(10004,"arnold ",90000);
//
//		System.out.println("user add operation");
//		UserDao dao = bean.getBean(UserDao.class);
//              for(User u:user)
//				  dao.addUser(u);
//
//		System.out.println("all user");
//		Map<Integer, User> allUser = dao.getAllUser();
//		Set<Map.Entry<Integer, User>> entries = allUser.entrySet();
//		System.out.println();
//		System.out.println("size "+entries.size());
//		for (Map.Entry<Integer,User> entry:	entries		 ) {
//			System.out.println(entry.getValue());
//		}

	}

	@Autowired
	UserDao dao;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("this is run method ");

		User user[]=new User[4];
		user[0]=new User(10001,"mark luis",20000);
		user[1]=new User(10002,"max john",34000);
		user[2]=new User(10003,"albert luis",80000);
		user[3]=new User(10004,"arnold ",90000);

		System.out.println("===================user add operation======================");
		for(User u:user)
			dao.addUser(u);

		System.out.println("=================all user operation ");
		Map<Integer, User> allUser = dao.getAllUser();
		Set<Map.Entry<Integer, User>> entries = allUser.entrySet();
		System.out.println();
		System.out.println("size "+entries.size());

		for (Map.Entry<Integer,User> entry:	entries		 ) {
			System.out.println(entry.getValue());
		}
		System.out.println("======================= search operation ==========================");
		User user1 = dao.searchUser(1001);
        if(user1==null)
			System.out.println("user not present ");
		else
			System.out.println("User present "+user1);
		 user1 = dao.searchUser(10002);

        if(user1==null)
			System.out.println("user not present ");
		else
			System.out.println("User present "+user1);

		System.out.println("====================Remove operation=============================== ");

		User user2 = dao.removeUser(10001);
		if(user2==null)
			System.out.println("User removed "+user2);
		else
			System.out.println("user not found ");
		System.out.println("After  user removal  all user data are  ");
		for(Integer k:dao.getAllUser().keySet()) {
			User user3 = dao.getAllUser().get(k);
			System.out.println(user3.getUserId() + "\t" + user3.getUserName() + "\t" + user3.getUserSalary());
		}

		System.out.println("================== update operation ===================");
		user[2]=new User(10003,"thomas cook",78000);
		User user3 = dao.updateUser(user[2]);
		if(user3==null)
			System.out.println("user not found ");
		else
			System.out.println("updated \n updated value "+user3);
	}
}
