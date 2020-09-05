package xample.decorator;

import xample.decorator.icecream.base.BarIceCream;
import xample.decorator.icecream.base.ConeIceCream;
import xample.decorator.icecream.base.CupIceCream;
import xample.decorator.icecream.base.IceCream;
import xample.decorator.icecream.decorator.Melon;
import xample.decorator.icecream.decorator.Strawberry;
import xample.decorator.student.base.AmericanStudent;
import xample.decorator.student.base.KoreanStudent;
import xample.decorator.student.base.Student;
import xample.decorator.student.decorator.Art;
import xample.decorator.student.decorator.Science;

public class Client {
    public static void main(String[] args) {
        Student korean = new KoreanStudent();
        Art art = new Art(korean);
        System.out.println(art.getDescription());

        Student american = new AmericanStudent();
        Science science = new Science(american);
        System.out.println(science.getDescription());

        Science artScience = new Science(art);
        System.out.println(artScience.getDescription());

        IceCream cupIceCream = new CupIceCream();
        System.out.println(cupIceCream.getDescription());
        System.out.println(cupIceCream.getPrice());

        IceCream coneIceCream = new ConeIceCream();
        IceCream coneStrawberry = new Strawberry(coneIceCream);
        System.out.println(coneStrawberry.getDescription());
        System.out.println(coneStrawberry.getPrice());

        IceCream coneMelon = new Melon(coneIceCream);
        System.out.println(coneMelon.getDescription());
        System.out.println(coneMelon.getPrice());

        IceCream barStrawMelon = new Melon(new Strawberry(new BarIceCream()));
        System.out.println(barStrawMelon.getDescription());
        System.out.println(barStrawMelon.getPrice());

    }
}
