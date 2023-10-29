package com.springcore.dependencyInjection.javaconfig.BeanAnnotation;

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
