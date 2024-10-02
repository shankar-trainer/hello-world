package org.abc.config;

import org.abc.aop.CalculatorAop;
import org.abc.aop.MyProgramAop;
import org.abc.prg.Calculator;
import org.abc.prg.MyProgram;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AOPConfig {

    @Bean
    public MyProgram program() {

        return new MyProgram();
    }

    @Bean
    public MyProgramAop programAop() {

        return new MyProgramAop();
    }
  @Bean
    public Calculator calculator() {
        return new Calculator();
    }
  @Bean
    public CalculatorAop  getCalculatorAop() {


        return new CalculatorAop();
    }

}
