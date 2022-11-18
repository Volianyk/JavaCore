package com.softserve.academy.homeWorks.homeWork_7.partTwo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter sentence:");
        String sentence = br.readLine();
        br.close();
        System.out.println(rewriteConsecutiveWhiteSpaces(sentence));
    }

    public static String rewriteConsecutiveWhiteSpaces(String str) {
        return str.trim().replaceAll("\\s+", " ");
    }

}
