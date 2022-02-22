package com.company.person;

public class Driver extends Person implements canDrive{
    private String driversCar;
    @Override
    void talk() {
        System.out.println("Driver is talking");

    }

    public Driver() {


    }

    public Driver(String name, int age, String driversCar) {
        super(name, age);
        this.driversCar = driversCar;
    }

    public String getDriversCar() {
        return driversCar;
    }

    public void setDriversCar(String driversCar) {
        this.driversCar = driversCar;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driversCar='" + driversCar + '\'' +
                '}';
    }

    @Override
    public void canDrive() {
        System.out.println("Driver can drive");

    }
}
