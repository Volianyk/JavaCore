package com.softserve.academy.homeworks.homeWork_7.partOne;

import org.junit.jupiter.api.Test;

import static com.softserve.academy.homeWorks.homeWork_7.partOne.Program.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ProgramTest {

    @Test
    void findSecondWordTest() {
        String res = findSecondWord("1 22 333 00");
        assertEquals("22", res);
    }

    @Test
    void wordInReverseTest() {
        assertEquals("321", wordInReverse("123"));
    }

    @Test
    void numberOfLettersTest() {
        assertEquals(5, numberOfLetters("12345"));
    }

    @Test
    void longestWordTest() {
        assertEquals("5196", longestWord("1 22 333 4 5196"));
    }

}