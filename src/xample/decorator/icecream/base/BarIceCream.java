package xample.decorator.icecream.base;

public class BarIceCream extends IceCream {
    @Override
    public String getDescription() {
        return super.getDescription() +  "IceCream(Bar)";
    }

    @Override
    public int getPrice() {
        return 1000;
    }
}
