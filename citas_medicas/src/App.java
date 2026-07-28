import java.time.LocalDateTime;

import models.Appointment;
import services.AppointmentService;

public class App {
    public static void main(String[] args) {
        AppointmentService service = new AppointmentService();

        service.register(new Appointment(LocalDateTime.of(2026, 7, 25, 9, 0), 
        "Juan", "Dr. Gomez"));
        service.register(new Appointment(LocalDateTime.of(2026, 7, 25, 9, 0), 
        "Carlos", "Dr. Lopez"));
        service.register(new Appointment(LocalDateTime.of(2026, 7, 25, 11, 0), 
        "Ana", "Dr. Perez"));
        service.register(new Appointment(LocalDateTime.of(2026, 7, 25, 13, 0), 
        "Maria", "Dr. Ruiz"));
        service.register(new Appointment(LocalDateTime.of(2026, 7, 25, 12, 30), 
        "Angeliza", "Dr. Soto"));


        System.out.println("==============CITAS=====================");
        service.showAppointments();

        System.out.println("========PRIMER CITA===============");
        System.out.println(service.firstAppointment());


        System.out.println("=============ULTIMA CITA======================");
        System.out.println(service.lastAppointment());

        System.out.println("=============Siguiente cita desde las 10:00");
        System.out.println(service.nextAppointment(
            LocalDateTime.of(2026, 7, 25, 10, 0)));

        System.out.println("========Citas entre 10:00 y 13:00");
        service.appointmentBetween(LocalDateTime.of(2026, 7, 25, 10,0), 
        LocalDateTime.of(2026, 7, 25, 13,0))
        .forEach(c -> System.out.println(c));
    
    }
}
