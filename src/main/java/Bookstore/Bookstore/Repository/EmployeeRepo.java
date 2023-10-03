package Bookstore.Bookstore.Repository;

import Bookstore.Bookstore.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import Bookstore.Bookstore.Entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer>{

}
