package com.springcore.dependencyInjection.javaconfig;

import org.springframework.stereotype.Component;

@Component("DSASubject")
public class DSASubject implements Course {

    private static String courseName = "DSASubject";

    public DSASubject() {
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        DSASubject.courseName = courseName;
    }

    @Override
    public String toString() {
        return "DSASubject{" +
                "courseName='" + courseName + '\'' +
                '}';
    }
}
