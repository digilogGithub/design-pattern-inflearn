package xample.strategy;

public class MySQL implements Database {

    @Override
    public void connectDatabase() {
        System.out.println("Connect MySQL");
    }

    @Override
    public void insertRow() {
        System.out.println("insert into MySQL_TABLE");
    }

    @Override
    public void selectData() {
        System.out.println("Select 30 Rows from MySQL_TABLE");
    }

    @Override
    public void getDatabaseInfo() {
        System.out.println("MySQL Info");
    }
}
