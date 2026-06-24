package opciones;

public class DiaLaborable {
    public static void main(String[] args) {
        String dia = "sabados";
        dia = dia.toLowerCase();
        switch (dia) {
            case "lunes", "martes", "miercoles", "jueves", "viernes" -> {
                System.out.println("Mensaje" );
                System.out.println("Día laborable.");  
            }
            case "sabado", "domingo" -> System.out.println("Fin de semana.");
            default -> System.out.println("Día no valido.");
        }

        // switch (dia) {
        //     case "lunes", "martes", "miercoles", "jueves", "viernes":
        //         System.out.println("Día laborable.");  
        //         break;
        //     case "sabado", "domingo":
        //         System.out.println("Fin de semana.");
        //         break;
        //     default:
        //         System.out.println("Día no valido.");
        //         break;
        // }
    }
}
