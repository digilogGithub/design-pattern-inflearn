package singleton.case1.step2sync;

public class Database {
    private static Database singleton;
    private String name;

    private Database(String name) {
//        this.name = name;
        try {
            Thread.sleep(100);
            this.name = name;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

//    synchronized
    public synchronized static Database getInstance(String name) {
        if(singleton == null) {
            singleton = new Database(name);
        }
        return singleton;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
