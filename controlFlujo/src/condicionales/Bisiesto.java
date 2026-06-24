package condicionales;

import java.util.Scanner;

public class Bisiesto {
    public static void main(String[] args) {
        /*
        Solicitar un año y determinar si es bisiesto.
        Reglas
            Divisible entre 4
            Pero no entre 100
            O divisible entre 400

        */
        Scanner in = new Scanner(System.in);
        int anio;
        System.out.println("Ingrese el año a verificar:");
        anio = in.nextInt();
        if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
            System.out.println("El año " + anio + " es bisiesto");
        }else{
            System.out.println("El año " + anio + " no es bisiesto");
        }
        in.nextLine();
        in.close();
    }
}
