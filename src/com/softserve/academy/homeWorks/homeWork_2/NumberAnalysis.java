package com.softserve.academy.homeWorks.homeWork_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberAnalysis {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter numbers for analysis:");
        int numbers = Integer.parseInt(br.readLine());
        br.close();
        int count = countNumbers(numbers);

        System.out.println("The number of digits in the number is: " + count);
        numberGreaterThanNumberToCompare(numbers);
        writeTheNumberInReverse(numbers);

    }

    public static void writeTheNumberInReverse(int numbers) {
        while (numbers > 0) {
            int reverse = numbers % 10;
            System.out.println(reverse);
            numbers = numbers / 10;
        }
    }

    public static int countNumbers(int numbers) {
        int count = 0;
        while (numbers > 0) {
            long reverse = numbers % 10;
            count++;
            numbers = numbers / 10;
        }
        return count;
    }

    public static void numberGreaterThanNumberToCompare(int numbers) {
        int numberToCompare = 4;
        boolean result = false;
        while (numbers > 0) {
            int compareNumber = numbers % 10;
            if (compareNumber > numberToCompare) {
                result = true;
            }
            numbers = numbers / 10;
        }
        if (result == true) {
            System.out.println("The inputted numbers have a number greater than " + numberToCompare);
        } else {
            System.out.println("The inputted numbers don't have a number greater than " + numberToCompare);
        }
    }
}
