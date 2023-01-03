package models;

public class Part {
    public enum Status {
        NOTORDERED, ORDERED, ONSTOCK, PLACED
    }

    private Order orders;
    private float amount;
    private String code;
    private double price;
    private Status status;

    public Part(Order orders, float amount, String code, double price, Status status) {
        this.orders = orders;
        this.amount = amount;
        this.code = code;
        this.price = price;
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }
}
