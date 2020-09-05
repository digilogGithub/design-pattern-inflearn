package flyweight.case2;

public class Client {
    public static void main(String[] args) {
        FlyweightFactory flyweight = new FlyweightFactory();
        flyweight.getSubject("a");
        flyweight.getSubject("a");
        flyweight.getSubject("b");
        flyweight.getSubject("b");
    }
}
