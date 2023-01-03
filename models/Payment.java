package models;

public class Payment {
    private double amount;
    private String comment;
    private Person from;

    public Payment(double amount, String comment, Person from) {
        this.amount = amount;
        this.comment = comment;
        this.from = from;
    }

    private double getAmount() {
        return amount;
    }

    private void setAmount(double amount) {
        this.amount = amount;
    }

    private String getComment() {
        return comment;
    }

    private void setComment(String comment) {
        this.comment = comment;
    }

    private Person getFrom() {
        return from;
    }

    private void setFrom(Person from) {
        this.from = from;
    }

    
}
