package com.codersbay;

public class Person {


    public String firstname;
    public String surname;
    public String birthday;

    public enum gender {
        MALE,
        FEMALE

    }


    public Person(String firstname, String surname, String birthday, String adress) {
        this.firstname = firstname;
        this.surname = surname;
        this.birthday = birthday;

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
