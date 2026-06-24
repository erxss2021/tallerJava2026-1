package test;

import clases.Employee;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee();
        // employee.name = "";
        // employee.salary = -1223.00;
        // System.out.println(employee.getSalary());
        // System.out.println(employee.getName());
        employee.setName("Eloy");
        employee.setSalary(23000.233);
        // System.out.println(employee.getName());
        employee.showInformation();
    }

}
