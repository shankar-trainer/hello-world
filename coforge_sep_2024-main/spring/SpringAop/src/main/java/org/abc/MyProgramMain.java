package org.abc;

import org.abc.config.AOPConfig;
import org.abc.prg.Calculator;
import org.abc.prg.MyProgram;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyProgramMain {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AOPConfig.class);
        MyProgram bean = context.getBean(MyProgram.class);

        bean.welcome();

        Calculator bean1 = context.getBean(Calculator.class);

        System.out.println("addition is "+ bean1.addition(11,12));
        try {
            System.out.println("division is " + bean1.division(110, 12));
            System.out.println("division is " + bean1.division(110, 0));
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }

    }
}
