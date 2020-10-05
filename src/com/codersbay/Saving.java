package com.codersbay;

import java.util.ArrayList;

public class Saving {

    public ArrayList<Person> persons = new ArrayList<>();


    public void addPerson(String firstname, String surname, String birthday, String gender, int postcode, String city, String streetname, int streetnumber) {
        Adress adress = new Adress(postcode, city, streetname, streetnumber);
        Person person = new Person(firstname, surname, birthday, Gender.valueOf(gender), adress);
        this.persons.add(person);
        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }
    }

    public void addPersonWithoutBirthdayandGender(String firstname, String surname, int postcode, String city, String streetname, int streetnumber) {
        Adress adress = new Adress(postcode, city, streetname, streetnumber);
        this.persons.add(new Person(firstname, surname, adress));
        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }
    }

    public void addPersonWithoutAdress(String firstname, String surname, String birthday, String gender) {
        this.persons.add(new Person(firstname, surname, birthday, Gender.valueOf(gender)));
        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }
    }

    public void removePerson(int removeNumber) {
        this.persons.remove(removeNumber);
        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }
    }
}