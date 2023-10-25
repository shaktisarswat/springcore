package com.springcore;

import com.springcore.collections.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        String path = "src/main/resources/config.xml";
        ApplicationContext context = new FileSystemXmlApplicationContext(path);

        Student student = (Student) context.getBean("student1");
        Student student2 = (Student) context.getBean("student2");
        System.out.println(student);
        System.out.println(student2);

        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee);
    }
}