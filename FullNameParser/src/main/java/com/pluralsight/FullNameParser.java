package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner frontDesk = new Scanner(System.in);

        // Enter full Name
        System.out.print("Enter Full Name: ");
        String fullName= frontDesk.nextLine().trim();// trim from start
        String[] nameParts = fullName.split("\\s+"); //split by spaces among name
        // give each different variableName
        String firstName = nameParts[0];
        String middleName = "(none)";
        String lastName = ""; //dont put default on last name will be defined in ifelse

        // go over array if middle name exist
        if(nameParts.length ==2){
            // middle name does not exist
            lastName = nameParts[1];
        } else if (nameParts.length ==3) {
            //middle name exist
            middleName = nameParts[1];
            lastName = nameParts[2];

        }else {
            System.out.println("Invalid name format. Please enter a valid name. Restart the application");
            frontDesk.close();

        }
        // Results yayy!
        System.out.println("First Name: "+firstName);
        System.out.println("Middle Name: "+middleName);
        System.out.println("Last Name: "+ lastName);


    }
}
