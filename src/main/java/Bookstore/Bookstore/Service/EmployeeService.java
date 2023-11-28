package Bookstore.Bookstore.Service;

import Bookstore.Bookstore.Entity.Employee;
import Bookstore.Bookstore.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public Employee saveDetails(Employee employee) {

        return employeeRepo.save(employee);
    }
}
