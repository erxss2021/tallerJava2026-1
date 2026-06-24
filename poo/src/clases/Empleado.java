package clases;

public class Empleado {
    String nombre;
    double sueldo;

    //Constructores
    public Empleado(){
        this("Sin nombre", 0.0);
    }

    public Empleado(String nombre){
        this(nombre, 0.0);
        // this.nombre = nombre; 
    }

    public Empleado(double sueldo){
        this("Sin nombre", sueldo);
        // this.sueldo = sueldo;
    }

    public Empleado(String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
}
