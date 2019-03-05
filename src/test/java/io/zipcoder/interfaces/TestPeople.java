package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestPeople {

    @Test
    public void addTest() {
        // Given
        People people = new People(new ArrayList<Person>());
        long expected1Id = 1l;
        long expected2Id = 2l;
        Person expected1 = new Person(expected1Id);
        Person expected2 = new Person(expected2Id);

        // When
        people.add(expected1);
        people.add(expected2);
        Person actual1 = people.findById(expected1Id);
        Person actual2 = people.findById(expected2Id);

        // Then
        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
    }

    @Test
    public void removeTest() {
        // Given
        People people = new People(new ArrayList<Person>());
        long idToRemove = 0l;
        Person personToRemove = new Person(idToRemove);
        people.add(personToRemove);

        // When
        people.remove(personToRemove);

        // Then
        Assert.assertNull(people.findById(idToRemove));
    }

    @Test
    public void findByIdTest() {
        // Given
        People people = new People(new ArrayList<Person>());
        long idToFind = 3l;
        Person expected = new Person(idToFind);
        people.add(expected);

        // When
        Person actual = people.findById(idToFind);

        // Then
        Assert.assertEquals(expected, actual);
    }
}
