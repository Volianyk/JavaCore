package com.softserve.academy.homeWorks.homeWork_4.partTwo;

public class Developer extends Employee {
    private String name;
    private int age;
    private String position;
    private double salary;

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %d, Position: %s, Salary: \u20B4 $.2f.", name, age, position, salary);
    }
}
