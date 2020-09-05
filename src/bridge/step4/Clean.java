package bridge.step4;

public class Clean extends IAction {
    public Clean(IRobot iRobot) {
        super(iRobot);
    }

    public void doClean() {
        System.out.println("Do clean~~~");
    }
}
