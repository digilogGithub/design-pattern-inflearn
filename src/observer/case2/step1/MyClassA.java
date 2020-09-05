package observer.case2.step1;

public class MyClassA implements Observer {
    private boolean bPlay;

    @Override
    public void update(boolean play) {
        this.bPlay = play;
        myActControl();
    }

    private void myActControl() {
        if (bPlay) {
            System.out.println("MyClassA : START!!!");
        } else {
            System.out.println("MyClassA : STOP!!!");
        }
    }
}
