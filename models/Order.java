package models;

import java.util.Date;
import java.util.List;


public class Order {
    public Car car;
    public Date date;
    public Car.Status status;
    public List<Mechanic> workers;
    public double amount;

    private boolean isEditing;

    public Order(Car car, List<Mechanic> workers) {
        this(car, Utils.getRandomBirthDate(), Car.Status.NOTES, workers, 0.0, false);
    }



    public Order(Car car, Date date, Car.Status status, List<Mechanic> workers, double amount, boolean isEditing) {
        this.car = car;
        this.date = date;
        this.status = status;
        this.workers = workers;
        this.amount = amount;
        this.isEditing = isEditing;
    }

    @Override
    public String toString() {
        return "Order for car " + car.marque + " number "+ car.carNumber;
    }



    public double getPrice(float sallaryPart, float sallaryWork) {
        return 0;
    }


    public boolean isEditing() {
        return isEditing;
    }

}
