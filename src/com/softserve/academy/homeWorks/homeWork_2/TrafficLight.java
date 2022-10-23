package com.softserve.academy.homeWorks.homeWork_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrafficLight {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter time:");
        int time = Integer.parseInt(br.readLine());
        br.close();
        int colorTime = time % 5;
        System.out.println(colorTime);
        trafficLight(colorTime);
    }

    public static void trafficLight(int colorTime) {
        if (colorTime > 0 && colorTime <= 3) {
            System.out.println("GREEN light");
        } else {
            System.out.println("RED light");
        }
    }

}
