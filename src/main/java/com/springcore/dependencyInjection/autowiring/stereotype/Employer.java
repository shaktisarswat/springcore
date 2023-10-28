package com.springcore.dependencyInjection.autowiring.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Employer {
    @Value("SpaceX")
    private String companyName;


    public Employer(String companyName) {
        this.companyName = companyName;
    }

    public Employer() {
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "companyName='" + companyName + '\'' +
                '}';
    }
}
