package clases;

public class Employee {
    private String name;
    private double salary;

    //Metodos
    //Constructores
    public Employee() {}
    
    //Getters y Setters
    //Get --> nos devuelve el valor del atributo
    public String getName(){
        return name;
    }
    //Set --> modificar o asignarn el valor al atributo
    public void setName(String name){
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    


    //Metodos de logica
    public void showInformation(){
        System.out.println("Name: %s\tSalary: $%.2f".formatted(name, salary));
    }
    
    

}
