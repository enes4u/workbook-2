package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
    CellPhone myPhone = new CellPhone();
        Scanner askQs = new Scanner(System.in);

        System.out.println("What is the serial number?");
        String serialNumber = askQs.nextLine();
        myPhone.setSerialNumber(serialNumber);
        System.out.println(serialNumber);// left here

        System.out.println("Who is the carrier?");
        String carrier = askQs.nextLine();
        myPhone.setCarrier(carrier);
        System.out.println(carrier);


        System.out.println("What model is the phone?");
        String  model = askQs.nextLine();
        myPhone.setModel(model);
        System.out.println(model);

        System.out.println("What is the phone number?");
        String  phoneNumber = askQs.nextLine();
        myPhone.setPhoneNumber(phoneNumber);
        System.out.println(phoneNumber);

        System.out.println("Who is the owner of the phone?");
        String  owner = askQs.nextLine();
        myPhone.setOwner(owner);
        System.out.println(owner);


    }
}
