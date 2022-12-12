package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Person {
    public String name, surname, phone;
    public Date dateOfBirtday;

    private String password;
    private double saldo;
    private List<Permission> permissions;

    public Person() {
        this(Utils.getRandomName(), Utils.getRandomName(), Utils.getRandomPhone(), Utils.getRandomBirthDate(), 0.0,
                Utils.getRandomPassword());
    }

    Person(String name, String surname, String phone, Date dateOfBirtday, double saldo, String password) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.dateOfBirtday = dateOfBirtday;
        this.saldo = saldo;
        this.password = password;
        this.permissions = new ArrayList<>();
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean verify(String phone) {
        return this.phone == phone;
    }

    public boolean hasPermission(Permission p) {
        return permissions.contains(p);
    }

    public void addPermission(Permission p) {
        permissions.add(p);
        System.out.println(String.format("%s now has permission: %s", this, p.name));
    }

    public void removePermission(Permission p) {
        permissions.remove(p);
    }

    public boolean checkPassword(String password) {
        return password.equals(password);
    }
}