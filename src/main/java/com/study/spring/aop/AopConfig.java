package com.study.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
/**
 *
 * @EnableAspectJAutoProxy
 *
 *
 *
 */





@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.study.spring.aop")
public class AopConfig {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        CircleServiceImpl circleService = context.getBean(CircleServiceImpl.class);
        circleService.draw();

        Hello hello = context.getBean(Hello.class);
        hello.say();
    }
}
