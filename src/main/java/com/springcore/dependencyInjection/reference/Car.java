package com.springcore.dependencyInjection.reference;

public class Car {
    private String modelNumber;
    private float milege;

    private String carType;

    private CarParts carParts;


    public Car() {
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public float getMilege() {
        return milege;
    }

    public void setMilege(float milege) {
        this.milege = milege;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public CarParts getCarParts() {
        return carParts;
    }

    public void setCarParts(CarParts carParts) {
        this.carParts = carParts;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelNumber='" + modelNumber + '\'' +
                ", milege=" + milege +
                ", carType='" + carType + '\'' +
                ", carParts=" + carParts +
                '}';
    }
}
