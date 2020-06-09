package pl.camp.it;

import pl.camp.it.pojazdy.childrens.Amfibia;
import pl.camp.it.pojazdy.childrens.Car;
import pl.camp.it.pojazdy.parent.Vehicle;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Amfibia amfibia = new Amfibia();
        amfibia.jade();

        Car c = new Car();
        c.jade();

        System.out.println(c);

        Vehicle vehicle = new Amfibia();
        ((Amfibia) vehicle).metodaWAmfibii();

        Amfibia amfibia1 = (Amfibia) vehicle;

        Amfibia amfibia2 = new Amfibia();

        Vehicle vehicle1 = amfibia2;

        System.out.println(vehicle.toString());

        Vehicle[] tablica = new Vehicle[10];
        tablica[0] = new Amfibia();
        tablica[1] = new Car();
    }
}
