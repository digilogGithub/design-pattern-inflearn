package builder.step2;

import java.time.LocalDate;
import java.time.Month;

public class Client {
    public static void main(String[] args) {
        Person p1 = Person.builder()
                .firstName("FirstName")
                .lastName("LastName")
                .addressOne("add1")
                .addressTwo("add2")
                .birthDate(LocalDate.of(2012, Month.SEPTEMBER, 30))
                .sex("male")
                .driverLicence(true)
                .married(true)
                .build();
        Person p2 = Person.builder()
                .firstName("FirstName")
                .lastName("LastName")
                .birthDate(LocalDate.of(2012, Month.SEPTEMBER, 30))
                .sex("male")
                .build();
        System.out.println(p1.getBirthDate());
        System.out.println(p2.getAddressOne());
        System.out.println(p2.isMarried());
        System.out.println(p2.getAddressOne());
    }


}
