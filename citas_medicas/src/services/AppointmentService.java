package services;

import java.time.LocalDateTime;
import java.util.NavigableSet;
import java.util.TreeSet;

import models.Appointment;
import utils.AppointmentComparator;

public class AppointmentService {

    private final NavigableSet<Appointment> appointments;

    public AppointmentService() {
        this.appointments = new TreeSet<>(new AppointmentComparator());
    }

    public boolean register(Appointment appointment){
        return this.appointments.add(appointment);
    }

    public void showAppointments(){
        if (appointments.isEmpty()) {
            System.out.println("No existen citas.");
            return ;
        }
        appointments.forEach(c -> System.out.println(c));
        
    }
    
    public Appointment firstAppointment(){
        if (!appointments.isEmpty()) {
            return appointments.first();
            
        }
        return null;
    }

    public Appointment lastAppointment(){
        return appointments.last();
    }

    public Appointment nextAppointment(LocalDateTime dateTime){
        Appointment appointment = new Appointment(dateTime, "", "");
        return appointments.ceiling(appointment);
    }


    public NavigableSet<Appointment> appointmentBetween(LocalDateTime start, LocalDateTime end){
        Appointment appointmentFrom = new Appointment(start, "", "");
        Appointment appointmentTo = new Appointment(end, Character.toString(Character.MAX_VALUE), "");
        return appointments.subSet(appointmentFrom, true, appointmentTo, true);

    }
    
}
