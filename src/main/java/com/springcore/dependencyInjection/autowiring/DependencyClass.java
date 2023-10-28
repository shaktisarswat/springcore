package com.springcore.dependencyInjection.autowiring;

public class DependencyClass {

    private String classInfo;

    public DependencyClass(String classInfo) {
        System.out.println("DependencyClass Parameterized Constructor called!!");
        this.classInfo = classInfo;
    }

    public DependencyClass() {
        System.out.println("DependencyClass without Parameterized Constructor called!!");
    }

    public String getClassInfo() {
        return classInfo;
    }

    public void setClassInfo(String classInfo) {
        this.classInfo = classInfo;
    }

    @Override
    public String toString() {
        return "DependencyClass{" + "classInfo='" + classInfo + '\'' + '}';
    }
}
