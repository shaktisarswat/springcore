package com.springcore.dependencyInjection.javaconfig.BeanAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaTestAnnotation {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(ConfigClassForBean.class);
        Teacher teacher=context.getBean("teacher",Teacher.class);
        System.out.println(teacher);
    }
}
