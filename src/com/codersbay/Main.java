package com.codersbay;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Saving saving = new Saving();

        do {
            System.out.println("Would you want to Add a Person(0) or Remove a Person(1) press(q) to quit");
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
                    System.out.println("Gender: ");
                    String gender = input.next();
                    saving.addPerson(firstname, surname, birthday);
                    System.out.println("do you want to add another person press(0) press(1) to remove person press(q) to quit");
                    input.nextLine();
                }
                case 1 -> {
                    System.out.println("Remove Person");
                    System.out.println("Which person? give the list number?");
                    int removeNumber = input.nextInt();
                    saving.removePerson(removeNumber);
                    System.out.println("do you want to add another person press(0) press(1) to remove person press(q) to quit");
                    input.nextLine();
                }
            }
            System.out.println();
        } while (!input.hasNext("q"));
    }

}
