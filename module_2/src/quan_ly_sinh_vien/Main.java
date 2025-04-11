package quan_ly_sinh_vien;

import java.util.Scanner;

public class Main {
    private static StudentsManager studentsManager = new StudentsManager();

    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println();
            System.out.println("---- MENU ---- ");
            System.out.println("1. Display");
            System.out.println("2. Add");
            System.out.println("3. Edit");
            System.out.println("4. Delete");
            System.out.println("5. Search");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Display students");
                    studentsManager.display();
                    break;
                case 2:
                    System.out.println("Add a student");
                    studentsManager.add();
                    break;
                case 3:
                    System.out.println("edit a student");
                    studentsManager.edit();
                    break;
                case 4:
                    System.out.println("Delete a student");
                    studentsManager.delete();
                    break;
                case 5:
                    System.out.println("Search for a student");
                    studentsManager.search();
                    break;
                case 6:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 6);
    }
}