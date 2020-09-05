package observer.case2.step2;

public class Client {
    public static void main(String[] args) {
        PlayController pager = new PlayController();
        Observer obA = new MyClassA(pager);
        Observer obB = new MyClassB(pager);

        System.out.println("----All class STOP---");
        pager.setFlag(false);

        pager.deleteObserver(obB);

        System.out.println("----All class START---");

        pager.setFlag(true);
    }
}
