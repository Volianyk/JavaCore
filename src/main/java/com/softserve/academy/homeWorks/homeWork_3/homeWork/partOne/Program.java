package com.softserve.academy.homeWorks.homeWork_3.homeWork.partOne;

public class Program {
    public static void main(String[] args) {
        Student st1 = new Student("Oleg", 68);
        Student st2 = new Student("Stepan", 51);
        Student st3 = new Student("Petro", 89);

        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(st2.betterStudent(st1));
        Student.setAvgRating(avgRating(st1, st2, st3));
        System.out.println(Student.getAvgRating());
    }

    static public int avgRating(Student st1, Student st2, Student st3) {
        int total = st1.getRating() + st2.getRating() + st3.getRating();
        int average = total / 3;
        System.out.println("Total rating=" + total);
        return average;
    }

}
