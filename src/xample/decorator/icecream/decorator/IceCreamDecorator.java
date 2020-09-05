package xample.decorator.icecream.decorator;
import xample.decorator.icecream.base.IceCream;

public abstract class IceCreamDecorator extends IceCream {

    private IceCream iceCream;

    public IceCreamDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription();
    }

    @Override
    public int getPrice() {
        return iceCream.getPrice();
    };
//    public abstract int getPrice();
}
