package com.softserve.academy.homeWorks.homeWork_3.lecture;

public class Student {
    String firstName;
    String lastName;
    int age;
    String login;
    String password;
    final double socialPayment=4500;

    public Student(String firstName, String lastName, int age, String login, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.login = login;
        this.password = password;
    }

    public String getPassword() {
        return password.charAt(0)+"***";
    }

    public Student() {
    }

    public void printInfo(){
        System.out.println("firstName "+firstName+", lastName "+lastName);
    }
}
