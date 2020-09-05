package strategy.case2.step3;

public abstract class Database {
    public String name;
    public double rows;

    public abstract void connectDatabase();

    public void insertData() {
        System.out.println(name + "add data");
    }

    public void selectData() {
        System.out.println("select "+rows+ " from "+name);
    }

}
