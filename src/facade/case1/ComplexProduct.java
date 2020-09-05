package facade.case1;

public class ComplexProduct {
    char nameChars[] = new char[4];
    public ComplexProduct() {
    }

    public void setFirstNameCharacter(char c) {
        nameChars[0] = c;
    }

    public void setSecondNameCharacter(char c) {
        nameChars[1] = c;
    }

    public void setThirdNameCharacter(char c) {
        nameChars[2] = c;
    }

    public void setFourthNameCharacter(char c) {
        nameChars[3] = c;
    }

    public String getName() {
        System.out.println("complext : "+ nameChars.toString());
        return new String(nameChars);
    }
}
