package adapter.case1;

public class BToAAdapter implements APlayer {

    private BPlayer media;

    public BToAAdapter(BPlayer media) {
        this.media = media;
    }

    @Override
    public void play(String fileName) {
        System.out.println("Using Adapter : ");
        media.playFile(fileName);
    }

    @Override
    public void stop() {

    }
}
