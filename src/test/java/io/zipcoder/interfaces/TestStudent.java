package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void implementationTest() {
        // Given
        Student student = new Student(0l);

        // When
        boolean isInstanceOf = student instanceof Learner;

        // Then
        Assert.assertTrue(isInstanceOf);
    }

    @Test
    public void inheritanceTest() {
        // Given
        Student student = new Student(0l);

        // When
        boolean isInstanceOf = student instanceof Person;

        // Then
        Assert.assertTrue(isInstanceOf);
    }

    @Test
    public void learnTest() {
        // Given
        Student student = new Student(0l);
        double numberOfHours = 2.0;
        double expected = student.getTotalStudyTime() + 2.0;

        // When
        student.learn(numberOfHours);
        double actual = student.getTotalStudyTime();

        // Then
        Assert.assertEquals(expected, actual, 0.001);
    }
}
