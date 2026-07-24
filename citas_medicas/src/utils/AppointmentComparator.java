package utils;

import java.util.Comparator;

import models.Appointment;

public class AppointmentComparator implements Comparator<Appointment>{
    @Override
    public int compare(Appointment o1, Appointment o2) {
        int result = o1.dateTime().compareTo(o2.dateTime());
        if (result != 0) {
            return result;
        }
        return o1.patientName().compareToIgnoreCase(o2.patientName());
    }

}
