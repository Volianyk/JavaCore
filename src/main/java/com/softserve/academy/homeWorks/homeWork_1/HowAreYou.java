package com.softserve.academy.homeWorks.homeWork_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HowAreYou {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("How are you?");
        String answer = br.readLine();
        System.out.println("You are " + answer);
    }
}
