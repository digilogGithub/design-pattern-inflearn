package observer.case2.step1;

public class MyClassB implements Observer {
    private boolean bPlay;

    @Override
    public void update(boolean play) {
        this.bPlay = play;
        myActControl();
    }

    private void myActControl() {
        if (bPlay) {
            System.out.println("MyClassB : START!!!");
        } else {
            System.out.println("MyClassB : STOP!!!");
        }
    }
}
