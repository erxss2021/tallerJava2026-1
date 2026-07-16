package repositories.impl;

import java.util.Optional;

import model.Employee;
import repositories.Repository;

public class EmployeeRepositoryImpl implements Repository<Employee, Long>{

    private final Employee[] employees = {
        new Employee(1L, "Juan Perez", "IT"),
        new Employee(2L, "Ana Lopez", "Finance"),
        new Employee(3L, "Carlos Ruiz", "HR"),
        new Employee(4L, "Maria Garcia", "Sales"),
    };

    @Override
    public Optional<Employee> findById(Long id) {
        // Optional<Employee> optional;
        if (id == null) {
            return Optional.empty();
        }  
        for (Employee employee : employees) {
            if (employee.id().equals(id)) {
                return Optional.of(employee);
            }
        } 
        return Optional.empty();
    }

}
