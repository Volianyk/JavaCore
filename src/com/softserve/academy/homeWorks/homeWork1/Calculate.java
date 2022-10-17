package com.softserve.academy.homeWorks.homeWork1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculate {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter numbers:");

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int sum = a + b;
        int subtraction = a - b;
        int multiply = a * b;
        double division = a / b;

        System.out.printf("sum=%d, subtraction=%d, multiply=%d, division=%.2f" , sum, subtraction, multiply, division);
    }
}
