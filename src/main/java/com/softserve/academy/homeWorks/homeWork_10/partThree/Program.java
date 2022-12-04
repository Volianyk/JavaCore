package com.softserve.academy.homeWorks.homeWork_10.partThree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {
    public static void main(String[] args) throws Exception {
        //  System.out.println(div(2, -2));
        readNumber(1, 5);
    }

    public static double div(double a, double b) {
        try {
//            if (b < 0) {
//                throw new ArithmeticException("Divided by zero operation cannot possible");
//            }
            if (b == 0) {
                throw new ArithmeticException("Divided by zero operation cannot possible");
            }
            return a / b;
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
            return 0;
        }
    }


    public static int readNumber(int start, int end) throws Exception {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter value a: ");
            int a = Integer.parseInt(reader.readLine());
            if (a < start) {
                throw new MyException("entered number is less than start number");
            }
            System.out.println("Enter value b:");
            int b = Integer.parseInt(reader.readLine());
            if (b > end) {
                throw new MyException("entered number is bigger than end number");

            }
            System.out.println(a + "  " + b);
            reader.close();
        } catch (NumberFormatException | IOException e) {
            return -1;
        }
        return 0;
    }
}
