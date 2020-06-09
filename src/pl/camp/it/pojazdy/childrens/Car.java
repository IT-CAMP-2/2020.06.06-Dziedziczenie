package pl.camp.it.pojazdy.childrens;

import pl.camp.it.pojazdy.parent.Vehicle;

public class Car extends Vehicle {

    public void matoda2() {

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Schamochod:\nid = ");
        sb.append(this.getId());
        sb.append(" brand = ");
        sb.append(this.getBrand());
        return sb.toString();
    }
}
