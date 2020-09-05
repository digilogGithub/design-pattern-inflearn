package xample.decorator.student.decorator;

import xample.decorator.student.base.Student;

public abstract class DecoratorStudent extends Student {
    Student student;

    public DecoratorStudent(Student student) {
        this.student = student;
    }

    @Override
    public String getDescription() {
        return student.getDescription();
    }
}
