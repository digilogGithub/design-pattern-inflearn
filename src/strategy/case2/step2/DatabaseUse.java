package strategy.case2.step2;

enum DBTYPE {MySQL, Informix, Oracle}

public class DatabaseUse {
    private Database db;

    public void connect(DBTYPE dbtype) {
        switch (dbtype) {
            case MySQL:
                db = new MySQL();
                break;
            case Informix:
                db = new Informix();
                break;
            case Oracle:
                db = new Oracle();
                break;
        }

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
