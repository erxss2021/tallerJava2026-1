package services;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

import models.Appointment;

public class AppointmentManager {

    private final NavigableMap<LocalDateTime, Appointment> appointments;

    public AppointmentManager() {
        appointments = new TreeMap<>();
    }

    public void registerAppointment(Appointment appointment){
        appointments.put(appointment.dateTime(), appointment);
    }

    public Map.Entry<LocalDateTime, Appointment> firstAppointment(){
        return appointments.firstEntry();
    }

    public Map.Entry<LocalDateTime, Appointment> lastAppointment(){
        return appointments.lastEntry();
    }
    
    public Map.Entry<LocalDateTime, Appointment> nextAppointment(LocalDateTime dateTime){
        return appointments.higherEntry(dateTime);
    }

    public Map.Entry<LocalDateTime, Appointment> previousAppointmemt(LocalDateTime dateTime){
        return appointments.lowerEntry(dateTime);
    }

    public Map<LocalDateTime, Appointment> appointmentBetween(LocalDateTime start, LocalDateTime end){
        return appointments.subMap(start, true, end, true);
    } 

    public Map<LocalDateTime, Appointment> weeklyAppointmets(LocalDate weekStart){
        LocalDateTime start = weekStart.atStartOfDay();
        LocalDateTime end = weekStart.plusDays(6).atTime(23, 59, 59);
        return appointments.subMap(start, true, end, true);
    }

}
