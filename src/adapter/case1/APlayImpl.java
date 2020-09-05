package adapter.case1;

public class APlayImpl implements APlayer {
    @Override
    public void play(String fileName) {
        System.out.println("(A) "+fileName);
    }

    @Override
    public void stop() {

    }
}
