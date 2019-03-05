package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void constructorTest() {
        // Given
        long expected = 3246789431l;

        // When
        Person person = new Person(expected);
        long actual = person.getID();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest() {
        // Given
        Person person = new Person(0l);
        String expected = "NewName";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

}
