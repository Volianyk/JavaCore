package com.softserve.academy.homeworks.homeWork_2;

import com.softserve.academy.homeWorks.homeWork_2.NumberAnalysis;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberAnalysisTest {


    @Test
    void writeTheNumberInReverse() {

    }

    @Test
    void countNumbers() {
        assertEquals(2, NumberAnalysis.countNumbers(12));
        assertEquals(1, NumberAnalysis.countNumbers(8));
        assertEquals(5, NumberAnalysis.countNumbers(12345));
    }

    @Test
    void numberGreaterThanNumberToCompare() {

    }
}