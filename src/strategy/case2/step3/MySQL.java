package strategy.case2.step3;

public class MySQL extends Database {

    public MySQL() {
        name = "MySQL";
        rows = 20;
    }

    @Override
    public void connectDatabase() {
        System.out.println(name+" : connect success");
    }
}
