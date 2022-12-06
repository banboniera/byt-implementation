package models;

import java.util.List;

public class Mechanic {
    public Person person;

    private double saldo;
    private float sallaryPart, sallaryWork;
    private List<Order> orders;

    Mechanic(Person person) {
        this(person, 0.0, Utils.randomFloat(), Utils.randomFloat());
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
        double workerSaldo = 0;

        for (Order o : orders)
            workerSaldo += o.getPrice(sallaryPart, sallaryWork);

        return workerSaldo + person.getSaldo();
    }

    public void showOrders() {
        System.out.println(String.format("Orders for %s", this));

        for (Order o : orders)
            System.out.println(o);
    }

    public void addOrder(Order o) {
        orders.add(o);
    }
}
