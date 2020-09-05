package xample.strategy;

public class Oracle implements Database {
    @Override
    public void connectDatabase() {
        System.out.println("Connect Oracle");
    }

    @Override
    public void insertRow() {
        System.out.println("insert into Oracle_TABLE");
    }

    @Override
    public void selectData() {
        System.out.println("Select 20 Rows from Oracle_TABLE");
    }

    @Override
    public void getDatabaseInfo() {
        System.out.println("Oracle Info");
    }
}
