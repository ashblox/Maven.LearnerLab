package io.zipcoder.interfaces;

public class ZipCodeWilmington {

    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    private static final Students students = Students.getInstance();
    private static final Instructors instructors = Instructors.getInstance();

    private ZipCodeWilmington() {

    }

    public static ZipCodeWilmington getInstance() {
        return INSTANCE;
    }

    public static Students getStudents() {
        return students;
    }

    public static Instructors getInstructors() {
        return instructors;
    }

    public static void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(students.getArray(), numberOfHours);
    }

    public static void hostLecture(long ID, double numberOfHours) {
        Instructor teacher = null;
        for (Instructor instructor: instructors.getArray()) {
            if (instructor.getID() == ID) {
                teacher = instructor;
            }
        }
        teacher.lecture(students.getArray(), numberOfHours);
    }
}
