package com.springcore.dependencyInjection.constructorInjection;

public class CarInfo {

    private String carModel;
    private float mileage;

    public CarInfo(String carModel, float mileage) {
        this.carModel = carModel;
        this.mileage = mileage;
    }

    public CarInfo() {
    }

    @Override
    public String toString() {
        return "CarInfo{" +
                "carModel='" + carModel + '\'' +
                ", mileage='" + mileage + '\'' +
                '}';
    }
}
