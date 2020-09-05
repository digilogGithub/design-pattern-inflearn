package strategy.case2.step2;

public class Informix extends Database {

    public Informix() {
        name = "Informix";
        rows = 40;
    }

    @Override
    public void connectDatabase() {
        System.out.println(name+" : connect success");
    }
}
