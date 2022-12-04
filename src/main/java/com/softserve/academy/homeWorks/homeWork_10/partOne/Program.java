package com.softserve.academy.homeWorks.homeWork_10.partOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter value a: ");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Enter value b:");
        int b = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(squareRectangle(a, b));

    }

    public static int squareRectangle(int a, int b) {
        try {
            if (a <= 0 | b <= 0) {
                throw new ArithmeticException("Inputted value is less than zero");
            }
            return a * b;
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
        }
        return 0;
    }
}
