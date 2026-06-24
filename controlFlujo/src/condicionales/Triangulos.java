package condicionales;

import java.util.Scanner;

public class Triangulos {
    public static void main(String[] args) {
        /*Solicitar tres lados y determinar si el triángulo es:
            Equilátero 
            Isósceles 
            Escaleno
        */
        int lado1, lado2, lado3;
        Scanner in = new Scanner(System.in);

        System.out.println("Ingresa el lado 1:");
        lado1 = in.nextInt();
        System.out.println("Ingresa el lado 2:");
        lado2 = in.nextInt();
        System.out.println("Ingresa el lado 3:");
        lado3 = in.nextInt();
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Es un triangulo Equilatero.");
        }else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("Es un triangulo Isosceles.");
        }else{
            System.out.println("Es un triangulo Escaleno");
        }
    }
}
