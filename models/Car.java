package models;

public class Car {
    public enum Status {
        NOTES, IN_WORK, NOT_IN_WORK, PROJECTS
    }

    public Person person;
    public String marque;
    public String model;
    public String carNumber;
    public float power;
    public Status status;

    public Car(Person person) {
        this(person, Utils.getRandomName(), Utils.getRandomName(), Utils.getRandomName(), Utils.randomFloat(),
                Status.NOT_IN_WORK);
    }

    Car(Person person, String marque, String model, String carNumber, float power, Status status) {
        this.person = person;
        this.marque = marque;
        this.model = model;
        this.carNumber = carNumber;
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }
}
