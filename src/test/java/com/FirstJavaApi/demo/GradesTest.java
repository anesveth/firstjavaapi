package com.FirstJavaApi.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//imports all methods from assert junit
class GradesTest {

    @Test
    void GradesTest() {
        assertEquals("GRADE: D\n",Grades.CalculateGrade(12));
    }
}