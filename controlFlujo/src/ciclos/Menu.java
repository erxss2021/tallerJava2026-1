package ciclos;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("----------MENU-----------");
            System.out.println("1. Alta");
            System.out.println("2. Consulta");
            System.out.println("3. Salir");
            System.out.print("Seleccione: ");
            opcion = entrada.nextInt();
        } while (opcion != 3);

        System.out.println("Fin del sistema. Hasta pronto...");
    }
}
