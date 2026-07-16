package generics.interfaces.impl;

import clases.Employee;
import generics.interfaces.Repository;

public class EmployeeRepository implements Repository<Employee>{

    @Override
    public void save(Employee employee) {
        System.out.println("Save Employee...");
    }

    @Override
    public Employee findById(Long id) {
        return new Employee("Juan");
    }


}
