package com.springcore.dependencyInjection.autowire;

import com.springcore.dependencyInjection.autowiring.DependentClassExampleUsingAnnotation;
import com.springcore.dependencyInjection.autowiring.DependentClassExampleUsingXML;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AutoWireInjectionTest {
    ApplicationContext context;
    private String path;

    @Before
    public void setup() {
        path = "src/main/java/com/springcore/dependencyInjection/autowiring/config.xml";
        context = new FileSystemXmlApplicationContext(path);
    }

    @Test
    public void testingAutoWireXML() {
        DependentClassExampleUsingXML dependentClassExampleUsingXML = context.getBean("dependentClassExampleUsingXML", DependentClassExampleUsingXML.class);
        System.out.println(dependentClassExampleUsingXML);
    }

    @Test
    public void testingAutoWireAnnotation() {
        DependentClassExampleUsingAnnotation dependentClassExampleUsingAnnotation = context.getBean("dependentClassExampleUsingAnnotation", DependentClassExampleUsingAnnotation.class);
        System.out.println(dependentClassExampleUsingAnnotation);
    }

}
