package xample.adapter;

public class Client {
    public static void main(String[] args) {
        PlayerA playerA = new PlayAImplement();
        playerA.play();

        PlayerB playerB = new PlayerBImplement();
        playerB.playFile();

        playerA = new AToBAdapter(new PlayerBImplement());
        playerA.play();
    }
}
