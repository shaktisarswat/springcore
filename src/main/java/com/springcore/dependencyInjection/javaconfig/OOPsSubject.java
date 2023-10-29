package com.springcore.dependencyInjection.javaconfig;

import org.springframework.stereotype.Component;

@Component("OOPsSubject")
public class OOPsSubject implements Course {

    private static String courseName = "OOPsSubject";

    public OOPsSubject() {
    }


    public static String getCourseName() {
        return courseName;
    }

    public static void setCourseName(String courseName) {
        OOPsSubject.courseName = courseName;
    }

    @Override
    public String toString() {
        return "OOPsSubject{" + "courseName='" + courseName + '\'' + '}';
    }
}
