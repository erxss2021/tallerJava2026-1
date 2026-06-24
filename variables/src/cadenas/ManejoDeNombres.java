package cadenas;

import java.util.Scanner;

public class ManejoDeNombres {
    public static void main(String[] args) {
        String nombre1, nombre2, nombre3;
        String nombreA, nombreB, nombreC;
        String cadenaFinal;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Teclea nombre 1:");
        nombre1  = entrada.next();
        System.out.print("Teclea nombre 2:");
        nombre2  = entrada.next();
        System.out.print("Teclea nombre 3:");
        nombre3  = entrada.next();

        //Problema
        nombreA = nombre1.toUpperCase().charAt(1)+"."
                  + nombre1.substring(nombre1.length()-2);
        nombreB = nombre2.toUpperCase().charAt(1)+"."
                  + nombre2.substring(nombre2.length()-2);
        nombreC = nombre3.toUpperCase().charAt(1)+"."
                  + nombre3.substring(nombre3.length()-2);

        cadenaFinal = nombreA + "_" + nombreB + "_" + nombreC;
        System.out.println(cadenaFinal);
    

    }
}
