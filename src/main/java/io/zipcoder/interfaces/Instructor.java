package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {

    public Instructor(long ID) {
        super(ID);
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        for (Learner learner : learners) {
            learner.learn(numberOfHours/learners.length);
        }
    }
}
