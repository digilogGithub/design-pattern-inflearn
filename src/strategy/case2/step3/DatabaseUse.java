package strategy.case2.step3;

//enum DBTYPE {MySQL, Informix, Oracle}

public class DatabaseUse {
    private Database db;

    public void setDb(Database db) {
        this.db = db;
    }

    public void connect() {
        if (db == null) {
            System.out.println("STEP1 : Select Database.");
        } else {
            db.connectDatabase();
        }
    }

    public void select() {
        db.selectData();
    }
}
