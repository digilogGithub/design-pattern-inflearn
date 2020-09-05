package xample.observer;

public class MyClassA implements Observer {
    private Publisher publisher;

    public MyClassA(Publisher publisher) {
        this.publisher = publisher;
        publisher.add(this);
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public void update(boolean play) {
        if (play) {
            System.out.println("My ClassA : START!!!");
        } else {
            System.out.println("My ClassA : STOP!!!");
        }
    }
}
