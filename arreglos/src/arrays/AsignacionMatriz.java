package arrays;

public class AsignacionMatriz {
    public static void main(String[] args) {
        int[][] numeros = {
            {1, 2, 3, 4}, 
            {4, 5, 6, 7}, 
            {8, 9, 10, 11}, 
            {9, 10, 11, 12}
        };

        for (int[] fila : numeros) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }

        System.out.println("Intercambio de filas por columnas");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[j][i] + " ");
            }
            System.out.println();
        }
    }
}
