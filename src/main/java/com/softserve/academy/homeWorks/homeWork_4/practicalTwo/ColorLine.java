package com.softserve.academy.homeWorks.homeWork_4.practicalTwo;

public class ColorLine extends Line implements Print {
    private String color;

    public ColorLine(Point firstPoint, Point secondPoint, String color) {
        super(firstPoint, secondPoint);
        this.color=color;
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "The color line has two points: first" + this.firstPoint + ", second" + this.secondPoint + ", and color: " + color;
    }
}
