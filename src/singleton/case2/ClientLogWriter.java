package singleton.case2;

public class ClientLogWriter {
    public static void main(String[] args) {
        LogWriter logWriter;

        logWriter = LogWriter.getInstance();
        logWriter.log("Sia");

        logWriter = LogWriter.getInstance();
        logWriter.log("Liam");
    }
}
