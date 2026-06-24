package clases;

public class Test {
    public static void main(String[] args) {
        // Estudiante estudiante = new Estudiante(); //instancia de la clase Estudiante
        //Ciclo de vida
        //1. declaración de referencia
        Estudiante estudiante;
        // System.out.println(estudiante.nombre);
        //2. Creación del objeto
        estudiante = new Estudiante();
        //3. Uso del objeto
        System.out.println("Nombre: " + estudiante.nombre);
        System.out.println("Edad: " + estudiante.edad);
        estudiante.nombre = "Eloy";
        estudiante.edad = 41;
        estudiante.estudiar();
        System.out.println("Edad: " + estudiante.edad);
        
        //4. objeto sin referencia
        estudiante = null;
        //5. Recolección de basura
        // System.gc();
        // System.out.println(estudiante.nombre);
        System.out.println("------------estudiante2-----------------");
        Estudiante estudiante2 = new Estudiante();
        estudiante2.nombre = "Bingo";
        estudiante2.edad = 23;
        estudiante2.estudiar();
    }
}
