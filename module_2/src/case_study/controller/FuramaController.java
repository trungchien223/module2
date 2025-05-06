package case_study.controller;

import case_study.service.EmployeeService;
import case_study.service.IEmployeeService;

import java.util.Scanner;

public class FuramaController {
    private static final Scanner scanner = new Scanner(System.in);
    private static final IEmployeeService service = new EmployeeService();

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
                        System.out.println("Exiting the program");
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

    private static void employeeMenu() {
        boolean back = false;
        do {
            System.out.println("---- EMPLOYEE MANAGEMENT ----");
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Return to main menu");
            System.out.print("Enter your choice: ");
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Displaying employees");
                        service.display();
                        break;
                    case 2:
                        System.out.println("Adding employee");
                        service.add();
                        break;
                    case 3:
                        System.out.println("Editing employee");
                        service.edit();
                        break;
                    case 4:
                        back = true;
                        break;
                    default:
                        System.out.println("Choose from 1 to 4.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number.");
            }
        } while (!back);
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
                        System.out.println("Displaying customers");
                        break;
                    case 2:
                        System.out.println("Adding customer");
                        break;
                    case 3:
                        System.out.println("Editing customer");
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
                        System.out.println("Displaying facilities");
                        break;
                    case 2:
                        System.out.println("Adding facility");
                        break;
                    case 3:
                        System.out.println("Displaying facilities needing maintenance");
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
                        System.out.println("Adding booking");
                        break;
                    case 2:
                        System.out.println("Displaying bookings");
                        break;
                    case 3:
                        System.out.println("Creating contracts");
                        break;
                    case 4:
                        System.out.println("Displaying contracts");
                        break;
                    case 5:
                        System.out.println("Editing contracts");
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
                        System.out.println("Displaying customers using service");
                        break;
                    case 2:
                        System.out.println("Displaying customers getting vouchers");
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
