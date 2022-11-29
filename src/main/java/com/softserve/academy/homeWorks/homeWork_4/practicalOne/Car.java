package com.softserve.academy.homeWorks.homeWork_4.practicalOne;

public abstract class Car {
    String model;
    int maxSpeed;
    int yearOfManufacture;

    abstract void run();

    abstract void stop();

    public Car(String model, int maxSpeed, int yearOfManufacture) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }
}
