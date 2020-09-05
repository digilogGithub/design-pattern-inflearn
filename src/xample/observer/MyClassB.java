package xample.observer;

public class MyClassB implements Observer {
    private Publisher publisher;

    public MyClassB(Publisher publisher) {
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
            System.out.println("My ClassB : START!!!");
        } else {
            System.out.println("My ClassB : STOP!!!");
        }
    }
}
