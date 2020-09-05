package xample.builder;

public class Client {
    public static void main(String[] args) {
        Person p1 = Person.builder()
                .id(1)
                .name("sia")
                .build();
        System.out.println(p1.getId());
        System.out.println(p1.getName());
        System.out.println(p1.getCompany());
        System.out.println(p1.getAddress());

        Person p2 = Person.builder()
                .id(2)
                .name("digilog")
                .company("BISTel")
                .address("FURGIO")
                .build();
        System.out.println(p2.getId());
        System.out.println(p2.getName());
        System.out.println(p2.getCompany());
        System.out.println(p2.getAddress());
    }
}
