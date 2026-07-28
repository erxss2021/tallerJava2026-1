package utils;

import java.util.Comparator;

import models.EmergencyCase;

public class EmergencyComparator implements Comparator<EmergencyCase>{

    @Override
    public int compare(EmergencyCase o1, EmergencyCase o2) {
        int priority = Integer.compare(o1.priority(), o2.priority());

        if (priority != 0) {
            return priority;
        }

        return o1.arrivalTime().compareTo(o2.arrivalTime());
    }
    
}
