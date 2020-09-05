package xample.bridge;

public class ActionClean extends Action {
    public ActionClean(IRobot iRobot) {
        super(iRobot);
    }

    @Override
    public void action() {
        System.out.println("START : Clean");
    }
}
