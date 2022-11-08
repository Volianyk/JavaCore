package com.softserve.academy.homeWorks.homeWork_5;

public class Liner extends WaterVehicle {
    private int flours;

    public Liner(int passengers, int flours) {
        super(passengers);
        this.flours = flours;
    }

    public int getFlours() {
        return flours;
    }

    public void setFlours(int flours) {
        this.flours = flours;
    }

    @Override
    public void isSailing() {
        System.out.println("The liner is not sailing ship");
    }
}
