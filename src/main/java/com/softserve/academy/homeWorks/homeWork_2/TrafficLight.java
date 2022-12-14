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
        System.out.println(trafficLight(time));
    }

    public static String trafficLight(int time) {
        int colorTime = time % 5; //cycle=5 minute, 1-3m green light, 4-5m red light
        String color = "RED light";
        if (colorTime > 0 && colorTime <= 3) {
            color = "GREEN light";
        }
        return color;
    }
}
