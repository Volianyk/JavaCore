package com.softserve.academy.homeWorks.homeWork_8.homeWork.partOne;


import java.util.ArrayList;
import java.util.Collections;

public class Program {

    static ArrayList<Integer> newCollection = new ArrayList<>();
    static MyCollection myCollection = new MyCollection();

    public static void main(String[] args) {

        System.out.println(myCollection);

        System.out.println(newCollection = findElementsMoreThenValue(myCollection.getMyCollection(), 5));
        System.out.println(removeElementsMoreThenValue(myCollection.getMyCollection(), 20));

        myCollection.getMyCollection().set(2, 1);
        myCollection.getMyCollection().set(8, -3);
        myCollection.getMyCollection().set(5, -4);
        printResult(myCollection.getMyCollection());

        Collections.sort(myCollection.getMyCollection());
        System.out.println("After sorting" + myCollection.getMyCollection());

    }

    static public ArrayList<Integer> findElementsMoreThenValue(ArrayList<Integer> arrayList, int value) {
        ArrayList<Integer> collection = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (value <= arrayList.get(i)) {
                collection.add(arrayList.get(i));
            }
        }
        return collection;
    }

    static public ArrayList<Integer> removeElementsMoreThenValue(ArrayList<Integer> arrayList, int value) {
        ArrayList<Integer> collection = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (value > arrayList.get(i)) {
                collection.add(arrayList.get(i));
            }
        }
        return collection;
    }

    static public void printResult(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int element = list.get(i);
            System.out.println("position " + i + " - " + element);
        }
    }

}
