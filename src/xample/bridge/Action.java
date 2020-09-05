package xample.bridge;

public abstract class Action {
    private IRobot iRobot;

    public Action(IRobot iRobot) {
        this.iRobot = iRobot;
    }

    public void powerOn() {
        iRobot.powerOn();
    }

    public void powerOff() {
        iRobot.powerOff();
    }

    public abstract void action();
}
