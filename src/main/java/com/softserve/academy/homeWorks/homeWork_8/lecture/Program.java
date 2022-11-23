package com.softserve.academy.homeWorks.homeWork_8.lecture;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Program {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            String path = "src/main/resources/program.json";
            FileReader fileReader = new FileReader(path);
            JSONParser jsonParser = new JSONParser();
            JSONObject object = (JSONObject) jsonParser.parse(fileReader);
            String name = (String) object.get("firstName");
            System.out.println(name);

            JSONArray lang = (JSONArray) object.get("language");
            for (Object l : lang) {
                System.out.println(l);
            }



        } catch (Exception ex) {
            System.out.println("error");
        }


    }
}
