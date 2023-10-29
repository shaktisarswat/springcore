package com.springcore.dependencyInjection.javaconfig.BeanAnnotation;

import org.springframework.beans.factory.annotation.Value;


public class Teacher {
    @Value("#{new java.lang.String('Mr. Rajeev Saxena')}")
    private String teacherName;
    @Value("#{1}")
    private Integer teacherID;

    private Course teachingCourse;

    @Value("IIIT NAGPUR")
    private String collegeName;


    public Teacher(Course teachingCourse) {
        this.teachingCourse = teachingCourse;
    }

    public Teacher(String teacherName, Integer teacherID, Course teachingCourse, String collegeName) {
        this.teacherName = teacherName;
        this.teacherID = teacherID;
        this.teachingCourse = teachingCourse;
        this.collegeName = collegeName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Integer getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(Integer teacherID) {
        this.teacherID = teacherID;
    }

    public Course getTeachingCourse() {
        return teachingCourse;
    }

    public void setTeachingCourse(Course teachingCourse) {
        this.teachingCourse = teachingCourse;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    @Override
    public String toString() {
        return "Teacher{" + "teacherName='" + teacherName + '\'' + ", teacherID=" + teacherID + ", teachingCourses=" + teachingCourse + ", collegeName='" + collegeName + '\'' + '}';
    }
}
