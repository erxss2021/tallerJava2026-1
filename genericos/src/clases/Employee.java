package clases;

public class Employee {
    private Long id;
    private String name;

    public Employee(String name) {
        this.name = name;
    }
    
    public Employee(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }
    
    


    
}
