package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void implementationTest() {
        // Given
        Instructor instructor = new Instructor(0l);

        // When
        boolean isInstanceOf = instructor instanceof Teacher;

        // Then
        Assert.assertTrue(isInstanceOf);
    }

    @Test
    public void inheritanceTest() {
        // Given
        Instructor instructor = new Instructor(0l);

        // When
        boolean isInstanceOf = instructor instanceof Person;

        // Then
        Assert.assertTrue(isInstanceOf);
    }

    @Test
    public void teachTest() {
        // Given
        Instructor instructor = new Instructor(0l);
        Student student = new Student(0l);
        double numberOfHours = 3.5d;
        double expected = student.getTotalStudyTime() + numberOfHours;

        // When
        instructor.teach(student, numberOfHours);
        double actual = student.getTotalStudyTime();

        // Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void lectureTest() {
        // Given
        Instructor instructor = new Instructor(0l);
        Student student1 = new Student(0l);
        Student student2 = new Student(0l);
        Student student3 = new Student(0l);
        Student[] students = {student1, student2, student3};
        double numberOfHours = 3;
        double expected1 = student1.getTotalStudyTime() + 1;
        double expected2 = student2.getTotalStudyTime() + 1;
        double expected3 = student3.getTotalStudyTime() + 1;

        // When
        instructor.lecture(students, numberOfHours);
        double actual1 = student1.getTotalStudyTime();
        double actual2 = student2.getTotalStudyTime();
        double actual3 = student3.getTotalStudyTime();

        // Then
        Assert.assertEquals(expected1, actual1, 0.001);
        Assert.assertEquals(expected2, actual2, 0.001);
        Assert.assertEquals(expected3, actual3, 0.001);

    }

}
