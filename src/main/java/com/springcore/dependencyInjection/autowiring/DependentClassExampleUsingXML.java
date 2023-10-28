package com.springcore.dependencyInjection.autowiring;

public class DependentClassExampleUsingXML {
    private DependencyClass dependencyClass;

    public DependentClassExampleUsingXML() {
    }

    public DependentClassExampleUsingXML(DependencyClass dependencyClass) {
        this.dependencyClass = dependencyClass;
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
        return "DependentClassExampleUsingXML{" +
                "dependencyClass=" + dependencyClass +
                '}';
    }
}
