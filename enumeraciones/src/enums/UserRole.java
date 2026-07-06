package enums;

public enum UserRole {
    ADMIN,
    EMPLOYEE, 
    CLIENT;

    public boolean isAdmin(){
        return this == ADMIN;
    }

    @Override
    public String toString() {
        // String result = "";
        return switch(this){
            case ADMIN -> "Admin";
            case EMPLOYEE -> "Employee";
            case CLIENT -> "Client";
        };
        // return result;
    }
    

}
