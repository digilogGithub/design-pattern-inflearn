package observer.case2.step2;

public class MyClassA implements Observer {

    Publisher observable;
    private boolean bPlay;

    public MyClassA(Publisher observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

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
