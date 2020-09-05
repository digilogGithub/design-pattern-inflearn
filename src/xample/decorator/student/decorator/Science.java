package xample.decorator.student.decorator;

import xample.decorator.student.base.Student;

public class Science extends DecoratorStudent {

    public Science(Student student) {
        super(student);
    }

    @Override
    public String getDescription() {
        return student.getDescription() +  calculation();
    }

    public String calculation() {
        return " and execute calculation~~~";
    }
}
