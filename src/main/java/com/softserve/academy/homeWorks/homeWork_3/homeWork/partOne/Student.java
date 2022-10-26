package com.softserve.academy.homeWorks.homeWork_3.homeWork.partOne;

public class Student {
    String name;
    int rating;

    private static int avgRating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (this.name == null) {
            this.name = name;
        }
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public static int getAvgRating() {
        return avgRating;
    }

    public static void setAvgRating(int avgRating) {
        Student.avgRating = avgRating;
    }


    public Student() {
    }

    public Student(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public boolean betterStudent(Student student) {
        if (this.rating > student.getRating()) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Student " + name + " has rating " + rating + ".";
    }
}
