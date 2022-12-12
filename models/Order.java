package models;

import java.util.Date;
import java.util.List;

import models.Car.Status;

public class Order {
    public Car car;
    public Date date;
    public Status status;
    public List<Mechanic> workers;
    public double amount;

    private boolean isEditing;

    public Order(Car car, List<Mechanic> workers) {
        this(car, Utils.getRandomBirthDate(), Status.NOTES, workers, 0.0, false);
    }

    Order(Car car, Date date, Status status, List<Mechanic> workers, double amount, boolean isEditing) {
        this.car = car;
        this.date = date;
        this.status = status;
        this.workers = workers;
        this.amount = amount;
        this.isEditing = isEditing;
    }

    public double getPrice(float sallaryPart, float sallaryWork) {
        return 0;
    }

}
