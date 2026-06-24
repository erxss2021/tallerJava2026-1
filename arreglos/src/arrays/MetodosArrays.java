package arrays;

import java.util.Arrays;

public class MetodosArrays {
    public static void main(String[] args) {
        String[] nombres = {"Eloy", "Bingo", "Angelica", "Irma", "Amelia", "Delfino"};
        int[] numeros = {5, 10, 45, 12, 14, 60, 80, 1, 20, 11};

        for (String nombre : nombres) {
            System.out.print(nombre + " ");
        }
        System.out.println();


        //Clase Arrays
        System.out.println("--------------toString(array)---------------------");
        System.out.println(Arrays.toString(nombres));
        System.out.println("--------------sort(array)---------------------");
        System.out.println();
        Arrays.sort(nombres);
        System.out.println(Arrays.toString(nombres));
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
        
        
        System.out.println("-------------fill(array, valor)---------------------");
        int[] edades = new int[10];
        Arrays.fill(edades, 2, 6, 10);
        System.out.println(Arrays.toString(edades));
        System.out.println("-------------binarySearch(array, valor)---------------------");
        int indice = Arrays.binarySearch(nombres, "Elo");
        System.out.println("Indice: " + indice);
        System.out.println("-------------copyOf(array, tamaño)---------------------");
        int[] copia = Arrays.copyOf(numeros, numeros.length); 
        System.out.println(Arrays.toString(copia));

        System.out.println("--------------------Matrices------------------");
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(matriz));
                





    }
}
