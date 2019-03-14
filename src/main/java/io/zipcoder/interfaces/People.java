package io.zipcoder.interfaces;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class People<E extends Person> implements Iterable<E> {

    private ArrayList<E> personList;

    public People() {
        personList = new ArrayList<E>();
    }

    public People (ArrayList<E> personList) {
        this.personList = personList;
    }

    public void add(E person) {
        personList.add(person);
    }

    public E findById(long ID) {
        E belongingToId = null;
        for (E person: personList) {
            if (person.getID() == ID) {
                belongingToId = person;
            }
        }
        return belongingToId;
    }

    public void remove(E person) {
        personList.remove(person);
    }

    public void remove(long ID) {
        personList.remove(findById(ID));
    }

    public int getCount() {
        return personList.size();
    }

    public boolean contains(E person) {
        return personList.contains(person);
    }

    public E[] getArray() {
        Class type = personList.get(0).getClass();
        return personList.toArray((E[])(Array.newInstance(type, personList.size())));
    }

    public void removeAll() {
        personList.removeAll(personList);
    }

    public Iterator<E> iterator() {
        return personList.iterator();
    }
}