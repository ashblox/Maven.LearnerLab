package io.zipcoder.interfaces;

public final class Students extends People<Student> {

    private static final Students INSTANCE = new Students();

    private Students() {
        String[] studentNames = {"Eleanor", "Kyle", "Kristina", "David", "Leah"};
        for (int id = 0; id < studentNames.length; id++) {
            String studentName = studentNames[id];
            Student student = new Student(id);
            student.setName(studentName);
            super.add(student);
        }
    }

    public static Students getInstance() {
        return INSTANCE;
    }

}
