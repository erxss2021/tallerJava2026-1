import java.util.Arrays;
import java.util.Collections;

public class Ordenamiento {
    public static void main(String[] args) {
        Integer[] numeros = {56, 34, 12, 80, 78, 3, 90, 45, 65, 88, 8};
        Arrays.sort(numeros, Collections.reverseOrder());
        System.out.println(Arrays.toString(numeros));

        //Tipos primitivos

        // Arrays.sort(numeros);
        // System.out.println(Arrays.toString(numeros));
        
        // //Ordenar de mayor a menor
        // for (int i = 0, j = numeros.length - 1; i < j; i++, j--) {
        //     int aux = numeros[i];
        //     numeros[i] = numeros[j];
        //     numeros[j] = aux;
        // }
        // System.out.println(Arrays.toString(numeros));
    }
}
