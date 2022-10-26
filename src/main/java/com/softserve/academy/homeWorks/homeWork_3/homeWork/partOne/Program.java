package com.softserve.academy.homeWorks.homeWork_3.homeWork.partOne;

public class Program {
    public static void main(String[] args) {
        Student st1 = new Student("Oleg", 68);
        Student st2 = new Student("Stepan", 51);
        Student st3 = new Student("Petro", 89);

        System.out.println(st1.toString());
        System.out.println(st2.toString());
        System.out.println(st3.toString());

        System.out.println(st2.betterStudent(st1.getRating()));
    }
}
