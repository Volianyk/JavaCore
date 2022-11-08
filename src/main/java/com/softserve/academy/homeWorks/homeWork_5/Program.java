package com.softserve.academy.homeWorks.homeWork_5;

public class Program {
    public static void main(String[] args) {
        Liner liner = new Liner(100, 2);
        Boat boat = new Boat(12, 25);
        Plane plane = new Plane(145, 4000);
        Helicopter helicopter = new Helicopter(4, 1500, 4000);
        Bus bus = new Bus(35, "Lviv");
        Motorcycle motorcycle = new Motorcycle(1, 170);
        Car car = new Car(5, "Prius");

        liner.isSailing();
        boat.isSailing();

        plane.fly();
        plane.land();
        helicopter.fly();
        helicopter.land();

        bus.drive();
        motorcycle.drive();
        car.drive();

    }
}
