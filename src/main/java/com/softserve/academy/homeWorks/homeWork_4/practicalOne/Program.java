package com.softserve.academy.homeWorks.homeWork_4.practicalOne;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Object> cars=new ArrayList<>();
        cars.add(new Sedan("Sonata",200, 2009,"blue"));
        cars.add(new Sedan("Golf",170, 2019,"green"));
        cars.add(new Truck("FH70",90,2010,12000));
        cars.add(new Truck("Actros",110,2020,16000));

        for (Object weicle: cars ){
            System.out.println(weicle);
        }

    }
}
