package com.springcore.dependencyInjection.autowiring.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@Scope("prototype")
public class Employee {
    @Value("Shakti")
    private String employeeName;
    @Value("#{myFriends}")
    private List<String> friends;
    @Value("#{workedCompanyWithExp}")
    private Map<String, String> companyAndExp;

    public Employee(String employeeName, List<String> friends, Map<String, String> companyAndExp) {
        this.employeeName = employeeName;
        this.friends = friends;
        this.companyAndExp = companyAndExp;
    }

    public Employee() {
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Map<String, String> getCompanyAndExp() {
        return companyAndExp;
    }

    public void setCompanyAndExp(Map<String, String> companyAndExp) {
        this.companyAndExp = companyAndExp;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeName='" + employeeName + '\'' + ", friends=" + friends + ", companyAndExp=" + companyAndExp + '}';
    }
}
