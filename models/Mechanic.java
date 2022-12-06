package models;

import java.util.List;

public class Mechanic {
    public Person person;

    private List<Order> orders;
    private double saldo;
    private float sallaryPart, sallaryWork;

    Mechanic(Person person) {
        Mechanic(person, 0.0, Utils.getRandomFloat(), Utils.getRandomFloat());
    }

    Mechanic(Person person, double saldo, float sallaryPart, float sallaryWork) {
        this.person = person;
        this.saldo = saldo;
        this.sallaryPart = sallaryPart;
        this.sallaryWork = sallaryWork;
    }

    @Override
    public String toString() {
        return "worker " + person;
    }

    public double getSaldo() {
        return saldo + person.getSaldo();
    }

    public void showOrders() {
        System.out.println(String.format("Orders for %s", this));
        for (Order o : orders)
            System.out.println(o);
    }
}
