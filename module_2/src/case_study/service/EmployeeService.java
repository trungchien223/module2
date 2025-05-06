package case_study.service;

import case_study.model.Employee;
import case_study.repository.EmployeeRepository;
import case_study.repository.IEmployeeRepository;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private final IEmployeeRepository repository = new EmployeeRepository();
    private final Scanner scanner = new Scanner(System.in);

    public void display() {
        List<Employee> list = repository.getAll();
        for (Employee e : list) {
            System.out.println(e.toString());
        }
    }

    public void add() {
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("DOB: ");
        String dob = scanner.nextLine();
        System.out.print("Gender: ");
        String gender = scanner.nextLine();
        System.out.print("CMND: ");
        String cmnd = scanner.nextLine();
        System.out.print("Phone: ");
        String phone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Level: ");
        String level = scanner.nextLine();
        System.out.print("Position: ");
        String position = scanner.nextLine();
        System.out.print("Salary: ");
        double salary = Double.parseDouble(scanner.nextLine());

        Employee employee = new Employee(id, name, dob, gender, cmnd, phone, email, level, position, salary);
        repository.add(employee);
        System.out.println("Employee add");
    }

    public void edit() {
        System.out.print("Enter ID to edit: ");
        String id = scanner.nextLine();

        System.out.print("New Name: ");
        String name = scanner.nextLine();
        System.out.print("New DOB: ");
        String dob = scanner.nextLine();
        System.out.print("New Gender: ");
        String gender = scanner.nextLine();
        System.out.print("New CMND: ");
        String cmnd = scanner.nextLine();
        System.out.print("New Phone: ");
        String phone = scanner.nextLine();
        System.out.print("New Email: ");
        String email = scanner.nextLine();
        System.out.print("New Level: ");
        String level = scanner.nextLine();
        System.out.print("New Position: ");
        String position = scanner.nextLine();
        System.out.print("New Salary: ");
        double salary = Double.parseDouble(scanner.nextLine());

        Employee updated = new Employee(id, name, dob, gender, cmnd, phone, email, level, position, salary);
        repository.update(id, updated);
        System.out.println("Employee updated.");
    }
}
