package ciclos;

import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base;
        System.out.print("Ingresa un numero: ");
        base = in.nextInt();
        System.out.println("Tabla de multiplicar de " + base);
        for(int i = 1; i <= 10; i++){
            System.out.println(base + " x " + i + " = " + base * i);
        } 

    }
}
