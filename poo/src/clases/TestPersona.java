package clases;

public class TestPersona {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Eloy");
        persona.setEdad(41);
        persona.mostrar();

        Persona persona2 = new Persona();
        persona2.setNombre("Juan")
                .mostrar()
                .setEdad(35)
                .mostrar();
    }
}
