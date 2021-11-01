package com.logicbig.example;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackageClasses = ScanFactoryComponentExample.class, useDefaultFilters = false,
                    includeFilters = {@ComponentScan.Filter(
                                        type = FilterType.ASSIGNABLE_TYPE,
                                        value = ScanFactoryComponentExample.TestBean.class)})
public class ScanFactoryComponentExample {

    public static void main (String[] args) {
        AnnotationConfigApplicationContext context =
                            new AnnotationConfigApplicationContext(
                                                ScanFactoryComponentExample.class);
        AnotherTestBean bean = context.getBean(AnotherTestBean.class);
        System.out.println(bean);

        //accessing multiple times
        bean = context.getBean(AnotherTestBean.class);
        System.out.println(bean);

        /*this will return a new instance because @Component methods are not
        * CGLIB proxied*/
        TestBean testBean = context.getBean(TestBean.class);
        System.out.println(testBean.anotherTestBean());
    }

    @Component
    public static class TestBean {
        @Bean
        public AnotherTestBean anotherTestBean () {
            return new AnotherTestBean();
        }
    }

    public static class AnotherTestBean {
    }
}