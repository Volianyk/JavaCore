package com.softserve.academy.homeWorks.homeWork_4.practicalOne;

public class Truck extends Car {
    private int weight;

    public Truck(String model, int maxSpeed, int yearOfManufacture, int weight) {
        super(model, maxSpeed, yearOfManufacture);
        this.weight = weight;
    }

    @Override
    void run() {
        System.out.println("The " + model + " is running");
    }

    @Override
    void stop() {
        System.out.println("The " + model + " stop");
    }

    @Override
    public String toString() {

        return "The truck has max weight " + weight + "kg, model is " + model + ", has max speed: " + maxSpeed + "km/h, was manufactured in " + yearOfManufacture;
    }
}
