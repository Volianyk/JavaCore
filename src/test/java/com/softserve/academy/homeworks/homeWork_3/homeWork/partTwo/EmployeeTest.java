package com.softserve.academy.homeworks.homeWork_3.homeWork.partTwo;

import com.softserve.academy.homeWorks.homeWork_3.homeWork.partTwo.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeTest {
    Employee worker;

    @BeforeEach
    public void preparedDat() {
        worker = new Employee("Semen", 5, 40);
    }

    @Test
    void getSalaryTest() {
        assertEquals(200, worker.getSalary());
    }
}