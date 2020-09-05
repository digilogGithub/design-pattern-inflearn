package xample.decorator.icecream.decorator;

import xample.decorator.icecream.base.IceCream;

public class Melon extends IceCreamDecorator {

    public Melon(IceCream iceCream) {
       super(iceCream);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Melon ";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 100;
    }
}
