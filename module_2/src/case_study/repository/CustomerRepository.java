package case_study.repository;

import case_study.model.Customer;
import case_study.utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static final String FILE_PATH = "src/case_study/data/customer.csv";

    @Override
    public List<Customer> getAll() {
        List<String> lines = ReadAndWriteFile.readFromFile(FILE_PATH);
        List<Customer> customers = new ArrayList<>();

        for (String line : lines) {
            String[] parts = line.split(",");
            if (parts.length == 9) {
                customers.add(new Customer(
                        parts[0], parts[1], parts[2], parts[3],
                        parts[4], parts[5], parts[6], parts[7], parts[8]
                ));
            }
        }
        return customers;
    }

    @Override
    public void add(Customer customer) {
        List<String> lines = ReadAndWriteFile.readFromFile(FILE_PATH);
        lines.add(toCsv(customer));
        ReadAndWriteFile.writeToFile(FILE_PATH, lines);
    }

    @Override
    public void edit(String id, Customer updatedCustomer) {
        List<Customer> customers = getAll();
        List<String> newLines = new ArrayList<>();

        for (Customer c : customers) {
            if (c.getId().equals(id)) {
                newLines.add(toCsv(updatedCustomer));
            } else {
                newLines.add(toCsv(c));
            }
        }

        ReadAndWriteFile.writeToFile(FILE_PATH, newLines);
    }

    private String toCsv(Customer c) {
        return String.join(",", c.getId(), c.getName(), c.getDateOfBirth(), c.getGender(),
                c.getIdCard(), c.getPhone(), c.getEmail(), c.getCustomerType(), c.getAddress());
    }
}
