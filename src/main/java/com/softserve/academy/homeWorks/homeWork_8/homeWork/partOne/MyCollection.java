package com.softserve.academy.homeWorks.homeWork_8.homeWork.partOne;

import java.util.ArrayList;
import java.util.Random;

public class MyCollection {
    private ArrayList<Integer> myCollection = new ArrayList<>();

    public MyCollection() {
        initialData();
    }

    public ArrayList<Integer> getMyCollection() {
        return myCollection;
    }

    public void initialData() {
        Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());
        for (int i = 0; i < 10; i++) {
            Integer r = rand.nextInt() % 256;
            myCollection.add(r);
        }
    }

    @Override
    public String toString() {
        return myCollection.toString();
    }
}
