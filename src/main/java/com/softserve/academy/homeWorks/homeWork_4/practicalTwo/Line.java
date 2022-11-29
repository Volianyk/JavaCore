package com.softserve.academy.homeWorks.homeWork_4.practicalTwo;

public class Line implements Print {
    Point firstPoint;
    Point secondPoint;

    public Line(Point firstPoint, Point secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "The line has two points: first" + firstPoint + ", second" + secondPoint;
    }
}
