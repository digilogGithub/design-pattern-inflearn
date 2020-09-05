package decorator.case1.decorator;

import decorator.case1.base.IceCream;

public class StrawBerry extends Decorator {


    public StrawBerry(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " Strawberry";
    }

    @Override
    public int price() {
        return iceCream.price() + 500;
    }
}
