package models;

import java.util.ArrayList;

public class Car {
    public enum Status {
        NOTES, IN_WORK, PROJECTS, NOT_IN_WORK
    }

    public static ArrayList<String> databaseCarNumber = new ArrayList<>();
    public Person person;
    public  String marque;
    public  String model;
    public  String carNumber;
    public  float power;
    public  Status status;

    public Car(Person person) {
        this(person, Utils.getRandomName(), Utils.getRandomName(), Utils.getRandomName(), Utils.randomFloat(),
                Status.NOT_IN_WORK);
    }

    public Car(Person person, String marque, String model, String carNumber, float power, Status status) {
        this.person = person;
        this.marque = marque;
        this.model = model ;
        setCarNumber(carNumber);
        setPower(power);
        setStatus(status);
    }


    public Status getStatus() {
        return status;
    }


    private void setCarNumber(String carNumber) {
        if (SearchCar(carNumber) == true ){
            System.err.println("Car is already i the system");
        }
        else {
            this.carNumber = carNumber;
            databaseCarNumber.add(carNumber);
        }
    }

    private void setPower(float power) {
        if(power <= 0){
            System.err.println("Car power cannot be less 0");
        }
        else    this.power = power;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    static boolean SearchCar(String carNumber) {

       if (databaseCarNumber.contains(carNumber))
             return true;
       else return false;

    }
}
