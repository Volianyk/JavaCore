package com.softserve.academy.homeWorks.homeWork_5;

public abstract class GroundVehicle extends Passengers implements Vehicle {

    public GroundVehicle(int passengers) {
        super(passengers);
    }

    public abstract void drive();
}
