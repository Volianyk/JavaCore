package com.softserve.academy.homeWorks.homeWork_1;

public class Factorial {

    public static void main(String[] args) {
        double result = (2 * factorialUsingForLoop(5) + 3 * factorialUsingForLoop(8))
                / (factorialUsingForLoop(6) + factorialUsingForLoop(4));
        System.out.printf("result=%.2f", result);
    }

    public static double factorialUsingForLoop(double n) {
        double fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
