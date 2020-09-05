package xample.singleton.case1;

public class Client {
    public static void main(String[] args) {

        Runnable task = () -> {
            Database database = Database.getInstance();
            System.out.println("Database : "+database);
        };

        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(task);
            t.start();
        }
    }

}
