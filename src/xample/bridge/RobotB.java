package xample.bridge;

public class RobotB implements IRobot {
    @Override
    public void powerOn() {
        System.out.println("Power On : Robot B");
    }

    @Override
    public void powerOff() {
        System.out.println("Power Off : Robot B");
    }
}
