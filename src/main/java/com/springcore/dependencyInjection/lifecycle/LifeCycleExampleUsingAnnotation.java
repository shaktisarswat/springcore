package com.springcore.dependencyInjection.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifeCycleExampleUsingAnnotation {
    private String classInfo;


    public LifeCycleExampleUsingAnnotation() {
    }

    public String getClassInfo() {
        return classInfo;
    }

    public void setClassInfo(String classInfo) {
        this.classInfo = classInfo;
    }

    @Override
    public String toString() {
        return "LifeCycleExampleUsingAnnotation{" + "classInfo='" + classInfo + '\'' + '}';
    }

    @PostConstruct
    public void inti() {
        System.out.println("Initialization Method called in LifeCycleExampleUsingAnnotation");

    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroy Method called in LifeCycleExampleUsingAnnotation");
    }

}
