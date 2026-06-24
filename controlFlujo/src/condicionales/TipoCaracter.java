package condicionales;

import java.util.Scanner;

public class TipoCaracter {
    public static void main(String[] args) {
        //Saber si el carácter dado por el usuario es una vocal, una consonante o un digito.
        char caracter;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa un solo caracter:");
        caracter = entrada.next().charAt(0);
        if(Character.isLetter(caracter)){
            //verificamos si es vocal o consonante
            char c = Character.toLowerCase(caracter);
            switch (c) {
                case 'a', 'e', 'i', 'o', 'u':
                    System.out.println("El caracter " + caracter + " es una vocal.");
                    break;
                default:
                    System.out.println("El caracter " + caracter + " es una consonante.");
                    break;
            }
            // if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            //     System.out.println("El caracter " + caracter + " es una vocal.");
            // }else{
            //     System.out.println("El caracter " + caracter + " es una consonante.");
                
            // }
        }else if(Character.isDigit(caracter)){
            //es digito
            System.out.println("El caracter " + caracter + " es un digito.");
            
        }else{
            //Carecter especial
            System.out.println("El caracter " + caracter + " es un caracter especial.");
        }

    }
}
