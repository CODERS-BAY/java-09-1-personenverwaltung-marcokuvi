package com.codersbay;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Saving saving = new Saving();

        do {
            System.out.println("Would you want to Add a Person(0) or Add a Person without birthday(3) Add a Person without Adress(4) or Remove a Person(1) press(q) to quit");
            int menu = input.nextInt();
            input.nextLine();

            switch (menu) {
                case 0 -> {
                    System.out.println("Add Person");
                    System.out.println("Firstname: ");
                    String firstname = input.nextLine();
                    System.out.println("Surname: ");
                    String surname = input.nextLine();
                    System.out.println("Birthday: ");
                    String birthday = input.nextLine();
                    System.out.println("Postcode: ");
                    String postcode = input.nextLine();
                    System.out.println("City: ");
                    String city = input.nextLine();
                    System.out.println("Streetname: ");
                    String streetname = input.nextLine();
                    System.out.println("Streetnumber: ");
                    String streetnumber = input.nextLine();
                    saving.addPerson(firstname, surname, birthday, postcode, city, streetname, streetnumber);
                    System.out.println("do you want to add another person press(0) add another person without birthday press(3) add another person without adress press(4) or press(1) to remove person press(q) to quit");
                    input.nextLine();
                }

                case 1 -> {
                    System.out.println("Remove Person");
                    System.out.println("Which person? give the list number?");
                    int removeNumber = input.nextInt();
                    saving.removePerson(removeNumber);
                    System.out.println("do you want to add another person press(0) add another person without birthday press(3) add another person without adress press(4) or press(1) to remove person press(q) to quit");
                    input.nextLine();
                }

                case 3 -> {
                    System.out.println("Add Person without birthday");
                    System.out.println("Firstname: ");
                    String firstname = input.nextLine();
                    System.out.println("Surname: ");
                    String surname = input.nextLine();
                    System.out.println("Postcode: ");
                    String postcode = input.nextLine();
                    System.out.println("City: ");
                    String city = input.nextLine();
                    System.out.println("Streetname: ");
                    String streetname = input.nextLine();
                    System.out.println("Streetnumber: ");
                    String streetnumber = input.nextLine();
                    saving.addPersonWithoutBirthday(firstname, surname, postcode, city, streetname, streetnumber);
                    System.out.println("do you want to add another person press(0) add another person without birthday press(3) add another person without adress press(4) or press(1) to remove person press(q) to quit");
                    input.nextLine();
                }

                case 4 -> {
                    System.out.println("Add Person without Adress");
                    System.out.println("Firstname: ");
                    String firstname = input.nextLine();
                    System.out.println("Surname: ");
                    String surname = input.nextLine();
                    System.out.println("Birthday: ");
                    String birthday = input.nextLine();
                    saving.addPersonWithoutAdress(firstname, surname, birthday);
                    System.out.println("do you want to add another person press(0) add another person without birthday press(3) add another person without adress press(4) or press(1) to remove person press(q) to quit");
                    input.nextLine();
                }
            }
        } while (!input.hasNext("q"));
    }

}
