package com.coforge;

import com.coforge.model.Library;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
//        ConfigurableApplicationContext context =
                SpringApplication.run(Main.class, args);

   /*     Library bean = context.getBean(Library.class);
   Library bean1 = context.getBean(Library.class);

        System.out.println(bean);
        System.out.println(bean.getId()+"\t"+bean.getName()+"\t"+bean.getStartDate());
        System.out.println(bean.equals(bean1));
        System.out.println(bean.hashCode());
        System.out.println(bean1.hashCode());*/
    }
}
