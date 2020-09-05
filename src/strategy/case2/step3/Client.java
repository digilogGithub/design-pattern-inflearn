package strategy.case2.step3;

public class Client {
    public static void main(String[] args) {

        DatabaseUse myDB = new DatabaseUse();

        myDB.setDb(new MySQL());
        myDB.connect();
        myDB.select();

        myDB.setDb(new Informix());
        myDB.connect();
        myDB.select();

        myDB.setDb(new Oracle());
        myDB.connect();
        myDB.select();
    }
}
