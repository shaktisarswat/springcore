package com.springcore.dependencyInjection.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaTest {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(ConfigClassForComponentAnnotation.class);
        Teacher teacher=context.getBean("teacher",Teacher.class);
        System.out.println(teacher);
    }
}
