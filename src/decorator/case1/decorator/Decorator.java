package decorator.case1.decorator;

import decorator.case1.base.IceCream;

public abstract class Decorator extends IceCream {
    IceCream iceCream;

    public Decorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public abstract String getDescription();
}
