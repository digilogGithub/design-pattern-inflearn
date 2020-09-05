package xample.strategy;

public class PostgreSQL implements Database{
    @Override
    public void connectDatabase() {
        System.out.println("Connect PostgreSQL");
    }

    @Override
    public void insertRow() {
        System.out.println("insert into PostgreSQL_TABLE");
    }

    @Override
    public void selectData() {
        System.out.println("Select 50 Rows from PostgreSQL_TABLE");
    }

    @Override
    public void getDatabaseInfo() {
        System.out.println("PostgreSQL Info");
    }
}
