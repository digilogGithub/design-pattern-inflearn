package xample.singleton.case3;

public class ClientLogWriter {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            Thread t = new TreadSub(i);
            t.start();
        }
    }
}

class TreadSub extends Thread {
    int num;

    public TreadSub(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        LogWriter logWriter = LogWriter.getInstance();
        if(num < 20)
            logWriter.log("*** 0" + num + " ***");
        else
            logWriter.log("*** 0" + num + " ***");
    }
}
