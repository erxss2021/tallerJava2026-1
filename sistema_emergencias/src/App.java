import java.time.LocalDateTime;

import models.EmergencyCase;
import services.EmergencyService;

public class App {
    public static void main(String[] args){
        EmergencyService service = new EmergencyService();
        service.registerCase(
            new EmergencyCase(1, "Juan", 5, 
            LocalDateTime.of(2026, 7, 28, 9, 0)));
        service.registerCase(
            new EmergencyCase(2, "Ana", 1, 
            LocalDateTime.of(2026, 7, 28, 9, 5)));
        service.registerCase(
            new EmergencyCase(3, "Carlos", 3, 
            LocalDateTime.of(2026, 7, 28, 9, 10)));
        service.registerCase(
            new EmergencyCase(4, "Pedro", 1, 
            LocalDateTime.of(2026, 7, 28, 9, 1)));
        
        System.out.println("===========PENDIENTES==================");
        System.out.println(service.pendientPatients());
        
        System.out.println("=============SIGUIENTE EN ATENDERSE=============");
        System.out.println(service.nextPatient());
        
        System.out.println("================ATENDIENDO PACIENTE==============");
        System.out.println(service.attendPatient());

        System.out.println("===========PENDIENTES==================");
        System.out.println(service.pendientPatients());
        
        System.out.println("============ATENDER TODOS LOS PACIENTES==============");
        service.processAllPatients();
        
        System.out.println("===========PENDIENTES==================");
        System.out.println(service.pendientPatients());
    }
}
