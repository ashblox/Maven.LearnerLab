package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestInstructors {

    @Test
    public void instructorsTest() {
        Educator.values();

        // Given
        List<String> expectedInstructorNames = Arrays.asList("LEON", "FROILAN", "KRIS", "WILHEM", "NHU");

        for (Person instructor: Instructors.getInstance()) {
            // Then
            Assert.assertTrue(expectedInstructorNames.contains(instructor.getName()));
        }
    }

    @Test
    public void getInstructorsArrayTest() {
        Educator.values();

        for (Person instructor: Instructors.getInstance()) {
            System.out.println(instructor.getName());
        }
    }
}
