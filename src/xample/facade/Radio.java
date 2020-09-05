package xample.facade;

public class Radio {
    private boolean turnedOn = false;

    public void turnOn() {
        turnedOn = true;
        System.out.println("Turn on radio~~~");
    }

    public void turnOff() {
        turnedOn = false;
        System.out.println("Turn off radio~~~");
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }
}
