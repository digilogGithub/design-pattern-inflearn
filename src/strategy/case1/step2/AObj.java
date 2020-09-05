package strategy.case1.step2;

public class AObj {

    BInterface bInterface;

    public AObj() {
        bInterface = new BImplement();
    }

    public void someFunc() {
//        System.out.println("AAA");
//        System.out.println("AAA");

        bInterface.funcA();
        bInterface.funcA();
    }
}
