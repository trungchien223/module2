package case_study.service;

import case_study.model.Employee;
import case_study.repository.IEmployeeRepository;
import case_study.repository.EmployeeRepository;
import case_study.utils.EmployeeValidator;
import case_study.utils.InvalidInputException;

import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private final IEmployeeRepository repository = new EmployeeRepository();
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Employee e : repository.getAll()) {
            System.out.println(e);
        }
    }

    @Override
    public void add() {
        String id, name, dob, gender, idCard, phone, email, level, position;
        double salary;

        while (true) {
            try {
                System.out.print("Nhập mã NV (NV-YYYY): ");
                id = EmployeeValidator.validateEmployeeCode(scanner.nextLine());
                break;
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Nhập tên NV: ");
                name = EmployeeValidator.validateName(scanner.nextLine());
                break;
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
                dob = EmployeeValidator.validateBirthday(scanner.nextLine());
                break;
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.print("Nhập giới tính: ");
                gender = EmployeeValidator.validateGender();
                break;
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Nhập CMND (phải đủ 9 hoặc 12 số): ");
                idCard = EmployeeValidator.validateIdCard(scanner.nextLine());
                break;
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Nhập số điện thoại: ");
                phone = EmployeeValidator.validatePhone(scanner.nextLine());
                break;
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Nhập lương: ");
                salary = EmployeeValidator.validateSalary(scanner.nextLine());
                break;
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.print("Nhập email: ");
                email = EmployeeValidator.validateEmail(scanner.nextLine());
                break;
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.print("Nhập trình độ: ");
        level = scanner.nextLine();

        System.out.print("Nhập vị trí: ");
        position = scanner.nextLine();

        Employee employee = new Employee(id, name, dob, gender, idCard, phone, email, level, position, salary);
        repository.add(employee);
        System.out.println("Đã thêm nhân viên thành công.");
    }

    @Override
    public void edit() {
        System.out.print("Nhập mã nhân viên cần sửa: ");
        String id = scanner.nextLine();
        String name, dob, gender, idCard, phone, email, level, position;
        double salary;

        while (true) {
            try {
                System.out.print("Nhập tên mới: ");
                name = EmployeeValidator.validateName(scanner.nextLine());
                break;
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Nhập ngày sinh mới (dd/MM/yyyy): ");
                dob = EmployeeValidator.validateBirthday(scanner.nextLine());
                break;
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.print("Nhập giới tính mới: ");
        gender = scanner.nextLine();

        while (true) {
            try {
                System.out.print("Nhập CMND mới: ");
                idCard = EmployeeValidator.validateIdCard(scanner.nextLine());
                break;
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Nhập số điện thoại mới: ");
                phone = EmployeeValidator.validatePhone(scanner.nextLine());
                break;
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Nhập lương mới: ");
                salary = EmployeeValidator.validateSalary(scanner.nextLine());
                break;
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.print("Nhập email mới: ");
        email = scanner.nextLine();

        System.out.print("Nhập trình độ mới: ");
        level = scanner.nextLine();

        System.out.print("Nhập vị trí mới: ");
        position = scanner.nextLine();

        Employee employee = new Employee(id, name, dob, gender, idCard, phone, email, level, position, salary);
        repository.edit(id, employee);
        System.out.println("Cập nhật nhân viên thành công.");
    }
}
