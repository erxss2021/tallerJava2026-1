package models;

import java.time.LocalDateTime;

public record Appointment(LocalDateTime dateTime, String patientName, String doctorName) {}
