package facade.case2;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Light light = new Light();
        Radio radio = new Radio();

        computer.turnOff();
        light.turnOff();
        radio.turnOff();

        HomeFacade homeFacade = new HomeFacade(computer, light, radio);
        homeFacade.homeIn();
    }
}
