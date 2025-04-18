package com.pluralsight;

import java.util.Scanner;

public class VehicleInventory {
    static Vehicle[] vehicles = new Vehicle[20];
    static int vehicleCount = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Preload vehicles
        vehicles[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        vehicles[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        vehicles[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        vehicles[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        vehicles[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        vehicles[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);

        while (true) {
            System.out.println("\nWhat do you want to do?");
            System.out.println("1 - List all vehicles");
            System.out.println("2 - Search by make/model");
            System.out.println("3 - Search by price range");
            System.out.println("4 - Search by color");
            System.out.println("5 - Add a vehicle");
            System.out.println("6 - Quit");
            System.out.print("Enter your command: ");

            int command = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (command) {
                case 1:
                    listAllVehicles();
                    break;
                case 2:
                    searchByMakeModel(scanner);
                    break;
                case 4:
                    searchByColor(scanner);
                    break;
                case 5:
                    addAVehicle(scanner);
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    return;
                default:
                    System.out.println("Invalid command.");
            }
        }
    }

    public static void listAllVehicles() {
        System.out.println("\nListing all vehicles:");
        for (int i = 0; i < vehicleCount; i++) {
            vehicles[i].printInfo();
        }
    }

    public static void searchByMakeModel(Scanner scanner) {
        System.out.print("Enter make/model to search: ");
        String searchTerm = scanner.nextLine().toLowerCase();
        boolean found = false;

        for (int i = 0; i < vehicleCount; i++) {
            if (vehicles[i].getMakeModel().toLowerCase().contains(searchTerm)) {
                vehicles[i].printInfo();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No vehicles found with make/model containing: " + searchTerm);
        }
    }

    public static void addAVehicle(Scanner scanner) {
        if (vehicleCount >= vehicles.length) {
            System.out.println("Inventory full! Cannot add more vehicles.");
            return;
        }


        System.out.print("Enter vehicle ID: ");
        long id = scanner.nextLong();
        scanner.nextLine();

        System.out.print("Enter make/model: ");
        String makeModel = scanner.nextLine();

        System.out.print("Enter color: ");
        String color = scanner.nextLine();

        System.out.print("Enter odometer reading: ");
        int odo = scanner.nextInt();

        System.out.print("Enter price: ");
        float price = scanner.nextFloat();

        vehicles[vehicleCount++] = new Vehicle(id, makeModel, color, odo, price);
        System.out.println("Vehicle added successfully.");
    }
    public static void searchByColor(Scanner scanner){
        System.out.print("Enter color to search: ");
        String colorInput =scanner.nextLine().toUpperCase()+scanner.nextLine().substring(1);
        boolean found= false;
        for (int i =0; i<vehicleCount; i++){
            if(vehicles[i].getColor().contains(colorInput)){
                found=true;
            }
            if (!found){
                System.out.println("No vehicles found with color:   "+ colorInput);
            }
        }
    }
}
