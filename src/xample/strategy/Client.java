package xample.strategy;

public class Client {
    public static void main(String[] args) {
        Database postgreSQL = new PostgreSQL();
        Database mySQL = new MySQL();
        Database oracle = new Oracle();

        DatabaseUse databaseUse = new DatabaseUse(postgreSQL);
        databaseUse.connectionDB();
        databaseUse.getDatabase();
        databaseUse.insert();
        databaseUse.select();

        System.out.println();
        System.out.println("--------------------------");
        databaseUse.setDatabase(mySQL);
        databaseUse.connectionDB();
        databaseUse.getDatabase();
        databaseUse.insert();
        databaseUse.select();

        System.out.println();
        System.out.println("--------------------------");
        databaseUse.setDatabase(oracle);
        databaseUse.connectionDB();
        databaseUse.getDatabase();
        databaseUse.insert();
        databaseUse.select();

        System.out.println();
        System.out.println("--------------------------");
        databaseUse.setDatabase(postgreSQL);
        databaseUse.connectionDB();
        databaseUse.getDatabase();
        databaseUse.insert();
        databaseUse.select();

    }
}
