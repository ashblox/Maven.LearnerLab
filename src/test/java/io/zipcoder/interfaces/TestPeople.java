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
        Assert.assertFalse(people.contains(expected1));
        Assert.assertFalse(people.contains(expected2));

        // When
        people.add(expected1);
        people.add(expected2);

        // Then
        Assert.assertTrue(people.contains(expected1));
        Assert.assertTrue(people.contains(expected2));
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
    public void countTest() {
        // Given
        People people = new People();
        int expected = 10;

        // When
        for (long l = 0l; l < expected; l++) {
            people.add(new Person(l));
        }
        int actual = people.getCount();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getArrayTest() {
        // Given
        People people = new People();
        Person person1 = new Person(0);
        Person person2 = new Person(0);
        Person[] expected = new Person[] {person1, person2};

        // When
        people.add(person1);
        people.add(person2);
        Person[] actual = people.getArray();

        // Then
        for (int i = 0; i < expected.length; i++) {
            Assert.assertEquals(expected[i], actual[i]);
        }
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

    @Test
    public void getArray() {
        // Given
        People people = new People(new ArrayList<Person>());
        Person expected = new Person(2);
        people.add(expected);

        // When
        Person[] persons = people.getArray();
        Person actual = persons[0];

        // Then
        Assert.assertEquals(expected, actual);
    }
}
