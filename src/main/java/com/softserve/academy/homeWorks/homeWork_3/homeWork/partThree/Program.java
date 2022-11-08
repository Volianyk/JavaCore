package com.softserve.academy.homeWorks.homeWork_3.homeWork.partThree;

public class Program {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();

        person1.input("James", "Smith", 1991);
        person2.input("Robert", "Johnson", 1992);
        person3.input("John", "Williams", 1993);
        person4.input("Michael", "Brown", 1994);
        person5.input("David", "Jones", 1995);

        person1.output();
        person2.output();
        person3.output();
        person3.output();
        person4.output();
        person5.output();

    }
}
