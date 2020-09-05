package xample.bridge;

public class Client {
    public static void main(String[] args) {
        IRobot robotA = new RobotA();
        IRobot robotB = new RobotB();

        Action actionCook = new ActionCook(robotA);
        Action actionClean = new ActionClean(robotB);

        actionCook.powerOn();
        actionCook.action();
        actionCook.powerOff();

        actionClean.powerOn();
        actionClean.action();
        actionClean.powerOff();
    }
}
