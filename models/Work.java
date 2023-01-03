package models;

public class Work {
    private Order order;
    private String classOfWork;
    private double price;
    private int amount;

    public Work(Order order, String classOfWork, double price, int amount) {
        this.order = order;
        this.classOfWork = classOfWork;
        this.price = price;
        this.amount = amount;
    }
}
