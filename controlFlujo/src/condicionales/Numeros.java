package condicionales;

public class Numeros {
    public static void main(String[] args) {
        //Saber si un numero dado es positivo, negativo o cero
        int numero = 0;
        if (numero > 0) {
            System.out.println("El numero " + numero + " es positivo");
        }else if (numero < 0) {
            System.out.println("El numero " + numero + " es negativo");
        }else{
            System.out.println("El numero es cero (0)");

        }
    }
}
