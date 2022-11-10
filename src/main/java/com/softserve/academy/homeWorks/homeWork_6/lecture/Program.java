package com.softserve.academy.homeWorks.homeWork_6.lecture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(-234);
        list.add(234);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, (Integer o1, Integer o2) -> o2
                .intValue() - o1.intValue());
        System.out.println(list);
    }
}
