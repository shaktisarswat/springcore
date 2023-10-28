package com.springcore.dependencyInjection.autowire.qualifier;

import com.springcore.dependencyInjection.autowiring.DependentClassExampleUsingAnnotation;
import com.springcore.dependencyInjection.autowiring.DependentClassExampleUsingXML;
import com.springcore.dependencyInjection.autowiring.qualifier.DependentClassExampleUsingAnnotationWithQualifier;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AutoWireInjectionWithQualifierTest {
    ApplicationContext context;
    private String path;

    @Before
    public void setup() {
        path = "src/main/java/com/springcore/dependencyInjection/autowiring/qualifier/config.xml";
        context = new FileSystemXmlApplicationContext(path);
    }


    @Test
    public void testingAutoWireAnnotation() {
        DependentClassExampleUsingAnnotationWithQualifier dependentClassExampleUsingAnnotation = context.getBean("dependentClassExampleUsingAnnotationWithQualifier", DependentClassExampleUsingAnnotationWithQualifier.class);
        System.out.println(dependentClassExampleUsingAnnotation);
    }

}
