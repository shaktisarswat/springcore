package com.springcore.dependencyInjection.autowiring.qualifier;

import com.springcore.dependencyInjection.autowiring.DependencyClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class DependentClassExampleUsingAnnotationWithQualifier {
    @Autowired
    @Qualifier("dependencyClass1")
    private DependencyClass dependencyClass;


    public DependentClassExampleUsingAnnotationWithQualifier(DependencyClass dependencyClass) {
        this.dependencyClass = dependencyClass;
    }

    public DependentClassExampleUsingAnnotationWithQualifier() {
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
        return "DependentClassExampleUsingAnnotationWithQualifier{" + "dependencyClass=" + dependencyClass + '}';
    }
}
