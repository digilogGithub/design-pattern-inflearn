package bridge.step1;

public class Client {
    public static void main(String[] args) {
        IRobot robot1 = new RobotModel1();
        robot1.powerOn();
        robot1.powerOff();

        System.out.println("-------------------------");

        IRobot robot2 = new RobotModel2();
        robot2.powerOn();
        robot2.powerOff();
    }
}
