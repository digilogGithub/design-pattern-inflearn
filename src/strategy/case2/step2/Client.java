package strategy.case2.step2;

public class Client {
    public static void main(String[] args) {

        DatabaseUse myDB = new DatabaseUse();

        myDB.connect(DBTYPE.MySQL);
        myDB.select();

        myDB.connect(DBTYPE.Informix);
        myDB.select();

        myDB.connect(DBTYPE.Informix);
        myDB.select();
    }
}
