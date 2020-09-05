package facade.case2;

public class Computer {
    private boolean turnedOn = false;

    public void turnOn() {
        turnedOn = true;
        System.out.println("Turn on computer~~~");
    }

    public void turnOff() {
        turnedOn = false;
        System.out.println("Turn off computer~~~");
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }
}
