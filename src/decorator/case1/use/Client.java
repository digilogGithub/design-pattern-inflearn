package decorator.case1.use;

import decorator.case1.base.IceCream;
import decorator.case1.base.IceCreamCone;
import decorator.case1.base.IceCreamPop;
import decorator.case1.decorator.Melon;
import decorator.case1.decorator.StrawBerry;

public class Client {
    public static void main(String[] args) {
        IceCream iceCream1 = new IceCreamCone();
        System.out.println(iceCream1.getDescription() + " cost : "+iceCream1.price());

        IceCream iceCream2 = new IceCreamCone();
        iceCream2 = new StrawBerry(iceCream2);
        System.out.println(iceCream2.getDescription() + " cost : "+iceCream2.price());


        IceCream iceCream3 = new Melon(new StrawBerry(new IceCreamPop()));
        System.out.println(iceCream3.getDescription() + " cost : "+iceCream3.price());
    }
}
