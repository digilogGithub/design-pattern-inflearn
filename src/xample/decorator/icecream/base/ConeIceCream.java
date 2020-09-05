package xample.decorator.icecream.base;

public class ConeIceCream extends IceCream {
    @Override
    public String getDescription() {
        return super.getDescription() +  "IceCream(Cone)";
    }

    @Override
    public int getPrice() {
        return 1500;
    }
}
