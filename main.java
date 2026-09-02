package car;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        garage garages = new garage();

        int choice;

            do {
            System.out.println("\nWelcome to your Garage");
            System.out.println("1. Add Vehicle");
            System.out.println("2. Show garage");
            System.out.println("3. End");

            choice = scanner.nextInt();

            switch (choice) {
                case 1 :
                    System.out.println("1. Add Car");
                    System.out.println("2. Add Motorcycle");

                    int type = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Brand: ");
                    String brand = scanner.next();

                    System.out.println("Model: ");
                    String model = scanner.next();

                    System.out.println("Color: ");
                    String color = scanner.next();

                    scanner.nextLine();

                    if (type == 1) {
                        System.out.println("Enter Car Doors:");
                        int doors = scanner.nextInt();
                        scanner.nextLine();

                        garages.addVehicle(
                                new car(brand, model, color, doors));
                    }
                    else if (type == 2) {
                        System.out.println("Enter Motorcycle displacement: ");
                        String displacement = scanner.nextLine();

                        garages.addVehicle(
                                new motorcycle(brand, model, color, displacement));
                    }
                    break;

                case 2:
                    garages.showGarages();
                    break;

                case 3:
                    System.out.println("Programme Done.");
                    System.out.println("--> ");
                    break;

                default:
                    System.out.println("Wrong Input");
                    System.out.println("--> ");
            }

        } while (choice != 3);

        scanner.close();
    }
}
