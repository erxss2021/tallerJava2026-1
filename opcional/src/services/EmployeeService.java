package services;

import java.util.Optional;

import model.Employee;

public interface EmployeeService {
    Optional<Employee> findEmployee(Long id);
    Employee findEmployeeOrThrow(Long id);
    Optional<String> findEmployeeName(Long id);
    void printEmployee(Long id);
}
