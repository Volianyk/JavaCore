package com.softserve.academy.homeWorks.homeWork_4.partTwo;

public class Program {
    public static void main(String[] args) {
        Employee employee = new Employee("Tom", 29, 12.500);
        Developer developer = new Developer("Mike", 31, 12.300, "developer");
        System.out.println(employee.report());
        System.out.println(developer.report());

    }
}
