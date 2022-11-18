package com.softserve.academy.homeworks.homeWork_7.partTwo;

import org.junit.jupiter.api.Test;

import static com.softserve.academy.homeWorks.homeWork_7.partTwo.Program.rewriteConsecutiveWhiteSpaces;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ProgramTest {

    @Test
    void rewriteConsecutiveWhiteSpacesTest() {
        assertEquals("1 2 3 4 5", rewriteConsecutiveWhiteSpaces(" 1 2   3  4 5  "));
    }
}