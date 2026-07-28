package models;

import java.time.LocalDateTime;

public record EmergencyCase(Integer id, String patientName, int priority,
    LocalDateTime arrivalTime) {

}
