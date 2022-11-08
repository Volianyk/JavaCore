package com.softserve.academy.homeworks.homeWork_1;

import com.softserve.academy.homeWorks.homeWork_1.Factorial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTests {
    @Test
    public void testAdd1Plus()
    {
        assertEquals(120, Factorial.factorialUsingForLoop(5));
        assertEquals(2, Factorial.factorialUsingForLoop(2));
        assertEquals(5040, Factorial.factorialUsingForLoop(7));
    }
}
