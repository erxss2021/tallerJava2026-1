package clases;

public class Example {
    public static void main(String[] args) {
        Employee employee = new Employee();
        // employee.name = "";
        // employee.salary = 23000.40;
        employee.setName("Eloy");
        employee.setSalary(15000.0);
        employee.showInformation();
    }
}
