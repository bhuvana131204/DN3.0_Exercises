package com.example.EmployeeManagementSystem.repository;
import com.example.EmployeeManagementSystem.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Derived query method to find an employee by email
    Optional<Employee> findByEmail(String email);
}

