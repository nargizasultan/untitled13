package com.company.person;

import java.util.Arrays;

public class Pool {
    private Person[]person;

    public Pool() {
    }

    public Pool(Person[] person) {
        this.person = person;
    }

    public Person[] getPerson() {
        return person;
    }

    public void setPerson(Person[] person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Pool{" +
                "person=" + Arrays.toString(person) +
                '}';
    }
}
