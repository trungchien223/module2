package case_study.service;

import case_study.model.Customer;
import case_study.repository.CustomerRepository;
import case_study.repository.ICustomerRepository;

import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private static final Scanner scanner = new Scanner(System.in);

    private final ICustomerRepository repository = new CustomerRepository();

    public void display() {
        for (Customer customer : repository.getAll()) {
            System.out.println(customer);
        }
    }

    public void add() {
        
    }

    public void edit() {
    }
}
