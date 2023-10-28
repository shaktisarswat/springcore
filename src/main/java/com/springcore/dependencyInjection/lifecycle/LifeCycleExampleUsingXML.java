package com.springcore.dependencyInjection.lifecycle;

public class LifeCycleExampleUsingXML {

    private String classInfo;


    public LifeCycleExampleUsingXML() {
    }

    public String getClassInfo() {
        return classInfo;
    }

    public void setClassInfo(String classInfo) {
        this.classInfo = classInfo;
    }

    @Override
    public String toString() {
        return "LifeCycleExampleUsingXML{" +
                "classInfo='" + classInfo + '\'' +
                '}';
    }

    public void init() {
        System.out.println("Initialization method called in LifeCycleExampleUsingXML");
    }

    public void destroy() {
        System.out.println("Destroy method called in LifeCycleExampleUsingXML");
    }
}





