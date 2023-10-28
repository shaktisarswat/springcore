package com.springcore;

import com.springcore.dependencyInjection.collections.Employee;
import com.springcore.dependencyInjection.constructorInjection.CarInfo;
import com.springcore.dependencyInjection.fieldInitialization.Student;
import com.springcore.dependencyInjection.lifecycle.LifeCycleExampleUsingAnnotation;
import com.springcore.dependencyInjection.lifecycle.LifeCycleExampleUsingInterface;
import com.springcore.dependencyInjection.lifecycle.LifeCycleExampleUsingXML;
import com.springcore.dependencyInjection.reference.Car;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        String path = "src/main/resources/config.xml";
        AbstractApplicationContext context = new FileSystemXmlApplicationContext(path);
        context.registerShutdownHook();
        Student student = (Student) context.getBean("student1");
        Student student2 = (Student) context.getBean("student2");
        System.out.println(student);
        System.out.println(student2);

        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee);

        Car car = (Car) context.getBean("refCar");
        System.out.println(car);

        CarInfo carInfo = (CarInfo) context.getBean("consInjCar");
        System.out.println(carInfo);

        LifeCycleExampleUsingXML lifeCycleExampleUsingXML = (LifeCycleExampleUsingXML) context.getBean("lifeCycleUsingXML");
        System.out.println(lifeCycleExampleUsingXML);

        LifeCycleExampleUsingInterface lifeCycleExampleUsingInterface= (LifeCycleExampleUsingInterface) context.getBean("lifeCycleUsingInterface");
        System.out.println(lifeCycleExampleUsingInterface);

        LifeCycleExampleUsingAnnotation lifeCycleExampleUsingAnnotation = (LifeCycleExampleUsingAnnotation) context.getBean("lifeCycleUsingAnnotation");
        System.out.println(lifeCycleExampleUsingAnnotation);
    }
}