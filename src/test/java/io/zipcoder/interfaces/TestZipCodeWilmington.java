package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestZipCodeWilmington {

    @Test
    public void hostLectureTest() {
        Educator.values();
        //Given
        ArrayList<Double> expected = new ArrayList<Double>();
        for (Student student: ZipCodeWilmington.getStudents()) {
            expected.add(student.getTotalStudyTime());
        }
        for (int i = 0; i < expected.size(); i++) {
            expected.set(i, expected.get(i) + 0.5);
        }

        // When
        ZipCodeWilmington.hostLecture(ZipCodeWilmington.getInstructors().getArray()[0], 2.5);
        ArrayList<Double> actual = new ArrayList<Double>();
        // Then
        for (Student student: ZipCodeWilmington.getStudents()) {
            Assert.assertTrue(expected.contains(student.getTotalStudyTime()));
        }
    }
}
