package case_study.repository;

import case_study.model.Employee;

import java.util.List;

public interface IEmployeeRepository extends Repository {
    List<Employee> getAll();

    void add(Employee employee);

    void update(String id, Employee updatedEmployee);
}
