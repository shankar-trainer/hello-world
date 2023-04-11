
package org.example.main;

import org.example.config.UserConfig;
import org.example.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    //mvn exec:java -Dexec.mainClass="org.example.main.Main"
    public static void main(String[] args) {
        //1st way
        //   ApplicationContext ctx=new AnnotationConfigApplicationContext(User.class);
        //  User bean = ctx.getBean(User.class);
       // System.out.println(bean);

        //2nd way

        ApplicationContext ctx=new AnnotationConfigApplicationContext(UserConfig.class);
        //User bean = ctx.getBean(User.class);
        //User bean = ctx.getBean("getBean",User.class);
        User bean = ctx.getBean("user1",User.class);

        System.out.println(bean);
    }
}
