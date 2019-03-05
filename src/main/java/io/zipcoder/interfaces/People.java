package io.zipcoder.interfaces;

import java.util.ArrayList;

public class People {

    ArrayList<Person> personList;

    public People() {
        personList = new ArrayList<Person>();
    }

    public People (ArrayList<Person> personList) {
        this.personList = personList;
    }

    public void add(Person person) {
        personList.add(person);
    }

    public Person findById(long ID) {
        Person belongingToId = null;
        for (Person person: personList) {
            if (person.getID() == ID) {
                belongingToId = person;
            }
        }
        return belongingToId;
    }

    public void remove(Person person) {
        personList.remove(person);
    }

    public void remove(long ID) {
        for (Person person: personList) {
            if (person.getID() == ID) {
                personList.remove(person);
            }
        }
    }

    public int getCount() {
        return personList.size();
    }

    public Person[] getArray() {
        Person[] result = new Person[personList.size()];
        return personList.toArray(result);
    }

    public void removeAll() {
        personList.removeAll(personList);
    }
}
