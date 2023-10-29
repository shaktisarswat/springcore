package com.springcore.dependencyInjection.javaconfig.BeanAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClassForBean {

    @Bean("teacher")
    public Teacher getTeacherBean() {
        Teacher teacher = new Teacher(getOOPsSubjectBean());
        return teacher;
    }

    @Bean("OOPsSubject")
    public OOPsSubject getOOPsSubjectBean() {
        return new OOPsSubject();
    }

    @Bean("DSASubject")
    public DSASubject getDSASubjectBean() {
        return new DSASubject();
    }


}
