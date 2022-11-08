package com.softserve.academy.homeWorks.homeWork_5;

public class Plane extends FlyingVehicle {
    private int maxDistance;

    public Plane(int passengers, int maxDistance) {
        super(passengers);
        this.maxDistance = maxDistance;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {
        System.out.printf("\nThe plane can fly to %d kilometers with %d passengers ", maxDistance, getPassengers());
    }

    @Override
    public void land() {
        System.out.println("\nThe plane needs airport to land");
    }
}
