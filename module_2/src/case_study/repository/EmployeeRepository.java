package case_study.repository;

import case_study.model.Employee;
import case_study.utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static final String FILE_PATH = "module_2/src/case_study/data/employee.csv";
    private final List<Employee> employeeList = new ArrayList<>();

    public EmployeeRepository() {
        loadFromFile();
    }

    @Override
    public List<Employee> getAll() {
        return employeeList;
    }

    @Override
    public void add(Employee employee) {
        employeeList.add(employee);
        saveToFile();
    }

    @Override
    public void update(String id, Employee updatedEmployee) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equals(id)) {
                employeeList.set(i, updatedEmployee);
                saveToFile();
                return;
            }
        }
    }

    @Override
    public void display() {
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }

    private void loadFromFile() {
        List<String> lines = ReadAndWriteFile.readFromFile(FILE_PATH);
        employeeList.clear();
        for (String line : lines) {
            Employee employee = Employee.fromString(line);
            if (employee != null) {
                employeeList.add(employee);
            }
        }
    }

    private void saveToFile() {
        List<String> lines = new ArrayList<>();
        for (Employee e : employeeList) {
            lines.add(e.toString());
        }
        ReadAndWriteFile.writeToFile(FILE_PATH, lines);
    }

}
