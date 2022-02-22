package com.company;

import com.company.person.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Programmer programmer=new Programmer("Nargiza", 18, "HP");
        Programmer programmer2=new Programmer("Nurzhan", 20, "Asus");

        Driver driver=new Driver("Ayana", 23, "Tayota");
        Driver driver2=new Driver("kira", 20, "Mercedes");

        Sportman sportman=new Sportman("Maksim", 30, "BMV");
        Sportman sportman1=new Sportman("Marina", 20, "Lexus");

        Seaman seaman=new Seaman("Nargiza", 18, "HP");
        Seaman seaman1=new Seaman("Nurzhan", 20, "Asus");
        Pool poool=new Pool();

        Person[] person={programmer, programmer2, driver, driver2, seaman, seaman1, sportman, sportman1};
        poool.setPerson(person);
        System.out.println(Arrays.toString(poool.getPerson()));

    }
}
