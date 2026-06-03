package variables;

public class Ejemplo {
    public void mostrar(){
        int edad = 30;
        System.out.println("Edad: " + edad);
        Persona persona = new Persona();
        persona.edad = 47;
        persona.nombre = "Eloy";
    }   
}
