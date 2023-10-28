package com.springcore.dependencyInjection.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycleExampleUsingInterface implements InitializingBean, DisposableBean {
    private String classInfo;


    public LifeCycleExampleUsingInterface() {
    }

    public String getClassInfo() {
        return classInfo;
    }

    public void setClassInfo(String classInfo) {
        this.classInfo = classInfo;
    }

    @Override
    public String toString() {
        return "LifeCycleExampleUsingInterface{" + "classInfo='" + classInfo + '\'' + '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initialization Method called in LifeCycleExampleUsingInterface");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy Method called in LifeCycleExampleUsingInterface");

    }
}
