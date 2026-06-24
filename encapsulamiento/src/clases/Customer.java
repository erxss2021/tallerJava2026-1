package clases;

public class Customer {
    private static Integer id = 0;
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.id++;
        // this.name = name;
        updateName(name);
        // this.email = email;
        updateEmail(email);
    }

    public static int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public void updateName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Invalid name.");
        }
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void updateEmail(String email) {
        if (email == null || email.isBlank() ||
            !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
                throw new IllegalArgumentException("Invalid email");
        }
        this.email = email;
    }


    public void showInformation(){
        System.out.println("Id: %d\tName: %s\tEmail: %s".formatted(id, name, email));
    }
    
}
