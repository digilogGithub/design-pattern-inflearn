package decorator.case1.base;

public class IceCreamPop extends IceCream {

    public IceCreamPop() {
        this.description = "IceCream(Pop)";
    }

    @Override
    public int price() {
        return 1000;
    }
}

