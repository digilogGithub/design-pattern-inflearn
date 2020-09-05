package adapter.case1;

public class Client {
    public static void main(String[] args) {
        APlayer player1 = new APlayImpl();
        player1.play("aaa.mp3");

        BPlayer player2 = new BPlayerImpl();
        player2.playFile("bbb.mp3");

        player1 = new BToAAdapter(new BPlayerImpl());
        player1.play("ccc.mp3");
    }
}
