package observer.case2.step2;

public class MyClassB implements Observer {
    Publisher observable;
    private boolean bPlay;

    public MyClassB(Publisher observable) {
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
            System.out.println("MyClassB : START!!!");
        } else {
            System.out.println("MyClassB : STOP!!!");
        }
    }
}
