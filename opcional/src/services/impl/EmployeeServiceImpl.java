package services.impl;

import java.util.Optional;

import model.Employee;
import repositories.Repository;
import services.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{

    private final Repository<Employee, Long> repository;
    
    public EmployeeServiceImpl(Repository<Employee, Long> repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Employee> findEmployee(Long id) {
        return repository.findById(id);
    }

    @Override
    public Optional<String> findEmployeeName(Long id) {
        Optional<Employee> optionalEmployee = repository.findById(id);
        return Optional.ofNullable(optionalEmployee.get().name());
        // return repository.findById(id).map(Employee::name);
    }

    @Override
    public Employee findEmployeeOrThrow(Long id) {
        return repository.findById(id).orElseThrow(
            () -> new IllegalArgumentException("Empleado con ID " +  id + " no encontrado")
        );
    }

    @Override
    public void printEmployee(Long id) {
        repository.findById(id).ifPresent(System.out::println);
    }

    
}
