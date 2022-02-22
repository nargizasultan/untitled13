package com.company.person;

public class Programmer extends Person implements Swimable, canDrive{
    private String programmersNoutbuk;
    @Override
    void talk() {
        System.out.println("Programmer can talk");


    }


    public Programmer() {


    }

    public Programmer(String name, int age, String programmersNoutbuk) {
        super(name, age);
        this.programmersNoutbuk = programmersNoutbuk;
    }

    public String getProgrammersNoutbuk() {
        return programmersNoutbuk;
    }

    public void setProgrammersNoutbuk(String programmersNoutbuk) {
        this.programmersNoutbuk = programmersNoutbuk;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "programmersNoutbuk='" + programmersNoutbuk + '\'' +
                '}';
    }

    @Override
    public void swim() {
        System.out.println("Programmer can swim");



    }

    @Override
    public void canDrive() {
        System.out.println("Programmer can drive");
    }
}
