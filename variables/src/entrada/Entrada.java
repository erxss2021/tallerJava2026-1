package entrada;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad;
        String nombre;
        double sueldo;

        System.out.print("Ingresa tu nombre:");
        nombre = entrada.nextLine();
        System.out.print("Ingresa tu edad:");
        edad = entrada.nextInt();
        System.out.print("Ingresa tu sueldo:");
        sueldo = entrada.nextDouble();
        entrada.nextLine();
        entrada.close();

        System.out.println("Hola " + nombre + " tu edad es: " + edad);
        System.out.println("Tienes un sueldo de $" + sueldo);
    }
}
