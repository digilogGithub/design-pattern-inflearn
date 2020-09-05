package xample.decorator.icecream.base;

public abstract class IceCream {

    private String description = "";

    public String getDescription() {
        return description;
    }

    public abstract int getPrice();
}
