package com.softserve.academy.homeWorks.homeWork_4.practicalTwo;

public class Program {
    public static void main(String[] args) {
        Line lines[] = new Line[4];
        lines[0] = new Line(new Point(1, 2), new Point(3, 4));
        lines[1] = new Line(new Point(55, 62), new Point(37, 14));
        lines[2]=new ColorLine(new Point(45,98),new Point(70,64), "green");
        lines[3]=new ColorLine(new Point(-5,78),new Point(-10,-44), "white");

        for (Line line: lines){
            line.print();
        }
    }
}
