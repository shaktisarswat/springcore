package com.springcore.dependencyInjection.autowire;

import com.springcore.dependencyInjection.autowiring.DependentClassExampleUsingAnnotation;
import com.springcore.dependencyInjection.autowiring.DependentClassExampleUsingXML;
import com.springcore.dependencyInjection.autowiring.stereotype.Employee;
import com.springcore.dependencyInjection.autowiring.stereotype.Employer;
import com.springcore.dependencyInjection.autowiring.stereotype.SpringExpressionLangExample;
import org.junit.Assert;
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

    @Test
    public void testingStereoType() {
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);
    }

    @Test
    public void testingSingleton() {
        Employer employer1 = context.getBean("employer", Employer.class);
        Employer employer2 = context.getBean("employer", Employer.class);
        String hashCode1 = String.valueOf(employer1.hashCode());
        String hashCode2 = String.valueOf(employer2.hashCode());
        Assert.assertEquals(hashCode2, hashCode1);
    }

    @Test
    public void testingProtoType() {
        Employee employee1 = context.getBean("employee", Employee.class);
        Employee employee2 = context.getBean("employee", Employee.class);
        String hashCode1 = String.valueOf(employee1.hashCode());
        String hashCode2 = String.valueOf(employee2.hashCode());
        Assert.assertNotEquals(hashCode2, hashCode1);
    }

    @Test
    public void testingSpelExample() {
        SpringExpressionLangExample springExpressionLangExample = context.getBean("springExpressionLangExample", SpringExpressionLangExample.class);
        System.out.println(springExpressionLangExample);
    }
}
