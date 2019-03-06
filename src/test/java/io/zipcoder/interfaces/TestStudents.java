package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestStudents {

    @Test
    public void studentsTest() {
        // Given
        List<String> expectedStudentNames = Arrays.asList("Eleanor", "Kyle", "Kristina", "David", "Leah");
        for(Person student : Students.getInstance()) {
            // then
            Assert.assertTrue(expectedStudentNames.contains(student.getName()));
        }
    }


}
