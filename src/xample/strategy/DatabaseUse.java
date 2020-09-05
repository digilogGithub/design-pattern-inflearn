package xample.strategy;

public class DatabaseUse {
    private Database database;

    public DatabaseUse(Database database) {
        this.database = database;
    }

    public void connectionDB() {
        database.connectDatabase();
    }

    public void getDatabase() {
        database.getDatabaseInfo();
    }

    public void setDatabase(Database database) {
        this.database = database;
    }

    public void insert() {
        database.insertRow();
    }

    public void select() {
        database.selectData();
    }
}
