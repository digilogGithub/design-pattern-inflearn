package decorator.case1.decorator;

import decorator.case1.base.IceCream;

public class Melon extends Decorator {

    public Melon(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " Melon";
    }

    @Override
    public int price() {
        return iceCream.price() + 500;
    }
}
