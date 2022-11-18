package com.softserve.academy.homeWorks.homeWork_7.partOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program {
    private static final Pattern SECOND_WORD_PATTERN = Pattern.compile("^\\S+?\\s(\\S+).*$");

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter sentence:");

        String sentence = br.readLine();
        br.close();

        System.out.println(findSecondWord(sentence));
        wordInReverse(findSecondWord(sentence));
        numberOfLetters(sentence);
        System.out.println("The longest word is: " + longestWord(sentence) + " has " + longestWord(sentence).length() + " letters");

    }

    public static String findSecondWord(String s) {
        Matcher matcher = SECOND_WORD_PATTERN.matcher(s);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        throw new IllegalArgumentException("Provided input not valid");
    }

    public static String wordInReverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }

    public static int numberOfLetters(String s) {
        return s.length();
    }

    public static String longestWord(String s) {
        return Arrays.stream(s.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse(null);
    }
}


