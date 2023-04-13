package com.example.main;

import com.example.config.JavaConfig;
import com.example.model.Share;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by shankar on 4/13/2023.
 */
public class ShareMain {
    public static void main(String[] args) {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(JavaConfig.class);
        Share bean = ctx.getBean(Share.class);
        Share bean1 = ctx.getBean(Share.class);

        bean1.setShareId(1);
        bean1.setShareName("hcl");
        bean1.setShareCost(4000);

        System.out.println(bean);
        System.out.println(bean1);
    }
}
