package strategy.case2.step2;

public class Oracle extends Database {

    public Oracle() {
        name = "Oracle";
        rows = 10;
    }

    @Override
    public void connectDatabase() {
        System.out.println(name+" : connect success");
    }
}