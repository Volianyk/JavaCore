package com.softserve.academy.homeWorks.homeWork_4.practicalTwo;

public class Point implements Print {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        toString();
    }

    @Override
    public String toString() {
        return " point has coordinates x=" + this.x + ", y=" + this.y;
    }
}
