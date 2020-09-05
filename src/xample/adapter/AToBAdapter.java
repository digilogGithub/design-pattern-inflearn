package xample.adapter;

public class AToBAdapter implements PlayerA {
    private PlayerB playerB;

    public AToBAdapter(PlayerB playerB) {
        this.playerB = playerB;
    }

    @Override
    public void play() {
        playerB.playFile();
    }
}
