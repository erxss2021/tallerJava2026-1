package clases;

public class TestEmpleado {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        Empleado empleado2 = new Empleado("Eloy");
        Empleado empleado3 = new Empleado(5000.0);
        Empleado empleado4 = new Empleado("Juan", 7600.0);
        System.out.println(empleado.nombre);
        System.out.println(empleado4.nombre);
        System.out.println(empleado2.nombre);

    }

}
