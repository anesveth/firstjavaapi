package com.FirstJavaApi.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//imports all methods from assert junit
class GradesTest {

    @Test
    void GradesTest() {
        assertEquals("GRADE: D\n",Grades.CalculateGrade(12));
        assertEquals("GRADE: C\n",Grades.CalculateGrade(49));
        assertEquals("GRADE: B\n",Grades.CalculateGrade(57));
        assertEquals("GRADE: A\n",Grades.CalculateGrade(75));
        assertEquals("GRADE: O\n",Grades.CalculateGrade(76));

    }
}