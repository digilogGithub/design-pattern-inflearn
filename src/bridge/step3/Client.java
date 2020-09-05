package bridge.step3;

public class Client {
    public static void main(String[] args) {
        IRobot robot1 = new RobotModel1();
        Cook iActionCook = new Cook(robot1);
        iActionCook.powerOn();
        iActionCook.doCook();
        iActionCook.powerOff();

        System.out.println("-------------------------");

        IRobot robot2 = new RobotModel2();
        robot2.powerOn();
        robot2.powerOff();
    }
}
