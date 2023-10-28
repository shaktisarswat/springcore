package com.springcore.dependencyInjection.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class DependentClassExampleUsingAnnotation {
    @Autowired
    private DependencyClass dependencyClass;


    public DependentClassExampleUsingAnnotation(DependencyClass dependencyClass) {
        this.dependencyClass = dependencyClass;
    }

    public DependentClassExampleUsingAnnotation() {
    }

    public DependencyClass getDependencyClass() {
        return dependencyClass;
    }

    public void setDependencyClass(DependencyClass dependencyClass) {
        System.out.println("setDependencyClass method setting value");
        this.dependencyClass = dependencyClass;
    }

    @Override
    public String toString() {
        return "DependentClassExampleUsingAnnotation{" +
                "dependencyClass=" + dependencyClass +
                '}';
    }
}
