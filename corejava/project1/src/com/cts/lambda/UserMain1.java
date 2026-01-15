package com.cts.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class UserMain1 {

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

        Stream.of(user).forEach(s-> System.out.println(s));
        System.out.println("sorting by name");

        Stream.of(user).sorted(comparatorName).forEach(s-> System.out.println(s));
        //(o1,o2)->o1.getName().compareTo(o2.getName())
        Stream.of(user).sorted((o1,o2)->o1.getName().compareTo(o2.getName())).
                forEach(s-> System.out.println(s));

        System.out.println("using limit");
        Stream.of(user).sorted(comparatorName).limit(2).
                forEach(s-> System.out.println(s));
    }

}
