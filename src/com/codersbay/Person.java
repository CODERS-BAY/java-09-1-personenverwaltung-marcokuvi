package com.codersbay;

public class Person {


    public String firstname;
    public String surname;
    public String birthday;

    enum Gender {
        FEMALE,
        MALE,
        OTHER
    }


    public Person(String firstname, String surname, String birthday) {
        this.firstname = firstname;
        this.surname = surname;
        this.birthday = birthday;
    }

    public Person(String firstname, String surname) {
        this.firstname = firstname;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person(" +
                "firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday=" + birthday +
                ')';
    }
}
