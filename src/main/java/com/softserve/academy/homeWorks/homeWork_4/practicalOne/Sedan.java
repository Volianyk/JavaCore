package com.softserve.academy.homeWorks.homeWork_4.practicalOne;

public class Sedan extends Car {
    String color;

    public Sedan(String model, int maxSpeed, int yearOfManufacture, String color) {
        super(model, maxSpeed, yearOfManufacture);
        this.color = color;
    }

    @Override
    void run() {
        System.out.println("The " + model + " can run with max speed  " + maxSpeed);
    }

    @Override
    void stop() {
        System.out.println("The " + model + " was stopped");
    }

    @Override
    public String toString() {
        return "The Sedan has color " + color+", model is "+model+", has max speed: "+maxSpeed+"km/h, was manufactured in "+ yearOfManufacture;

    }
}
