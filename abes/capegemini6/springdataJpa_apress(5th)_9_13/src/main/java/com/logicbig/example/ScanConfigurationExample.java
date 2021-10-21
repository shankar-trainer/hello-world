package com.logicbig.example;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackageClasses = ScanConfigurationExample.class, useDefaultFilters = false,
                    includeFilters = {@ComponentScan.Filter(
                                        type = FilterType.ASSIGNABLE_TYPE,
                                        value = ScanConfigurationExample.TestBean.class)})
public class ScanConfigurationExample {

    public static void main (String[] args) {
        AnnotationConfigApplicationContext context =
                            new AnnotationConfigApplicationContext(
                                                ScanConfigurationExample.class);
        AnotherTestBean bean = context.getBean(AnotherTestBean.class);
        System.out.println(bean);

        //accessing multiple times
        bean = context.getBean(AnotherTestBean.class);
        System.out.println(bean);

        /*this will return same instance because @Configuration classes even in scan path will be
        * CGLIB proxied*/
        TestBean testBean = context.getBean(TestBean.class);
        System.out.println(testBean.anotherTestBean());
    }

    @Configuration
    public static class TestBean {
        @Bean
        public AnotherTestBean anotherTestBean () {
            return new AnotherTestBean();
        }
    }

    public static class AnotherTestBean {
    }
}