package com.softserve.academy.homeWorks.progect.model;

public class Employee extends Person {
    private String department;

    public Employee(int id, String firstName, String lastName, int age, String department) {
        super(id, firstName, lastName, age);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}
