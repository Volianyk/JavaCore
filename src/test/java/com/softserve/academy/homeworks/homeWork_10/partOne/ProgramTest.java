package com.softserve.academy.homeworks.homeWork_10.partOne;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static com.softserve.academy.homeWorks.homeWork_10.partOne.Program.*;

class ProgramTest {

    @Test
    void squareRectangleTest() {
        assertEquals(10, squareRectangle(2,5));
    }
    @Test
    void squareRectangleTestIncorrectValue() {
        assertEquals(0, squareRectangle(-2,5));
    }
}