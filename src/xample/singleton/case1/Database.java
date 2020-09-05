package xample.singleton.case1;

public class Database {
    private static Database database;

    private Database() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static Database getInstance() {
        if (database == null) {
            return new Database();
        } else {
            return database;
        }
    }
}
