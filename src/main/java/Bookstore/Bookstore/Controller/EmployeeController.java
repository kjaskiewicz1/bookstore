package Bookstore.Bookstore.Controller;

import Bookstore.Bookstore.Entity.Employee;
import Bookstore.Bookstore.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {

    Employee employee;
    @GetMapping("{id}")
    public Employee getEmployeeDetails(String id)
    {
        return employee;
        //new Employee(22,"Martin","Smith","A&G",50);
    }

    @PostMapping
    public String createEmployeeDetails(@RequestBody Employee employee)
    {
        this.employee = employee;
        return "Employee created successfully.";
    }

    @PutMapping
    public String updatedEmployeeDetails(@RequestBody Employee employee)
    {
        this.employee = employee;
        return "Employee updated successfully.";
    }
}
