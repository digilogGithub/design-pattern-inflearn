package xample.singleton.case2;

public class Database {
    private static Database database = new Database();

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
        } else
            return database;
    }
}
