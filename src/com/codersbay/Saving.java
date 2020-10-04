package com.codersbay;

import java.util.ArrayList;

public class Saving {

    public ArrayList<Person> person;
    public ArrayList<Adress> adresses;

    public Saving() {
        this.person = new ArrayList();
        this.adresses = new ArrayList();
    }

    public void addPerson(String firstname, String surname, String birthday, String postcode, String city, String streetname, String streetnumber) {
        this.person.add(new Person(firstname, surname, birthday));
        this.adresses.add(new Adress(postcode, city, streetname, streetnumber));
        System.out.println(person.toString());
        System.out.println(adresses.toString());
    }

    public void removePerson(int removeNumber) {
        this.person.remove(removeNumber);
        this.adresses.remove(removeNumber);
        System.out.println(person.toString());
        System.out.println(adresses.toString());
    }

    public void addPersonWithoutBirthday(String firstname, String surname, String postcode, String city, String streetname, String streetnumber) {
        this.person.add(new Person(firstname, surname));
        this.adresses.add(new Adress(postcode, city, streetname, streetnumber));
        System.out.println(person.toString());
        System.out.println(adresses.toString());
    }

    public void addPersonWithoutAdress(String firstname, String surname, String birthday) {
        this.person.add(new Person(firstname, surname, birthday));
        this.adresses.add(new Adress());
        System.out.println(person.toString());
        System.out.println(adresses.toString());
    }
}
