package xample.decorator.icecream.decorator;

import xample.decorator.icecream.base.IceCream;

public class Strawberry extends IceCreamDecorator {

    public Strawberry(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Strawberry ";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 100;
    }
}
