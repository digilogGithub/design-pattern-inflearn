package xample.decorator.icecream.base;

public class CupIceCream extends IceCream {

    @Override
    public String getDescription() {
        return super.getDescription() +  "IceCream(Cup)";
    }

    @Override
    public int getPrice() {
        return 2000;
    }
}
