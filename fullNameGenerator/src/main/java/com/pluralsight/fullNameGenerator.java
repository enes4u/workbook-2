package com.pluralsight;

import java.util.Scanner;

public class fullNameGenerator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" First name : ");
        String firstName = scanner.nextLine().trim();

        System.out.print("Middle Name (press ENTER to skip): ");
        String middleName = scanner.nextLine().trim();

        System.out.print(" Last Name : ");
        String lastName = scanner.nextLine().trim();

        System.out.println(" Suffix e.g., Jr, PhD, JD (Press ENTER to skip)");

        String suffix = scanner.nextLine().trim();

        // full name
        StringBuilder fullName = new StringBuilder(firstName);
        if (!middleName.isEmpty()){
            fullName.append(" ").append(middleName);

        }
        fullName.append(" ").append(lastName);
        if (!suffix.isEmpty()){
            fullName.append(", ").append(suffix);

        }
        //print out full name
        System.out.println(" Full name: "+ fullName.toString());
        scanner.close();//shut it down not necessary anymore, leave it, save energy lol



    }
}
