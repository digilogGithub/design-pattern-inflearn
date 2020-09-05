package singleton.case1.step2sync;

public class Client2 {

    static int nNum = 0;

    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                nNum++;
                Database database = Database.getInstance(nNum + "th Database");
                System.out.println("This is the " + database.getName() + " !!!");
            } catch (Exception e) {

            }
        };

        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(task);
            t.start();
        }
    }
}
