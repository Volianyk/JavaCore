package com.softserve.academy.homeWorks.homeWork_10.partTwo;

public class Plant {
    private int size;
    private Color color;
    private Type type;


    enum Color {
        BROWN, WHITE, GREEN, RED, BLUE, ORANGE
    }

    enum Type {
        HERBS, SHRUBS, TREES, CLIMBERS, CREEPERS
    }

    public Plant(int size, Color color, Type type) {
        this.size = size;
        this.color = color;
        this.type = type;
    }

    @Override
    public String toString() {
        return " The plant has size " + size +
                ", color is " + color +
                ", type is " + type;
    }
}
