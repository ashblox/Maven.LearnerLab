package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestEducator {

    @Test
    public void implementationTest() {
        Assert.assertTrue(Educator.FROILAN instanceof Teacher);
    }

    @Test
    public void testEnumerations() {
        // given
        Educator[] educators = Educator.values();
        Assert.assertEquals(5, educators.length);
    }

    @Test
    public void teachTest() {
        // Given
        Student student = new Student(1);
        double numberOfHours = 3;
        double expected = student.getTotalStudyTime() + numberOfHours;

        // When
        Educator.FROILAN.teach(student, numberOfHours);
        double actual = student.getTotalStudyTime();

        // Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void lectureTest() {
        // Given
        Student student1 = new Student(0);
        Student student2 = new Student(1);
        Student[] students = {student1, student2};
        double numberOfHours = 2;
        double expected1 = student1.getTotalStudyTime() + 1;
        double expected2 = student2.getTotalStudyTime() + 1;

        // When
        Educator.LEON.lecture(students, numberOfHours);
        double actual1 = student1.getTotalStudyTime();
        double actual2 = student2.getTotalStudyTime();

        // Then
        Assert.assertEquals(expected1, actual1, 0.001);
        Assert.assertEquals(expected2, actual2, 0.001);
    }
}
