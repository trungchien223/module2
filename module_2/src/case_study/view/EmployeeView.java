package case_study.view;

import case_study.service.EmployeeService;
import case_study.service.IEmployeeService;

import java.util.Scanner;

public class EmployeeView {
    private final Scanner scanner = new Scanner(System.in);
    private final IEmployeeService employeeService = new EmployeeService();

    public void showMenu() {
        boolean back = false;
        do {
            System.out.println(" EMPLOYEE MANAGEMENT ");
            System.out.println("1. Display employee list");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Return to main menu");
            System.out.print("Enter your choice: ");

            switch (scanner.nextLine()) {
                case "1":
                    employeeService.display();
                    break;
                case "2":
                    employeeService.add();
                    break;
                case "3":
                    employeeService.edit();
                    break;
                case "4":
                    back = true;
                    break;
                default:
                    System.out.println("Please chose 1 to 4.");
            }
        } while (!back);
    }
}
