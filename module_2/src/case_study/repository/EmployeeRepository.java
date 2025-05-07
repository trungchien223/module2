package case_study.repository;

import case_study.model.Employee;
import case_study.utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static final String FILE_PATH = "module_2/src/case_study/data/employee.csv";

    @Override
    public List<Employee> getAll() {
        List<String> lines = ReadAndWriteFile.readFromFile(FILE_PATH);
        List<Employee> employees = new ArrayList<>();

        for (String line : lines) {
            String[] parts = line.split(",");
            if (parts.length == 10) {
                employees.add(new Employee(
                        parts[0], parts[1], parts[2], parts[3],
                        parts[4], parts[5], parts[6], parts[7],
                        parts[8], Double.parseDouble(parts[9])
                ));
            }
        }
        return employees;
    }

    @Override
    public void add(Employee employee) {
        List<String> lines = ReadAndWriteFile.readFromFile(FILE_PATH);
        lines.add(toCsv(employee));
        ReadAndWriteFile.writeToFile(FILE_PATH, lines);
    }

    @Override
    public void edit(String id, Employee updated) {
        List<Employee> list = getAll();
        List<String> newLines = new ArrayList<>();

        for (Employee e : list) {
            if (e.getId().equals(id)) {
                newLines.add(toCsv(updated));
            } else {
                newLines.add(toCsv(e));
            }
        }

        ReadAndWriteFile.writeToFile(FILE_PATH, newLines);
    }

    private String toCsv(Employee e) {
        return String.join(",", e.getId(), e.getName(), e.getDateOfBirth(), e.getGender(),
                e.getIdCard(), e.getPhone(), e.getEmail(), e.getLevel(), e.getPosition(),
                String.valueOf(e.getSalary()));
    }
}
