package adapter.case2;

public class BToAAdapter extends BPlayerImpl implements APlayer {

    @Override
    public void play(String fileName) {
        System.out.println("Using Adapter : ");
        playFile(fileName);
    }

    @Override
    public void stop() {

    }
}
