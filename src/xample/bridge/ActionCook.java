package xample.bridge;

public class ActionCook extends Action {
    public ActionCook(IRobot iRobot) {
        super(iRobot);
    }

    @Override
    public void action() {
        System.out.println("START : Cook");
    }
}
