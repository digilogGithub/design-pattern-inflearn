package observer.case2.step1;

public class Client {
    public static void main(String[] args) {
        PlayController pager = new PlayController();
        Observer obA = new MyClassA();
        Observer obB = new MyClassB();

        pager.addObserver(obA);
        pager.addObserver(obB);

        pager.setFlag(false);

        pager.deleteObserver(obB);

        System.out.println("-------------------");

        pager.setFlag(true);
    }
}
