package com.company.person;

public class Seaman extends Person implements Swimable{
    private String seamensSheep;
    @Override
    void talk() {
        System.out.println("Seaman is talking");
    }

    public Seaman() {


    }

    public Seaman(String name, int age, String seamensSheep) {
        super(name, age);
        this.seamensSheep = seamensSheep;
    }

    public String getSeamensSheep() {
        return seamensSheep;
    }

    public void setSeamensSheep(String seamensSheep) {
        this.seamensSheep = seamensSheep;
    }

    @Override
    public String toString() {
        return "Seaman{" +
                "seamensSheep='" + seamensSheep + '\'' +
                '}';
    }

    @Override
    public void swim() {
        System.out.println("Seaman can swim");
    }
}
