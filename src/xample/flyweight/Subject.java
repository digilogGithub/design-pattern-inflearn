package xample.flyweight;

public class Subject {
    private String name;

    public Subject(String name) {
        this.name = name;
    }

    public String getName() {
        return "Subject(" + name+")";
    }
}
