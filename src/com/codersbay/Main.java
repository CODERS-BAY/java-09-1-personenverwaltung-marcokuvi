package com.codersbay;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Saving saving = new Saving();

        do {
            System.out.println("press(0) to add a person" + "\n" + "press(1) to add a person without gender and birthday" + "\n" + "press(2) to add a Person without adress" + "\n" + "press(3) to remove a person");
            int menu = input.nextInt();
            input.nextLine();

            //create a menu that you can choose the methods to add persons and remove persons with q you quit the menu
            switch (menu) {
                case 0 -> {
                    System.out.println("Add Person");
                    System.out.println("Firstname: ");
                    String firstname = input.nextLine();
                    System.out.println("Surname: ");
                    String surname = input.nextLine();
                    System.out.println("Birthday: ");
                    String birthday = input.nextLine();
                    System.out.println("Gender: ");
                    String gender = input.nextLine();
                    System.out.println("Postcode: ");
                    int postcode = input.nextInt();
                    input.nextLine();
                    System.out.println("City: ");
                    String city = input.nextLine();
                    System.out.println("Streetname: ");
                    String streetname = input.nextLine();
                    System.out.println("Streetnumber: ");
                    int streetnumber = input.nextInt();
                    input.nextLine();
                    saving.addPerson(firstname, surname, birthday, gender, postcode, city, streetname, streetnumber);
                    System.out.println("press(0) to add a person" + "\n" + "press(1) to add a person without gender and birthday" + "\n" + "press(2) to add a Person without adress" + "\n" + "press(3) to remove a person");
                    System.out.println();
                }
                case 1 -> {
                    System.out.println("Add Person without birthday and gender");
                    System.out.println("Firstname: ");
                    String firstname = input.nextLine();
                    System.out.println("Surname: ");
                    String surname = input.nextLine();
                    System.out.println("Postcode: ");
                    int postcode = input.nextInt();
                    input.nextLine();
                    System.out.println("City: ");
                    String city = input.nextLine();
                    System.out.println("Streetname: ");
                    String streetname = input.nextLine();
                    System.out.println("Streetnumber: ");
                    int streetnumber = input.nextInt();
                    input.nextLine();
                    saving.addPersonWithoutBirthdayandGender(firstname, surname, postcode, city, streetname, streetnumber);
                    System.out.println("press(0) to add a person" + "\n" + "press(1) to add a person without gender and birthday" + "\n" + "press(2) to add a Person without adress" + "\n" + "press(3) to remove a person");
                    System.out.println();
                }

                case 2 -> {
                    System.out.println("Add Person without Adress");
                    System.out.println("Firstname: ");
                    String firstname = input.nextLine();
                    System.out.println("Surname: ");
                    String surname = input.nextLine();
                    System.out.println("Birthday: ");
                    String birthday = input.nextLine();
                    System.out.println("Gender: ");
                    String gender = input.nextLine();
                    saving.addPersonWithoutAdress(firstname, surname, birthday, gender);
                    System.out.println("press(0) to add a person" + "\n" + "press(1) to add a person without gender and birthday" + "\n" + "press(2) to add a Person without adress" + "\n" + "press(3) to remove a person");
                    System.out.println();
                }

                case 3 -> {
                    System.out.println("Remove Person");
                    System.out.println("Which person? give the list number?");
                    int removeNumber = input.nextInt();
                    saving.removePerson(removeNumber);
                    System.out.println("press(0) to add a person" + "\n" + "press(1) to add a person without gender and birthday" + "\n" + "press(2) to add a Person without adress" + "\n" + "press(3) to remove a person");
                    System.out.println();
                }
            }
        } while (!input.hasNext("q"));
    }
}

