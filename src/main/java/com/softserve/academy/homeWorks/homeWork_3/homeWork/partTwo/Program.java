package com.softserve.academy.homeWorks.homeWork_3.homeWork.partTwo;

public class Program {
    public static void main(String[] args) {
        Employee worker1 = new Employee("Mike", 2, 40);
        Employee worker2 = new Employee("Jon", 4, 5);
        Employee worker3 = new Employee("Tom", 5, 10);

        System.out.println(worker1);
        System.out.println(worker2);
        System.out.println(worker3);

        System.out.println(worker1.getSalary() + worker1.getBonuses());
        System.out.println(worker2.getSalary() + worker2.getBonuses());
        System.out.println(worker3.getSalary() + worker3.getBonuses());

    }
}
