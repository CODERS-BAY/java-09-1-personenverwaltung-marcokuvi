package com.codersbay;

import java.util.ArrayList;

public class Saving {

    public ArrayList<Person> person;

    public Saving() {
        this.person = new ArrayList();
    }

    public void addPerson(String firstname, String surname, String birthday) {
        this.person.add(new Person(firstname, surname, birthday);
        System.out.println(person.toString());
    }

    public void removePerson(int removeNumber) {
        this.person.remove(removeNumber);
        System.out.println(person.toString());
    }

}
