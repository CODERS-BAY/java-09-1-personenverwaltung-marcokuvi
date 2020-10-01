package com.codersbay;

import java.util.Date;

public class Person {

    public String firstname;
    public String surname;
    public String birthday;
    public String adress;
    public String gender;


    public Person(String firstname, String surname, String birthday, String adress, String gender) {
        this.firstname = firstname;
        this.surname = surname;
        this.birthday = birthday;
        this.adress = adress;
        this.gender = gender;
    }

    public Person() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday=" + birthday +
                ", adress='" + adress + '\'' +
                ", gender=" + gender +
                '}';
    }
}
