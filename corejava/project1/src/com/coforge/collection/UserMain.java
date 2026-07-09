package com.coforge.collection;

import java.util.List;
import java.util.Scanner;

public class UserMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ch = "y";
        User user;
        UserDao userDao = new UserDao();

        while (ch.equals("y")) {
            System.out.println("1. Add User");
            System.out.println("2. Show All  User");
            System.out.println("3. Search User by id");
            System.out.println("4. Delete User By id");
            System.out.println("5. Update User by id");
            int operation = scanner.nextInt();

            switch (operation) {
                case 1:
                    System.out.println("enter id name and salary");
                    user = null;
                    user = new User();
                    user.setUserId(scanner.nextInt());
                    scanner.nextLine();
                    user.setUserName(scanner.nextLine());
                    user.setUserSalary(scanner.nextFloat());
                    User u = userDao.addUser(user);
                    System.out.println("added user " + u);
                    break;

                case 2:
                    List<User> allUser = userDao.getAllUser();
                    System.out.println("all users ..");
                    for (User u1 : allUser)
                        System.out.println(u1);
                    break;
                case 3:
                    System.out.println("enter id to search");
                    List<User> users = userDao.searchUserById(scanner.nextInt());
                    System.out.println("all users found by search");
                    for (User u1 : users)
                        System.out.println(u1);
                    break;

                default:
                    System.out.println("invalid operation");
                    break;
            }
            System.out.println("continue y\\n");
            ch= scanner.next();;
        }
    }
}
