package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestInstructors {

//    @Before
//    public void setup() {
//        Educator.values();
//    }

    @Test
    public void instructorsTest() {
        // Given
        List<String> expectedInstructorNames = Arrays.asList("LEON", "FROILAN", "KRIS", "WILHEM", "NHU");

        for (Person instructor: Instructors.getInstance()) {
            // Then
            Assert.assertTrue(expectedInstructorNames.contains(instructor.getName()));
        }
    }

}
