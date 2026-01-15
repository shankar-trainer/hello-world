package com.cts.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class UserMain {

    public static void main(String[] args) {
        Comparator<User> comparatorId = (o1, o2) -> Integer.valueOf(o1.getId()).
                compareTo(Integer.valueOf(o2.getId()));

        Comparator<User> comparatorName = (o1, o2) -> o1.getName().compareTo(o2.getName());

        User user[] = new User[3];
        int id1[] = {2, 1, 3};
        String nm[] = {"suresh", "amit", "vimal"};
        for (int i = 0; i < user.length; i++) {
            user[i] = new User();
            user[i].setId(id1[i]);
            user[i].setName(nm[i]);
        }
        for (User u : user)
            System.out.println(u);
        Arrays.sort(user, comparatorId);

        System.out.println("sorted by id");
        for (User u : user)
            System.out.println(u);

        Arrays.sort(user, comparatorName);

        System.out.println("sorted by name");
        for (User u : user)
            System.out.println(u);

    }

}
