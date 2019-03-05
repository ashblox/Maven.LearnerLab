package io.zipcoder.interfaces;

import java.util.ArrayList;

public final class Students extends People {

    private final ArrayList<Student> INSTANCE;

    private Students() {
        INSTANCE = new ArrayList<Student>();
        INSTANCE.add(new Student(123456l));
        INSTANCE.add(new Student(234567l));
        INSTANCE.add(new Student(345678l));
        INSTANCE.add(new Student(456789l));
        INSTANCE.add(new Student(567890l));
    }

    public ArrayList<Student> getINSTANCE() {
        return INSTANCE;
    }
}
