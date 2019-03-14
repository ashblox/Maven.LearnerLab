package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    LEON,
    FROILAN,
    NHU,
    KRIS,
    WILHEM;

    private final Instructor instructor;
    private double timeWorked;

    Educator() {
        this.instructor = new Instructor(ordinal());
        instructor.setName(this.toString());
        Instructors.getInstance().add(instructor);
    }

    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
        timeWorked += numberOfHours;
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
        timeWorked = timeWorked + numberOfHours;
    }

    public double getTimeWorked() {
        return timeWorked;
    }
}
