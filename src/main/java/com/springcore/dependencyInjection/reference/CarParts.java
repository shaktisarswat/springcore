package com.springcore.dependencyInjection.reference;

import java.util.Set;

public class CarParts {
    private Set<String> parts;

    public CarParts(Set<String> parts) {
        this.parts = parts;
    }

    public CarParts() {
    }

    public Set<String> getParts() {
        return parts;
    }

    public void setParts(Set<String> parts) {
        this.parts = parts;
    }

    @Override
    public String toString() {
        return "CarParts{" +
                "parts=" + parts +
                '}';
    }
}
