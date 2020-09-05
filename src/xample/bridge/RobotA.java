package xample.bridge;

public class RobotA implements IRobot {
    @Override
    public void powerOn() {
        System.out.println("Power On : Robot A");
    }

    @Override
    public void powerOff() {
        System.out.println("Power Off : Robot A");
    }
}
