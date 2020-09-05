package builder.step1;

public class Client {
    public static void main(String[] args) {
        Person p1 = createPersonForTesting();
        System.out.println(p1.getFirstName());
    }

    public static Person createPersonForTesting() {
        Person person = new Person();
        person.setFirstName("FirstName");
        person.setLastName("LastName");
        person.setAddressOne("Address1");
        person.setAddressTwo("Address2");
        person.setSex("Man");
        person.setDriverLicence(false);
        person.setMarried(true);
//        ... To hard setting
        return person;
    }
}
