package com.springcore.dependencyInjection.autowiring.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SpringExpressionLangExample {
    @Value("#{new java.lang.String('SpringExpressionLangExample')}")
    private String className;

    @Value("#{2>1}")
    private Boolean isExample;

    @Value("#{visitedPlace}")
    private List<String> visitedPlace;

    @Value("#{T(java.lang.Math).PI}")
    private Double valueOfPI;

    @Value("#{T(java.lang.Math).sqrt(64)}")
    private Double squreRoot;


    public SpringExpressionLangExample() {
    }

    public SpringExpressionLangExample(String className, Boolean isExample, List<String> visitedPlace, Double valueOfPI, Double squreRoot) {
        this.className = className;
        this.isExample = isExample;
        this.visitedPlace = visitedPlace;
        this.valueOfPI = valueOfPI;
        this.squreRoot = squreRoot;
    }

    @Override
    public String toString() {
        return "SpringExpressionLangExample{" +
                "className='" + className + '\'' +
                ", isExample=" + isExample +
                ", visitedPlace=" + visitedPlace +
                ", valueOfPI=" + valueOfPI +
                ", squreRoot=" + squreRoot +
                '}';
    }
}
