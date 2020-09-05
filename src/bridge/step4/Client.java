package bridge.step4;

public class Client {
    public static void main(String[] args) {
        IRobot robot1 = new RobotModel1();
        Cook iActionCook = new Cook(robot1);
        iActionCook.powerOn();
        iActionCook.doCook();
        iActionCook.powerOff();

        System.out.println("-------------------------");

        IRobot robot2 = new RobotModel2();
        Clean cleanRobot = new Clean(robot2);
        cleanRobot.powerOn();
        cleanRobot.doClean();
        cleanRobot.powerOff();
    }
}
