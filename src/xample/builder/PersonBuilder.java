package xample.builder;

public class PersonBuilder {
    private int id;
    private String name;
    private String address;
    private String company;

    public PersonBuilder id(int id) {
        this.id = id;
        return this;
    }

    public PersonBuilder name(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder address(String address) {
        this.address = address;
        return this;
    }

    public PersonBuilder company(String company) {
        this.company = company;
        return this;
    }

    public Person build() {
        Person person = new Person();
        person.setId(id);
        person.setName(name);
        person.setCompany(company);
        person.setAddress(address);
        return person;
    }
}
