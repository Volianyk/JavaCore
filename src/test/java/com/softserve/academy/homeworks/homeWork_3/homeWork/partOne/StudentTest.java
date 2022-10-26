package com.softserve.academy.homeworks.homeWork_3.homeWork.partOne;

import com.softserve.academy.homeWorks.homeWork_3.homeWork.partOne.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {
    Student st;

    @BeforeEach
    void preparedData() {
        st = new Student("Robert", 65);
    }

    @Test
    void setNameWhenNameIsEmpty() {
        Student student = new Student();
        student.setName("Oleg");
        assertEquals("Oleg", student.getName());
    }

    @Test
    void setName() {
        st.setName("Jon");
        assertEquals("Robert", st.getName());
    }

    @Test
    void setRating() {
        st.setRating(99);
        assertEquals(99, st.getRating());
    }

    @Test
    void betterStudent() {
        Student studentTest = new Student();
        studentTest.setRating(50);
        assertEquals(true, st.betterStudent(studentTest.getRating()));
    }

    @Test
    void testToString() {
        assertEquals("Student Robert has rating 65.", st.toString());
    }
}