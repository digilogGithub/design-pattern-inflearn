package xample.facade;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Light light = new Light();
        Radio radio = new Radio();

        System.out.println("----manual turn on----");
        computer.turnOn();
        light.turnOff();
        radio.turnOn();

        HomeFacade homeFacade = new HomeFacade(computer, light,radio);
        homeFacade.homeTurnOn();
        homeFacade.homeTurnOff();

    }
}
