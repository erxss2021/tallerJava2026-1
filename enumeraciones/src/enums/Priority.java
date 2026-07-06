package enums;

public enum Priority {
    
    LOW("Low priority"),
    MEDIUM("Medium priority"),
    HIGH("High priority");
    
    private final String description;

    Priority(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    
}
