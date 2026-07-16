package test;

import model.Employee;
import repositories.Repository;
import repositories.impl.EmployeeRepositoryImpl;
import services.EmployeeService;
import services.impl.EmployeeServiceImpl;

public class TestEmployee {
    public static void main(String[] args) {
        Repository<Employee, Long> repository = new EmployeeRepositoryImpl();
        EmployeeService service = new EmployeeServiceImpl(repository);

        System.out.println("---------Buscando empleado-----------");
        // System.out.println(service.findEmployee(3L));
        service.printEmployee(3L);
        System.out.println();

        System.out.println("----------Buscar inexiste------------");
        Employee employee = service.findEmployee(null)
            .orElse(new Employee(0L, "Empleado no encontrado", "N/A"));
        System.out.println(employee);

        try {
            
            System.out.println(service.findEmployeeOrThrow(2L));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Sigue la ejecución");
        System.out.println(service.findEmployeeName(9L).orElse("No encontrado"));
    }
}
