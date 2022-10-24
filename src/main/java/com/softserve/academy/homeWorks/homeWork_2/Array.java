package com.softserve.academy.homeWorks.homeWork_2;

import java.io.IOException;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) throws IOException {

        int[] a = new int[]{1, 2, -3, 4, 5, 6, -7, 8};
        System.out.println("Inputted array: " + Arrays.toString(a));
        localMaxima(a);
        localMinimum(a);
        arithmeticMeanSecondHalfArray(a);
        findEvenAndOddElements(a);
    }

    public static void localMaxima(int[] a) {
        int max = a[0];
        int imax = 0;
        int i = 0;
        while (i < a.length) {
            if (a[i] > max) {
                max = a[i];
                imax = i;
            }
            i++;
        }
        System.out.print("Maximum = " + max);
        System.out.println(" and has index: " + imax);
    }

    public static void localMinimum(int[] a) {
        int max = a[0];
        int imax = 0;
        int i = 0;
        while (i < a.length) {
            if (a[i] < max) {
                max = a[i];
                imax = i;
            }
            i++;
        }
        System.out.print("Maximum = " + max);
        System.out.println(" and has index: " + imax);
    }

    public static void arithmeticMeanSecondHalfArray(int[] a) {
        double result = 0;
        double count = 0;
        for (int i = 1; i <= a.length / 2; i++) {
            result = result + a[a.length - i];
            count++;
        }
        System.out.println("The arithmetic mean of the second half of the array is " + result / count);
    }

    public static void findEvenAndOddElements(int[] a) {
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                count++;
            }
        }
        int[] b = new int[count];
        int[] c = new int[a.length - count];
        int j = 0;
        int k = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                b[j] = a[i];
                j++;
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                c[k] = a[i];
                k++;
            }
        }
        System.out.println("Even Numbers:" + Arrays.toString(b));
        System.out.println("Odd Numbers:" + Arrays.toString(c));
    }
}
