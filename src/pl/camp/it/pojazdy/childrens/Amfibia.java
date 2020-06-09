package pl.camp.it.pojazdy.childrens;

import pl.camp.it.pojazdy.parent.Vehicle;

public class Amfibia extends Vehicle {

    public Amfibia() {
        super(5);
        System.out.println("Konstruktor Amfibii !!");
    }

    @Override
    public void jade() {
        System.out.println("Jade i plyne !!");
    }

    @Override
    public String toString() {
        return "Amfibia";
    }

    public void metodaWAmfibii() {

    }
}
