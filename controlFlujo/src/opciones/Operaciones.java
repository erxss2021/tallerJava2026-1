package opciones;

import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {
        int a, b;
        char op; //'+','-','*','/', '%'
        Scanner in = new Scanner(System.in);

        System.out.println("Teclea el valor de a:");
        a = in.nextInt();
        System.out.println("Teclea el valor de b:");
        b = in.nextInt();
        

        System.out.println("Operación (+, -, *, / o %):");
        op = in.next().charAt(0);
        int resultado = switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            case '%' -> a % b;
            default -> 0;

        };
        System.out.println(a + " " + op + " " + b  + " = " + resultado);

        // switch (op) {
        //     case '+' -> System.out.println(a + " + " + b + " = " + (a + b));
        //     case '-' -> System.out.println(a + " - " + b + " = " + (a - b));
        //     case '*' -> System.out.println(a + " * " + b + " = " + (a * b));
        //     case '/' -> {
        //         if (b != 0) {
        //             System.out.println(a + " / " + b + " = " + (a / b));
        //         }else
        //             System.out.println("No se puede dividir entre cero");
        //     }
        //     case '%' -> System.out.println(a + " % " + b + " = " + (a % b));
        //     default -> System.out.println("Operación no valida.");

        // }

     }
}
