package ciclos;

import java.util.Random;
import java.util.Scanner;

public class AdivinarNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int secreto, numero;
        secreto = random.nextInt(100) + 1;
        do {
            System.out.print("Adivina el numero secreto (1-100): ");
            numero = sc.nextInt();
            if (numero < secreto) {
                System.out.println("El numero secreto es mayor");
            }else if (numero > secreto) {
                System.out.println("El numero secreto es menor");
            }
        } while (numero != secreto);
        System.out.println("Adivinaste el numero, es " + secreto);
    }
}
