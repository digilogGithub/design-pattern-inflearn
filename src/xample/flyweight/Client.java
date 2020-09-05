package xample.flyweight;

public class Client {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        flyweightFactory.getInstance("sia");
        flyweightFactory.getInstance("digilog");
        flyweightFactory.getInstance("sia");
        flyweightFactory.getInstance("digilog");
        flyweightFactory.getInstance("sia");
        flyweightFactory.getInstance("sia");
        flyweightFactory.getInstance("karres");
        flyweightFactory.getInstance("last");
    }
}
