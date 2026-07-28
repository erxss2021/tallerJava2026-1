package models;

import java.time.LocalDateTime;

public record SupportTicket(Long id, String custumerName, String description, 
    LocalDateTime createdAt) {

}
