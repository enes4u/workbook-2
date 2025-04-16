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

        String carrier = askQs.nextLine();
        myPhone.setCarrier(carrier);
        System.out.println("What model is the phone?");
        String  model = askQs.nextLine();

        System.out.println("What is the phone number?");
        String  phoneNumber = askQs.nextLine();

        System.out.println("Who is the owner of the phone?");
        String  owner = askQs.nextLine();


    }
}
