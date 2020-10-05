package com.codersbay;

public class Person {


    public String firstname;
    public String surname;
    public String birthday;
    public Gender gender;
    public Adress adress;

    public Person(String firstname, String surname, String birthday, Gender gender, Adress adress) {
        this.firstname = firstname;
        this.surname = surname;
        this.birthday = birthday;
        this.gender = gender;
        this.adress = adress;
    }

    public Person(String firstname, String surname, Adress adress) {
        this.firstname = firstname;
        this.surname = surname;
        this.adress = adress;
    }

    public Person(String firstname, String surname, String birthday, Gender gender) {
        this.firstname = firstname;
        this.surname = surname;
        this.birthday = birthday;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person(" +
                "firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender=" + gender +
                ", adress=" + adress +
                ')';
    }
}
