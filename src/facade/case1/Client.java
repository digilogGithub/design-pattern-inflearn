package facade.case1;

public class Client {
    public static void main(String[] args) {
        SimpleProductFacade simpleProductFacade = new SimpleProductFacade();
        simpleProductFacade.setName("test");
        System.out.println("The product is a " + simpleProductFacade.getName());
    }
}
