package com.softserve.academy.homeWorks.homeWork_7.partThree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

public class Program {
    private static final Pattern PATTERN = Pattern.compile("\\$\\d+\\.\\d{2}");

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter sentence:");
        String sentence = br.readLine();
        br.close();
        returnCorrectValue(sentence);
    }

    public static void returnCorrectValue(String s) {
        PATTERN.matcher(s).results().map(MatchResult::group).forEach(System.out::println);
    }
}
