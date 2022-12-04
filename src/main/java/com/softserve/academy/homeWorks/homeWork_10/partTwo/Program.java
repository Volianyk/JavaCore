package com.softserve.academy.homeWorks.homeWork_10.partTwo;

public class Program {
    public static void main(String[] args) {
        Plant plants[] = new Plant[5];
        plants[0] = new Plant(10, Plant.Color.BLUE, Plant.Type.SHRUBS);
        plants[1] = new Plant(20, Plant.Color.GREEN, Plant.Type.TREES);
        plants[2] = new Plant(10, Plant.Color.BROWN, Plant.Type.TREES);
        for (Plant plant : plants) {
            System.out.println(plant);
        }
    }
}
