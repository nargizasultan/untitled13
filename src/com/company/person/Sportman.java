package com.company.person;

public class Sportman extends Person implements Swimable, canDrive{
    private String Sportmenstool;
    @Override
    void talk() {
        System.out.println("Sportman is talking");
    }

    public Sportman() {


    }

    public Sportman(String name, int age, String Sportmenstool) {
        super(name, age);
        this.Sportmenstool = Sportmenstool;
    }

    public String getSportmantool() {
        return Sportmenstool ;
    }

    public void setSportmantool(String Sportmenstool) {
        this.Sportmenstool = Sportmenstool;
    }

    @Override
    public String toString() {
        return "Sportman{" +
                "sportmantool='" +  + '\'' +
                '}';
    }

    @Override
    public void swim() {
        System.out.println("Sportman can swim");

    }

    @Override
    public void canDrive() {
        System.out.println("Sportman can drive");

    }
}
