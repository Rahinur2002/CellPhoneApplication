package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhone myPhone = new CellPhone();

        System.out.println("Enter your serial number: ");
        int serialNumbers = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What model is the phone?");
        String phoneModel = scanner.nextLine();

        System.out.println("Who is the carrier?");
        String phoneCarrier = scanner.nextLine();

        System.out.println("what is the phone number?");
        String phoneNumber = scanner.nextLine();

        System.out.println("Who is the owner of the phone?");
        String owner = scanner.nextLine();

        myPhone.setSerialNumber(serialNumbers);
        myPhone.setModel(phoneModel);
        myPhone.setCarrier(phoneCarrier);
        myPhone.setPhoneNumber(phoneNumber);
        myPhone.setOwner(owner);

        System.out.println("Serial Number: " + myPhone.getSerialNumber());
        System.out.println("Phone Model: " + myPhone.getModel());
        System.out.println("Phone Carrier: " + myPhone.getCarrier());
        System.out.println("Phone Number: " + myPhone.getPhoneNumber());
        System.out.println("Owner: " + myPhone.getOwner());



    }
}

