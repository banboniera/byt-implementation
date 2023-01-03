package models;

public class Service {
    private String Address;
    private double saldo;

    public Service(String address, double saldo) {
        Address = address;
        this.saldo = saldo;
    }

   private String getAddress() {
        return Address;
    }

    private void setAddress(String address) {
        Address = address;
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
