package arrays;

public class Arreglo {
    public static void main(String[] args) {
        //Declarar el arreglo
        int[] numeros;

        //inicialización o reserva de espacio de memoria
        numeros = new int[5]; 

        //Asignación de valores
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;
        // numeros[5] = 60;  
        // numeros[-1] = -10;

        //Recorrer un arreglo con for
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        //Recorrer un arreglo con foreach
        System.out.println("-------------foreach-------------");
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
            System.out.print(numero + " ");
        }
        System.out.println("\nSuma: " + suma);

    }
}