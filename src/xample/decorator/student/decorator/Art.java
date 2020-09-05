package xample.decorator.student.decorator;

import xample.decorator.student.base.Student;

public class Art extends DecoratorStudent {

    public Art(Student student) {
        super(student);
    }

    @Override
    public String getDescription() {
        return student.getDescription() +  draw();
    }

    public String draw() {
        return " and draw pictures~~~~";
    }
}
