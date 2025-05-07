package case_study.controller;

import case_study.view.EmployeeView;

import java.util.Scanner;

public class FuramaController {
    private static final Scanner scanner = new Scanner(System.in);
    private static final EmployeeView employeeView = new EmployeeView();

    private static void employeeMenu() {
        employeeView.showMenu();
    }

    public void displayMainMenu() {
        boolean exit = false;
        do {
            System.out.println(" FURAMA MANAGEMENT ");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        employeeMenu();
                        break;
                    case 2:
                        customerMenu();
                        break;
                    case 3:
                        facilityMenu();
                        break;
                    case 4:
                        bookingMenu();
                        break;
                    case 5:
                        promotionMenu();
                        break;
                    case 6:
                        System.out.println("Exit the program");
                        exit = true;
                        break;
                    default:
                        System.out.println("Please choose from 1 to 6.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number.");
            }

        } while (!exit);
    }

    private static void customerMenu() {
        boolean back = false;
        do {
            System.out.println("---- CUSTOMER MANAGEMENT ----");
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return to main menu");
            System.out.print("Enter your choice: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Display customers");
                        break;
                    case 2:
                        System.out.println("Add customer");
                        break;
                    case 3:
                        System.out.println("Edit customer");
                        break;
                    case 4:
                        back = true;
                        break;
                    default:
                        System.out.println("Choose from 1 to 4");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number");
            }
        } while (!back);
    }

    private static void facilityMenu() {
        boolean back = false;
        do {
            System.out.println("---- FACILITY MANAGEMENT ----");
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return to main menu");
            System.out.print("Enter your choice: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Display facilities");
                        break;
                    case 2:
                        System.out.println("Add facility");
                        break;
                    case 3:
                        System.out.println("Display facilities needing maintenance");
                        break;
                    case 4:
                        back = true;
                        break;
                    default:
                        System.out.println("Choose from 1 to 4");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number");
            }
        } while (!back);
    }

    private static void bookingMenu() {
        boolean back = false;
        do {
            System.out.println("---- BOOKING MANAGEMENT ----");
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new contracts");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return to main menu");
            System.out.print("Enter your choice: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Add booking");
                        break;
                    case 2:
                        System.out.println("Display bookings");
                        break;
                    case 3:
                        System.out.println("Creat contracts");
                        break;
                    case 4:
                        System.out.println("Display contracts");
                        break;
                    case 5:
                        System.out.println("Edit contracts");
                        break;
                    case 6:
                        back = true;
                        break;
                    default:
                        System.out.println("Choose from 1 to 6");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number");
            }
        } while (!back);
    }

    private static void promotionMenu() {
        boolean back = false;
        do {
            System.out.println("---- PROMOTION MANAGEMENT ----");
            System.out.println("1. Display list customers use service");
            System.out.println("2. Display list customers get voucher");
            System.out.println("3. Return to main menu");
            System.out.print("Enter your choice: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Display customers using service");
                        break;
                    case 2:
                        System.out.println("Display customers getting vouchers");
                        break;
                    case 3:
                        back = true;
                        break;
                    default:
                        System.out.println("Choose from 1 to 3");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number");
            }
        } while (!back);
    }
}