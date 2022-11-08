package com.softserve.academy.homeWorks.homeWork_3.homeWork.partTwo;

public class Employee {
    private String name;
    private int rate;
    private int hours;
    static int totalSum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public Employee() {
    }

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public int getSalary() {
        return this.rate * this.hours;
    }

    @Override
    public String toString() {
        return "Employee " + name + " has rate: " + rate + ", and has been worked for " + hours + " hours";
    }

    public int changeRate(int rate) {
        this.rate = rate;
        return getSalary();
    }

    public double getBonuses() {
        return getSalary() * 0.1;
    }
}
