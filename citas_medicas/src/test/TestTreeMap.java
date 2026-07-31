package test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import models.Appointment;
import services.AppointmentManager;

public class TestTreeMap {
    public static void main(String[] args) {
        AppointmentManager manager = new AppointmentManager();
        manager.registerAppointment(new Appointment(
            LocalDateTime.of(2026, 7, 27, 9,0), "Juan Perez", "Dr. Simi"));
        manager.registerAppointment(new Appointment(
            LocalDateTime.of(2026, 7, 28, 12,0), "Carlos Ruiz", "Dr. Simi"));
        manager.registerAppointment(new Appointment(
            LocalDateTime.of(2026, 7, 30, 13,0), "Ana Garcia", "Dr. Simi"));
        manager.registerAppointment(new Appointment(
            LocalDateTime.of(2026, 7, 26, 22,0), "Eloy Sanchez", "Dr. Simi"));
        manager.registerAppointment(new Appointment(
            LocalDateTime.of(2026, 8, 3, 22,0), "Eloy Sanchez", "Dr. Simi"));

        System.out.println("==============PRIMER CITA=================");
        System.out.println(manager.firstAppointment());
        System.out.println("==============ULTIMA CITA=================");
        System.out.println(manager.lastAppointment());
        System.out.println("==============SIGUIENTE CITA=================");
        System.out.println(manager.nextAppointment(LocalDateTime.of(2026, 7, 28, 12,0)));
        System.out.println("==============ANTERIOR CITA=================");
        System.out.println(manager.previousAppointmemt(LocalDateTime.of(2026, 7, 28, 12,0)));
        System.out.println("==============CITA ENTRE FECHAS=================");
        var range = manager.appointmentBetween(
            LocalDateTime.of(2026, 7, 28, 12,0),
            LocalDateTime.of(2026, 7, 30, 23,0));

        range.forEach((k, v) -> System.out.println(k + " -> " + v));
        System.out.println("==============SEMANA=================");
        var week = manager.weeklyAppointmets(LocalDate.of(2026, 7, 26));
        week.forEach((k, v) -> System.out.println(k + " -> " + v));
        

    }

}
