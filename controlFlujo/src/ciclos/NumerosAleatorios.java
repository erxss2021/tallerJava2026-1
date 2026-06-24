package ciclos;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.random.RandomGenerator;

public class NumerosAleatorios {
    public static void main(String[] args) {
        //1. Math.random()  Java 1.0
        double numero;
        numero = Math.random();
        System.out.println("Numero: " + numero);

        //numeros enteros 1-100
        int numeroEntero;
        numeroEntero =  (int) (Math.random() * 100) + 1;
        System.out.println("Numero entero: " + numeroEntero);

        //2. Clase Random  Java 1.0
        System.out.println("-----------Clase Random------------");
        Random random = new Random();
        int numeroRandom;
        numeroRandom = random.nextInt();
        System.out.println("Numero: " + numeroRandom);

        int numeroRango = random.nextInt(100) + 1;
        System.out.println("Numero Rango: " +  numeroRango);

        //3. Clase ThreadLocalRandom  --- Java 7
        System.out.println("------------------ThreadLocalRandom-------------------");
        int numAleatorio = ThreadLocalRandom.current().nextInt(1, 101);
        System.out.println("Numero: " + numAleatorio);

        //4. Clase RandomGenerator --- Java 17
        System.out.println("--------------------RandomGenerator--------------");
        RandomGenerator randomGenerator = RandomGenerator.getDefault();
        int numGenerado = randomGenerator.nextInt(1, 101);
        System.out.println("Numero: " + numGenerado); 


        //Ejemplo de lanzamiento de un dado
        System.out.println("--------------Dado-------------------");
        int dado = randomGenerator.nextInt(1, 7);
        System.out.println("Numero del dado: " + dado);
    }
}
