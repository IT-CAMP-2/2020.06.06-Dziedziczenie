package pl.camp.it;

import pl.camp.it.pojazdy.childrens.Car;
import pl.camp.it.pojazdy.parent.Vehicle;

public class Main {
    public static void main(String[] args) {
        Car c = new Car();

        Vehicle v = new Vehicle();

        int a = 5;
        int b = 5;

        System.out.println(a == b);

        String s1 = new String("A");
        String s2 = "A";

        System.out.println(s1.equals(s2));

        Car c1 = new Car();
        Car c2 = new Car();

        System.out.println(c1 == c2);

        Car c3 = new Car();
        Car c4 = c3;

        System.out.println(c3 == c4);

        String s3 = "A";
        String s4 = "A";

        System.out.println(s3);
        System.out.println(s4);

        s3 = s3 + "B";

        System.out.println(s3);
        System.out.println(s4);

        String s5 = "PT.";
        String s6 = "PT";
        String s7 = s6 + ".";

        System.out.println(s5 == s7);
        System.out.println(s5.equals(s7));

        System.out.println(Integer.toHexString(s5.hashCode()));
        System.out.println(Integer.toHexString(s6.hashCode()));
        System.out.println(Integer.toHexString(s7.hashCode()));

        System.out.println(c.hashCode());
    }
}
