package xample.observer;

public class Client {
    public static void main(String[] args) {
        PlayController publisher = new PlayController(false);
        MyClassA myClassA = new MyClassA(publisher);
        MyClassB myClassB = new MyClassB(publisher);

        System.out.println("---------- START -------------");
        publisher.setFlag(true);

        publisher.remove(myClassB);

        System.out.println("---------- STOP -------------");
        publisher.setFlag(false);
    }
}
