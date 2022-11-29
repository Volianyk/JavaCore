package com.softserve.academy.homeWorks.homeWork_8.homeWork.partTwo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) throws IOException {
        Map<Integer, String> employeeMap = new HashMap();
        employeeMap.put(1, "Semen");
        employeeMap.put(2, "Oleg");
        employeeMap.put(3, "Taras");
        employeeMap.put(4, "Stepan");
        employeeMap.put(5, "Tom");
        employeeMap.put(6, "Jon");
        employeeMap.put(7, "Tamara");
        System.out.println(employeeMap);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter id:");
        int enteredId = Integer.parseInt(reader.readLine());
        System.out.println("Please enter Name:");
        String enteredName = reader.readLine();
        reader.close();
        System.out.println(getName(employeeMap, enteredId));
        System.out.println("Key is: " + getKeyByValue(employeeMap, enteredName));

    }

    public static String getName(Map map, int id) {
        if (map.containsKey(id)) {
            return "Name is: " + map.get(id);
        }
        return "User not found";
    }

    public static <T, E> T getKeyByValue(Map<T, E> map, E value) {
        if (map.containsValue(value)) {
            for (Map.Entry<T, E> entry : map.entrySet()) {
                if (value.equals(entry.getValue())) {
                    return entry.getKey();
                }
            }
        }
        return (T) "User not found";
    }

}
