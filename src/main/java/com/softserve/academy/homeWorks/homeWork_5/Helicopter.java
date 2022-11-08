package com.softserve.academy.homeWorks.homeWork_5;

public class Helicopter extends FlyingVehicle {
    private int weight;
    private int maxHeight;

    public Helicopter(int passengers, int weight, int maxHeight) {
        super(passengers);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    @Override
    public void fly() {
        System.out.printf("\nThe helicopter can fly with %d kilograms up to %d meters", weight, maxHeight);
    }

    @Override
    public void land() {
        System.out.println("\nThe helicopter does not need airport to land");
    }
}
