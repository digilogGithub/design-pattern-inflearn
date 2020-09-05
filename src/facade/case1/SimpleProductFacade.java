package facade.case1;

public class SimpleProductFacade {
    ComplexProduct difficultProduct;

    public SimpleProductFacade() {
        difficultProduct = new ComplexProduct();
    }

    public void setName(String name) {
        char chars[] = name.toCharArray();

        if(chars.length > 0 ){
            difficultProduct.setFirstNameCharacter(chars[0]);
        }

        if(chars.length > 1 ){
            difficultProduct.setFirstNameCharacter(chars[1]);
            System.out.println(chars[1]);
        }

        if(chars.length > 2 ){
            difficultProduct.setFirstNameCharacter(chars[2]);
        }

        if(chars.length > 3 ){
            difficultProduct.setFirstNameCharacter(chars[3]);
        }
    }

    public String getName() {
        return difficultProduct.getName();
    }
}
